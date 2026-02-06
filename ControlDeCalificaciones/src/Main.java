import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre = InputValidator.leerTextoNoVacio(scanner, "Ingresa tu nombre");
        double parcial1 = InputValidator.leerDoubleEnRango(scanner, "Ingresa la calificaicon del priemr parcial", 0, 100);
        double parcial2 = InputValidator.leerDoubleEnRango(scanner, "Ingresa la calificacion del segundo parcial", 0, 100);
        double parcial3 = InputValidator.leerDoubleEnRango(scanner, "Ingresa la calificacion del segundo parcial", 0, 100);
        int asistencia = InputValidator.leerIntEnRango(scanner, "Ingresa el promedio de asiastencia",0,100);
        boolean entregoProyecto = InputValidator.leerBoolean(scanner,"¿Entregó proyecto final?(responde con si o no)");
        double promedio = GradeService.calcularPromedio(parcial1, parcial2, parcial3);
        double promedioFinal = GradeService.calcularFinal(promedio, asistencia);


    }
}
