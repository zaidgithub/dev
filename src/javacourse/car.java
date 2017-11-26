 
package javacourse;

public class car {

    public int speed;
    
    public car()
    {
    this.speed=0;
    }
    
    public void setspeed(int p)
    {
    this.speed=p;
    switch(this.speed)
    {
    case 50:
    case 60:
    case 70:
    case 80:
    case 90:
          System.out.println("you are in saafe mode");
    break;
    case 100:
         System.out.println("100km");
    break;
    case 180:
        System.out.println("please slow down now");
    default:
        System.out.println("no value is selected ");
    }
    
    }
    
    public int getspeed()
    {
    return this.speed;
    }
    
}
