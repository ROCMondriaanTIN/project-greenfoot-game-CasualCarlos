import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClosedDoorTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClosedDoorTop extends Mover
{
    /**
     * Act - do whatever the ClosedDoorTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeDoor();
        applyVelocity();
    }    
        public void removeDoor(){
        if (Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
        }
    }
}
