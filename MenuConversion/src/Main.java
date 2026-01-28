import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int contadorGeneral=0;
        int contadorGrados=0;
        int contadorFahrenheit=0;
        int contadorMillas=0;
        int contadorKilometros=0;

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
             opcion= scanner.nextInt();

            switch(opcion){
                case 1:
                    int valor=validarNumero(scanner,"Ingresa los datos en grados celcius");
                    double fahrenheit=pasarGradosAFahrenheit(valor);
                    System.out.println("El resultado es: "+ fahrenheit);
                    contadorFahrenheit+=1;
                    contadorGeneral+=1;
                    break;
                case 2:
                    valor=validarNumero(scanner, "Ingresa los grados fahrenheit");
                    double grados=pasarFahrenheitAGrados(valor);
                    System.out.println("El resultado es: "+ grados);
                    contadorGrados+=1;
                    contadorGeneral+=1;
                    break;
                case 3:
                    valor=validarNumero(scanner, "Ingresa los kilometros que deseas convertir a millas");
                    double millas=pasarKilometrosAMillas(valor);
                    System.out.println("El resultado es: "+ millas);
                    contadorMillas+=1;
                    contadorGeneral+=1;
                    break;
                case 4:
                    valor=validarNumero(scanner, "Ingresa las millas que deseas convertir en kilometros");
                    double kilometros=pasarMillasAKilometros(valor);
                    System.out.println("El resultado es: "+ kilometros);
                    contadorKilometros+=1;
                    contadorGeneral+=1;
                    break;
                case 5:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor ingresa una opcion dentro del rango");
                    break;
            }

        } while(opcion!=5);

        System.out.println("El total de conversiones realizadas fue de: "+contadorGeneral);
        System.out.println("El total de conversiones de grados celcius a fahrenheit fue de: "+contadorFahrenheit);
        System.out.println("El total de conversiones de grados fahrenheit a grados celcius fue de: "+contadorGrados);
        System.out.println("El total de conversiones de kilometros a millas fue de: "+contadorMillas);
        System.out.println("El total de conversiones de millas a kilometros fue de: "+contadorKilometros);

    }

    /**
     *
     */
    public static void imprimirMenu() {
        System.out.println("-------Menú-------");
        System.out.println("1. C a F");
        System.out.println("2. F a C");
        System.out.println("3. Km a Millas");
        System.out.println("4. Millas a Km");
        System.out.println("5. Salir");
        System.out.print("Ingresa el numero de la conversion que desees hacer: ");
    }

    /**
     *Metodo para validar que el dato ingresado sea numerico
     * @param scanner -> declarado en el main
     * @param mensaje -> mensaje que le aparece al usuario
     * @return -> int valor validado para que sea unicamente un numero
     */
    public static int validarNumero(Scanner scanner, String mensaje){
        int valor;
        while (true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                valor = scanner.nextInt();
                return valor;
            } else{
                System.out.print("El valor no es numerico, ingresa un valor numerico: ");
                scanner.next();
            }
        }
    }

    /**
     *Metodo para pasar de grados celsius a fahrenheit
     * @param grados -> parametro
     * @return -> double de la conversion
     */
    public static double pasarGradosAFahrenheit(int grados){
        return (grados*1.8)+32;
    }

    /**
     *Metodo para pasar de grados fahrenheit a grados celsius
     * @param fahrenheit -> parametro
     * @return -> double resultado de la conversion
     */
    public static double pasarFahrenheitAGrados(int fahrenheit){
        return (fahrenheit-32)/1.8;
    }

    /**
     *Metodo para pasar de kilometros a millas
     * @param kilometros -> parametro
     * @return -> double resultado de la conversion
     */
    public static double pasarKilometrosAMillas(int kilometros){
        return kilometros*0.621;
    }

    /**
     *Metodo para pasar de millas a kilometros
     * @param millas -> parametro
     * @return -> double resultado de la conversion
     */
    public static double pasarMillasAKilometros(int millas){
        return millas*1.6;
    }
}
