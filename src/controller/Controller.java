package controller;

import model.Simulator;


import java.awt.event.ActionEvent;

public class Controller extends AbstractController {


    public Controller(){

    }

    /**
     * Constructor for the controller.
     * @param simulator the simulator
     */
    public Controller(Simulator simulator) {
        setSimulator(simulator);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getActionCommand().equals("start")){
            System.out.println("Start has been pressed");
            simulator.start();
        }
        if(e.getActionCommand().equals("pause")){
            simulator.pause();
        }
        if(e.getActionCommand().equals("quit")){
            simulator.pause();
        }
        if(e.getActionCommand().equals("step")){
            simulator.pause();
        }
    }

}
