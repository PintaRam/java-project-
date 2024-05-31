import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Steganography {

    public static void main(String[] args) {
        String message = "Hello, this is a secret message!";
        String imagePath = "image.png";
        String encodedImagePath = "encoded_image.png";

        // Encode message into image
        encodeMessage(message, imagePath, encodedImagePath);

        // Retrieve message from image
        String decodedMessage = decodeMessage(encodedImagePath);
        System.out.println("Decoded Message: " + decodedMessage);
    }

    // Encode message into the least significant bits of the image pixels
    public static void encodeMessage(String message, String imagePath, String encodedImagePath) {
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            int messageLength = message.length();
            int imageWidth = image.getWidth();
            int imageHeight = image.getHeight();

            // Encode message length into the first 32 bits of the image
            encodeInteger(image, 0, messageLength);

            // Encode each character of the message into the image
            for (int i = 0; i < messageLength; i++) {
                char character = message.charAt(i);
                encodeByte(image, (i + 1) * 8, (byte) character);
            }

            // Write the modified image to a new file
            ImageIO.write(image, "png", new File(encodedImagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Retrieve message from the least significant bits of the image pixels
    public static String decodeMessage(String imagePath) {
        StringBuilder decodedMessage = new StringBuilder();
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            int messageLength = decodeInteger(image, 0);

            // Decode each character of the message from the image
            for (int i = 0; i < messageLength; i++) {
                byte character = decodeByte(image, (i + 1) * 8);
                decodedMessage.append((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return decodedMessage.toString();
    }

    // Helper method to encode an integer into the image
    private static void encodeInteger(BufferedImage image, int offset, int value) {
        for (int i = 0; i < 32; i++) {
            int bit = (value >> (31 - i)) & 1;
            image.setRGB(offset % image.getWidth(), offset / image.getWidth(), (image.getRGB(offset % image.getWidth(), offset / image.getWidth()) & 0xFFFFFFFE) | bit);
            offset++;
        }
    }

    // Helper method to encode a byte into the image
    private static void encodeByte(BufferedImage image, int offset, byte value) {
        for (int i = 0; i < 8; i++) {
            int bit = (value >> (7 - i)) & 1;
            image.setRGB(offset % image.getWidth(), offset / image.getWidth(), (image.getRGB(offset % image.getWidth(), offset / image.getWidth()) & 0xFFFFFFFE) | bit);
            offset++;
        }
    }

    // Helper method to decode an integer from the image
    private static int decodeInteger(BufferedImage image, int offset) {
        int value = 0;
        for (int i = 0; i < 32; i++) {
            int bit = image.getRGB(offset % image.getWidth(), offset / image.getWidth()) & 1;
            value = (value << 1) | bit;
            offset++;
        }
        return value;
    }

    // Helper method to decode a byte from the image
    private static byte decodeByte(BufferedImage image, int offset) {
        byte value = 0;
        for (int i = 0; i < 8; i++) {
            int bit = image.getRGB(offset % image.getWidth(), offset / image.getWidth()) & 1;
            value = (byte) ((value << 1) | bit);
            offset++;
        }
        return value;
    }
}
