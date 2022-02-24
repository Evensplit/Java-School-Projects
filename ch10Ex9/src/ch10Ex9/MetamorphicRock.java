package ch10Ex9;

public class MetamorphicRock extends Rock {
    public MetamorphicRock(int number, double weight) {
        super(number, weight);
        setDescription();
    }

    public void setDescription() {
        description = "Any rock can become a metamorphic rock \r\n"
        		+ "if the rock is moved into an environment in which the \r\n"
        		+ "minerals which make up the rock become unstable and \r\n"
        		+ "out of equilibrium with the new environmental conditions.";
    }

}