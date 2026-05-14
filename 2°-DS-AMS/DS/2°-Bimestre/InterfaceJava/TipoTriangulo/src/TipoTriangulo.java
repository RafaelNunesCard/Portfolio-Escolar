import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipoTriangulo extends JFrame {
    JLabel lado1, lado2, lado3, exibir;
    JTextField l1,l2, l3;
    JButton Descobrir;

    public TipoTriangulo() {
        super("Tipo Triangulo");
        Container tela = getContentPane();
        setLayout(null);

        lado1 = new JLabel("Lado 1:");
        lado2 = new JLabel("Lado 2:");
        lado3 = new JLabel("Base:");
        exibir = new JLabel();

        l1 = new JTextField(5);
        l2 = new JTextField(5);
        l3 = new JTextField(5);

        lado1.setBounds(50, 50, 100, 30);
        lado2.setBounds(50, 100, 100, 30);
        lado3.setBounds(50, 150, 100, 30);
        exibir.setBounds(50, 200, 100, 30);

        l1.setBounds(150, 50, 100, 30);
        l2.setBounds(150, 100, 100, 30);
        l3.setBounds(150, 150, 100, 30);

        Descobrir = new JButton("Descobrir");
        Descobrir.setBounds(150, 200, 100, 30);
        Descobrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a,b,c;

                a = Double.parseDouble(l1.getText());
                b = Double.parseDouble(l2.getText());
                c = Double.parseDouble(l3.getText());

                if(a==b && a==c && b==c){
                    exibir.setText("Equilatero");
                }else if(b!=a && b!=c && a!=b){
                    exibir.setText("Escaleno");
                }else{
                    exibir.setText("Isosceles");
                }
            }
        });

        tela.add(lado1);
        tela.add(lado2);
        tela.add(lado3);
        tela.add(exibir);
        tela.add(l1);
        tela.add(l2);
        tela.add(l3);
        tela.add(Descobrir);

        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
