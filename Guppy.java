import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class Guppy extends Fish{

    protected static int count = 0;
    public Guppy(int x, int y){
        super(x, y);
        count++;
        label = "Guppy " + count;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        BufferedImnage guppy = null;
        try {
            guppy = ImageIO.read(new File("guppy.png"));
            
        } catch (IOException e) {
            System.err.println("Unable to read file: guppy.png");
            e.printStackTrace();
        }
        
        g2.drawImage(guppy, null, this.getX(), this.getY());
    }

    public void move(){

    }

    public boolean eat(Creature c){
        if(c instanceof Plankton && this.intersects(c)) return true;
        return false;
    }
    
}
