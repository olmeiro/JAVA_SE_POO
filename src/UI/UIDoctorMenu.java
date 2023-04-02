package UI;

import Model.Doctor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointmets;
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
            }


        }while(response != 0);

    }

    private static void showAddAvailableAppointmensMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++){
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                //1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + "\n1. Correct\n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2){
                    continue; //sigue en el ciclo
                }

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your times is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while(responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

                //arreglo de doctores con fecha disponibles
            }else if(response ==0){
                showDoctorMenu();
            }
        }while(response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if(doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointmets.contains(doctor)) { //si tiene citas y no existe el doctor en la lista
            doctorsAvailableAppointmets.add(doctor);
        }
    }
}
