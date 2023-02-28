import Model.AppointmentDoctor;
import Model.Doctor;
import Model.IScheduleable;
import Model.Patient;

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


    }
}