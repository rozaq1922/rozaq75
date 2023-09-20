import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends animal
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
  {
    // Add your action code here.
    int xPoss = this.getX();
    int yPoss = this.getY();
    World wrld = this.getWorld();
    this.move(1);
    if(Greenfoot.isKeyDown("space")){
       this.setLocation(xPoss, yPoss-10);
    }
    
    if(xPoss == wrld.getWidth()-1){
        this.setLocation(0, yPoss);
    }
    
    if(yPoss == wrld.getWidth()-1){
        this.setLocation(xPoss, 0);
    
    }
  }
}
