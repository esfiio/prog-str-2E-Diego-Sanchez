//Debe contener SOLO PROCESO:
//- double calcularPromedio(double a, double b, double c)
//- double calcularFinal(double promedio, int asistencia)
//- String determinarEstado(double final, int asistencia, boolean entregoProyecto)

public class GradeService {
    /**
     * meotodo para obtener el promedio en base a los parciales
     * @param parcial1 parametro
     * @param parcial2 parametro
     * @param parcial3 parametro
     * @return double -> promedio
     */
    public static double calcularPromedio(double parcial1, double parcial2, double parcial3){
        return (parcial1+parcial2+parcial3)/3;
    }

    /**
     * metodo para calcular el promedio final
     * @param promedio parametro
     * @param asistencia parametro
     * @return double -> promedio final
     */
    public static double calcularFinal(double promedio, int asistencia){
        return (promedio*0.7)+(asistencia*0.3);
    }

    /**
     * metodo para obetener el estado del estudiante (aprobado/reprobado)
     * @param promedioFinal parametro
     * @param asistencia parametro
     * @param entregoProyecto parametro
     * @return String
     */
    public static String calcularEstado(double promedioFinal, int asistencia, boolean entregoProyecto){
        String estado;
        if(asistencia<80){
            estado = "Reprobado por asistencia";
            }else if(!entregoProyecto){
                estado = "Reprobado por proyecto";
                }else if(promedioFinal<70){
                    estado = "Reprobado por calificacion";
                    }else{
                        estado = "aprobado";
                    }
        return estado;
    }

}
