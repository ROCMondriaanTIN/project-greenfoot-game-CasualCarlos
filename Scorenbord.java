import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Scorenbord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorenbord extends Actor
{
    public int leven = 2;
    ArrayList<Leven> hartje =new ArrayList<Leven>();
    ArrayList<Letter> verzameldeLetters = new ArrayList<Letter>();
    public void act() 
    {
        hartjeLatenZien();
        //  voegLetterToe('R');
    }    
    
    
    public void voegLetterToe(char letter){
        //voegt een letter in de arraylist toe
        verzameldeLetters.add(new Letter(letter, true));
        laatlettersZien();
    }

    public void laatlettersZien(){
        //   System.out.println("show letters");
        //  Letter let = verzameldeLetters.get(0);
        for(int a = 0; a < verzameldeLetters.size(); a++){
            Letter lettertje = verzameldeLetters.get(a);
            getWorld().addObject(lettertje, 50+(a*67), 120);
        }
    }

    public void hartjeEraf(){
        leven--;
        hartjeLatenZien();
    }

    public void hartjeErbij(){
        leven++;
        hartjeLatenZien();
    }

    public void doodGaan(){
        if(leven == 0){
            Greenfoot.setWorld(new Start());
        }
    }

    public void hartjeLatenZien(){
        for(int i = 0; i < hartje.size();i++){
            getWorld().removeObject(hartje.get(i));
        }
        hartje.clear();

        for(int i = 0; i < leven; i++){
            Leven leven = new Leven();
            leven.setImage("hud_heartFull.png");
            getWorld().addObject(leven, 50+(i*60), 50);
            hartje.add(leven);
        }
    }
}

