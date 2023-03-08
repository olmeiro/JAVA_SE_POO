
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //declaración del map
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

        //agregar empleados:
        personal.put("145", new Empleado("Alberto"));
        personal.put("146", new Empleado("Juan"));
        personal.put("147", new Empleado("Mario"));
        personal.put("148", new Empleado("Carrasco"));

        System.out.println(personal);

        //eliminar objeto en map:
        personal.remove("145");
        System.out.println(personal);

        System.out.println("____");
        personal.put("145", new Empleado("Albert"));
        System.out.println(personal);

        System.out.println();
        System.out.println("____ENTRY SET___");
        //método entry set:
        // System.out.println(personal.entrySet());

        for(Map.Entry<String, Empleado> entrada: personal.entrySet()){
            //ahora puedo jugar con clave y valor:
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();

            System.out.println("Clave= " + clave + " Valor: " + valor);
        }

    }
}