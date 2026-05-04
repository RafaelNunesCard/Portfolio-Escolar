import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparTexto extends JFrame {
    JLabel rotulo1, rotulo2;
    JTextField texto1, texto2;
    JButton limpar;

    public LimparTexto(){
        super("Exemplo Limpar");
        Container tela = getContentPane();
        setLayout(null);
        setSize(400,250);

        rotulo1 = new JLabel("1° Número: ");
        rotulo1.setBounds(50,20,100,20);

        rotulo2 = new JLabel("2° Número: ");
        rotulo2.setBounds(50,60,100,20);

        texto1 = new JTextField(5);
        texto1.setBounds(120,20,100,20);

        texto2 = new JTextField(5);
        texto2.setBounds(120,60,100,20);

        limpar = new JButton("Limpar");
        limpar.setBounds(150,100,80,20);
        limpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);

                        texto1.requestFocus();
                    }
                }
        );

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(limpar);
        setVisible(true);
    }
}
