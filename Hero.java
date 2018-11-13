
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public int coin;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        setLocation(300, 200);
   
    }
    
    @Override
    public void act() {
        handleInput();
        addCoin();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                //getWorld().removeObject(this);
                setLocation(300,200);
                break;
            }
        }
            
    }
    public int addCoin(){
         if(isTouching(coinBronze.class)){
            removeTouching(coinBronze.class);
            coin ++;
        }
        return coin;
    }
    public void handleInput() {
        if (Greenfoot.isKeyDown("space")) {
            velocityY = -10;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
