import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Alenjadra Lópex", "alejalopex@gmail.com");
        myDoctor.setSpeciality("cardiología");
        System.out.println(myDoctor.getSpeciality());

        Doctor otherDoctor = new Doctor("Sara Saldarriage", "sarasalda@gmail.com");
        otherDoctor.setSpeciality("radiología");
        System.out.println(otherDoctor.getSpeciality());

        System.out.println();
        System.out.println(myDoctor);

        Patient patient = new Patient("Alejandra", "aleja@gmail.com");
        patient.setWeight(54.6);
        patient.setPhoneNumber("12345678");
        patient.setAddress("calle 20");
        patient.setBirthday("9/05/1989");
        System.out.println();
        System.out.println(patient);

    }
}