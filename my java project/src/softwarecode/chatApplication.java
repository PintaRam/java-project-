import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;
import java.net.Socket;

public class ChatApplication extends Application {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private TextArea chatArea;
    private TextField messageField;
    private String serverAddress = "localhost"; // Replace with your server address
    private int serverPort = 12345; // Replace with your server port

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chat Application");

        chatArea = new TextArea();
        chatArea.setEditable(false);

        messageField = new TextField();

        Button sendButton = new Button("Send");
        sendButton.setOnAction(event -> sendMessage());

        VBox vbox = new VBox();
        vbox.getChildren().addAll(chatArea, messageField, sendButton);

        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

        try {
            socket = new Socket(serverAddress, serverPort);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread messageReceiver = new Thread(this::receiveMessages);
        messageReceiver.start();

        primaryStage.setOnCloseRequest(event -> closeApplication());
    }

    private void sendMessage() {
        String message = messageField.getText();
        out.println(message);
        messageField.clear();
    }

    private void receiveMessages() {
        try {
            String message;
            while ((message = in.readLine()) != null) {
                Platform.runLater(() -> chatArea.appendText(message + "\n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeApplication() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
