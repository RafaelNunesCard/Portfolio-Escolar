import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploCheckBox extends JFrame {
    JCheckBox primeira, segunda, terceira, quarta, quinta;
    JLabel vazio, rotulo;
    JButton botao;

    public ExemploCheckBox() {
        super("Exemplo de um JCheckBox");
        Container tela = getContentPane();
        tela.setLayout(null);

        rotulo = new JLabel("Quais suas linguagens favoritas?");
        rotulo.setBounds(40, 30, 200, 20);
        tela.add(rotulo);

        primeira = new JCheckBox("Java");
        primeira.setMnemonic(KeyEvent.VK_J);
        primeira.setBounds(40, 60, 80, 20);
        primeira.setSelected(false); // Inicia a caixa de seleção marcada
        primeira.setForeground(Color.blue); // Alterando a cor da letra

        segunda = new JCheckBox("C++");
        segunda.setMnemonic(KeyEvent.VK_C);
        segunda.setBounds(120,60,80,20);

        terceira = new JCheckBox("Python");
        terceira.setMnemonic(KeyEvent.VK_P);
        terceira.setBounds(210,60,80,20);

        quarta = new JCheckBox("TypeScript");
        quarta.setMnemonic(KeyEvent.VK_T);
        quarta.setBounds(300,60,80,20);

        quinta = new JCheckBox("Ruby");
        quinta.setMnemonic(KeyEvent.VK_R);
        quinta.setBounds(390,60,80,20);

        botao = new JButton("Exibir");
        botao.setBounds(200,150,100,20);
        botao.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String escolhas = "";
                        if (primeira.isSelected() == true){
                            escolhas = escolhas + "" + primeira.getText() ;
                        }
                        if (segunda.isSelected() == true){
                            escolhas = escolhas + "" + segunda.getText() ;
                        }
                        if (terceira.isSelected() == true){
                            escolhas = escolhas + "" + terceira.getText() ;
                        }
                        if (quarta.isSelected() == true){
                            escolhas = escolhas + "" + quarta.getText() ;
                        }
                        if (quinta.isSelected() == true){
                            escolhas = escolhas + "" + quinta.getText() ;
                        }
                        vazio.setText("Voce escolheu: " + escolhas);
                    }
                }
        );

        vazio = new JLabel("");
        vazio.setBounds(100,200,600,20);


        //Adicionando os componetes a tela:
        tela.add(rotulo);
        tela.add(vazio);
        tela.add(botao);
        tela.add(primeira);
        tela.add(segunda);
        tela.add(terceira);
        tela.add(quarta);
        tela.add(quinta);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}