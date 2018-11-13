
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
        setLocation(387, 1573);
   
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
                setLocation(385,1573);
                break;
            }
        }
            
    }
    
    public String getPosition() {
        String retval = "X: " + this.getX() +" Y: " + this.getY();
        return retval;
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
            velocityX = -4;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 4;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
