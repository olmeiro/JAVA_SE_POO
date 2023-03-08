public class Empleado {
    public  Empleado(String name){
        nombre= name;
        sueldo = 2000;
    }

    public String toString(){
        return "[Nombre= " + nombre + " sueldo= " + sueldo +"]";
    }

    private String nombre;
    private double sueldo;
}
