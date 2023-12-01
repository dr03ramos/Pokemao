import javax.swing.*;
import java.awt.*;

public class PokemaoLogin extends JFrame {
    PokemaoLogin(){
        this.setTitle("Login");
        this.setSize(600, 600);
        JLabel user = new JLabel("Usuário");
        user.setBounds(125, 125, 150, 25);
        JTextField nUser = new JTextField();
        nUser.setBounds(200, 125, 150, 25);
        JLabel senha = new JLabel("Senha");
        senha.setBounds(125, 150, 150, 25);
        JPasswordField senhaF = new JPasswordField();
        senhaF.setBounds(200, 150, 150, 25);
        JButton acesso = new JButton("Acessar");
        acesso.setBounds(175, 180, 100, 35);
        JButton cadastro = new JButton("Cadastre-se");
        cadastro.setBounds(155, 250, 150, 25);
        JLabel msgCad = new JLabel("Não possui uma conta?");
        msgCad.setBounds(150, 225, 300, 25);

        JLabel dNome = new JLabel();
        dNome.setBounds(120, 250, 100, 25);
        JLabel dSenha = new JLabel();
        dSenha.setBounds(210, 250, 100, 25);

        ImageIcon pickle = new ImageIcon("pickle.png");
        this.setIconImage(pickle.getImage());
        ImageIcon patos = new ImageIcon("patos.jpeg");
        JLabel pokemao = new JLabel("POKEMÃO");
        pokemao.setBounds(185, 45, 200, 50);
        //this.getContentPane().setBackground(Color.CYAN);

        this.add(pokemao);
        this.add(user);
        this.add(nUser);
        this.add(senha);
        this.add(senhaF);
        this.add(acesso);
        this.add(dNome);
        this.add(dSenha);
        this.add(cadastro);
        this.add(msgCad);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);


    }
}