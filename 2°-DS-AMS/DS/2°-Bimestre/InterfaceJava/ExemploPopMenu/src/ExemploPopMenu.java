import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploPopMenu extends JFrame {
    JPopupMenu opcoes;
    JMenuItem recortar, copiar, colar;
    JTextArea texto;

    public ExemploPopMenu() {
        super("Exemplo Pop Menu");
        Container tela = getContentPane();
        setLayout(null);

        texto = new JTextArea(10,20);
        texto.setBounds(30,30,250,250);

        texto.addMouseListener( new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    opcoes.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        Tratador tratMenu = new Tratador();
        opcoes = new JPopupMenu();
        recortar = new JMenuItem("Recortar");
        copiar = new JMenuItem("Copiar");
        colar = new JMenuItem("Colar");

        recortar.setMnemonic(KeyEvent.VK_R);
        copiar.setMnemonic(KeyEvent.VK_C);
        colar.setMnemonic(KeyEvent.VK_L);

        recortar.addActionListener(tratMenu);
        copiar.addActionListener(tratMenu);
        colar.addActionListener(tratMenu);

        opcoes.add(recortar);
        opcoes.add(copiar);
        opcoes.addSeparator();
        opcoes.add(colar);

        tela.add(texto);

        setSize(320,340);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class Tratador implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == recortar) {
                texto.cut();
            }
            if(e.getSource() == copiar) {
                texto.copy();
            }
            if(e.getSource() == colar) {
                texto.paste();
            }
            repaint();
        }
    }
}