public class Reporte {

    public double promedio;
    public double promedioFinal;
    public String estadoEstudiante;

    /**
     * metodo para procesar las operaciones
     * @param parcial1 parametro
     * @param parcial2 parametro
     * @param parcial3 parametro
     * @param asistencia parametro
     * @param promedioFinal parametro
     * @param entregoProyecto parametro
     */
        public void procesar(double parcial1, double parcial2, double parcial3, int asistencia, double promedioFinal, boolean entregoProyecto){
            sacarPromedio(parcial1, parcial2, parcial3);
            calcularPromedioFinal(asistencia);
            estadoFinal(asistencia,entregoProyecto);

        }

    /**
     * metodo para obtener el promedio
     * @param parcial1 parametro
     * @param parcial2 parametro
     * @param parcial3 parametro
     */
        private void sacarPromedio(double parcial1, double parcial2, double parcial3){
            this.promedio = GradeService.calcularPromedio(parcial1, parcial2, parcial3);
        }

    /**
     * metodo para obtene el promedio final
     * @param asistencia parametro
     */
        public void calcularPromedioFinal(int asistencia){
            this.promedioFinal = GradeService.calcularFinal(this.promedio, asistencia);
        }

    /**
     * metodo para obtener el estado final del estudiante (aprobado/reprobado)
     * @param asistencia parametro
     * @param entregoProyecto parametro
     */
        public void estadoFinal(int asistencia, boolean entregoProyecto){
            this.estadoEstudiante = GradeService.calcularEstado(this.promedioFinal, asistencia, entregoProyecto);
        }

        //nombre, parciales, promedio, asistencia, entregó proyecto, final, estado

    /**
     * metodo para imprir el reporte del estudiante
     * @param nombre parametro
     * @param parcial1 parametro
     * @param parcial2 parametro
     * @param parcial3 parametro
     * @param asistencia parametro
     * @param entregoProyecto parametro
     */
        public void imprimirReporte(String nombre, double parcial1, double parcial2, double parcial3, int asistencia, boolean entregoProyecto){
            System.out.println("==================Reporte de Estado del Estudiante===================");
            System.out.println("El nombre del estudiante es: "+ nombre);
            System.out.println("la calificacion del primer parcial fue de: "+parcial1);
            System.out.println("la calificacion del segundo parcial fue de: "+parcial2);
            System.out.println("la calificacion del tercer parcial fue de: "+parcial3);
            System.out.println("-------------------------------------------------------------");
            System.out.println("El promedio es de: "+promedioFinal);
            System.out.println("La asistencia fue de: "+ asistencia);
            System.out.println("El estudiante entrego su proyecto final: "+entregoProyecto);
            System.out.println("-------------------------------------------------------------");
            System.out.println("El estado del estudiante es: "+estadoEstudiante);
        }
}
