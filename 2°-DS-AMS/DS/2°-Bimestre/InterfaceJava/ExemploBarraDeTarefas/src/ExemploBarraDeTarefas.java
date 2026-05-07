import javax.swing.*;
import java.awt.*;

public class ExemploBarraDeTarefas extends JFrame {
    JToolBar barra;
    JButton direita,esquerda,centralizar,recortar,copiar,colar;
    ImageIcon imagens[];

    public ExemploBarraDeTarefas() {
        super("Exemplo Barra de Ferramentas");
        Container tela = getContentPane();
        tela.setBackground(Color.YELLOW);
        tela.setLayout(null);

        String icones[] = {"Icones/direita.gif","Icones/esquerda.gif", "Icones/centro.gif",
                            "Icones/recortar.gif","Icones/copiar.gif", "Icones/colar.png"};
        imagens = new ImageIcon[icones.length];
        for (int i = 0; i < imagens.length; i++) {
            imagens[i] = new ImageIcon(icones[i]);
        }
        direita = new JButton(imagens[0]);
        esquerda = new JButton(imagens[1]);
        centralizar = new JButton(imagens[2]);
        recortar = new JButton(imagens[3]);
        copiar = new JButton(imagens[4]);
        colar = new JButton(imagens[5]);

        direita.setToolTipText("Direita (Ctrl+D)");
        esquerda.setToolTipText("Esquerda (Ctrl+E)");
        centralizar.setToolTipText("Centralizar (Ctrl+Z)");
        recortar.setToolTipText("Recortar (Ctrl+X)");
        copiar.setToolTipText("Copiar (Ctrl+C)");
        colar.setToolTipText("Colar (Ctrl+V)");

        barra = new JToolBar("Barra de Ferramentas");
        UIManager.put("ToolTip.background", SystemColor.info);
        UIManager.put("ToolTip.foreground", Color.blue);
        barra.setRollover(true);
        barra.add(direita);
        barra.add(esquerda);
        barra.add(centralizar);
        barra.add(recortar);
        barra.add(copiar);
        barra.add(colar);
        barra.setBounds(1, 1, 260, 50);

        tela.add(barra);

        setSize(320, 240);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
