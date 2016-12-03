import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zlota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zlota extends Ryba
{
    public Zlota(){
        szybkosc = 2;
    }
    public void act() 
    {
        super. act();
        move(szybkosc);
    }    
}
