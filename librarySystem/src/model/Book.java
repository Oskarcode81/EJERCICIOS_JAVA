package model;

public class Book {
    private String title;
    private String author;
    private int quantity;
    private int prestados;

    public Book() {
    }

    public Book(String title, String author, int quantity, int prestados) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.prestados = prestados;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrestados() {
        return this.prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

}
