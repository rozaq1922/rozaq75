import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru1 here.
 * 
 * @author Maswanul Dwi M
 * @version (a version number or a date)
 */
public class peluru1 extends Actor
{
    /**
     * Act - do whatever the pelor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x+29,y);
        if(x == 853){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneObjectAtOffset(0 ,0, ufo.class);
        if(a != null){
            getWorld().addObject(new api(),getX(),getY());
            ((bg)getWorld()).tambah();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
}
