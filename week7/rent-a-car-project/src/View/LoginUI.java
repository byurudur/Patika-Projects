package View;

import Core.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {
    private JPanel container;
    private JPanel wrapper_top;
    private JLabel label_welcome;
    private JLabel label_welcome2;
    private JPanel wrapper_bottom;
    private JTextField user_name;
    private JPasswordField password;
    private JButton button_login;
    private JLabel label_username;
    private JLabel label_password;

    public LoginUI(){
        this.add(container);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Rent A Car");
        this.setSize(500,500);
        this.setVisible(true);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;
        this.setLocation(x, y);
        button_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(this.user_name) || Helper.isFieldEmpty(this.password)){
                JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
