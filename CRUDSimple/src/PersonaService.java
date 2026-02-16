import java.util.Scanner;

public class PersonaService {

    /**
     * metodo dar de alta al usuario
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void alta(Persona[] personas, Scanner scanner){

        InputValidator input= new InputValidator();

        int id= input.obtenerIntValido(scanner, "Ingresa el Id del nuevo usuario");
        boolean idVerificado= input.verificarId(id, personas);
        if(idVerificado){
            System.out.println("Ese id existe");
            return;
        }

        int indiceInsercion= input.obtenerIndice(personas);
        if(indiceInsercion==-1){
            System.out.println("El arreglo esta lleno");
            return;
        }

        String nombre= input.obtenerTextoNoVacio(scanner, "Ingresa tu nombre: ");

        Persona persona1= new Persona(id, nombre);
        personas[indiceInsercion] = persona1;

        for (Persona persona : personas) {
            System.out.println("________");
            System.out.println(persona);
        }
    }

    /**
     * metodo para buscar al usuario por ID
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void buscarPorId(Persona[] personas, Scanner scanner){
        InputValidator input = new InputValidator();
        int id= input.obtenerIntValido(scanner, "Ingrese el ID que deseas buscar");
        boolean idVerificado= input.verificarId(id, personas);
        if(idVerificado){
            for (Persona persona : personas) {
                if (persona != null && persona.isActive()) {//puedo poner todas las valdiaciones dentro de un if para hacerlo mas "sencillo"
                    if (persona.getId() == id) {
                        System.out.println(persona.toString());
                    }
                }
            }
        }else {
            System.out.println("El id no encontrado");
        }
    }

    /**
     * metodo para dar de baja a un usuario
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void bajaLogica(Persona[] personas, Scanner scanner){
        InputValidator input = new InputValidator();
        int id= input.obtenerIntValido(scanner, "Ingrese el ID que deseas dar de baja");
        boolean idVerificado= input.verificarId(id, personas);
        if(idVerificado){
            for (Persona persona : personas) {
                if (persona != null && persona.isActive()) {
                    if (persona.getId() == id) {
                        persona.setActive(false);
                    }
                }
            }
        }else {
            System.out.println("El id no existe");
        }
    }


    /**
     * metodo para listar a los usuarios activos
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void listarActivos(Persona[] personas, Scanner scanner){
        for (Persona persona : personas) {
            if (persona != null && persona.isActive()) {
                System.out.println(persona.toString());
            }
        }
    }

    /**
     * metodo para actualizar nombre
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void actualizarNombre(Persona[] personas, Scanner scanner){
        InputValidator input = new InputValidator();
        int id= input.obtenerIntValido(scanner, "Ingrese el ID al que deseas cambiarle el nombre");
        boolean idVerificado= input.verificarId(id, personas);
        if(idVerificado){
            for (Persona persona : personas) {
                if (persona != null && persona.isActive()) {
                    if (persona.getId() == id) {
                        String nombre= input.obtenerTextoNoVacio(scanner, "Ingresa el nuevo nombre: ");
                        persona.setName(nombre);
                    }
                }
            }
        }else {
            System.out.println("El id no existe");
        }
    }
}

