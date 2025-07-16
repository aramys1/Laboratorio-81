package Problema3;

import javax.swing.*;

public class PanelProblema3 {
    private JPanel panel1;
    private JLabel LBLtitulo;
    private JLabel LBLnombre;
    private JLabel LBLcedula;
    private JTextField TXTnombre;
    private JTextField TXTcedula;
    private JTextField TXTmonto;
    private JLabel LBLmonto;
    private JLabel LBLrespuesta;
    private JLabel LBLplazoindicacion;
    private JTextField TXTplazo;
    private JButton BTNcalcular;


    public PanelProblema3() {
        BTNcalcular.addActionListener(e -> {
            try {
                String nombre = TXTnombre.getText();
                String cedula = TXTcedula.getText();
                double monto = Double.parseDouble(TXTmonto.getText());
                int plazo = Integer.parseInt(TXTplazo.getText());
                Problema3Logica logica = new Problema3Logica(monto, plazo);

                nombre.trim();
                if(nombre != "" && cedula != "" && monto > 2000 && plazo >= 1 && plazo < 7){
                    if(nombre.matches("^[a-zA-Z\\s]+$") && cedula.matches("^[0-9\\\\-]+$")){
                        LBLrespuesta.setText(String.valueOf(logica.CalcularMontoAcumulado()));
                    }
                    else{
                        LBLrespuesta.setText("Nombre o cedula no son validos");
                    }
                }
                else{
                    LBLrespuesta.setText("Rellene todos los campos con datos validos");
                }

            } catch (NumberFormatException er) {
                LBLrespuesta.setText("Error, hay un valor no valido");
            } catch (RuntimeException ex) {
                throw new RuntimeException(ex);
            }

        });

    }
    public JPanel getPanel1 () {
        return panel1;
    }
}

