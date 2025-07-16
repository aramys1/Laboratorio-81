package lab8.Problema2;

public class LogicaProblema2 {

    public static int contarPalindromos(int inicio, int fin) {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esPalindromo(i)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esPalindromo(int numero) {
        String str = String.valueOf(numero);
        int izquierda = 0, derecha = str.length() - 1;
        while (izquierda < derecha) {
            if (str.charAt(izquierda++) != str.charAt(derecha--)) return false;
        }
        return true;
    }
}
