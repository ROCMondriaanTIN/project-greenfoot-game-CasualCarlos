
import greenfoot.*;
import java.util.*;
/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    GreenfootSound coinPlay = new GreenfootSound("sounds/smb2_coin.wav");
    GreenfootSound doorPlay = new GreenfootSound("sounds/nsmbwiiDoor3.wav");
    GreenfootSound rainPlay = new GreenfootSound("sounds/rain.mp3");
    private final double gravity;
    private final double acc;
    public String worldName = "";
    private final double drag;
    public static int coin;
    public boolean inAir;
    public int x = 397;
    public boolean doorOpen = true;
    public int y = 3733;
    public String verzamel = "";
    private int frame = 1;
    private int jumpFrame = 1;
    public String word;
    public String activeWorld = "";

    Scorenbord scb;
    Gameover gov;
    
    
    public Hero(String worldName) {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        setLocation(397,3733);
        this.worldName = worldName;
    }

    public int levens(){
        if(scb.leven == 0){
            Greenfoot.setWorld(new Gameover(worldName));
        } else{
            
        }
        return scb.leven;
    }

    @Override
    public void act() {
        if(activeWorld == ""){
            String activeWorld = "MyWorld1";
        }
        openDoor();
        handleInput();
        addLetter();
        velocityX *= drag;
        velocityY += acc;

        if(scb == null){
            scb = new Scorenbord();
            getWorld().addObject(scb, -10, -10);
        }

        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                if(worldName == "World1"){
                    setLocation(x,y);
                    scb.hartjeEraf();
                    levens();
                    return;
                }
                if(worldName == "World2"){
                    setLocation(452,1633);
                    scb.hartjeEraf();
                    levens();
                    return;
                }
            }
        }
        for (Tile WaterTile : getObjectsInRange(50, WaterTile.class)) {
            if (WaterTile != null && WaterTile instanceof WaterTile) {
                //getWorld().removeObject(this);
                if(worldName == "World1"){
                    setLocation(397,3733);
                    scb.hartjeEraf();
                    levens();
                    return;
                }
                if(worldName == "World2"){
                    setLocation(452, 1633);
                    scb.hartjeEraf();
                    levens();
                    return;
                }
                if(worldName == "World3"){
                    setLocation(453, 2353);
                    scb.hartjeEraf();
                    levens();
                    return;
                }
            }
            break;
        }
        for (Actor LavaTile : getObjectsInRange(50, LavaTile.class)) {
            if (LavaTile != null && LavaTile instanceof LavaTile) {
                //getWorld().removeObject(this);
                setLocation(452, 1633);
                scb.hartjeEraf();
                levens();
                return;
            }
            break;
        }
        for (Actor door : getIntersectingObjects(door.class)) {
            if (coin == 4 && doorOpen == true){
                //getWorld().removeObject(this);
                doorPlay.play();
                Greenfoot.setWorld(new MyWorld2());
                setLocation(452, 1633);
            } 
            if (coin == 7 && doorOpen == true){
                //getWorld().removeObject(this);
                doorPlay.play();
                Greenfoot.setWorld(new MyWorld3());
                setLocation(452, 1633);
            } 
        }
        for (Actor door : getIntersectingObjects(fakeDoor.class)) {
            if(worldName == "World2"){
                    setLocation(452, 1633);
                    scb.hartjeEraf();
                    levens();
                    return;
                }
            if(worldName == "World3"){
                    setLocation(453, 2353);
                    scb.hartjeEraf();
                    levens();
                    return;
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

    
    public void openDoor(){
        if(isTouching(keyDoor.class) && (coin == 4)){
            String activeWorld = "MyWorld1";
            boolean doorOpen = true;
            getWorld().removeObjects(getWorld().getObjects(keyDoor.class));
            getWorld().removeObjects(getWorld().getObjects(ClosedDoor.class));
            getWorld().removeObjects(getWorld().getObjects(ClosedDoorTop.class));
        }
        if(isTouching(keyDoor.class) && (coin == 7)){
            String activeWorld = "MyWorld2";
            boolean doorOpen = true;
            getWorld().removeObjects(getWorld().getObjects(keyDoor.class));
            getWorld().removeObjects(getWorld().getObjects(ClosedDoor.class));
            getWorld().removeObjects(getWorld().getObjects(ClosedDoorTop.class));
        }
        if(isTouching(keyDoor.class) && (coin == 10)){
            String activeWorld = "MyWorld3";
            boolean doorOpen = true;
            getWorld().removeObjects(getWorld().getObjects(keyDoor.class));
            getWorld().removeObjects(getWorld().getObjects(ClosedDoor.class));
            getWorld().removeObjects(getWorld().getObjects(ClosedDoorTop.class));
        }
    }

    public String addLetter(){
        for(Letter verzamelLetter : getIntersectingObjects(Letter.class)){
            if(verzamelLetter != null) {
                this.verzamel += verzamelLetter.letter;
                // StringBuffer verzamelBuffer = new StringBuffer(verzamel);
                // for(int i = 0; i < verzamelBuffer.capacity();i++) {

                // }
                // GreenfootImage verzamelImg = verzamelLetter.getImage();
                // setImage(verzamel + ".png");
                coinPlay.play();
                getWorld().removeObject(verzamelLetter);
                scb.voegLetterToe(verzamelLetter.letter);

                //ltr.hartjeLatenZien();
                //getWorld().showText(verzamel, 100, 100);
                coin ++;

            }
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
        if (Greenfoot.isKeyDown("h")) {
            velocityY = -14;
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
