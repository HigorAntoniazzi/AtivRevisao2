import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAdminLogin extends JFrame {
    private JTextField textLogin;
    private JTextField textPassword;
    private JButton btnLogin;
    private JButton btnCancelar;
    public JPanel panelLogin;

    private String login;

    private String password;

    public TelaAdminLogin() {
    btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            login = textLogin.getText();
            password = textPassword.getText();

            if(login.equals("admin") && password.equals("admin")){

                JOptionPane.showMessageDialog(null,"logado com sucesso");


            }else{
                JOptionPane.showMessageDialog(null,"Senha ou Usuário Incorreto");
            }

        }
    });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLogin.setText("");
                textPassword.setText("");
            }
        });
    }
}
