import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
public abstract class Creature extends JComponent {
    public int dir; // direction (left or right / up or down)
    private Rectangle hitbox;
    private String label;
    public Creature(int x, int y){
        this.setLocation(x, y);
        dir = 1;
    }

    public abstract void move();

    public abstract boolean eat(Creature c);

    public boolean intersects(Creature c){
        return this.hitbox.intersects(c.hitbox);
    }

    

}
