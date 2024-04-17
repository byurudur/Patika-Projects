package View;

import Business.UserManager;
import Core.Helper;
import Entities.User;

import javax.swing.*;

public class LoginUI extends Layout {
    private final UserManager userManager;
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
        this.userManager = new UserManager();
        this.guiInitialize(400,400);

        button_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(this.user_name) || Helper.isFieldEmpty(this.password)){
                JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else {
                User loginUser = this.userManager.findByLogin(this.user_name.getText(), this.password.getText());
                if (loginUser == null){
                    Helper.msg("No such user.");
                }else {
                    Helper.msg("Success.");
                    AdminUI adminUI = new AdminUI(loginUser);
                    dispose();
                }
            }
        });
    }
}
