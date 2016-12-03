import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paskowana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paskowana extends Ryba

{
    public Paskowana(){
        szybkosc = 5;
    }
        
       public void act() 
    {
        super. act();
        move(szybkosc);
        
    }    
}

