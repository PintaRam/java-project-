package awtcode;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class TableExample  {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tabel");
        String data[][] = {{"101" , "ram","67000"},
                           {"102", "ganesh" , "89990"},
                           {"103","sita" ,"67899"}};
        String columns[] = {"Id","Name" ,"Salary"};
        final JTable  jt = new JTable(data ,  columns);
       // jt.setBounds(50 , 50 , 200 , 200);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select  = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e)
            {
                String Data  = null;
                int row[] = jt.getSelectedRow();
                int column[] = jt.getSelectedColumn();
                for(int i = 0 ; i<row.length ; i++)
                {
                    for(int j = 0 ; j<column.length ; j++){
                      Data = (String)jt.getValueAt(row[i], column[i]);
                    }
                }
                System.out.println("Table element selected is "+Data);
            }
        });
        JScrollPane sp = new JScrollPane(jt);
        f.add(jt);
        f.setSize(500 ,500);
        f.setVisible(true);
    }
}
