package UI;

import Model.Doctor;
import Model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public final static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to my appointments");
        System.out.println("Choose correct option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for your visit.");
                    break;
                default:
                    System.out.println("Please select a correct answer.");
            }

        } while (response != 0);
    }

    private static void authUser(int userType) {
        //userType = 1 Doctor
        //userType = 2 Pacient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
        doctors.add(new Doctor("Rocío Gomez", "rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí salgado", "salgado@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "rodriguez@gmail.com"));
        patients.add(new Patient("Carlos Sánchez", "sanchez@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if(userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logueado:
                        doctorLogged = d;
                        //showDoctor Menu:
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if(userType == 2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logueado:
                        patientLogged = p;
                        //showPatient Menu:
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while(!emailCorrect);
    }
}
