import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Doctor myDoctor = new Doctor("Alenjadra Lópex", "Cardiología");
        myDoctor.showName();
        myDoctor.showSpeciality();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor otherDoctor = new Doctor("Sara Saldarriage");
        otherDoctor.showName();
        otherDoctor.showId();
        System.out.println(Doctor.id);

        //UIMenu.showMenu(); //Mejor guardamos el UI en un package y lo importamos ->
        showMenu();  //Modularización
    }
}