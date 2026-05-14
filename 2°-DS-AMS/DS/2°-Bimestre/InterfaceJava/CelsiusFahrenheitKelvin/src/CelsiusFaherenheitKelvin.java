import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusFaherenheitKelvin extends JFrame {
    JLabel titulo, rotulo1, rotulo2, rotulo3, ce, fa, ke;
    JTextField celsius, fahrenheit, kelvin;
    JButton converter;

    public CelsiusFaherenheitKelvin() {
        super("Celsius Faherenheit Kelvin");
        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("Conversor de Temperatura");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.BLUE);

        rotulo1 = new JLabel("Celsius");
        rotulo2 = new JLabel("Fahrenheit");
        rotulo3 = new JLabel("Kelvin");

        ce = new JLabel("°C");
        fa = new JLabel("°F");//Por que EUA?
        ke = new JLabel("°K");

        celsius = new JTextField(5);
        fahrenheit = new JTextField(5);
        kelvin = new JTextField(5);

        converter = new JButton("Converter");
        converter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                double c, f, k;
                c =  Double.parseDouble(celsius.getText());
                f = (c * 1.8) + 32;
                k = c + 273.15;
                fahrenheit.setText(String.valueOf(f));
                kelvin.setText(String.valueOf(k));
            }
        });

        titulo.setBounds(110, 10, 300, 30);
        rotulo1.setBounds(50, 50, 100, 20);
        rotulo2.setBounds(50, 100, 100, 20);
        rotulo3.setBounds(50, 150, 100, 20);
        celsius.setBounds(150, 50, 100, 20);
        ce.setBounds(250, 50, 20, 20);
        fa.setBounds(250, 100, 100, 20);
        ke.setBounds(250, 150, 100, 20);
        fahrenheit.setBounds(150, 100, 100, 20);
        kelvin.setBounds(150, 150, 100, 20);
        converter.setBounds(175, 200, 150, 20);

        tela.add(titulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(celsius);
        tela.add(fahrenheit);
        tela.add(kelvin);
        tela.add(ce);
        tela.add(fa);
        tela.add(ke);
        tela.add(converter);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
