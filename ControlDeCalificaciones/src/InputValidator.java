//- nombre del alumno (String) (no vacío)
//- 3 calificaciones parciales (double) de 0 a 100
//- asistencia (int) de 0 a 100
//- entregaProyecto (boolean) true/fal
import java.util.Scanner;
public class InputValidator {

    public static String leerTextoNoVacio(Scanner scanner, String mensaje){
        String texto = "";
        boolean esValido = false;
        while (!esValido){
            System.out.println(mensaje);
            texto = scanner.nextLine();
            if(scanner.hasNextLine()){
                texto = scanner.nextLine();
                if(validarSoloLetras(texto)){
                    System.out.println("El nombre no puede estar vacio");
                }
            }else {
                System.out.println("Dato invalido");
            }
        }
        return texto;
    }

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


    public static double leerDoubleEnRango(Scanner scanner, String mensaje, double min, double max){
        double calificacion = 0;
        boolean esValido = false;

        while (!esValido) {
            System.out.println(mensaje);
            if (scanner.hasNextDouble()) {
                calificacion = scanner.nextDouble();
                if (calificacion > min && calificacion < max) {
                    esValido = true;
                }
                System.out.println("La calificacion esta fuera del rango");
            }else{
                System.out.println("El dato ingresado no es valido");
                scanner.nextLine();
            }
        }
        return calificacion;
    }


    public static int leerIntEnRango(Scanner scanner, String mensaje, int min, int max){
        int asistencia = 0;
        boolean esValido = false;

        while (!esValido){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                asistencia = scanner.nextInt();
                if(asistencia>min && asistencia<max){
                    esValido = true;
                }
                System.out.println("La asistencia esta fuera del rango, debe ser entre "+min+" y "+max);
            }else{
                System.out.println("El dato ingresado no es valido");
                scanner.next();
            }
        }
        return asistencia;

    }


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
