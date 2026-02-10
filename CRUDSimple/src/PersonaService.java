import java.util.Scanner;

public class PersonaService {

    public void alta(Persona[] personas, Scanner scanner){

        InputValidator input= new InputValidator();
        int id= input.obtenerIntValido(scanner, "Ingresa el Id del nuevo usuario");
        boolean idVerificado= input.verificarId(id, personas);
        int indiceInsercion= input.obtenerIndice(personas);
        scanner.nextLine();
        String nombre= input.obtenerTextoNoVacio(scanner, "Ingresa tu nombre: ");

        if(id<=0){
            System.out.println("No se admiten valores menores que 1");
            scanner.next();
            return;
        }
        if(idVerificado){
            System.out.println("Ese id existe");
            scanner.next();
            return;
        }

        if(indiceInsercion==-1){
            System.out.println("El arreglo esta lleno");
            return;
        }
        Persona persona1= new Persona(id, nombre);
        personas[indiceInsercion] = persona1;

        for (Persona persona : personas) {
            System.out.println("________");
            System.out.println(persona);
        }



    }

    public



}

