public class EnvioAereo extends Envio {

    private double Costo=20000;



    public EnvioAereo() {
    }


    public EnvioAereo(String codigo, String destino, double distancia, double peso) {
        super(codigo, destino, distancia, peso);
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public double calcularPrecio() {
        double costoTotal=Costo+(peso*4000)+(distancia*600);
        if(peso>10){
            System.out.println("incremento del 20% por su peso" + (costoTotal + (costoTotal*0.2)));

        } else if (peso<0) {
            System.out.println("Error peso no valido");

        } else{
            System.out.println("No valido");

        }

        if (distancia>1000){
            System.out.println("Descuento del 5% por la distancia mayor 1000 KL" + (costoTotal + (costoTotal-0.05)));

        } else if (distancia<0) {
            System.out.println(" Peso no Valido");

        } else{
            System.out.println("Sin costo adicional...");

        }

        return costoTotal;
    }

    @Override
    public String calcularTiempoEntrega() {
        String op="";
        if (distancia<=500){
            op =("llega en 1 dia.  ");
        } else if (distancia>501 && distancia<=1500) {
            System.out.println("Llega en 2 dias.  ");
        }else if (distancia>1501) {
            System.out.println("Llega em 3 dias.  ");
        }else{
            System.out.println("Llega en 5 dias.  ");
        }
        return op;
    }
}