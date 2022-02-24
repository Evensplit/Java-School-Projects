package ch10Ex9;

public class SedimentaryRock extends Rock {
    public SedimentaryRock(int number, double weight) {
        super(number, weight);
        setDescription();
    }

    public void setDescription() {
        description = "Sedimentary rocks are called secondary, \r\n"
        		+ "because they are often the result of the accumulation \r\n"
        		+ "of small pieces broken off of pre-existing rocks.\r\n"
        		+ "";
    }

}