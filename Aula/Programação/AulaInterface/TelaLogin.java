import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    JLabel rotuloUsuario = new JLabel("Usuário");
    JLabel rotuloSenha = new JLabel("Senha");
    JTextField campoUsuario = new JTextField(20);
    JTextField campoSenha = new JTextField(20);
    JButton btEntrar = new JButton("Entrar");

    public TelaLogin() {
        setLayout(new FlowLayout());
        setTitle("Tela Principal");

        getContentPane().add(rotuloUsuario);
        getContentPane().add(campoUsuario);
        getContentPane().add(rotuloSenha);
        getContentPane().add(campoSenha);
        getContentPane().add(btEntrar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        getContentPane().setBackground(Color.BLUE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

        JOptionPane.showMessageDialog(
                null,
                "Programa iniciado!",
                "IFRS Osório",
                JOptionPane.ERROR_MESSAGE);
    }
}
