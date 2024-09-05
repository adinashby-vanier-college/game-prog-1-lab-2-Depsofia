// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Dolphin extends Actor
{

    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (foundCrab()) {
            eatCrab();
        }
        else {
            move(2);
        }
        Greenfoot.delay(2);
        move(8);
        if (Greenfoot.isKeyDown("down")) {
            Greenfoot.setSpeed(50);
            turn(-5);
        }
        if (Greenfoot.isKeyDown("up")) {
            Greenfoot.setSpeed(50);
            turn(4);
        }
    }

    /**
     * Eat a crab (if there is one)
     */
    public void eatCrab()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            /* eat the crab...*/
            getWorld().removeObject(crab);
        }
    }

    /**
     * 
     */
    public boolean foundCrab()
    {
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        return crab != null;
    }
}
