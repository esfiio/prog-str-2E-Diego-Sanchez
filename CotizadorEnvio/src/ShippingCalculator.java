public class ShippingCalculator {
    public double IVA=0.16;

    /**
     * metodo para obtener el subtotal
     * @param pesoKg -> parametro
     * @param distanciaKm -> parametro
     * @param tipoServicio -> parametro
     * @param zonaRemota -> parametro
     * @return double -> el subtotal del servicio
     */
    public double obtenerSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        double subtotal=0;
        if(tipoServicio==1){
            subtotal+=50;
        }else {
            subtotal+=90;
        }

        subtotal+=pesoKg*12;

        if(distanciaKm<=50){
            subtotal+=20;
        }else if(distanciaKm<=200) {
            subtotal+=60;
        } else {
            subtotal+=120;
        }

        if(zonaRemota){
            subtotal=subtotal*1.10;
        }
        return subtotal;
    }

    /**
     * metodo para obtener el iva
     * @param subtotal -> parametro que sacamos antes
     * @return -> double el iva de multiplicar el subtotal por 0.16
     */
    public double obtenerIva(double subtotal){
        return subtotal*IVA;
    }

    /**
     * metodo para calcular el total de la operacion
     * @param subtotal -> parametro
     * @param iva -> parametro
     * @return -> double de sumar iva + subtotal
     */
    public double obtenerTotal(double subtotal, double iva){
        return subtotal+iva;
    }
}
