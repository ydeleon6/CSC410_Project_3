package com.deitel.cannongame;

import android.graphics.Rect;

import edu.noctrl.craig.generic.GameSprite;
import edu.noctrl.craig.generic.Point3F;
import edu.noctrl.craig.generic.World;

/**
 * Created by Christian on 5/25/2015.
 */
public class CreateEnemy extends GameSprite {
    public static final Rect source = new Rect(128, 90, 149, 103);
    public static final Point3F scale = Point3F.identity();

    public CreateEnemy(World theWorld, Point3F pos){
        super(theWorld);
        this.position = pos;
        this.collidesWith = 1;
        this.speed = 300;
        this.substance = 4;
    }

    @Override
    public Rect getSource(){
        return source;
    }

    @Override
    public Point3F getScale(){
        return scale;
    }

    @Override
    public void cull(){
        this.kill();
    }
}