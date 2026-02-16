import java.util.Scanner;

public class Validador {


    public static int obtenerIntValido(Scanner scanner, String mensaje){
        int id;
        while (true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                id = scanner.nextInt();
                scanner.nextLine();
                if(id>0){
                    return id;
                }else{
                    System.out.println("El ID no puede ser menor que 0");
                }
            }else {

                System.out.println("El dato ingresado no es valido");
                scanner.nextLine();
            }
        }
    }

    public static String teextoNoVacio(Scanner scanner, String mensaje){
        String texto = "";
        boolean esValido = false;
        while(!esValido){
            System.out.println(mensaje);
            texto= scanner.nextLine();
            if(validarSoloLetras(texto)){
                esValido=true;
            }else {
                System.out.println("El nombre no puede contener numeros o ser vacio");
            }
        }
        return texto;
    }

    public static boolean validarSoloLetras(String texto){
        if(texto == null || texto.isEmpty()){
            return false;
        }

        for (int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);
            if(!Character.isLetter(letraActual) && letraActual!= ' '){
                return false;
            }
        }
        return true;
    }

    public static int validarPromedio(Scanner scanner, String mensaje){
       int promedio;
        while(true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                promedio = scanner.nextInt();
                scanner.nextLine();
                if(promedio>=0 && promedio<=10){
                    return promedio;
                }else {
                    System.out.println("El promedio no puede ser menor que 0 o mayor que 10");
                }
            }else {
                System.out.println("El promedio tiene que ser un numero");
            }
        }
    }


}
