//- nombre del alumno (String) (no vacío)
//- 3 calificaciones parciales (double) de 0 a 100
//- asistencia (int) de 0 a 100
//- entregaProyecto (boolean) true/fal
import java.util.Scanner;
public class InputValidator {

    /**
     * metodo para validar que el nombre sea string
     * @param scanner parametro
     * @param mensaje parametro
     * @return string -> nombre del alumno
     */
    public static String leerTextoNoVacio(Scanner scanner, String mensaje){
        String texto = "";
        boolean esValido = false;
        while (!esValido){
            System.out.println(mensaje);
            if(scanner.hasNextLine()){
                texto = scanner.nextLine();
                //esValido = true;
                if(validarSoloLetras(texto)) {
                    esValido = true;
                }else{
                    System.out.println("El nombre no contener numeros o caracteres especiales, ingresa tu nombre de nuevo");
                }
            }
        }
        return texto;
    }

    /**
     * Metodo para validar que el string que ingresa el usuario solo contenga letras, no numeros, etc
     * @param texto parametro
     * @return booleano
     */
    public static boolean validarSoloLetras(String texto){
        if(texto==null || texto.isEmpty()){
            return false;
        }
        for(int i=0; i < texto.length(); i++){
            char letraActual = texto.charAt(i);
            if(!Character.isLetter(letraActual) && letraActual!= ' '){
                return false;
            }
        }
        return true;
    }

    /**
     * metodo para obtener la calificacion del estudainte
     * @param scanner parametro
     * @param mensaje parametro
     * @param min parametro
     * @param max parametro
     * @return double -> calificacion del parcial
     */
    public static double leerDoubleEnRango(Scanner scanner, String mensaje, double min, double max){
        double calificacion = 0;
        boolean esValido = false;

        while (!esValido) {
            System.out.println(mensaje);
            if (scanner.hasNextDouble()) {
                calificacion = scanner.nextDouble();
                if (calificacion >= min && calificacion <= max) {
                    esValido = true;
                }else {
                    System.out.println("La calificacion esta fuera del rango");
                }
            }else{
                System.out.println("El dato ingresado no es valido");
                scanner.nextLine();
            }
        }
        return calificacion;
    }

    /**
     * metodo para obtener la asistencia del usuario
     * @param scanner parametro
     * @param mensaje parametro
     * @param min parametro
     * @param max parametro
     * @return int -> asistencia del usuario
     */
    public static int leerIntEnRango(Scanner scanner, String mensaje, int min, int max){
        int asistencia = 0;
        boolean esValido = false;

        while (!esValido){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                asistencia = scanner.nextInt();
                if(asistencia>min && asistencia<max){
                    esValido = true;
                }else {
                    System.out.println("La asistencia esta fuera del rango, debe ser entre " + min + " y " + max);
                }
            }else{
                System.out.println("El dato ingresado no es valido");
                scanner.next();
            }
        }
        return asistencia;

    }

    /**
     * metodo para saber si el usuario entrego sui proyecto final
     * @param scanner parametro
     * @param mensaje parametro
     * @return boolean -> true o false
     */
    public static boolean leerBoolean(Scanner scanner, String mensaje){
        while(true){
            System.out.println(mensaje);
            String respuesta = scanner.next();
            String respuestaRevisada = respuesta.trim().toLowerCase();
            if(respuestaRevisada.equals("si")){
                return true;
            } else if(respuestaRevisada.equals("no")){
                return false;
            } else {
                System.out.println("El dato ingresado no es valido");
            }
        }
    }


}
