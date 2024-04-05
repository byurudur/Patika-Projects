package Core;

import javax.swing.*;

public class Helper {

    public static boolean isFieldEmpty(JTextField field){
       return field.getText().trim().isEmpty();
    }
}
