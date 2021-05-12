import java.awt.BorderLayout;

import javax.swing.JFrame;


public class FishTank {
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Fish Tank Simulation");
        SimulationPanel p = new SimulationPanel();
        SettingsPanel settings = new SettingsPanel();
        
        f.setSize(1920, 1000);
        f.add(p, BorderLayout.SOUTH);
        f.add(settings, BorderLayout.NORTH);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);

    }

}
