import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Mover
{
    public Home(){
        setImage("home.png");
    }
    GreenfootImage img = new GreenfootImage("home.png");
    public void act() 
    {
        applyVelocity();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Start());
        }
        img.scale(395, 73);
        setImage(img);
    }    
}
