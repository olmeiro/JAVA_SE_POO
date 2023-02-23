import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Doctor myDoctor = new Doctor("Alenjadra Lópex", "Cardiología");
        myDoctor.showName();
        myDoctor.showSpeciality();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor otherDoctor = new Doctor("Sara Saldarriage", "Radiología");
        otherDoctor.showName();
        otherDoctor.showId();
        System.out.println(Doctor.id);

        //UIMenu.showMenu(); //Mejor guardamos el UI en un package y lo importamos ->
        showMenu();  //Modularización

        Patient patient = new Patient("Alejandra", "aleja@gmail.com");

   /*     System.out.println("paciente: " + patient.name);
        patient.weight = 60.5; //kg ?
        patient.height = 1.65; //metros ?

        System.out.println("altura paciente: " + patient.height);
        System.out.println("peso paciente: " + patient.weight);

        patient.weight = 200.3; // no es consistente
        patient.name = "Juan"; //mutamos los datos originales*/


        //Usando getters y setters
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        //Variables vs Objetos:
        int i = 0;
        int b = 2;
        b = i; //b = 0

        Patient patient1 = new Patient("paciente1", "p1@gmail.com");
        Patient patient2 = new Patient("paciente2", "p2@gmail.com");

        System.out.println("patient1: " + patient1);
        System.out.println("patient2: " + patient2);

        patient2 = patient1;
        System.out.println();
        System.out.println("Miremos que pasa luego de la reasignación:");

        System.out.println("patient1: " + patient1);
        System.out.println("patient2: " + patient2); //apunta a la misma dirección en memoria de patient1

        System.out.println(patient1.getName());
        patient2.setName("Nuevo paciente"); //hacemos cambio en p2
        System.out.println(patient1.getName()); //vemos reflejado el cambio en p1

        patient1.setName("Dorian");
        System.out.println(patient1.getName());
        System.out.println(patient2.getName());


        //usando clase anidada en Doctor:
        Doctor doctorHouse = new Doctor("House", "Whatever");
        doctorHouse.addAvailableAppointment(new Date(), "10am");
        doctorHouse.addAvailableAppointment(new Date(), "1pm");

        System.out.println(doctorHouse.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA : doctorHouse.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        //enumerations:
        System.out.println("ENUM-Monday: " + Day.MONDAY);
        System.out.println("ENUM-Monday-spanish: " + Day.MONDAY.getSpanish());
        System.out.println("ENUM-Monday-french: " + Day.MONDAY.getFrench());

        Day sunday = Day.SUNDAY;

        if (sunday == Day.MONDAY) {
            System.out.println("Day off");
        } else {
            System.out.println("working day!");
        }

        Day allDays[] = Day.values();

        for (Day d : allDays) {
            System.out.println(d);
        }

        System.out.println(Day.SATURDAY.ordinal());
    }
}