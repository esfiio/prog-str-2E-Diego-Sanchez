import java.util.Scanner;

public class Main {
    public static double pi=3.1416;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Obtener el IMC");
            System.out.println("2. Obtener el area de un rectangulo");
            System.out.println("3. Pasar de °C a °F");
            System.out.println("4. Obtener area de un circulo");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Quieres calcular e IMC:");
                    double pesoKg = obtenerDouble(sc, "Ingresa el peso en KG");
                    double alturaM = obtenerDouble(sc, "Ingresa la altura en M -> 1.80");
                    double IMC = calcularIMC(pesoKg, alturaM);
                    System.out.println("IMC: " + IMC);
                    break;
                case 2:
                    System.out.println("Deseas obtener el area de un rectangulo");
                    double baseCm = obtenerDouble(sc, "Ingresa la base del rectangulo en CM");
                    double alturaCm = obtenerDouble(sc, "Ingresa la altura del rectangulo en CM");
                    double AreaRectangulo = calcularAreaRectangulo(baseCm, alturaCm);
                    System.out.println("El area del rectangulo es: " + AreaRectangulo);
                    break;
                case 3:
                    System.out.println("Deseas pasar de C° a F: ");
                    double c = obtenerDouble(sc, "Ingresa los grados Celcius (C)");
                    double GradosAFahreheit = pasarGradosAFahrenheit(c);
                    System.out.println("La conversion a grados fahrenheit es: " + GradosAFahreheit);
                    break;
                case 4:
                    System.out.println("Deseas calcular el area de un circulo");
                    double radioCM = obtenerDouble(sc, "Ingresa la medida del radio en CM: ");
                    double AreaCirculo = calcularAreaCirculo(pi, radioCM);
                    System.out.println("El area del circulo es:" + AreaCirculo);
                    break;
                case 5:
                    System.out.println("Opcion invalida. Intente de nuevo");
            }

        } while (opcion != 5);

    }

    /**
     * Metodo que retorna el valor que ingresamos en la terminal
     * @param sc -> declarado en el main
     * @param mensaje -> es un parametro
     * @return -> double
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo para obtener el IMC como lo vimos en clase
     * @param pesoKg -> peso en KG
     * @param alturaM -> peso en metros M
     * @return double IMC
     */
    public static double calcularIMC(double pesoKg, double alturaM){
        return pesoKg/(alturaM*alturaM);
    }

    /**
     * Metodo para obtener el area del rectangulo
     * @param baseCm -> base en CM
     * @param alturaCm -> altura en CM
     * @return -> double Area del Rectangulo
     */

    public static double calcularAreaRectangulo(double baseCm, double alturaCm){
        return baseCm*alturaCm;
    }

    /**
     * Metodo para pasar de Grados celcius a Fahrenheit
     * @param c -> temperatura en grados celsius
     * @return -> Grados Farenheit
     */
    public static double pasarGradosAFahrenheit(double c){
        return (c*1.8)+32;
    }

    /**
     * Metodo para sacar el area del circulo
     * @param pi -> constante de pi (3.1416)
     * @param radioCM -> medida del raido en CM
     * @return -> area del circulo
     */
    public static double calcularAreaCirculo(double pi, double radioCM){
        return pi*(radioCM*radioCM);
    }
}