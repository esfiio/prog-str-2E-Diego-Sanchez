import java.util.Scanner;

public class InputValidator {

    public int obtenerIntValido(Scanner scanner, String mensaje){
        int id;
        while (true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                id = scanner.nextInt();
                if(id>0){
                    return id;
                }else{
                    System.out.println("El ID no peude ser menor que 0");
                }
            }else {
                System.out.println("El dato ingresado no es valido");
            }
        }
    }


    public String obtenerTextoNoVacio(Scanner scanner, String mensaje){
        String texto = "";
        boolean esValido = false;
        while (!esValido){
            System.out.println(mensaje);
            if(scanner.hasNextLine()){
                texto = scanner.nextLine();
                if(validarSoloLetras(texto)) {
                    esValido = true;
                }else{
                    System.out.println("El nombre no puede contener numeros o caracteres especiales, ingresa tu nombre de nuevo");
                }
            }
        }
        return texto;
    }

    public static boolean validarSoloLetras(String texto){
        if(texto==null || texto.isEmpty()){
            return false;
        }
        for(int i=0; i < texto.length(); i++){
            char letraActual = texto.charAt(i);
            if(!Character.isLetter(letraActual) && letraActual!= ' '){
                return false;
            }
        }
        return true;
    }

    public boolean verificarId(int id, Persona[] personas){

        for (Persona persona : personas) {
            if(persona!=null && persona.getId()==id) {
                return true;
            }
        }
        return false;
    }

    public int obtenerIndice(Persona[] personas){

        for (int i = 0; i < personas.length; i++) {
            if(personas[i]==null){
                return i;
            }
        }
        return -1;
    }


}
