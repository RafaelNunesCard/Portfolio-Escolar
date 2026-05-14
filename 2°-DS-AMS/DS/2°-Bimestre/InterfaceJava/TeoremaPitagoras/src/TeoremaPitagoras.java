import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeoremaPitagoras extends JFrame {
    JLabel rotulo1,rotulo2,exibir;
    JTextField valorA, valorB;
    JButton Calcular;

    TeoremaPitagoras() {
        super("Teorema Pitagoras");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("Valor do 1° cateto:");
        rotulo2 = new JLabel("Valor do 2° cateto:");
        exibir = new JLabel("");

        valorA = new JTextField(10);
        valorB = new JTextField(10);

        Calcular = new JButton("Calcular");
        Calcular.setBounds(170, 150, 100, 30);

        rotulo1.setBounds(50, 50, 120, 30);
        rotulo2.setBounds(50, 100, 120, 30);
        exibir.setBounds(50, 150, 120, 30);

        valorA.setBounds(170, 50, 100, 30);
        valorB.setBounds(170, 100, 100, 30);

        Calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a,b,c;

                a = Double.parseDouble(valorA.getText());
                b = Double.parseDouble(valorB.getText());

                c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                exibir.setText("Hipotenusa: " + c);
            }
        });

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(Calcular);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}