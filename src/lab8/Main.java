package lab8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");
        PanelPrincipal panelPrincipal = new PanelPrincipal(frame);

        frame.setContentPane(panelPrincipal.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
