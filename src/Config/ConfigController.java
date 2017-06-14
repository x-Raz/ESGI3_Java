package Config;

import Main.Controller;

import javax.swing.*;
import java.awt.*;

public class ConfigController {

    private JFrame window;
    private ConfigModel config;

    public ConfigController() {
        this.window = new ConfigView(this);
        this.config = new ConfigModel();
    }

    public void startSimulation(Dimension windowsSize, Point antihillPosition, int antsCount, int foodCount) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Controller(windowsSize, antihillPosition, antsCount, foodCount);
            }
        }).start();

        //new Main.Simulation(d, nbSourceFood, nbAnts, explorationSpeed); // TODO
        //System.out.println(d + " " + nbSourceFood + " " + nbAnts + " " + explorationSpeed);
    }


}