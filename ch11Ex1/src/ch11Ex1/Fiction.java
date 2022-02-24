package ch11Ex1;

public class Fiction extends Book {

    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    void setPrice() {
        this.price = 24.99;
    }
}