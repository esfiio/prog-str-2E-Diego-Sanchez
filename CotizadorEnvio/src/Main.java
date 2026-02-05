import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Ticket ticket1 = new Ticket();
        Validador validador1 = new Validador();
        Scanner scanner = new Scanner(System.in);
        //input
        int tipoServicio = validador1.obtenerTipoServicio("Escribe 1 si deseas envio estandar, escribe 2 si deseas envio express", scanner);
        double pesoKg = validador1.obtenerDoubleEnRango("Ingresa el peso en Kg", scanner);
        int distanciaKm = validador1.obtenerIntEnRango("Ingresa la distancia en Km",scanner);
        boolean zonaRemota = validador1.leerBooleano("Vives en una zona remota? Contesta con 'si' o 'no'", scanner);
        //output
        ticket1.procesar(pesoKg, distanciaKm, tipoServicio, zonaRemota);
        ticket1.imprimirTicket(tipoServicio, pesoKg, distanciaKm, zonaRemota);
    }
}
