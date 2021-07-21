import app.Library;
import model.Book;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creamos una instancia de la clase Book o creamos un libro con los atributos definidos en el constructor
        Book book = new Book("Crear o morir", "Andrés Oppenheimer", 5, 2);

        // Creamos una instancia de Library y le pasamos por el constructor a book
        Library library = new Library(book);

        // Se realiza un prestamo de book
        if(library.prestamo()) {
            System.out.println("Se ha prestado el libro " + book.getTitle());
        } else {
            System.out.println("No quedan ejemplares del libro " + book.getTitle() + " para prestar.");
        }

        // Se realiza una devolucion de book
        if(library.devolucion()) {
            System.out.println("Se ha devuelto el libro " + book.getTitle());
        } else {
            System.out.println("No quedan ejemplares del libro " + book.getTitle() + " para prestar.");
        }


    }
}
