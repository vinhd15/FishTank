import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Simulation {
    private Random rand;
    private int numP, numG, numS, count;
    protected List<Creature> creaturesList;
    JPanel panel;
    public Simulation(int numPlankton, int numGuppy, int numShark, JPanel panel){
        creaturesList = new ArrayList<Creature>();
        numP = numPlankton;
        numG = numGuppy; 
        numS = numShark;
        this.panel = panel;
        rand = new Random();
        init();
    }

    public void init(){
        for(int i = 0; i < numG; i++) addCreature(new Guppy(rand.nextInt(panel.getWidth()), rand.nextInt(panel.getHeight())));
        for(int i = 0; i < numP; i++) addCreature(new Plankton(rand.nextInt(panel.getWidth()), rand.nextInt(panel.getHeight())));
        for(int i = 0; i < numS; i++) addCreature(new Shark(rand.nextInt(panel.getWidth()), rand.nextInt(panel.getHeight())));
    }

    public void addCreature(Creature c){
        creaturesList.add(c);
    }
}
