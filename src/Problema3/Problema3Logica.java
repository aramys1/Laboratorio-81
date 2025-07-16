package Problema3;

public class Problema3Logica {
    double montoAcumulado = 0;
    double tasaDeInteres = 0;
    double monto = 0;
    int plazo = 0;

    public Problema3Logica(double monto, int plazo) {
        this.monto = monto;
        this.plazo = plazo;
    }


    double CalcularMontoAcumulado(){
        switch (plazo) {
            case 1:
                tasaDeInteres = 0.04;
                break;
            case 2:
                tasaDeInteres = 0.045;
                break;
            case 4:
                tasaDeInteres = 0.0455;
                break;
            case 5:
                tasaDeInteres = 0.0475;
                break;
            case 6:
                tasaDeInteres = 0.05;
                break;
        }

        montoAcumulado = monto*Math.pow(1+tasaDeInteres, plazo);
        return montoAcumulado;
    }

}
