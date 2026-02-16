import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        EstudianteService servicio = new EstudianteService();
        Estudiante[] personas = new Estudiante[20];

        do{
            System.out.println("=========Menu========");
            System.out.println("1) Alta");
            System.out.println("2) Buscar por ID");
            System.out.println("3) Actualizar promedio por ID");
            System.out.println("4) Baja logica por ID");
            System.out.println("5) Listar activos");
            System.out.println("6) Reportes");
            System.out.println("0) Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    servicio.alta(personas, scanner);
                    break;
                case 2:
                    servicio.buscarPorId(personas, scanner);
                    break;
                case 3:
                    servicio.actualizarPromedio(personas, scanner);
                    break;
                case 4:
                    servicio.bajaLogica(personas, scanner);
                    break;
                case 5:
                    servicio.listarActivos(personas, scanner);
                    break;
                case 6:
                    servicio.hacerReportes(personas, scanner);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (opcion!=0);
    }
}
