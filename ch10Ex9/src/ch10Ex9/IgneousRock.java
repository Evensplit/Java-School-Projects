package ch10Ex9;

public class IgneousRock extends Rock {
    public IgneousRock(int number, double weight) {
        super(number, weight);
        setDescription();
    }

    public void setDescription() {
        description = "Igneous rocks are crystalline solids \r\n"
        		+ "which form directly from the cooling of magma.";
    }

}