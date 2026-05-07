import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovaJanela extends JFrame {
    JButton abrir;
    Inicial segundaJanela;

    public NovaJanela() {
        super("Abrir uma nova janela");
        Container tela = getContentPane();
        tela.setLayout(null);
        abrir = new JButton("Abrir");
        abrir.setBounds(100, 50, 80, 20);
        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundaJanela = new Inicial(null, "Segunda Janela", true);
                segundaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundaJanela.setVisible(true);
            }
        });
        tela.add(abrir);
        setSize(300, 150);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
