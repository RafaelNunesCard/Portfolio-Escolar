import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularMedia extends JFrame {
    JLabel rotulo1, rotulo2,rotulo3,rotulo4, exibir;
    JTextField valor1, valor2, valor3, valor4;
    JButton calcular;
    CalcularMedia() {
        super("Calcular Media");
        Container tela = getContentPane();

        rotulo1 = new JLabel("Digite o valor da 1: ");
        rotulo2 = new JLabel("Digite o valor da 2: ");
        rotulo3 = new JLabel("Digite o valor da 3: ");
        rotulo4 = new JLabel("Digite o valor da 4: ");
        exibir = new JLabel("");

        rotulo1.setBounds(50, 50, 130, 30);
        rotulo2.setBounds(50, 100, 130, 30);
        rotulo3.setBounds(50, 150, 130, 30);
        rotulo4.setBounds(50, 200, 130, 30);
        exibir.setBounds(50, 250, 130, 30);

        valor1 = new JTextField();
        valor2 = new JTextField();
        valor3 = new JTextField();
        valor4 = new JTextField();

        valor1.setBounds(190, 50, 100, 30);
        valor2.setBounds(190, 100, 100, 30);
        valor3.setBounds(190, 150, 100, 30);
        valor4.setBounds(190, 200, 100, 30);

        calcular = new JButton("Calcular");
        calcular.setBounds(130, 250, 100, 30);
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1, num2, num3, num4, Media;
                 num1 = Integer.parseInt(valor1.getText());
                 num2 = Integer.parseInt(valor2.getText());
                 num3 = Integer.parseInt(valor3.getText());
                 num4 = Integer.parseInt(valor4.getText());

                 Media = (num1 + num2 + num3 + num4)/4;
                 exibir.setText("Media: " + Media);
            }
        });

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(valor1);
        tela.add(valor2);
        tela.add(valor3);
        tela.add(valor4);
        tela.add(calcular);
        tela.add(exibir);

        setSize(400, 400);
        setVisible(true);
    }
}
