import java.util.Comparator;

public class Articulo implements Comparable<Articulo> {
    public Articulo(int num, String desc) {
        numero_articulo = num;
        descripcion = desc;
    }

    @Override
    public int compareTo(Articulo o) {
//        return 0;
        return numero_articulo - o.numero_articulo; //compara articulos
    }

    public String getDescripcion() {
        return descripcion;
    }

    private int numero_articulo;
    private String descripcion;

}

//class ComparadorArticulos implements Comparator<Articulo>{
//
//    @Override
//    public int compare(Articulo o1, Articulo o2) {
//        String descripcion1 = o1.getDescripcion();
//        String descripcion2 = o2.getDescripcion();
//        return descripcion1.compareTo(descripcion2);
//    }
//}
