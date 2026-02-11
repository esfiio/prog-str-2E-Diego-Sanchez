import java.util.Scanner;

public class InputValidator {

    /**
     * metodo para obtener el id
     * @param scanner -> parametro
     * @param mensaje -> parametro
     * @return int -> id
     */
    public int obtenerIntValido(Scanner scanner, String mensaje){
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

    /**
     * metodo para obtener el nombre
     * @param scanner -> parametro
     * @param mensaje -> parametro
     * @return -> string nombre
     */
    public String obtenerTextoNoVacio(Scanner scanner, String mensaje){
        String texto = "";
        boolean esValido = false;
        while (!esValido){
            System.out.println(mensaje);
            texto= scanner.nextLine();
            if(validarSoloLetras(texto)) {
                esValido = true;
            }else{
                System.out.println("El nombre no puede contener numeros o caracteres especiales, ingresa tu nombre de nuevo");
            }
        }
        return texto;
    }

    /**
     * metodo para validar que el nombre tenga solo letras
     * @param texto -> parametro
     * @return boolean -> true si tiene solo letras, false si no
     */
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

    /**
     * metodo para verificar el id
     * @param id -> parametro
     * @param personas -> parametro
     * @return boolean
     */
    public boolean verificarId(int id, Persona[] personas){
        for (Persona persona : personas) {
            if(persona!=null && persona.getId()==id) {
                return true;
            }
        }
        return false;
    }

    /**
     * metodo para darle un indice a la persona
     * @param personas -> parametro
     * @return int -1 si esta en eso, i para asignarlo
     */
    public int obtenerIndice(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]==null){
                return i;
            }
        }
        return -1;
    }
}
