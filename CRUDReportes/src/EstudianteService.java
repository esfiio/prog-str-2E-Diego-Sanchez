import java.util.Scanner;

public class EstudianteService {

    private Estudiante[] personas = new Estudiante[25];

    /**
     * Metodo para dar de alta a un estudiante
     * @param personas ->
     * @param scanner ->
     */
    public void alta(Estudiante[] personas, Scanner scanner){

        Validador input= new Validador();

        int id= Validador.obtenerIntValido(scanner, "Ingresa el Id del nuevo usuario");
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

        String nombre= Validador.textoNoVacio(scanner, "Ingresa tu nombre: ");

        Estudiante persona1= new Estudiante(id, nombre);
        personas[indiceInsercion] = persona1;

        double promedio = Validador.validarPromedio(scanner, "Ingresa el promedio");

        for (Estudiante persona : personas) {
            if (persona != null && persona.isActive()) {
                System.out.println("________");
                System.out.println(persona.toString());
            }
        }
    }

    /**
     * metodo para buscar al usuario por ID
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void buscarPorId(Estudiante[] personas, Scanner scanner){
        Validador input = new Validador();
        int id= Validador.obtenerIntValido(scanner, "Ingrese el ID que deseas buscar");
        boolean idVerificado= input.verificarId(id, personas);
        if(idVerificado){
            for (Estudiante persona : personas) {
                if (persona != null && persona.isActive() && persona.getId() == id) {//puedo poner todas las valdiaciones dentro de un if para hacerlo mas "sencillo"
                    System.out.println(persona.toString());
                }
            }
        }else {
            System.out.println("ID no encontrado");
        }
    }

    /**
     * metodo para dar de baja a un usuario
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void bajaLogica(Estudiante[] personas, Scanner scanner){
        Validador input = new Validador();
        int id= Validador.obtenerIntValido(scanner, "Ingrese el ID que deseas dar de baja");
        boolean idVerificado= input.verificarId(id, personas);
        if(idVerificado){
            for (Estudiante persona : personas) {
                if (persona != null && persona.isActive() && persona.getId() == id) {
                    persona.setActive(false);
                }
            }
        }else {
            System.out.println("El id no existe");
        }
    }

    /**
     * metodo para actualizar el promedio
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void actualizarPromedio(Estudiante[] personas, Scanner scanner){
        Validador input = new Validador();
        int id= Validador.obtenerIntValido(scanner, "Ingresa el ID que deseas buscar");
        boolean idVerificado = input.verificarId(id, personas);
        if(idVerificado){
            for(Estudiante persona : personas){
                if (persona != null && persona.isActive() && persona.getId() == id){
                    double promedio = Validador.validarPromedio(scanner,"Ingresa el nuevo promedio");
                    persona.setPromedio(promedio);
                }
            }
        }

    }

    /**
     * metodo para listar a los usuarios activos
     * @param personas -> parametro
     * @param scanner -> parametro
     */
    public void listarActivos(Estudiante[] personas, Scanner scanner){
        for (Estudiante persona : personas) {
            if (persona != null && persona.isActive()) {
                System.out.println(persona.toString());
            }
        }
    }

    public void hacerReportes(Estudiante[] personas, Scanner scanner){
        double promedio = 0;
        for (Estudiante persona : personas){
            if (persona != null && persona.isActive()){
                promedio += persona.getPromedio();
            }
        }
        promedio = promedio / personas.length;
        System.out.println("---------------------------");
        System.out.println(promedio);
        System.out.println("---------------------------");

        double promedioAlto = 0;
        Estudiante estudianteAlto = null;
        for (Estudiante persona : personas){
            if (persona != null && persona.isActive()){
                if(persona.getPromedio() > promedioAlto){
                    promedioAlto = persona.getPromedio();
                    estudianteAlto = persona;
                }
            }
        }
        System.out.println(estudianteAlto.toString());

        Estudiante estudianteBajo = null;
        if (personas[0] != null && personas[0].isActive()){
            double promedioBajo = personas[0].getPromedio();
            for (Estudiante persona : personas){
                if (personas[0] != null && personas[0].isActive()) {
                    if (persona.getPromedio() < promedioBajo) {
                        promedioBajo = persona.getPromedio();
                        estudianteBajo = persona;
                    }
                }
            }
            System.out.println(estudianteBajo.toString());
        }else {
            System.out.println("No hay ningun estudiante registrado");
        }

        int contador = 0;
        for (Estudiante persona : personas){
            if (persona != null && persona.isActive()){
                if(persona.getPromedio() >= 8){
                    contador ++;
                }
            }
        }
        System.out.println("---------------------------");
        System.out.println(contador);
       }

}
