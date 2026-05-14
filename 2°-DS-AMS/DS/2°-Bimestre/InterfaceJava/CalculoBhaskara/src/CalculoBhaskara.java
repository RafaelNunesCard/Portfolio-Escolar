import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoBhaskara extends JFrame {
    JLabel titulo,subtitulo,rotulo1,rotulo2,rotulo3,resposta1,resposta2;
    JTextField valorA,valorB,valorC,resultado1,resultado2;
    JButton Calcular;

    CalculoBhaskara(){
        super("Calculo Bhaskara");
        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("Formula de Bhaskara");
        subtitulo = new JLabel("ax² + bx + c = 0");
        rotulo1 = new JLabel("Valor de A:");
        rotulo2 = new JLabel("Valor de B:");
        rotulo3 = new JLabel("Valor de C:");
        resposta1 = new JLabel("x¹:");
        resposta2 = new JLabel("x²:");

        valorA = new JTextField();
        valorB = new JTextField();
        valorC = new JTextField();
        resultado1 = new JTextField();
        resultado2 = new JTextField();

        titulo.setBounds(50, 10, 300, 30);
        subtitulo.setBounds(100, 50, 200, 30);
        rotulo1.setBounds(50, 100, 100, 30);
        rotulo2.setBounds(50, 150, 100, 30);
        rotulo3.setBounds(50, 200, 100, 30);
        resposta1.setBounds(50, 300, 100, 30);
        resposta2.setBounds(50, 350, 100, 30);

        valorA.setBounds(160, 100, 100, 30);
        valorB.setBounds(160, 150, 100, 30);
        valorC.setBounds(160, 200, 100, 30);
        resultado1.setBounds(160, 300, 100, 30);
        resultado2.setBounds(160, 350, 100, 30);


        Calcular = new JButton("Calcular");
        Calcular.setBounds(150, 250, 100, 30);
        Calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a,b,c,delta,res1, res2;
                a = Double.parseDouble(valorA.getText());
                b = Double.parseDouble(valorB.getText());
                c = Double.parseDouble(valorC.getText());

                delta = Math.sqrt(b) - 4 * a * c;
                res1 = (- b + Math.pow(delta, 2)) /  (2 * a);
                res2 = (- b - Math.pow(delta, 2)) /  (2 * a);

                resultado1.setText(String.valueOf(res1));
                resultado2.setText(String.valueOf(res2));
            }
        });

        tela.add(titulo);
        tela.add(subtitulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(resposta1);
        tela.add(resposta2);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(valorC);
        tela.add(resultado1);
        tela.add(resultado2);
        tela.add(Calcular);

        setSize(400,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
