package lab8.Problema2;

import lab8.PanelPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPalindromos {
    private JTextField txtInicio;
    private JTextField txtFinal;
    private JButton buttonCalcular;
    private JLabel lbRespuesta;
    private JPanel PanelPrincipal;
    private JButton volverAlMenuButton;

    public PanelPalindromos(JFrame frame) {
        buttonCalcular.addActionListener(e -> calcularPalindromos());

        volverAlMenuButton.addActionListener(e -> {
            PanelPrincipal panelPrincipal = new PanelPrincipal(frame);
            frame.setContentPane(panelPrincipal.getPanel());
            frame.revalidate();
            frame.repaint();
        });
    }


    private void calcularPalindromos() {
        try {
            int inicio = Integer.parseInt(txtInicio.getText().trim());
            int fin = Integer.parseInt(txtFinal.getText().trim());

            if (inicio > fin) {
                lbRespuesta.setText("El inicio debe ser menor o igual que el final.");
                return;
            }

            int cantidad = LogicaProblema2.contarPalindromos(inicio, fin);
            lbRespuesta.setText("Cantidad de palíndromos: " + cantidad);
        } catch (NumberFormatException ex) {
            lbRespuesta.setText("Por favor, ingresa números válidos.");
        }
    }

    public JPanel getPanel() {
        System.out.println("¿PanelPrincipal es null? " + (PanelPrincipal == null));
        return PanelPrincipal;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}