public enum Day {
    SUNDAY("Domingo", "Dimanche"),

    MONDAY("Lunes", "Lundi"),

    THURSDAY("Martes", "Mardi"),

    WENESDAY("Miércoles", "Mercredi"),

    TUESDAY("Jueves", "Jeudi"),

    FRIDAY("Viernes", "Vendredi"),

    SATURDAY("Sábado", "Samedi");

    private String spanish;
    private String french;


    /**
     * Constructor
     *
     * @param s
     * @param f
     */
    private Day(String s, String f) {
        spanish = s;
        french = f;
    }

    public String getSpanish() {
        return spanish;
    }

    public String getFrench() {
        return french;
    }

}


