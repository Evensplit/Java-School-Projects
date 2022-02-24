package ch11Ex6;

public class ElectricBlanket extends Blanket {
	private int settings;
    private boolean hasAutoShutoff;
    private final int MAX_SETTINGS = 5;
    private double shutoffPremium;
    private final double S_PRICE = 5.75;
    public ElectricBlanket()
    {
        // write your code here
    	  super();
          this.settings=1;
          this.hasAutoShutoff=false;
    }
    public int getSettings()
    {
        // write your code here
    	return settings;
    }
    public boolean getHasAutoShutoff()
    {
        // write your code here
    	return hasAutoShutoff;
    }
    public void setSettings(int s)
    {
        // write your code here
    	 if(s < 1 || s > 5)
             this.settings = 1;
         else
             this.settings = s;
   
    }
    public void setHasAutoShutoff(boolean h)
    {
        // write your code here
    	 if(h)
         {
                 this.price+=5.75;
                 this.hasAutoShutoff=h;
         }
         else
                 this.hasAutoShutoff=h;
    	
    }
    public String toString()
    {
        // write your code here
        return super.toString()+" having setting value is "+this.settings+" and shutoff feature is present "+this.hasAutoShutoff;
    }




}
