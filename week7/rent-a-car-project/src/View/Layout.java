package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Layout extends JFrame {
    public void guiInitialize(int width, int height){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1000,500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
        this.setLocation(x, y);
        this.setVisible(true);
    }
    public void createTable(DefaultTableModel model, JTable jTable, Object[] columns, ArrayList<Object[]> rows){
        model.setColumnIdentifiers(columns);
        jTable.setModel(model);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getColumnModel().getColumn(0).setMaxWidth(75);
        jTable.setEnabled(false);

        DefaultTableModel clearModel = (DefaultTableModel) jTable.getModel();
        clearModel.setRowCount(0);

        if (rows == null){
            rows = new ArrayList<>();
        }
        for (Object[] row : rows){
            model.addRow(row);
        }
    }
    public int getTableSelectedRow(JTable table, int index){
        return Integer.parseInt(table.getValueAt(table.getSelectedRow(), index).toString());

    }
}
