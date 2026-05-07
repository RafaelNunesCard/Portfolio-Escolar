import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ExemploDeMenu3 extends JFrame {
    JMenuBar barra;
    JMenu opcoes,fonte,estilo,cor;
    JMenuItem limpar,sair,tamanho,azul,verde,vermelho,amarelo,preto;
    JCheckBoxMenuItem normal, negrito, italico, negritoItalico;

    public ExemploDeMenu3() {
        super("Exemplo de Menu 3 ");
        Container tela = getContentPane();
        tela.setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);

        opcoes = new JMenu("Opcoes");
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        estilo = new JMenu("Estilo");
        barra.add(opcoes);
        opcoes.add(fonte);
        fonte.add(cor);

        limpar = new JMenuItem("Limpar");
        sair = new JMenuItem("Sair");
        tamanho = new JMenuItem("Tamanho");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");

        normal = new JCheckBoxMenuItem("Normal");
        negrito = new JCheckBoxMenuItem("Negrito");
        italico = new JCheckBoxMenuItem("Italico");
        negritoItalico = new JCheckBoxMenuItem("Italico");

        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        estilo.setMnemonic(KeyEvent.VK_E);
        cor.setMnemonic(KeyEvent.VK_C);
        tamanho.setMnemonic(KeyEvent.VK_T);
        sair.setMnemonic(KeyEvent.VK_S);

        normal.setMnemonic(KeyEvent.VK_M);
        negrito.setMnemonic(KeyEvent.VK_N);
        italico.setMnemonic(KeyEvent.VK_I);
        negritoItalico.setMnemonic(KeyEvent.VK_C);

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
        estilo.add(normal);
        estilo.add(negrito);
        estilo.add(italico);
        estilo.add(negritoItalico);


        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
