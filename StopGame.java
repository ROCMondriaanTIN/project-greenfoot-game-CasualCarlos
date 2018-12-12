import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StopGame extends Mover
{
    public StopGame(){
        setImage("exit.png");
    }
    GreenfootImage img = new GreenfootImage("exit.png");
    public void act() 
    {
        applyVelocity();
        if(Greenfoot.mousePressed(this)){
            System.exit(0);
        }
        img.scale(395, 73);
        setImage(img);
    }    
}
