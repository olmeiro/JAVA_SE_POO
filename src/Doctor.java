public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(String name, String speciality) {
        System.out.println("Contruyendo obj Doctor.");
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    Doctor(String name) {
        id++;
        this.name = name;
        System.out.println("El nombre del doctor es: " + name);
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
