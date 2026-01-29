import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int contadorNoNumerico=0;
    public static int contadorRango=0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int intentos=0;
        int limiteIntentos=7;
        int minimo=1;
        int maximo=100;
        int secreto = random.nextInt(maximo)+minimo;
        boolean gano=false; //bandera
        System.out.println("Adivina el numero entre 1 y 100, tienes: "+limiteIntentos+" intentos");

        while (intentos<limiteIntentos && !gano){
            int valor=obtenerNumeroValido(minimo, maximo, scanner, "Intentos: "+(intentos+1));
            intentos++;
            if(valor== secreto){
                System.out.println("Ganaste en el "+intentos+" intento");
                gano=true;
                System.out.println("Ingresaste "+contadorNoNumerico+" valores no numericos");
                System.out.println("Igresaste "+contadorRango+" valores fuera del rango (1-100)");
            } else if (valor>secreto){
                System.out.println("El numero es menor");
            }else{
                System.out.println("El numero es mayor");
            }
        }
        if(!gano){
            System.out.println("Perdiste, el numero secreto era: "+secreto);
            System.out.println("Ingresaste "+contadorNoNumerico+" valores no numericos");
            System.out.println("Igresaste "+contadorRango+" valores fuera del rengo (1-100)");
        }
    }

    /**
     * Metodo para validar si el numero ingresado esta dentro del rango y si es un valor no numerico
     * @param minimo -> parametro
     * @param maximo -> parametro
     * @param scanner -> declarado en el main
     * @param mensaje -> parametro
     * @return int -> si el valor es numerico o no y si esta dentro del rango
     */
    public static int obtenerNumeroValido(int minimo, int maximo, Scanner scanner, String mensaje){
        int valor;
        while(true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                valor = scanner.nextInt();
                if(valor>=minimo && valor<=maximo){
                    return valor;
                }else {
                System.out.println("Numero fuera del rango, debe ser entre"+minimo+" y "+maximo);
                contadorRango++;
                }
            }else{
                System.out.println("El dato que ingresaste no es un numero");
                contadorNoNumerico++;
                scanner.next();
            }
        }
    }
}
