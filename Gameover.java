import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    public String worldName = "";
    public Gameover(String worldName)
    {    
        super(1000, 800, 1, false); 
        this.setBackground("gameOver.png");
        this.worldName = worldName;
        Home home = new Home();
        addObject(home,710,550);
        
        Continue ctn = new Continue(worldName);
        addObject(ctn,288, 550);
        
    }
    public void act(){
    }
}
