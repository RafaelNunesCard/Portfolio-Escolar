import javax.swing.*;
import java.awt.*;

public class Inicial extends JFrame {
    JButton sair;
    public Inicial(){
        super("Menu Pricipal");
        Container tela = getContentPane();
        tela.setLayout(null);
        sair = new JButton("Sair");
        sair.setBounds(50, 50, 100, 20);
        TBSair tsair = new TBSair(this);
        sair.addActionListener(tsair);
        tela.add(sair);
        setSize(200,200);
        setLocationRelativeTo(null);
    }
}
