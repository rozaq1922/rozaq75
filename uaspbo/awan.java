import greenfoot.*;

/**
 * Write a description of class awan here.
 * 
 * @author Maswanul Dwi M
 * @version 1.0.0
 */
public class awan extends Actor
{
    /**
     * Act - do whatever the awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-1,y);
        if(x==0){
            getWorld().removeObject(this);
        }
    }    
}
