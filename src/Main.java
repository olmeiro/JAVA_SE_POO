import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
        Cliente cl3 = new Cliente("Sandra Bullock", "00003", 300000);
        Cliente cl4 = new Cliente("Julio Iglesias", "00004", 800000);
        /*
            Cl5 es una copia identica de cl4 en cuanto a datos no en cuanto a objetos por ello el método add lo agrega. (son objetos diferentes)
        * */
        Cliente cl5 = new Cliente("Julio Iglesias", "00004", 800000);

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
        clientesBanco.add(cl5);

        /*Recorriendo colección  con for - each: */
      /*  for (Cliente cliente: clientesBanco) {
            if(cliente.getName().equals("Julio Iglesias")){
                clientesBanco.remove(cliente); //no podemos eliminar mientras recorremos la colección con el for-each (problema de concurrencia) más fácil con iterator
            }
        }*/

        //Borrando con un iterator
        Iterator<Cliente> it = clientesBanco.iterator();

        while (it.hasNext()) {
            String nombre_cliente = it.next().getName();
            if (nombre_cliente == "Julio Iglesias") {
                it.remove();
            }
        }

        for (Cliente clienteBank : clientesBanco) {
            System.out.println(clienteBank.getName() + " " + clienteBank.getN_cuenta() + " " + clienteBank.getSaldo());
        }

        //Recorriendo con un iterador:
        /*Iterator<Cliente> it = clientesBanco.iterator(); //it recorrera la colección
        while(it.hasNext()){
            String nombre_cliente = it.next().getName();
            System.out.println("Nombre cliente: " + nombre_cliente);

            String n_cuenta = it.next().getN_cuenta(); //esto es un error pues al llamar next() estamos llamando al siguiente elemento en la coleccion que no es el dato que buscamos.
        }*/

    }
}