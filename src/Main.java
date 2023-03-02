import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
        Cliente cl3 = new Cliente("Sandra Bullock", "00003", 300000);
        Cliente cl4 = new Cliente("Julio Iglesias", "00004", 800000);

        /*
        collection: de objeto de tipo Cliente, que no se repiten, tiene operaciones de agregación y eliminacion, también operaciones de lectura. no hay necesidad de ordenación por el momento.
        */

        /*HashSet es la clase que implementa Set ya que no podemos instanciarla por ser static*/
        Set<Cliente> clientesBanco = new HashSet<>();

        /*Agregando a la colección*/
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);

        /*Recorriendo colección  con for - each: */
        for (Cliente cliente: clientesBanco) {
            System.out.println(cliente.getName() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
        }
    }
}