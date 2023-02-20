import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

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

    //Usando una clase anidada:
    //fechas disponibles del doctor para citas: un doctor puede tener muchas citas
    //disponibles. Para hacerlo creariamos un array con las citas cosa que no se hace
    //escalable, por ello mejor usamos una clase anidada y ahora sí usamos el arrayList

    //Métodos para usar la clase anidada:
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
