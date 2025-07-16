package Problema1;

import javax.swing.*;

public class PanelProblema1 {
    private JPanel panelProblema1;
    private JTextField CampoPalabra;
    private JButton Contarvocales;
    private JList<Character> list1;
    private JLabel Pregunta;


    public PanelProblema1(JFrame frame) {
        Contarvocales.addActionListener(e -> {
            LogicaProblema1 logica = new LogicaProblema1();

            String palabra = CampoPalabra.getText();
            DefaultListModel<Character> modelo = logica.obtenerVocales(palabra);
            list1.setModel(modelo);

            int cantidad = logica.contarVocales(modelo);
            JOptionPane.showMessageDialog(panelProblema1, "Cantidad de vocales: " + cantidad);
        });
    }

    public JPanel getPanel() {
        return panelProblema1;
    }
}
