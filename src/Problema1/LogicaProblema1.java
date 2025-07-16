package Problema1;

import javax.swing.DefaultListModel;

public class LogicaProblema1 {

    public DefaultListModel<Character> obtenerVocales(String palabra) {
        palabra = palabra.toLowerCase();
        DefaultListModel<Character> modelo = new DefaultListModel<>();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    modelo.addElement(letra);
                }
            }
        }

        return modelo;
    }

    public int contarVocales(DefaultListModel<Character> modelo) {
        return modelo.getSize();
    }
}