package lab8;

import lab8.Problema2.PanelPalindromos;

import javax.swing.*;

public class PanelPrincipal {
    private JPanel PanelPrincipal;
    private JButton buttonProblema2;
    private JButton buttonProblema1;

    public PanelPrincipal(JFrame frame) {
        buttonProblema2.addActionListener(e -> {
            PanelPalindromos panelPalindromos = new PanelPalindromos();
            frame.setContentPane(panelPalindromos.getPanel());
            frame.revalidate();
            frame.repaint();
        });
    }
    public JPanel getPanel() {
        return PanelPrincipal;
    }
}
