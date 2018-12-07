import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends Mover
{
    public String worldName="";
    public Continue(String worldName)
    {
    setImage("continue.png"); 
    this.worldName=worldName;
    }
    GreenfootImage imgA = new GreenfootImage("continue.png");
    public void act() 
    {
    applyVelocity();
    imgA.scale(398, 73);
    setImage(imgA);
        if(Greenfoot.mouseClicked(this))
        { 
            if(worldName=="World1")
            {
              Greenfoot.setWorld(new MyWorld());    
            }
            if(worldName=="World2")
            {
              Greenfoot.setWorld(new MyWorld2());    
            }
            
            if(worldName=="World3")
            {
              Greenfoot.setWorld(new MyWorld3());    
            }
            
            // if(activeWorld=="MyWorld4")
            // {
               // Greenfoot.setWorld(new MyWorld4());   
            // }
        }   
    } 
 }
