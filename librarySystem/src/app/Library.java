package app;

import model.Book;

public class Library {

    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public boolean prestamo() {
        int prestados = this.book.getPrestados();

        if (prestados < this.book.getQuantity()) {
            this.book.setPrestados(prestados++);
        } else {
            return false;
        }

        return true;

    }

    public boolean devolucion() {
        int prestados = this.book.getPrestados();

        if (prestados == 0) {
            return false;
        } else {
            this.book.setPrestados(prestados--);
        }
        return true;

    }

}
