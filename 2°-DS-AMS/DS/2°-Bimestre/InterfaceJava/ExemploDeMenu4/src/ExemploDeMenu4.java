import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ExemploDeMenu4 extends JFrame {
    JMenuBar barra;
    JMenu opcoes,fonte,cor,estilo,tamanho;
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
    JCheckBoxMenuItem nomeE[];
    ButtonGroup grupoT, grupoE;
    JRadioButtonMenuItem tamanhoF[];

    String tam[] = {"12", "14", "16", "18"};
    String est[] = {"Normal", "Negrito", "Itálico", "Negrito e Italico"};

    public ExemploDeMenu4() {
        super("Exemplo de Menus com JRadioButtonItem");
        Container tela = getContentPane();
        tela.setLayout(null);
        barra = new JMenuBar();
        setJMenuBar(barra);

        opcoes = new JMenu("Opcoes");
        barra.add(opcoes);

        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        estilo = new JMenu("Estilo");
        tamanho = new JMenu("Tamanho");

        limpar = new JMenuItem("Limpar");
        sair = new JMenuItem("Sair");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");

        grupoE = new ButtonGroup();
        nomeE = new JCheckBoxMenuItem[4];
        for(int i = 0; i < 4; i++){
            nomeE[i] = new JCheckBoxMenuItem(est[i]);
            estilo.add(nomeE[i]);
            grupoE.add(nomeE[i]);
        }

        grupoT = new ButtonGroup();
        tamanhoF = new JRadioButtonMenuItem[4];
        for(int i = 0; i < 4; i++){
            tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
            tamanho.add(tamanhoF[i]);
            grupoT.add(tamanhoF[i]);
        }

        opcoes.setMnemonic(KeyEvent.VK_O);
        fonte.setMnemonic(KeyEvent.VK_F);
        cor.setMnemonic(KeyEvent.VK_C);
        estilo.setMnemonic(KeyEvent.VK_E);
        tamanho.setMnemonic(KeyEvent.VK_T);
        limpar.setMnemonic(KeyEvent.VK_L);
        sair.setMnemonic(KeyEvent.VK_S);

        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(sair);
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);
        fonte.add(cor);
        fonte.add(estilo);
        fonte.add(tamanho);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
