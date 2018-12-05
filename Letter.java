import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Mover
{
    char letter;
    GreenfootImage img;
    public Letter(char letter){
        this.letter = letter;
        setImage(letter+".png");
    }
    
    // public Letter(char letter, String img){
        
    // }
    
    public void act()
    {
        applyVelocity();
    } 
    
    // public void letterEraf(){
        // LettersLatenZien();
    // }
    
    // public void LettersLatenZien(){
        // setImage("A.png");
        
    // }
    
}
