import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelButton extends Mover
{
    GreenfootSound gameIntro = new GreenfootSound("sounds/testing4.mp3");
    public void act() 
    {
        applyVelocity();
        if(Greenfoot.mouseClicked(this)){
            gameIntro.play();
            Greenfoot.setWorld(new MyWorld());
            String actieveWereld = "MyWorld1";
            return;
        }
    }    

    LevelButton(){
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
    }
}
