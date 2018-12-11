import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelButton extends Mover
{
    GreenfootSound gameIntro = new GreenfootSound("sounds/gameStart.au");
    GreenfootSound gameVoice = new GreenfootSound("sounds/testing4.au");
    public void act() 
    {
        applyVelocity();
        if(Greenfoot.mouseClicked(this)){
            gameIntro.play();
            gameVoice.play();
            Greenfoot.setWorld(new MyWorld());
            return;
        }
    }    

    LevelButton(){
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
    }
}
