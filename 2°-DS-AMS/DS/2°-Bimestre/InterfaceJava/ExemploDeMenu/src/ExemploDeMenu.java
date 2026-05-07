import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ExemploDeMenu extends JFrame {
    JMenuBar barra;
    JMenu opcoes;
    JMenuItem limpar,fonte,sair;

    public ExemploDeMenu() {
        super("Exemplo de Menu");
        Container tela = getContentPane();
        tela.setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opcoes");
        barra.add(opcoes);
        limpar = new JMenuItem("Limpar");
        fonte = new JMenuItem("Fonte");
        sair = new JMenuItem("Sair");

        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);

        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.add(sair);
        opcoes.addSeparator();

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
