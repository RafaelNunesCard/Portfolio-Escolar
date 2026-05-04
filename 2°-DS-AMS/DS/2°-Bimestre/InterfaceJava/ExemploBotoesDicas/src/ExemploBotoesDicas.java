import javax.swing.*;
import java.awt.*;

public class ExemploBotoesDicas extends JFrame {
    JButton botao1, botao2;

    public ExemploBotoesDicas() {
        super("Exemplo botoes dicas");
        Container tela = getContentPane();
        tela.setLayout(null);

        // Configurar UIManager ANTES de criar os componentes
        UIManager.put("ToolTip.background", new Color(255, 255, 200)); // amarelo claro
        UIManager.put("ToolTip.foreground", Color.BLUE);
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 12));
        UIManager.put("ToolTip.border", BorderFactory.createLineBorder(Color.GRAY));

        botao1 = new JButton("Olá");
        botao2 = new JButton("Sair");

        // Para ver precisa apertar ctrl:
        botao1.setToolTipText("Botão usado para abrir algo");
        botao2.setToolTipText("Botão usado para Sair");

        botao1.setBounds(100, 50, 100, 20);
        botao2.setBounds(100, 100, 100, 20);

        tela.add(botao1);
        tela.add(botao2);

        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
