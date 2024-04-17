package View;

import Business.BrandManager;
import Core.Helper;
import Entities.Brand;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BrandUI extends Layout{
    private JPanel container;
    private JLabel lbl_brand;
    private JLabel lbl_brand_name;
    private JTextField fld_brand_name;
    private JButton btn_brand_save;
    private Brand brand;
    private BrandManager brandManager;
    public BrandUI(Brand brand){

        this.brandManager = new BrandManager();
        this.add(container);
        this.guiInitialize(100,100);
        this.brand = brand;
        if (brand != null){
            this.fld_brand_name.setText(brand.getBrand_name());
        }
        btn_brand_save.addActionListener(e ->  {
                if (Helper.isFieldEmpty(this.fld_brand_name)){
                    Helper.msg("Fill");
                }else{
                    boolean result = true;
                    if (this.brand == null){
                        Brand obj = new Brand(fld_brand_name.getText());
                        result = this.brandManager.save(obj);
                    }else {
                        this.brand.setBrand_name(fld_brand_name.getText());
                        result = this.brandManager.update(this.brand);
                    }
                    if (result){
                        Helper.msg("Done!");
                        dispose();
                    }else {
                        Helper.msg("Error.");
                    }
                }
        });
    }
}
