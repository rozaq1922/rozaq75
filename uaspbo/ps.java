import greenfoot.*;
/**
 * Write a description of class ps here.
 * 
 * @author Maswanul Dwi M
 * @version 1.0.0
 */
public class ps extends Actor
{
    /**
     * Act - do whatever the ps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private bg pl;
    public void addedToWorld(World bg){
        pl=(bg)bg;
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if(Greenfoot.mouseClicked(null)) {
            pl.addObject(new peluru1(),getX()+getImage().getHeight(),getY());
            Greenfoot.playSound("p1.wav");
        }
        Actor a=getOneObjectAtOffset(0,0,ufo.class);
        if(a!=null){
            getWorld().addObject(new api(),getX(),getY());
            ((bg)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }    
    }
}
