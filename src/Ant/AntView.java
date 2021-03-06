package Ant;

import javax.swing.*;
import java.awt.*;

public class AntView extends JPanel{

    private Ant ant;

    public AntView(Ant ant){
        this.ant = ant;

        this.setSize(20, 20);
        this.setLocation(ant.getPosition());
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        this.setLocation(ant.getPosition());

        graphics.fillOval(0, 0, 12, 12);
        if(ant.getHasFood()){
            graphics.setColor(Color.red);
            graphics.fillOval(3, 3, 4, 4);
            graphics.setColor(Color.black);
        }
    }
}
