import java.util.Scanner;

class Fan {
	public static final int SLOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	Fan()
	{
	    this.speed=1;
	    this.on=false;
	    this.radius=5;
	    this.color="white";
	}
	public int getSpeed()
	{
	    return speed;
	}
	public void setSpeed(int speed)
	{
	    if(speed==1)
	    this.speed=SLOW;
	    if(speed==2)
	    this.speed=MEDIUM;
	    if(speed==3)
	    this.speed=FAST;
	}
 
    public boolean isOn()
    {
        return on;
    }
    public void setOn(boolean on)
    {
        this.on=on;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String toString()
    {
        return "Fan[speed="+speed+",on="+on+",radius="+radius+",color="+color+"]";
    }
}

public class FanTest {

	public static void main(String[] args) {
		/* Do Not Alter main() */
		Scanner in = new Scanner(System.in);

		Fan f = new Fan();
		System.out.println(f);
		f.setSpeed(in.nextInt());
		f.setOn(in.nextBoolean());
		f.setRadius(in.nextDouble());
		f.setColor(in.next());
		System.out.println(f);
	}

}
