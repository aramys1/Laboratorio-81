package lab8;

import Problema3.PanelProblema3;
import lab8.Problema2.PanelPalindromos;

import javax.swing.*;

public class PanelPrincipal {
    private JPanel PanelPrincipal;
    private JButton buttonProblema2;
    private JButton buttonProblema1;
    private JButton BTNproblema3;


    public PanelPrincipal(JFrame frame) {


        buttonProblema2.addActionListener(e -> {
            PanelPalindromos panelPalindromos = new PanelPalindromos();
            frame.setContentPane(panelPalindromos.getPanel());
            frame.revalidate();
            frame.repaint();
        });
        BTNproblema3.addActionListener(e -> {
            PanelProblema3 panelProblema3 = new PanelProblema3(frame);
            frame.setContentPane(panelProblema3.getPanel1());
            frame.revalidate();
            frame.repaint();
        });

    }
    public JPanel getPanel() {
        return PanelPrincipal;
    }
}
