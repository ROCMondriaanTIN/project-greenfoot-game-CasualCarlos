import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class START here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class START.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        this.setBackground("start.png");
        showText("Klik op het MUNTJE om te STARTEN" , 200, 500);
        prepare();
    }
    
    
    public void prepare(){
        LevelButton levelButton = new LevelButton();
        addObject(levelButton, 506, 405);
    }
}
