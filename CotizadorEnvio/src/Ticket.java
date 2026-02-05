/*Cosas que debe llevar el ticket:
servicio, peso, distancia, zona remota
subtotal (antes de IVA)
IVA
total final
*/

public class Ticket {
    public double subtotal=0;
    public double iva;
    public double total;

    ShippingCalculator calculadora = new ShippingCalculator();

    /**
     * metodo para procesar las operaciones hechas en shipping calculator
     * @param pesoKg -> parametro
     * @param distanciaKm -> parametro
     * @param tipoServicio -> parametro
     * @param zonaRemota -> parametro
     */
    public void procesar(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        calcularSubtotal(pesoKg, distanciaKm, tipoServicio, zonaRemota);
        calcularIva();
        calcularTotal();

    }

    /**
     * metodo para tener el subtotal el 'procesar'
     * @param pesoKg -> parametro
     * @param distanciaKm -> parametro
     * @param tipoServicio -> parametro
     * @param zonaRemota -> parametro
     */
    private void calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        this.subtotal = calculadora.obtenerSubtotal(pesoKg, distanciaKm,tipoServicio, zonaRemota);
    }

    /**
     * metodo para tener el iva el 'procesar'
     */
    private void calcularIva(){
        this.iva = calculadora.obtenerIva(this.subtotal);
    }

    /**
     * metodo para tener el total el 'procesar'
     */
    public void calcularTotal(){
        this.total = calculadora.obtenerTotal(this.subtotal, this.iva);
    }

    /**
     * metodo para imprimir el ticket
     * @param tipoServicio -> parametro
     * @param pesoKg -> parametro
     * @param distanciaKm -> parametro
     * @param zonaRemota -> parametro
     */
    public void imprimirTicket(int tipoServicio, double pesoKg, int distanciaKm, boolean zonaRemota){
        System.out.println("==================TICKET===================");
        System.out.println("El tipo de servicio fue(1.Estandar 2.Express): "+tipoServicio);
        System.out.println("El peso del paquete fue de: "+pesoKg);
        System.out.println("La distancia del paquete fue de: "+distanciaKm);
        System.out.println("El paquete fue de zona remota: "+zonaRemota);
        System.out.println("----------------------------------------------");
        System.out.println("El sutotal del servicio fue de: $"+subtotal);
        System.out.println("El IVA del paquete fue de: $"+iva);
        System.out.println("----------------------------------------------");
        System.out.println("El total por el servicio fue de: $"+total);


    }
}
