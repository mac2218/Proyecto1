import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    public void wrapAtEdge()
    {
        move(3);
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth() - 1; 
        int worldHeight = getWorld().getHeight() - 1;
        if(x >= worldWidth)
        {
            setLocation(0 , y);
        }
        if(x <= 0)
        {
            setLocation(worldWidth - 1 , y);
        }
        if(y >= worldHeight)
        {
            setLocation(x , 1);
        }
        if(y <= 0)
        {
            setLocation(x , worldHeight - 1);
        }
    }
}

