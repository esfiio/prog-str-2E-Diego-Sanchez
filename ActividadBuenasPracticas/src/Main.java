import java.util.Scanner;

public class Main{
    public static int SUMA=0;
    public static int INTERVALO=0;

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int resultado= hacerSuma(sc);
        System.out.print("El resultado es: "+ resultado);

    }

    /**
     * Metodo para pedir el numero entero
     * @param sc -> declarado en el main
     * @param mensaje -> es un parametro
     * @return -> Int
     */
    public static int pedirEntero(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo para sumar hasta n
     * @param sc -> input que nos dara el usuario
     * @return -> int de la suma
     */
    public static int hacerSuma(Scanner sc){
        int numero = pedirEntero(sc, "Ingresa el numero hasta el que quieres sumar: ");
        for (int INTERVALO = 1; INTERVALO <= numero; INTERVALO++) {
            SUMA += INTERVALO;
        }
        return SUMA;
    }

}