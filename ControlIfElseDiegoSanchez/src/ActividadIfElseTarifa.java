import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static int MAYORDEEDADVALIDA=120;
    public static int MENORDEEDADVALIDA=0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad = obtenerInt(sc, "Ingresa tu edad: ");
        if (validarEdad(MAYORDEEDADVALIDA, MENORDEEDADVALIDA, edad)){
            System.out.println("La edad es valida");
        }else{
            System.out.println("La edad no es valida");
            System.exit(0);
        }
        boolean esEstudiante = obtenerBooleano(sc, "¿Eres estudiante? (responde con true o false): ");

        System.out.println("La edad del usuario es: " + edad);
        System.out.println("El usuario es estudiante: " + esEstudiante);
        System.out.println(obtenerTarifa(edad, esEstudiante));

    }

    /**
     * Metodo para obtener la edad del usuario
     * @param sc -> declarado en el main
     * @param mensaje -> es un parametro
     * @return int -> edad del usuario
     */
    public static int obtenerInt(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     *Metodo para saber si es estudiante
     * @param sc -> declarado en el main
     * @param mensaje -> es un parametro
     * @return booleano -> cierto o falso
     */
    public static boolean obtenerBooleano(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextBoolean();
    }

    /**
     *Metodo para validar si la edad del usuario es valida respecto a los requerimientos
     * @param MAYORDEEDADVALIDA -> constante delarada
     * @param MENORDEEDADVALIDA -> constante declara
     * @param edad -> eda ingresada del usuario
     * @return -> boolean
     */
    public static boolean validarEdad(int MAYORDEEDADVALIDA, int MENORDEEDADVALIDA, int edad){
        if (edad>MENORDEEDADVALIDA && edad<MAYORDEEDADVALIDA){
            return true;
        }else {
            return false;
        }
    }

    /**
     *Metodo if para obtener la tarifa
     * @param edad -> edad ingresada por el usuario
     * @param esEstudiante -> metodo para saber si el usuario es estudiante o no
     * @return -> int tarifa
     */
    public static String obtenerTarifa(int edad, boolean esEstudiante) {
        if (edad > 0 && edad < 120) {
            if (edad < 12) {
                return "La tarifa es de $50";
            } else if (edad >= 12 && edad < 17) {
                if (esEstudiante) {
                    return "La tarifa es de $60";
                } else {
                    return "La tarifa es de $80";
                }
            } else if(edad>=18){
                if(esEstudiante){
                    return "La tarifa es de $90";
                } else{
                    return "La tarifa es de  $120";
                }
            }
        } else return "Edad invalida";
        return "";
    }
}

