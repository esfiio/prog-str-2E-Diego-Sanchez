import java.util.Scanner;

public class Validador {
    public double PESO_MINIMO = 0.1;
    public double PESO_MAXIMO = 50.0;
    public int DISTANCIA_MINIMA = 1;
    public int DISTANCIA_MAXIMA = 2000;
    public int OPCION_ESTANDAR =1;
    public int OPCION_EXPRESS =2;


    /**
     * metodo para obtener el tipo de servicio
     * @param mensaje mensaje que le aparece al usuario
     * @param scanner declarado en el main
     * @return -> int 1 estandar 2. express
     */
    public int obtenerTipoServicio(String mensaje, Scanner scanner){
        int tipoServicio;
        while(true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                tipoServicio=scanner.nextInt();
                if(tipoServicio==OPCION_ESTANDAR||tipoServicio==OPCION_EXPRESS){
                    return tipoServicio;
                }else{
                    System.out.println("Opcion no valida, por favor elige entre "+OPCION_ESTANDAR+" u"+OPCION_EXPRESS);;
                }
            }else{
                System.out.println("El dato que ingresaste no es valido");
                scanner.nextLine();
            }
        }
    }

    /**
     * metodo para validar si el peso es numerico
     * @param mensaje -> mensaje que le aparece al usuario
     * @param scanner -> declarado en el main
     * @return-> double el peso en kg
     */
    public double obtenerDoubleEnRango(String mensaje, Scanner scanner){
        double valor = 0;
        boolean esValido = false;

        while(!esValido){
            System.out.println(mensaje);
            if(scanner.hasNextDouble()){
                valor = scanner.nextDouble();
                if (valor>= PESO_MINIMO && valor<= PESO_MAXIMO){
                    esValido = true;
                }else{
                    System.out.println("El peso ingresado está fuera del rango, debe estar entre "+ PESO_MINIMO +" y "+ PESO_MAXIMO);
                }
            } else{
                System.out.println("El dato ingresado no es un número");
                scanner.nextLine();
            }
        }
        return valor;
    }

    /**
     * metodo para obtener la distancia en km
     * @param mensaje -> mensaje que le aparece al usuario
     * @param scanner -> declarado en el main
     * @return -> int la distancia en km
     */
    public int obtenerIntEnRango(String mensaje, Scanner scanner){
        int valor = 0;
        boolean esValido = false;

        while(!esValido){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                valor = scanner.nextInt();
                if(valor>= DISTANCIA_MINIMA && valor<= DISTANCIA_MAXIMA){
                    esValido = true;
                }else{
                    System.out.println("La distancia ingresada está fuera del rango, debe estar entre "+ DISTANCIA_MINIMA +" y "+ DISTANCIA_MAXIMA);
                }
            }else{
                System.out.println("El dato ingresado no es un número");
                scanner.nextLine();
            }
        }
        return valor;
    }

    /**
     * metodo para saber si el usuario vive en una zona remota o no
     * @param mensaje -> mensaje que le aparece al usuario
     * @param scanner -> declarado en el main
     * @return -> boolean true si vive en zona remota, false si no vive en zona remota
     */
    public boolean leerBooleano(String mensaje, Scanner scanner){
        int esZonaRemota;
        while(true){
            System.out.println("Escribe 'si' si vives en unas zona remota, en caso de que no vivas en una zona remota escribe 'no'");
            String respuesta = scanner.next();
            String respuestaRevisada = respuesta.trim().toLowerCase();
            if(respuestaRevisada.equals("si")){
                return true;
            }else if(respuestaRevisada.equals("no")){
                return false;
            }else{
                System.out.println("El dato ingresado no es valido, recuerda que solo puedes responder con 'si' o 'no'");
            }
        }
    }

}
