import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameFinished here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameFinished extends World
{
    GreenfootSound finishedPlay = new GreenfootSound("sounds/smb2_game_over.wav");
    public String worldName = "Finished";
    public GameFinished(String worldName)
    {    
        super(1000, 800, 1, false); 
        this.setBackground("endScreen.png");
        this.worldName = worldName;
        Home home = new Home();
        addObject(home,712,550);
        finishedPlay.play();
        StopGame stp = new StopGame();
        addObject(stp,288, 550);
    }
    public void act(){
    }
}
