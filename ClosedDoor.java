import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClosedDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClosedDoor extends Mover
{
    /**
     * Act - do whatever the ClosedDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeDoor();
        applyVelocity();
    }    

    public void removeDoor(){
        if (Greenfoot.mouseClicked(this)){
            setLocation(7000, 5000);
            return;
        }
    }
}

