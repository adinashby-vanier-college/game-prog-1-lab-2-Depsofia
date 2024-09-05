// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.isKeyDown("a")) {
            move(6);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }
}
