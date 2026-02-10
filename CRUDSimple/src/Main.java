import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner scanner = new Scanner(System.in);
        PersonaService servicio = new PersonaService();
        Persona[] personas = new Persona[20];

        do{
            System.out.println("=========Menu========");
            System.out.println("1) Alta");
            System.out.println("2) Buscar por ID");
            System.out.println("3) Baja logica por ID");
            System.out.println("4) Listar Activas");
            System.out.println("5) Actualizar nombre por ID (solo activas)");
            System.out.println("0) Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    servicio.alta(personas, scanner);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }


        }while (opcion!=0);


    }
}
