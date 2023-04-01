import Model.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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

        //Doctor Appointments
        AppointmentDoctor appointmentDoctorSchedule = new AppointmentDoctor();
        appointmentDoctorSchedule.schedule(new Date(2023, 12, 21), "10:00");

        //ya no podemos crear objetos de tipo User:
        //User user = new User() {}
        //Lo sigte es un tipo de polimorfismo_user adquiere el comportamiento que le dió el objeto doctor.
        System.out.println("===================Doctor======================");
        User user = new Doctor("Anahi", "ana@naa.com");
        user.showDataUser();

        System.out.println("=================Paciente===================");
        User userPaciente = new Patient("Anahi", "ana@naa.com");
        userPaciente.showDataUser();

        //Nota: el código anterior muestra una especie de polimorfismo donde el comportamiento lo dicta la clase hija. Recordar que las clases abstract no se instancian.

        //Clases Anónimas: al escribir new damos ctrl + esp:
        //ahora sobreescribimos el método de la clase abstracta:
        User user1 = new User("Anahi", "ana@com") {
            @Override
            public void showDataUser() {
                System.out.println("\nDoctor");
                System.out.println("Hospital Cruz Verde");
                System.out.println("Departamento: pediatría");
            }
        };

        //llamamos el método abstracto:
        user1.showDataUser();

//        IScheduleable ischeduleable = new IScheduleable() {
//            @Override
//            public void schedule(Date date, String time) {
//
//            }
//        };
//        IScheduleable ischeduleable1 = new AppointmentDoctor();
//        ischeduleable1.schedule("10/02/2023","10:00");
    }
}