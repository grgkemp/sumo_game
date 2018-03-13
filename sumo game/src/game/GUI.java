/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.UserView;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gregclemp
 */
public class GUI extends JFrame {
    
    final private GameWorld world;
    final private UserView view;
    private JLabel score;
    
    GUI(GameWorld world, UserView view){
        super("SUMO game"); //the title
        setLayout(new FlowLayout());
        
        this.world = world;
        this.view = view;
        this.setSize(1000,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationByPlatform(true);
        this.add(view);
        this.setResizable(false);
        
        
        score = new JLabel("" + world.getPlayers()[0].getScore() + " - " + world.getPlayers()[1].getScore());
        //add(score); //displays current score at top of window
        this.setVisible(true);
    }
    
    public void updateScore(){
        score.setText("" + world.getPlayers()[0].getScore() + " - " + world.getPlayers()[1].getScore());
        //frame.pack();
    }
    
    public JFrame getFrame(){
        return null;
    }
    
}