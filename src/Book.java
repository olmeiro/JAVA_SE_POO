import java.util.Objects;

public class Book {
    private String titulo;
    private String autor;
    private int ISBN;

    public Book(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getDatos() {
        return "El título es: " + titulo + " .El autor es: " + autor + " .El ISBN es: " + ISBN;
    }

    //Utilizando equals para comparar objetos:
   /* public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj; //cast de obj a Book porque era Object

            if (this.ISBN == other.ISBN) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }*/

    //usando intellij equals method and hashCode:
    /*click + right + generate -> hashCode and equals -> elegir campo que marca la diferencia*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
