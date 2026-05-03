import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList2 extends JFrame {
    JList lista;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espirito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul"};
    JButton exibir;
    JLabel rotulo;

    public ExemploJList2(){
        super("Exemplo de List");
        Container tela = getContentPane();
        setLayout(null);
        setSize(400,250);

        rotulo = new JLabel("");
        rotulo.setBounds(50,150,200,30);

        lista = new JList(cidades);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        painelRolagem.setBounds(40,50,150,100);

        exibir = new JButton("Exibir");
        exibir.setBounds(270,50,100,30);
        exibir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Object selecionados[] = lista.getSelectedValues();
                        String resultados = "Valores selecionados:\n";
                        for(int i = 0; i < selecionados.length; i++){
                            resultados += selecionados[i].toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null,resultados);
                    }
                }
        );

        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);

        setVisible(true);
    }
}
