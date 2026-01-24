import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        imprimirMenu();
        int opcion= sc.nextInt();

        switch(opcion){
            case 1:
                double suma=obtenerSuma(sc);
                System.out.println("El resultado de la suma es: "+ suma);
                break;
            case 2:
                double resta=obtenerResta(sc);
                System.out.println("El resultado de la resta es: "+ resta);
                break;
            case 3:
                double multiplicacion=obtenerMultiplicacion(sc);
                System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
                break;
            case 4:
                double division=obtenerDivision(sc);
                System.out.println("El resultado de la multiplicacion es: "+ division);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    /**
     * Metodo para obtener double -> Variables de las operaciones
     * @param sc -> declarado anteriormente en el main
     * @param mensaje -> parametro
     * @return -> double numeros a operar
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo para imprimir el menu
     */
    public static void imprimirMenu(){
        System.out.println("-------Menú-------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige la operación que desees realizar:");
    }

    /**
     * Metodo para obtener suma
     * @param sc -> declarado en el main
     * @return -> double de la suma de las dos variables
     */
    public static double obtenerSuma(Scanner sc){
        System.out.println("-----Elegiste hacer una suma-----");
        double variableA= obtenerDouble(sc, "Ingresa el primer numero de a operación:");
        double variableB= obtenerDouble(sc,"Ingresa el segundo numero de la operación:");
        System.out.println("Los numeros que ingresaste fueron: "+ variableA+" y "+ variableB);
        return variableA+variableB;
    }

    /**
     *Metodo para obtener la resta
     * @param sc -> declara en el main
     * @return -> double de la resta de las 2 variables
     */
    public static double obtenerResta(Scanner sc){
        System.out.println("-----Elegiste hacer una resta-----");
        double variableA= obtenerDouble(sc, "Ingresa el primer numero de a operación:");
        double variableB= obtenerDouble(sc,"Ingresa el segundo numero de la operación:");
        System.out.println("Los numeros que ingresaste fueron: "+ variableA+" y "+ variableB);
        return variableA-variableB;
    }

    /**
     * Metodo para obtener la multiplicacion
     * @param sc -> scanner definido en el main
     * @return -> double de la multiplicacion de las 2 variables
     */
    public static double obtenerMultiplicacion(Scanner sc){
        System.out.println("-----Elegiste hacer una multiplicacion-----");
        double variableA= obtenerDouble(sc, "Ingresa el primer numero de la operación:");
        double variableB= obtenerDouble(sc, "Ingresa el segundo numero de la operación:");
        System.out.println("Los numeros que ingresaste fueron: "+ variableA+" y "+ variableB);
        return variableA*variableB;
    }

    /**
     * Metodo para obtener la division
     * @param sc -> scanner declarado en el main
     * @return -> double de la division de las 2 variables
     */
    public static double obtenerDivision(Scanner sc){
        System.out.println("-----Elegiste hacer una division-----");
        double variableA= obtenerDouble(sc, "Ingresa el primer numero de la operación:");
        double variableB= obtenerDouble(sc, "Ingresa el segundo numero de la operación:");
        System.out.println("Los numeros que ingresaste fueron: "+ variableA+" y "+ variableB);
        if(variableB==0){
            System.out.println("No se puede dividir entre 0");
        }
        return variableA/variableB;
    }
}
