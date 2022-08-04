import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BK extends World
{
public static int puntos = 0;
    /**
     * Constructor for objects of class BK.
     * 
     */
    public BK()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        showText("Puntaje:" + puntos, 50,20);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        puntos = 0;
        Rat rat = new Rat();
        addObject(rat,44,356);
        rat.setLocation(46,353);
        LH lH = new LH();
        addObject(lH,39,352);
        lH.setLocation(39,352);
        LH lH2 = new LH();
        addObject(lH2,45,270);
        lH2.setLocation(45,270);
        LV lV = new LV();
        addObject(lV,44,269);
        lV.setLocation(44,269);
        LH lH3 = new LH();
        addObject(lH3,126,187);
        lH3.setLocation(126,187);
        LV lV2 = new LV();
        addObject(lV2,128,360);
        lV2.setLocation(128,360);
        LH lH4 = new LH();
        addObject(lH4,125,126);
        lH4.setLocation(125,126);
        LV lV3 = new LV();
        addObject(lV3,84,121);
        lH3.setLocation(84,121);
        LH lH5 = new LH();
        addObject(lH5,122,31);
        lH3.setLocation(122,31);
        LH lH6 = new LH();
        addObject(lH6,176,74);
        lH6.setLocation(176,74);
        LH lH7 = new LH();
        addObject(lH7,267,74);
        lH7.setLocation(267,74);
        LV lV4 = new LV();
        addObject(lV4,265,156);
        lV4.setLocation(265,156);
        LH lH8 = new LH();
        addObject(lH8,125,181);
        lH8.setLocation(125,181);
        LH lH9 = new LH();
        addObject(lH9,268,126);
        lH9.setLocation(288,126);
        LV lV5 = new LV();
        addObject(lV5,202,65);
        lV5.setLocation(202,65);
        LV lV6 = new LV();
        addObject(lV6,202,20);
        lV6.setLocation(202,20);
        LV lV7 = new LV();
        addObject(lV7,208, 209);
        lV7.setLocation(208, 209);
        LH lH10 = new LH();
        addObject(lH10,0,77);
        lH10.setLocation(0,77);
        LH lH11 = new LH();
        addObject(lH11,255, 220);
        lH11.setLocation(255, 220);
        LV lV8 = new LV();
        addObject(lV8,205,398);
        lV8.setLocation(205,398);
        LV lV9 = new LV();
        addObject(lV9,353,155);
        lV9.setLocation(353,155);
        LV lV10 = new LV();
        addObject(lV10,353,242);
        lV10.setLocation(353,242);
        LV lV11 = new LV();
        addObject(lV11,296,362);
        lV11.setLocation(296,362);
        LH lH12 = new LH();
        addObject(lH12,361,16);
        lH12.setLocation(361,16);
        LV lV12 = new LV();
        addObject(lV12,354,102);
        lV12.setLocation(354,102);
        LH lH13 = new LH();
        addObject(lH13,464,303);
        lH13.setLocation(464,303);
        LV lV13 = new LV();
        addObject(lV13,425,396);
        lV13.setLocation(425,396);
        LH lH14 = new LH();
        addObject(lH14,436,131);
        lH14.setLocation(436,131);
        LV lV14 = new LV();
        addObject(lV14,314,7);
        lV14.setLocation(314,7);
        LV lV15 = new LV();
        addObject(lV15,442,169);
        lV15.setLocation(442,169);
        LV lV16 = new LV();
        addObject(lV16,449,10);
        lV16.setLocation(449,10);
        LH lH15 = new LH();
        addObject(lH15,554, 237);
        lH15.setLocation(554, 237);
        LH lH16 = new LH();
        addObject(lH16,542,8);
        lH16.setLocation(542,8);
        LH lH17 = new LH();
        addObject(lH17,595,8);
        lH17.setLocation(592,8);

        food food = new food();
        addObject(food,447,91);
        food.setLocation(447,91);
        food food2 = new food();
        addObject(food2,550,372);
        food2.setLocation(550,372);
        food food3 = new food();
        addObject(food3,456,251);
        food3.setLocation(456,251);
        food food4 = new food();
        addObject(food4,293,24);
        food4.setLocation(293,24);
        food food5 = new food();
        addObject(food5,203,144);
        food5.setLocation(203,144);
        food food6 = new food();
        addObject(food6,254,306);
        food6.setLocation(254,306);
        food food7 = new food();
        addObject(food7,156,29);
        food7.setLocation(156,29);
        food food8 = new food();
        addObject(food8,35,197);
        food8.setLocation(35,197);
        food food9 = new food();
        addObject(food9,328,225);
        food9.setLocation(328,225);
        food food10 = new food();
        addObject(food10,548,164);
        food9.setLocation(548,164);

        AH aH = new AH();
        addObject(aH,407,1);
        aH.setLocation(407,1);

        AV aV = new AV();
        addObject(aV,0,352);
        aV.setLocation(0,352);

        AH aH2 = new AH();
        addObject(aH2,439,1);
        aH2.setLocation(439,1);

        Snake snake = new Snake();
        addObject(snake,143,275);
        snake.setLocation(143,275);

        Snake snake2 = new Snake();
        addObject(snake2,83,112);
        snake2.setLocation(83,112);
    }
}

