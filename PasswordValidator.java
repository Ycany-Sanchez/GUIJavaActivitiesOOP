import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class PasswordValidator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Password Validation");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);


        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setName("passwordTextField");
        passwordTextField.setEchoChar('*');
        passwordTextField.setBounds(75, 100, 200, 30);


        JLabel statusLabel = new JLabel("");
        String shortPass = "Password must be 8 characters long";
        String noDig = "Password must contain at least one digit";
        String noSpecial = "Password must contain at least one special character";
        String ok = "Password is valid";
        statusLabel.setBounds(75, 150, 300, 30);



        passwordTextField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                validatePassword();
            }

            public void removeUpdate(DocumentEvent e) {
                validatePassword();
            }

            public void changedUpdate(DocumentEvent e) {
                validatePassword();
            }

            public void validatePassword(){
                String password = passwordTextField.getText();

                statusLabel.setForeground(Color.red);
                if(password.length() < 8) {
                    statusLabel.setText(shortPass);
                }else if(!(password.matches(".*\\d.*"))){
                    statusLabel.setText(noDig);
                }else if(!(password.matches(".*[\\\\!@#$%^&*()\\[\\]{};:'\",.<>/?|_+=`~-].*"))) {
                    statusLabel.setText(noSpecial);
                }else{
                    statusLabel.setText(ok);
                    statusLabel.setForeground(Color.GREEN);
                }
            }
        });

        frame.add(statusLabel);
        frame.add(passwordTextField);
        frame.setVisible(true);
    }
}
