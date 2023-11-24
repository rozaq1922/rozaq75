import greenfoot.*;

public class Fire extends Actor {
    public Fire() {
        GreenfootImage image = new GreenfootImage("/player/fire/0.png");
        setImage(image);
    }

    public void act() {
        move(10); 
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
