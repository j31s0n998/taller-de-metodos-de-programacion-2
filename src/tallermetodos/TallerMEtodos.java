/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallermetodos;

/**
 *
 * @author USUARIO
 */
public class TallerMEtodos {

    public class Calculadora {

    public static double calcularPrecioConDescuento(double precio, double descuento) {
        return precio * (1 - descuento / 100);
    }

    public static double calcularRectangulo(double lado1, double lado2, String tipoCalculo) {
        if (tipoCalculo.equals("perimetro")) {
            return 2 * (lado1 + lado2);
        } else if (tipoCalculo.equals("area")) {
            return lado1 * lado2;
        } else {
            return -1;
        }
    }

    public static double calcularCambioDolaresAEuros(double dolares) {
        final double TASA_CAMBIO = 1.33250;
        return dolares / TASA_CAMBIO;
    }

    public static double calcularCirculo(double radio, String tipoCalculo) {
        final double PI = 3.1416;
        if (tipoCalculo.equals("perimetro")) {
            return 2 * PI * radio;
        } else if (tipoCalculo.equals("area")) {
            return PI * radio * radio;
        } else if (tipoCalculo.equals("volumen")) {
            return (4 * PI * Math.pow(radio, 3)) / 3;
        } else {
            return -1;
        }
    }

    public static int calcularSegundosTotales(int dias, int horas, int minutos) {
        return dias * 24 * 60 * 60 + horas * 60 * 60 + minutos * 60;
    }

    public static void calcularTiempo(int segundos, String tipo) {
        int dias = segundos / (24 * 60 * 60);
        int horas = (segundos % (24 * 60 * 60)) / (60 * 60);
        int minutos = ((segundos % (24 * 60 * 60)) % (60 * 60)) / 60;
        int segs = ((segundos % (24 * 60 * 60)) % (60 * 60)) % 60;

        if (tipo.equals("dias")) {
            System.out.println("Días: " + dias);
        } else if (tipo.equals("horas")) {
            System.out.println("Horas: " + horas);
        } else if (tipo.equals("minutos")) {
            System.out.println("Minutos: " + minutos);
        } else {
            System.out.println("Segundos: " + segs);
        }
    }
}
    
    
}
