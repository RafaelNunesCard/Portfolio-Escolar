import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoIMC extends JFrame {
    JLabel exibir,rotulo1,rotulo2, Kg,Cm;
    JTextField peso,altura;
    JButton calcular;

    public CalculoIMC(){
        super("Calculo IMC");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("Insira o peso:");
        rotulo2 = new JLabel("Insira a altura:");
        Kg = new JLabel("Kg");
        Cm = new JLabel("cm");
        exibir = new JLabel("");
        peso = new JTextField(10);
        altura = new JTextField(10);
        calcular = new JButton("Calcular");
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                double imc, p, a;

                p = Double.parseDouble(peso.getText());
                a = Double.parseDouble(altura.getText()) / 100;
                imc = p / Math.pow(a,2);
                exibir.setText("IMC :" + imc);
            }
        });


        rotulo1.setBounds(50,50,120,30);
        rotulo2.setBounds(50,100,120,30);
        exibir.setBounds(50,150,100,30);
        Kg.setBounds(285,50,120,30);
        Cm.setBounds(285,100,120,30);
        peso.setBounds(180,50,100,30);
        altura.setBounds(180,100,100,30);
        calcular.setBounds(125,150,100,30);

        tela.add(exibir);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(Kg);
        tela.add(Cm);
        tela.add(peso);
        tela.add(altura);
        tela.add(calcular);

        setSize(350,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
