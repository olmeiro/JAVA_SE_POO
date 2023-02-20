public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Contruyendo obj Doctor.");
    }

    Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;

        System.out.println("El nombre del doctor es: " + name + " Especialidad: " + speciality);
    }

    public void showName() {
        System.out.println("name doctor: " + name);
    }

    public void showSpeciality() {
        System.out.println("especialidad: " + speciality);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
