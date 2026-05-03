import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class ExemploTable extends JFrame{
    private JTable table;
    private final String colunas[] = {"Nome:", "Idade:", "Sexo:"};
    private final String dados[][] = {
            {"Derek", "17", "Masculino"},
            {"Cauã", "17", "Masculino"},
            {"Izidio", "18", "Masculino"},
            {"Marquinhos", "16", "Masculino"},
            {"Diego", "16", "Gay"},
            {"David", "17", "Masculino"},
            {"Ana", "16", "Feminino"},
            {"Einstein", "147", "Masculino"}
    };

    public ExemploTable(){
        setLayout(new FlowLayout()); // Tipo do Layout
        setSize(new Dimension(600,200)); // tamanho do formulario
        setLocationRelativeTo(null);
        setTitle("Exemplo JTable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setando a ação de fechamento dp Formulario,
                                                        // neste caso irá fechar o programa
        //Instanciando o JTable:
        table = new JTable(dados,colunas);
        table.setPreferredScrollableViewportSize(new Dimension(500,100)); //Barra de rolagem
        table.setFillsViewportHeight(true);

        //Adicionando a tabela em uma barra de rolagem, ficará envolta, pela mesma
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
    }

    public void iniciar(){
        new ExemploTable().setVisible(true);
    }
}
