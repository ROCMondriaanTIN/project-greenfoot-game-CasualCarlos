import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lock extends Mover
{
    /**
     * Act - do whatever the lock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean arrivedCheckpoint;
    public void act() 
    {
        applyVelocity();
    }    
}
