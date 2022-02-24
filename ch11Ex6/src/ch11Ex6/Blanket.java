package ch11Ex6;

public class Blanket {
	protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;
    private final String SIZE1 = "Twin";
    private final String SIZE2 = "Double";
    private final String SIZE3 = "Queen";
    private final String SIZE4 = "King";
    protected final double BASE_PRICE = 30;
    private final double S_PRICE2 = 10;
    private final double S_PRICE3 = 25;
    private final double S_PRICE4 = 40;
    private final String MAT1 = "cotton";
    private final String MAT2 = "wool";
    private final String MAT3 = "cashmere";
    private final double M_PRICE2 = 20;
    private final double M_PRICE3 = 45;
    public Blanket()
    {
        setDefaults();
    }
    private void setDefaults()
    {
        // write your code here
    	this.size = SIZE1;
    	this.color = "white";
    	this.material = "MAT1";
    	this.price = BASE_PRICE;
    }
    public String getSize()
    {
        // write your code here
    	return size;
    	
    }
    public String getColor()
    {
        // write your code here
    	return color;
    }
    public String getMaterial()
    {
        // write your code here
    	return material;
    }
    public void setSize(String s)
    {
        // write your code here   
    	//if the given size is "Twin", use equal method from String to compare two strings
        if(SIZE1.equals(s)){
            // set blanket size to SIZE1
            size = SIZE1;
        }
        // if the given size is "Double"
        else if(SIZE2.equals(s)){
            // set blanket size to SIZE2
            size = SIZE2;
            // if the sizePremium is greater than 0
            if(sizePremium > 0){
                // remove the sizePremium from the price
                price -= sizePremium;
            }
            // set sizePremium to S_PRICE2
            sizePremium = S_PRICE2;
            // add sizePremium to the price of blanket
            price += sizePremium;
        }
        // if the given size is "Queen"
        else if(SIZE3.equals(s)){
            // set blanket size to SIZE3
            size = SIZE3;
            // if the sizePremium is greater than 0
            if(sizePremium > 0){
                // remove the sizePremium from the price
                price -= sizePremium;
            }
            // set sizePremium to S_PRICE3
            sizePremium = S_PRICE3;
            // add sizePremium to the price of blanket
            price += sizePremium;
        }
        // if the given size is "King"
        else if(SIZE4.equals(s)){
            // set blanket size to SIZE4
            size = SIZE4;
            // if the sizePremium is greater than 0
            if(sizePremium > 0){
                // remove the sizePremium from the price
                price += sizePremium;
            }
            // set sizePremium to S_PRICE2
            sizePremium = S_PRICE2;
            // add sizePremium to the price of blanket
            price += sizePremium;
        }
        // otherwise i.e. given size is invalid
        else{
            // set the blanket to default values
            setDefaults();
        }
    	
    	//write your code here
    	/* if(s.equals(SIZE2))
         {
                 this.size = s;
                 this.price += S_PRICE2;
         }
         else if(s.equals(SIZE3))
         {
                 this.size = s;
                 this.price += S_PRICE3;
         }
         else if(s.equals(SIZE4))
         {
                 this.size=s;
                 this.price += S_PRICE4;
         }
         else{
                 this.size=SIZE1;
                 this.price = BASE_PRICE;
         }*/
    }
    public void setMaterial(String m)
    {
        // write your code here
    	 // if the given material is "cotton", use String method equals to compare tow strings
        if(MAT1.equals(m)){
            // set blanket material to MAT1
            material = MAT1;
        }
        // if the given material is "wool"
        else if(MAT2.equals(m)){
            // set blanket material to MAT2
            material = MAT2;
            // if meterialPremium is greater than 0
            if(materialPremium > 0){
                // remove the materialPremium from the price
                price -= materialPremium;
            }
            // set materialPremium to M_PRICE2
            materialPremium = M_PRICE2;
            // add materialPrice to price of blanket
            price += materialPremium;
        }
        // if the given material is "cashmere"
        else if(MAT3.equals(m)){
            // set blanket material to MAT3
            material = MAT3;
            // if meterialPremium is greater than 0
            if(materialPremium > 0){
                // remove the materialPremium from the price
                price -= materialPremium;
            }
            // set materialPremium to M_PRICE3
            materialPremium = M_PRICE3;
            // add materialPrice to price of blanket
            price += materialPremium;
        }
        // otherwise i.e. invalid material is given
        else{
            // set all values to default
            setDefaults();
        }
    }
    	
    	//write code here
    	/* if(m.equals(MAT2))
         {
                         this.material = MAT2;
                         this.price += M_PRICE2;
         }
                 else if(m.equals(MAT3))
                 {
                         this.material = MAT3;
                         this.price += M_PRICE3;
                 }
                 else{
                         this.material = MAT1;
                 }*/
    
    //}
    public String toString()
    {
        // write your code here
        return "Blanket's size is '"+this.size +"', color is '"+this.color +"', material is '" + this.material+"' and price is $" + this.price;
    }

}
