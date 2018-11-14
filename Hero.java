
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
    public boolean inAir;
    public static int x = 397;
    public static int y = 3733;
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
        /*for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                //getWorld().removeObject(this);
                setLocation(x,y);
                break;
            }
        }*/
        for (Actor door : getIntersectingObjects(Door.class)) {
            if ((door != null) && (coin == 5)) {
                //getWorld().removeObject(this);
                Greenfoot.setWorld(new MyWorld2());
                String activeWorld = "MyWorld2";
                break;
            }
        }    
        
}
    public void checkpoint()
    {
    if(isTouching(lock.class))  
    {  
    this.x = getX();
    this.y = getY();
    setLocation(x,y);
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
        for(Actor hero : getIntersectingObjects(Tile.class)) {
        if (Greenfoot.isKeyDown("space")) {
            inAir = true;
            velocityY = -17;
        }
        else{
            inAir = false;
        }
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
