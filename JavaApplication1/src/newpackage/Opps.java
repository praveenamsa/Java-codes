package newpackage;
//import javaapplication1.Main;
/**
 *
 * @author PRAVEENAGRUD
 */
class Vehicle extends Methods
{
    protected String brand = "BMW";
    public String sound(String soundOfBmw)
    {
        return soundOfBmw;
    }
}
public class Opps extends Vehicle {
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name1)
    {
        this.name = name1;
    }
    public static void main(String args[]){
       // Main obj1 = new Main();
       // recusionMethod(5);
        Opps obj = new Opps();
        obj.setName("Praveen");
        System.out.println(obj.getName());
        System.out.println(obj.brand+" "+obj.sound("Sound of BMW"));   
    } 
}
