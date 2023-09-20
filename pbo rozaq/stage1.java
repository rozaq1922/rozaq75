import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage1 extends flatfromstage
{
    int gravity = 5;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }

    /**
     * Constructor for objects of class stage1.
     * 
     */
    public stage1()
    {
        player snake = new player();
        this.addObject(snake, 300, 200);
        this.gravity = 5;
        player snake2 = new player();
        this.addObject(snake2, 500, 100);
    }
    public void act(){
        List<animal>allChars = this.getObjects(animal.class);
        for(animal chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}
