import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
Ryba rybka;
Licznik licznik;
public Licznik zwrocLicznik(){
    return Licznik;
}
    
    public MyWorld()
    {    
        
        super(600, 400, 1); 
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            switch(Greenfoot.getRandomNumber(3))
            
            {case 0:
                {
            rybka = new Zielona();
            break;
        }
            case 1:
            {
            rybka = new Zlota();
                break;
            }
                case 2:
                {
                rybka = new Paskowana();
                break;
                
                
            }
            
           
}
addObject(rybka, 200, 300);
}
}
}
