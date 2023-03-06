
import java.util.*;

public class Main {
    public static void main(String[] args) {

//       TreeSet<String> ordenaPersonas = new TreeSet<String>();
//
//       ordenaPersonas.add("Sandra");
//       ordenaPersonas.add("Alejandra");
//       ordenaPersonas.add("Diana");
//
//       for(String s: ordenaPersonas){
//           System.out.println(s); //imprime alfabeticamente
//       }

       Articulo primero = new Articulo(1, "Primer articulo");
       Articulo segundo = new Articulo(2, "Segundo articulo");
       Articulo tercer = new Articulo(3, "Tercer articulo");
       Articulo cuarto = new Articulo(4, "Cuarto articulo");

       TreeSet<Articulo> articulos = new TreeSet<Articulo>();

       articulos.add(cuarto);
       articulos.add(primero);
       articulos.add(tercer);
       articulos.add(segundo);

        for(Articulo art: articulos){
            System.out.println(art.getDescripcion());
        }

        //¿Cómo ordenar por descripción? Problema: no podemos sobreescribir compareTo, además si el objeto no implementa comparableTo tampoco podemos. Para ello usamos el contrusctor TreeSet(comparator):

        System.out.println("__________Comparando por descripción___________");

        Articulo comparadorArticulo = new Articulo(); //creamos un constructor vacio en Articulo

        /**
         * el TreeSet ordena los articulos según lo que pasemos por el comparador.
         * */
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulo);

        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(tercer);
        ordenaArticulos2.add(cuarto);
        ordenaArticulos2.add(segundo);

        for(Articulo art: ordenaArticulos2){
            System.out.println(art.getDescripcion()); // ordena por descripción
        }

        // Que pasa si los objetos no implementan la interfaz comparator?
    }
}