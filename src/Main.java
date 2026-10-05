import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Envio> lstEnvio = new ArrayList<>();
        EnvioTerrestre T1 = new EnvioTerrestre("1081419158", "Ibague", 11, 200, 23);
        EnvioAereo A1 = new EnvioAereo("26491870", "Cucuta", 111, 13);

        lstEnvio.add(T1);
        lstEnvio.add(A1);

        for (Envio e : lstEnvio) {
            e.mostrarDatos();
            System.out.println(e.calcularTiempoEntrega());
        }
    }
}
