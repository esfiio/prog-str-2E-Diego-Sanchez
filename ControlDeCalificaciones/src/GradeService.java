//Debe contener SOLO PROCESO:
//- double calcularPromedio(double a, double b, double c)
//- double calcularFinal(double promedio, int asistencia)
//- String determinarEstado(double final, int asistencia, boolean entregoProyecto)

public class GradeService {

    public static double calcularPromedio(double parcial1, double parcial2, double parcial3){
        return (parcial1+parcial2+parcial3)/3;
    }

    public static double calcularFinal(double promedio, int asistencia){
        return (promedio*0.7)+(asistencia*0.3);
    }

    public static String estado(double calificacionFinal){

    }

}
