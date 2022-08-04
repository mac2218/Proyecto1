import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    BK mundo;
    /**
     * Act - do whatever the food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      
      if(isTouching(Rat.class))
      {
          getWorld().removeObject(this);
          mundo.puntos = mundo.puntos + 1;
      }
    }
}
