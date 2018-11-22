
import greenfoot.*;
/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public static int coin;
    public boolean inAir;
    public int x;
    public int y;
    public String verzamel = "";
    private int frame = 1;
    private int jumpFrame = 1;
    public String word;
    public String activeWorld = "";
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
        if(activeWorld == ""){
            String activeWorld = "MyWorld1";
        }
        
        
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
            if (activeWorld == "MyWorld1" && WaterTile != null && WaterTile instanceof WaterTile) {
                //getWorld().removeObject(this);
                setLocation(397,3733);
                return;
            }
            if (activeWorld == "MyWorld2" && WaterTile != null && WaterTile instanceof WaterTile) {
                //getWorld().removeObject(this);
                Greenfoot.setWorld(new MyWorld2());
                setLocation(452,1633);
                return;
            }
            break;
        }
        for (Actor door : getIntersectingObjects(door.class)) {
            if (coin == 5) {
                //getWorld().removeObject(this);
                Greenfoot.setWorld(new MyWorld2());
                String activeWorld = "MyWorld2";
                setLocation(397, 100);
            } 
        }
        for (Actor lock : getIntersectingObjects(lock.class)){
            if(isTouching(lock.class))  
            {  
                this.x = getX();
                this.y = getY();
                setLocation(x,y);
                return;
            }
            break;
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
        for(Actor hero : getIntersectingObjects(JumpTile.class)) {
            if (Greenfoot.isKeyDown("space")) {
                inAir = true;
                velocityY = -14;
                setImage("p1_jump.png");
            }
            else{
                inAir = false;
            }
        }
        if (Greenfoot.isKeyDown("a")) {
            velocityX = -4;
            frames2();
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 4;
            frames();
        }
    }

    public void frames2(){
        if(frame == 1){
            setImage("p1_walk2_01.png");
        }
        if(frame == 2){
            setImage("p1_walk2_02.png");
        }
        if(frame == 3){
            setImage("p1_walk2_03.png");
        }
        if(frame == 4){
            setImage("p1_walk2_04.png");
        }
        if(frame == 5){
            setImage("p1_walk2_05.png");
        }
        if(frame == 6){
            setImage("p1_walk2_06.png");
        }
        if(frame == 7){
            setImage("p1_walk2_07.png");
        }
        if(frame == 8){
            setImage("p1_walk2_08.png");
        }
        if(frame == 9){
            setImage("p1_walk2_09.png");
        }
        if(frame == 10){
            setImage("p1_walk2_10.png");
        }
        if(frame == 11){
            setImage("p1_walk2_11.png");
            frame = 1;
            return;
        }
        frame++;
    }

    public void frames(){
        if(frame == 1){
            setImage("p1_walk01.png");
        }
        if(frame == 2){
            setImage("p1_walk02.png");
        }
        if(frame == 3){
            setImage("p1_walk03.png");
        }
        if(frame == 4){
            setImage("p1_walk04.png");
        }
        if(frame == 5){
            setImage("p1_walk05.png");
        }
        if(frame == 6){
            setImage("p1_walk06.png");
        }
        if(frame == 7){
            setImage("p1_walk07.png");
        }
        if(frame == 8){
            setImage("p1_walk08.png");
        }
        if(frame == 9){
            setImage("p1_walk09.png");
        }
        if(frame == 10){
            setImage("p1_walk10.png");
        }
        if(frame == 11){
            setImage("p1_walk11.png");
            frame = 1;
            return;
        }
        frame++;
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
