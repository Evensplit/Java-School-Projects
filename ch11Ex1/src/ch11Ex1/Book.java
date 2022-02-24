package ch11Ex1;

public abstract class Book {
    //Instance variables
    String title;
    double price;

    //Argumented constructor
    public Book(String title) {
        this.title = title;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
    //Abstract setter
    abstract void setPrice();
}