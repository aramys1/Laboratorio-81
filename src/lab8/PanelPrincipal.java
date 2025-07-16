package lab8;

import lab8.Problema2.PanelPalindromos;

import javax.swing.*;

public class PanelPrincipal {
    private JPanel PanelPrincipal; // Panel raíz del formulario .form
    private JButton buttonProblema2; // ← Nombre actualizado del botón
    private JButton p1Button;

    public PanelPrincipal(JFrame frame) {
        buttonProblema2.addActionListener(e -> {
            // Cambiar al panel del Problema 2 (PanelPalindromos)
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
