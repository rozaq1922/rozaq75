import greenfoot.*;
/**
 * Write a description of class bg here.
 * 
 * @author Maswanul Dwi M
 * @version 1.0.0
 */
public class bg extends World
{
    Counter counter = new Counter("Skor: ");
    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 800, 1); 
        setPaintOrder(skor.class, api.class, awan.class, ps.class, ufo.class, Counter.class, peluru1.class, peluru2.class);
        addObject(new awan(),1090,220);
        addObject(new ps(),69,215);
        addObject(new ufo(),890,820);
        addObject(counter,120,450);
        
        //Greenfoot.playSound("opening.mp3");
    }
    private GreenfootSound mulai = new GreenfootSound("ms.mp3");{
   
    }
    public void started() {
        mulai.setVolume(70);
        mulai.play();
    }
    public void act(){
      
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new awan(),853,Greenfoot.getRandomNumber(70));
        }
       
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new ufo(),853,Greenfoot.getRandomNumber(479));
        }
       
    }
    public void tambah(){
        counter.add(20);
    }

    /**
     * Called when game is up. Stop running and display score.
     */
    public void selesai() 
    {
        addObject(new skor(counter.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.playSound("end.mp3");
        Greenfoot.stop();
    }
}
