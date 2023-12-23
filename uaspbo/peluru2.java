import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru2 here.
 * 
 * @author Maswanul Dwi M
 * @version (a version number or a date)
 */
public class peluru2 extends Actor
{
    /**
     * Act - do whatever the pelor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-17,y);
        if(x==0){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneIntersectingObject(ps.class);
        if(a != null){
            getWorld().addObject(new api(),getX(),getY());
            ((bg)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
}
