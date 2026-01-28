import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
             opcion= scanner.nextInt();

            switch(opcion){
                case 1:
                    int valor=validarNumero(scanner,"Ingresa un dato");
                    double grados=pasarGradosAFahrenheit("Ingresa los grados",valor);
                    System.out.println("El resultado es: "+ grados);
                    break;
                case 2:
                    double farenheit=pasarFahrenheitAGrados(scanner);
                    System.out.println("El resultado de la resta es: "+ farenheit);
                    break;
                case 3:
                    double millas=kilometrosAMillas(scanner);
                    System.out.println("El resultado de la multiplicacion es: "+ millas);
                    break;
                case 4:
                    double kilometros=millasAKilometros(scanner);
                    System.out.println("El resultado de la multiplicacion es: "+ kilometros);
                    break;
                case 5:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while(opcion!=5);


    }

    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    public static void imprimirMenu() {
        System.out.println("-------Menú-------");
        System.out.println("1. C a F");
        System.out.println("2. F a C");
        System.out.println("3. Km a Millas");
        System.out.println("4. Millas a Km");
        System.out.println("5. Salir");
    }

    public static int validarNumero(Scanner scanner, String mensaje){
        int valor;
        while (true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                valor = scanner.nextInt();
                return valor;

            }
            System.out.println("El valor no es numerico");
            scanner.next();
        }


    }


    public static double pasarGradosAFahrenheit(String mensaje, int grados){
        //double c = obtenerDouble(scanner, "Ingresa los grados Celcius (C)");
        System.out.println(mensaje);
        return (grados*1.8)+32;
    }

    public static double pasarFahrenheitAGrados(Scanner scanner){
        double f = obtenerDouble(scanner, "Ingresa los grados Celcius (C)");
        return (f-32)/1.8;
    }

    public static double kilometrosAMillas(Scanner scanner){
        double km = obtenerDouble(scanner, "Ingresa los kilometros que deseas convertir: ");
        return km*0.621;
    }

    public static double millasAKilometros(Scanner scanner){
        double mil = obtenerDouble(scanner, "Ingresa las millas que deseas convertir");
        return mil*1.6;
    }
}
