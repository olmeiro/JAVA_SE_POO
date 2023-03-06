/**
 * Articulo ordena los articulos en función del num del articulo, para ello sobreescribimos el método compareTo de la Interfaz Comparable: Así lo hace la clase String pero por orden alfabetico.
 */

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
