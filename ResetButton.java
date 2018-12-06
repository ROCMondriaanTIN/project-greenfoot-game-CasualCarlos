import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResetButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResetButton extends Mover
{
    /**
     * Act - do whatever the ResetButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String activeWorld = "MyWorld3";
    public void act() 
    {
        reset();
        applyVelocity();
    }  

    public void reset(){
        if (Greenfoot.mouseClicked(this)){
            if(activeWorld == "MyWorld3") {
                Greenfoot.setWorld(new MyWorld3());
                setLocation(453, 2353);
            }
            else if(activeWorld == "MyWorld1"){
                Greenfoot.setWorld(new MyWorld());
            }

        }
    }
}
