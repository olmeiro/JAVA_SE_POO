package Collections;

import java.util.*;

public class CollectionsCases {

    //Declaranto Maps:
    Map<Integer, String> map = new HashMap<Integer, String>();
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

    //Imprimir el map con un iterador:

    //Para HashMap:
    Iterator it = map.keySet().iterator();
    while(it.hasNext())

    {
        Object key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
    }

    //Para LinkedHashMap:
    // Imprimimos el Map con un Iterador
    Iterator itLinked = linkedHashMap.keySet().iterator();
    while(itLinked.hasNext())

    {
        Object key = itLinked.next();
        System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
    }

    //Para TreeMap:
    // Imprimimos el Map con un Iterador
    Iterator itTree = treeMap.keySet().iterator();
    while(itTree.hasNext())

    {
        Object key = itTree.next();
        System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
    }



}
