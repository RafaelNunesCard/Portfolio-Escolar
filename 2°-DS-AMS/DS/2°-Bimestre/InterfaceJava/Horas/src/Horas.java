import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

public class Horas extends JFrame {
    JLabel rotulo1, rotulo2;
    int hh,mm,ss,h;
    Calendar hora;
    DecimalFormat formato;

    public Horas() {
        super("Horas");
        Container tela = getContentPane();
        tela.setLayout(null);

        rotulo1 = new JLabel("");
        rotulo1.setBounds(100,60,280,20);

        rotulo2 = new JLabel("Hora no Formato hhmmss");
        rotulo2.setBounds(600,5,280,20);

        ActionListener tarefa = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HORAS();
            }
        };

        javax.swing.Timer timer = new javax.swing.Timer(1000,tarefa);
        timer.start();

        tela.add(rotulo1);
        tela.add(rotulo2);
        setSize(300,200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    private void HORAS(){
        hora = Calendar.getInstance();
        hh = hora.get(Calendar.HOUR_OF_DAY);
        mm = hora.get(Calendar.MINUTE);
        ss = hora.get(Calendar.SECOND);
        rotulo1.setText("Hora: "+formatar(hh)+":"+formatar(mm)+":"+formatar(ss));
    }
    private String formatar(int num){
        formato = new DecimalFormat("00");
        return formato.format(num);
    }
}
