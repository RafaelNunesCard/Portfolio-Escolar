import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ExemploRadioButton extends JFrame {
    JRadioButton primeira, segunda, terceira, quarta, quinta;
    JLabel rotulo1, rotulo2;
    JButton exibir;
    ButtonGroup grupo;

    public ExemploRadioButton() {
        super("Exemplo de um RadioButton");
        Container tela = getContentPane();
        tela.setLayout(null);

        rotulo1 = new JLabel("Escolha a Cidade: ");
        rotulo1.setBounds(50, 20, 200, 20);

        rotulo2 = new JLabel("");
        rotulo2.setBounds(150, 240, 400, 20);

        exibir = new JButton("Exibir");
        exibir.setBounds(200, 200, 120, 20);

        primeira = new JRadioButton("Rio de Janeiro");
        segunda = new JRadioButton("São Paulo");
        terceira = new JRadioButton("Minas Gerais");
        quarta = new JRadioButton("Amazonas");
        quinta = new JRadioButton("Rio Grande do Sul");

        primeira.setBounds(50, 50, 120, 20);
        segunda.setBounds(50, 80, 120, 20);
        terceira.setBounds(50, 110, 120, 20);
        quarta.setBounds(50, 140, 120, 20);
        quinta.setBounds(50, 170, 160, 20);

        primeira.setMnemonic(KeyEvent.VK_J);
        segunda.setMnemonic(KeyEvent.VK_C);
        terceira.setMnemonic(KeyEvent.VK_D);
        quarta.setMnemonic(KeyEvent.VK_V);
        quinta.setMnemonic(KeyEvent.VK_P);

        grupo = new ButtonGroup();
        grupo.add(primeira);
        grupo.add(segunda);
        grupo.add(terceira);
        grupo.add(quarta);
        grupo.add(quinta);

        exibir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(primeira.isSelected() == true) {
                            rotulo2.setText("A cidade escolhida foi: " + primeira.getText());
                        }
                        if(segunda.isSelected() == true) {
                            rotulo2.setText("A cidade escolhida foi: " + segunda.getText());
                        }
                        if(terceira.isSelected() == true) {
                            rotulo2.setText("A cidade escolhida foi: " + terceira.getText());
                        }
                        if(quarta.isSelected() == true) {
                            rotulo2.setText("A cidade escolhida foi: " + quarta.getText());
                        }
                        if(quinta.isSelected() == true) {
                            rotulo2.setText("A cidade escolhida foi: " + quinta.getText());
                        }
                    }
                }
        );

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
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
