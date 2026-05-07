import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovaJanela2 extends JFrame {
    JButton abrir;
    Inicial segundaJanela;
    public NovaJanela2() {
        super("Abrir uma nova janela");
        Container tela = getContentPane();
        tela.setLayout(null);

        abrir = new JButton("Abrir");
        abrir.setBounds(100, 50, 100, 20);
        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundaJanela = new Inicial();
                segundaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundaJanela.setVisible(true);
                setVisible(false);
                dispose();
            }
        });
        tela.add(abrir);
        setVisible(true);
        setSize(300, 150);
        setLocationRelativeTo(null);
    }
}
