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
    public String worldName = "World2";
    Hero hr = new Hero("World2");
    public void act() 
    {
        reset("World2");
        applyVelocity();
    }  

    public void reset(String worldName){
        if (Greenfoot.mouseClicked(this)){
            if(worldName == "World3") {
                Greenfoot.setWorld(new MyWorld3());
                setLocation(453, 2353);
                hr.coin = 10;
            }
            if(worldName == "World2"){
                Greenfoot.setWorld(new MyWorld2());
                hr.coin = 4;
            }
        }
    }
}
