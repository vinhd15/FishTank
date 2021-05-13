import java.io.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
public class SimulationPanel extends JPanel {

    private Simulation simulation;

    public SimulationPanel(){
        super();
        this.setPreferredSize(new Dimension(1920, 1000));
        simulation = new Simulation(0, 1, 0, this);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
 
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(
            RenderingHints.KEY_RENDERING,
            RenderingHints.VALUE_RENDER_QUALITY);
        

        BufferedImage background = null;
        try{
            background = ImageIO.read(new File("background.png"));
        }catch(IOException e){
            System.err.println("Unable to read file: background.png");
            e.printStackTrace();
        }
        g2.drawImage(background, null, 0, 0);
    }

}
