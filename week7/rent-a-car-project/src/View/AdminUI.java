package View;

import Business.BrandManager;
import Core.Helper;
import Entities.Brand;
import Entities.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class AdminUI extends Layout {

    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JPanel pnl_bottom;
    private JTabbedPane tabbedPane1;
    private JPanel tab_menu;
    private JButton btn_logout;
    private JPanel pnl_brand;
    private JScrollPane scrll_brand;
    private JTable tbl_brand;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private BrandManager brandManager;
    private JPopupMenu brandMenu;
    public AdminUI(User user){
        this.brandManager = new BrandManager();
        this.add(container);
        this.guiInitialize(1000,500);
        this.user = user;
        this.lbl_welcome.setText("Welcome " + this.user.getUser_name() + "!");
        loadBrandTable();
        loadBrandComponent();


        this.tbl_brand.setComponentPopupMenu(brandMenu);

        if (this.user == null){
            dispose();
        }
    }
    public void loadBrandComponent(){
        this.tbl_brand.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selected_row = tbl_brand.rowAtPoint(e.getPoint());
                tbl_brand.setRowSelectionInterval(selected_row, selected_row);
            }
        });

        this.brandMenu = new JPopupMenu();

        this.brandMenu.add("New").addActionListener(e -> {
            BrandUI brandUI = new BrandUI(null);
            brandUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            });
        });
        this.brandMenu.add("Update").addActionListener(e -> {
            int selectBrandId = this.getTableSelectedRow(tbl_brand, 0);
            BrandUI brandUI = new BrandUI(this.brandManager.getById(selectBrandId));
            brandUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            });
        });
        this.brandMenu.add("Delete").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectBrandId = this.getTableSelectedRow(tbl_brand, 0);
                if (this.brandManager.delete(selectBrandId)){
                    Helper.msg("Deleted successfully.");
                    loadBrandTable();
                }else {
                    Helper.msg("Something went wrong.");
                }
            }
        });
    }
    public void loadBrandTable(){
        Object[] col_brand = {"Brand ID", "Brand Name"};
        ArrayList<Object[]> brandList = brandManager.getForTable(col_brand.length);
        this.createTable(this.tmdl_brand, this.tbl_brand, col_brand, brandList);

    }
}
