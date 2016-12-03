import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ryba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ryba extends Actor
{
    boolean czyZlapana = false;
    int szybkosc;
    Licznik licznik = new Licznik();
    
    public void act()
    {
        if(!czyZlapana){
            move(szybkosc);
            if(Greenfoot.mousePressed(this)){
                getWorld().addObject( new Haczyk(),
                    getX(), getY());
                czyZlapana = true;
            } 
            if(isAtEdge())
            {
                setRotation(180 - getRotation());
                getImage().mirrorVertically();
            }
        } else {
          
            setLocation(getX(), getY()-5);
            szybkosc = 0;
              if(isAtEdge())
              {
        MyWorld swiat = (MyWorld) getWorld());
        Licznik licznik = swiat.zwrocLicznik();
        licznik.wynik();
        get(World().removeObject(this);
            
        
    }
}
}
}
