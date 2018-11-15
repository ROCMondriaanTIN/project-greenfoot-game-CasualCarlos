
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
    public int x = 397;
    public int y = 3733;
    public String verzamel = "";
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
        addLetter();
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
        for (Actor WaterTile : getObjectsInRange(50, WaterTile.class)) {
            if (WaterTile != null && WaterTile instanceof WaterTile) {
                //getWorld().removeObject(this);
                setLocation(x,y);
                break;
            }
        }
        for (Actor door : getIntersectingObjects(Door.class)) {
            if ((door != null) && (coin == 5)) {
                //getWorld().removeObject(this);
                Greenfoot.setWorld(new MyWorld2());
                String activeWorld = "MyWorld2";
                break;
            }
        }    
        for (Actor lock : getIntersectingObjects(lock.class)){
            if(isTouching(lock.class))  
            {  
                this.x = getX();
                this.y = getY();
                setLocation(x,y);
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
    public String addLetter(){
        if(isTouching(A.class)){
            removeTouching(A.class);
            verzamel += "A";
            getWorld().showText(verzamel, 100, 100);
            coin ++;
        }
        if(isTouching(B.class)){
            removeTouching(B.class);
            verzamel += "B";
            getWorld().showText(verzamel, 100, 100);
            coin ++;
        }
        return verzamel;
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
