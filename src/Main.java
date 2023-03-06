
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList<String>();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Perú");

        LinkedList<String> capitales = new LinkedList<String>();

        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("Ciudad de México");
        capitales.add("Lima");

//        System.out.println(paises);
//        System.out.println(capitales);

        //  Agregamos capitales a paises, en orden pais-capital
        // Usamos iterator:
        ListIterator<String> iterPaises = paises.listIterator();
        ListIterator<String> iterCapitales = capitales.listIterator();

        //Agregamos capitales a paises:
        while (iterCapitales.hasNext()) {
            if (iterPaises.hasNext()) {
                iterPaises.next(); //salta al siguiente elemento
            }
            iterPaises.add(iterCapitales.next()); //agrega el sigte elemento de capitales a continuación del elemento en paises.
        }

        System.out.println(paises); //LinkedList agregado

        //Eliminar posiciones pares de LinkedList capitales:
        // el iterador está en la última posición pues usamos next() - debemos devolverlo iniciando el iterador de nuevo:

        iterCapitales = capitales.listIterator();

        //eliminar:
        while (iterCapitales.hasNext()) {
            iterCapitales.next();

            if (iterCapitales.hasNext()) { //hay una siguiente posición?
                iterCapitales.next();
                iterCapitales.remove();
            }
        }

        System.out.println(capitales);
        paises.removeAll(capitales); //actualizamos paises segun lo que borramos en capitales con removeAll
        System.out.println();
        System.out.println(paises);

    }
}