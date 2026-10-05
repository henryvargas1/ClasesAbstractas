public abstract class Envio {

    protected String codigo;
    protected String destino;
    protected double peso;
    protected double distancia;

    public Envio() {
    }

    public Envio(String codigo, String destino, double peso, double distancia) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.distancia = distancia;
    }

    public void mostrarDatos() {
        System.out.println("codigo:" + codigo);
        System.out.println("destino:" + destino);
        System.out.println("peso:" + peso);
        System.out.println("distancia:" + distancia);
    }

    public abstract double calcularCosto();

    public abstract double calcularPrecio();

    public abstract String calcularTiempoEntrega();


}
