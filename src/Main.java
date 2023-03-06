
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> personas = new LinkedList<String>();

        //Agregando elementos:
        personas.add("Aleja");
        personas.add("Sandra");
        personas.add("Milena");
        personas.add("Laura");

        //length de la LinkedList
        System.out.println(personas.size());

        //Orden de la LinkedList: mismo orden en que se agregaron
//        personas.add("Juan"); //aqui lo agrega al final

        //Agregando en otras posiciones: mejor con iteradores
        //tenemos ListIterator para listas

        ListIterator<String> itList = personas.listIterator();

        itList.next();//desplaza una posición adelante en la lista. posición 1

        itList.add("Juan");

        //iterando:
        for (String persona : personas) {
            System.out.println(persona);
        }

        //Orden de la LinkedList: mismo orden en que se agregaron

        //Agregando en otras posiciones: mejor con iteradores
        //tenemos ListIterator para listas





    }
}