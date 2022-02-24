package ch10Ex9;

public class Rock
{
    private int sampleNumber;
    protected String description;
    private double weight;
    public Rock(int number, double weight)
    {
        sampleNumber = number;
        this.weight = weight;
        description = "Unclassified";
    }
    public int getSampleNumber()
    {
        return sampleNumber;
    }
    public String getDescription()
    {
        return description;
    }
    public double getWeight()
    {
        return weight;
    }
}