

public class Bike
{
    //instance variables are the adjectives that describe your object
    private String make;
    private String type;
    private double wheelSize;
    private String frameSize;
    
    //constructor definition
    public Bike(String mk, String typ, double wSz, String fSz)
    {
        make = mk;
        type = typ;
        wheelSize = wSz;
        frameSize = fSz;
    }
    
    //mutator method for changing private data
    public void setMake(String m)
    {
        make = m;
    }
    public void setType(String t)
    {
        type = t;
    }
    public void setWheelSize(double w)
    {
        wheelSize = w;
    }
    public void setFrameSize(String f)
    {
        frameSize = f;
    }
    
    
    //accessor method for accessing the private data
    public String getMake()
    {
        return make;
    }
    public String getType()
    {
        return type;
    }
    public double getWheelSize()
    {
        return wheelSize;
    }
    public String getFrameSize()
    {
        return frameSize;
    }
}
