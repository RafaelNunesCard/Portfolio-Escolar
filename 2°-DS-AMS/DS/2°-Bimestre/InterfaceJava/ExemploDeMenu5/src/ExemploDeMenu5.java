import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploDeMenu5 extends JFrame {
    JMenuBar barra;
    JMenu opcoes,fonte,cor,estilo,tamanho;
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
    JCheckBoxMenuItem nomeE[];
    ButtonGroup grupoT, grupoE;
    JRadioButtonMenuItem tamanhoF[];

    String tam[] = {"12", "14", "16", "18"};
    String est[] = {"Normal", "Negrito", "Itálico", "Negrito e Italico"};

    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    int estiloFonte, tamFonte;

    public ExemploDeMenu5() {
        super("Exemplo de Menus executando ações");
        Container tela = getContentPane();
        tela.setLayout(null);

        estiloFonte = Font.PLAIN;
        tamFonte = 12;

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
        TratadorE tratEstilo = new TratadorE();
        for(int i = 0; i < 4; i++){
            nomeE[i] = new JCheckBoxMenuItem(est[i]);
            estilo.add(nomeE[i]);
            grupoE.add(nomeE[i]);
            nomeE[i].addItemListener(tratEstilo);
        }

        grupoT = new ButtonGroup();
        tamanhoF = new JRadioButtonMenuItem[4];
        TratadorT trataEstilo = new TratadorT();
        for(int i = 0; i < 4; i++){
            tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
            tamanho.add(tamanhoF[i]);
            grupoT.add(tamanhoF[i]);
            tamanhoF[i].addItemListener(trataEstilo);
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

        texto = new JTextArea(10,20);
        rolagem = new JScrollPane(texto);
        rolagem.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
        painel.add(rolagem);
        painel.setBounds(30,30,250,250);
        tela.add(painel);

        limpar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
                texto.requestFocus();
                azul.addActionListener( new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        texto.setForeground(Color.BLUE);
                        repaint();
                    }
                });
            }
        });

        verde.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.GREEN);
            }
        });

        vermelho.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.RED);
                repaint();
            }
        });

        amarelo.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.YELLOW);
                repaint();
            }
        });
        preto.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.BLACK);
                repaint();
            }
        });

        sair.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int respostas;
                respostas = JOptionPane.showConfirmDialog(null,
                        "Deseja realmente sair?",
                        "Sair",
                        JOptionPane.YES_NO_OPTION
                );
                if (respostas == 6) {
                    System.exit(0);
                }
            }
        });

        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class TratadorE implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if(nomeE[0].isSelected()){
                estiloFonte = Font.PLAIN;
            }
            if(nomeE[1].isSelected()){
                estiloFonte = Font.BOLD;
            }
            if(nomeE[2].isSelected()){
                estiloFonte = Font.ITALIC;
            }
            if(nomeE[3].isSelected()){
                estiloFonte = Font.BOLD + Font.ITALIC;
            }
            texto.setFont(new Font("", estiloFonte, tamFonte));
        }
    }

    private class TratadorT implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if(tamanhoF[0].isSelected()){
                tamFonte = 12;
            }
            if(tamanhoF[1].isSelected()){
                tamFonte = 14;
            }
            if(tamanhoF[2].isSelected()){
                tamFonte = 16;
            }
            if(tamanhoF[3].isSelected()){
                tamFonte = 18;
            }
            texto.setFont(new Font("", estiloFonte, tamFonte));
            repaint();
        }
    }
}
