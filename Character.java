
/**
 * @author Elliot Frankel
 */
public class Character
{
    /*
     * Instance variables
     */
    
    private String name;
    private int height;
    private String colorHair;
    private int age;
    
    /**
     * Constructor will take 4 variables
     * @param name the name of the character
     * @param height their height
     * @param colorHair the color of their hair
     * @param age their age
     */
    public Character(String n, int h, String hair, int a)
    {
        name = n;
        height = h;
        colorHair = hair;
        age = a;
    }
    
    /**
     * Mutator method to change the name
     * @param n the name we are changing
     */
    public void setName(String n)
    {
        name = n;
    }
    /**
     * Mutator method to change the height
     * @param n the height we are changing
     */
    public void setHeight(int h)
    {
        height = h;
    }
    /**
     * Mutator method to change the hair color
     * @param n the color we are changing
     */
    public void setColor(String hair)
    {
        colorHair = hair;
    }
    /**
     * Mutator method to change the age
     * @param n the age we are changing
     */
    public void setAge(int a)
    {
        age = a;
    }
    
    /**
     * Accessor method to get name
     * @return the name of the character
     */
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String characterData = "Name: " + name;
        characterData += "Height: " + height;
        characterData += "Hair Color: " + colorHair;
        characterData += "Age: " + age;
        return characterData;
    }
}
// missed a chunk of class, was meeting with counselor, did not finish code
