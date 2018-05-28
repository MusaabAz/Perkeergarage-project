package controller;

import model.Simulator;

import java.awt.event.ActionListener;

public abstract class AbstractController implements ActionListener {
    protected Simulator simulator;

    public Simulator getSimulator() {return simulator; }

    public void setSimulator(Simulator simulator) {
        this.simulator = simulator;
    }
}
