import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJComboBox extends JFrame {
    JComboBox lista;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espirito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre"};
    JButton exibir;
    JLabel rotulo;

    public ExemploJComboBox(){
        super("Exemplo de JComboBox");
        Container tela = getContentPane();
        setLayout(null);
        setSize(400,250);

        exibir = new JButton("Exibir");
        exibir.setBounds(270,50,100,30);
        exibir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rotulo.setText("O estado é: " + lista.getSelectedItem().toString());
                    }
                }
        );

        rotulo = new JLabel("");
        rotulo.setBounds(50,150,200,30);

        lista = new JComboBox(cidades);
        lista.setMaximumRowCount(5);
        lista.setBounds(50,50,150,30);

        //Adicionando componentes na Tela:
        tela.add(exibir);
        tela.add(rotulo);
        tela.add(lista);

        setVisible(true);
    }
}
