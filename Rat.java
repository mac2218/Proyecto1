import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rat extends Actor
{
public void ganar()
{
    
    if(isTouching(AH.class))
    {
        Greenfoot.playSound("Ganar.wav");
        
    }
}
public void ratHit()
{
    if (hitEnemy() == true)
    {
        setLocation(46,353);
    }
}
public boolean hitEnemy()
{
    if (isTouching(Enemies.class))
    {
        return true;
    }
    else 
    {
        return false;
    }
}
    
public boolean hitWalls()
{
    if(isTouching(LH.class))
    {
        return true;
    }
    else
    {
        return false;
    }
}
    public void comer()
    {
        Actor food;
        food = getOneObjectAtOffset(0,0,food.class);
        if(food !=null) {
        World mundo;
        mundo = getWorld();
        mundo.removeObject(food);
        Greenfoot.playSound("comer.wav");
    }
}
    public Rat()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHight);
    }
    /**
     * Act - do whatever the Rat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x - 2, y);
             comer();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + 2, y);
             comer();
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y - 2);
             comer();
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + 2);
             comer();
        }
        ratHit();
    }
}
