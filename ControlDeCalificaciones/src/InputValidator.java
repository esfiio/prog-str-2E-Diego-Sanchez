//- nombre del alumno (String) (no vacío)
//- 3 calificaciones parciales (double) de 0 a 100
//- asistencia (int) de 0 a 100
//- entregaProyecto (boolean) true/false
import java.util.Scanner;
public class InputValidator {

    public String leerTextoNoVacio(Scanner scanner, String mensaje){


    }


    public double leerDoubleEnRango(Scanner scanner, String mensaje, double min, double max){
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


    public int leerIntEnRango(Scanner scanner, String mensaje, int min, int max){
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


    public boolean leerBoolean(Scanner scanner, String mensaje){
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
