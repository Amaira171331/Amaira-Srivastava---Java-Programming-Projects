class Birds
{ 
    public void act() 
    { 
        System.out.print("fly "); 
        makeNoise(); 
    } 
    public void makeNoise() 
    { 
        System.out.print("chirp "); 
    } 
} 
class Doves extends Birds 
{
    public void act() 
    { 
        super.act(); 
        System.out.print("waddle "); 
    } 
    public void makeNoise() 
    { 
        super.makeNoise(); 
        System.out.print("coo "); 
    } 
} 
public class other
{
    public static void main()
    {
        Birds pigeon = new Doves();
        pigeon.act();
    }
}
