import javax.swing.*;
import java.awt.*;

public class Inicial extends JDialog {
    JButton sair;
    TBsair tsair;
    public Inicial(Frame owner, String title, boolean modal) {
        super(owner,title,modal);
        Container tela1 = getContentPane();
        tela1.setLayout(null);

        sair = new JButton("Sair");
        sair.setBounds(50, 50, 100, 20);
        tsair = new TBsair(this);
        sair.addActionListener(tsair);

        tela1.add(sair);
        setSize(200, 200);
        setLocationRelativeTo(null);
    }
}
