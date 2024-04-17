package Core;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static boolean isFieldEmpty(JTextField field){
       return field.getText().trim().isEmpty();
    }
    public static void msg(String str){

        String msg;
        String title = switch (str) {
            case "fill" -> {
                msg = "Field not null";
                yield "Error";
            }
            case "done" -> {
                msg = "Saved";
                yield "Information";
            }
            default -> {
                msg = str;
                yield "Information";
            }
        };

        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(String str){
        String msg;
        if (str.equals("sure")){
            msg = "You are about to initialize the deleting process. Are you sure?";

        }else {
            msg = str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Warning!", JOptionPane.YES_NO_OPTION) == 0;
    }
    public static boolean isFieldListEmpty(JTextField[] fieldList) {
        for(JTextField field : fieldList) {
            if(isFieldEmpty(field)) return true;
        }
        return false;
    }
    public static int getLocationPoint(String type, Dimension size) {
        return switch (type) {
            case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
            default -> 0;
        };
    }

}
