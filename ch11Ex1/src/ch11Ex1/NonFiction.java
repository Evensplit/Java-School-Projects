package ch11Ex1;

class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    void setPrice() {
        this.price = 37.99;
    }
}