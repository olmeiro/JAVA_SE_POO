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
        for (Cliente cliente: clientesBanco) {
            System.out.println(cliente.getName() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
        }

        System.out.println();
        //Usando hashCode y equals con la clase Book:
        Book libro1 = new Book("Programación en JAVA", "Juan", 25);
        Book libro2 = new Book("Programación en JAVA", "Juan", 25);

        //hagamos libro1 = libro2
        // libro1 = libro2;

        System.out.println("libro1 = libro2: " + libro1.equals(libro2));

        /*Solución para comparar por hashCode*/
        if(libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }else{
            System.out.println("No es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }


    }
}