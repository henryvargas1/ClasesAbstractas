public class EnvioTerrestre extends Envio {

    private int costo = 8000;

    public EnvioTerrestre() {
    }

    public EnvioTerrestre(String codigo, String destino, double peso, double distancia, int costo) {
        super(codigo, destino, peso, distancia);
        costo = costo;
    }

    @Override
    public double calcularCosto() {

        double CostoTotal = costo + (peso * 1500) + (distancia * 400);

        if (peso > 20) {
            CostoTotal = (CostoTotal * 0.1) + CostoTotal;
        } else if (peso < 0) {
            System.out.println("Error No puedes ingresar este valor");
        } else {
            System.out.println("Error De Datos");
        }
        if (distancia > 500) {
            CostoTotal = (CostoTotal * 0.15) + CostoTotal;
        } else if (distancia < 0) {
            System.out.println("Error no puedes ingresar este valor");
        } else {
            System.out.println("Error De Datos");
        }
        return CostoTotal;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String calcularTiempoEntrega() {
        String op="";
        if (distancia > 200) {
           op=("El tiempo de llegada del paquete es de un 1 día.");
        } else if (distancia > 200 && distancia <= 500) {
           op=("el tiempo de llegada del paquete es de 2 días");
        }
        return op;
    }
}