import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ExemploDeMenu2 extends JFrame {
    JMenuBar barra;
    JMenu opcoes,fonte,cor;
    JMenuItem limpar,estilo,sair,tamanho,azul,verde,vermelho,amarelo,preto;

    public ExemploDeMenu2() {
        super("Exemplo de Menu");
        Container tela = getContentPane();
        tela.setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);

        opcoes = new JMenu("Opcoes");
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        barra.add(opcoes);
        opcoes.add(fonte);
        fonte.add(cor);

        limpar = new JMenuItem("Limpar");
        estilo = new JMenuItem("Fonte");
        sair = new JMenuItem("Sair");
        tamanho = new JMenuItem("Tamanho");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");

        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        estilo.setMnemonic(KeyEvent.VK_E);
        cor.setMnemonic(KeyEvent.VK_C);
        tamanho.setMnemonic(KeyEvent.VK_T);
        sair.setMnemonic(KeyEvent.VK_S);

        opcoes.add(limpar);
        opcoes.add(sair);
        opcoes.addSeparator();
        fonte.add(estilo);
        fonte.add(tamanho);
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
