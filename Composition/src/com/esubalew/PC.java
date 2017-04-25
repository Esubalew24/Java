package com.esubalew;

/**
 * Created by Esubalew on 25/04/17.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo(){
        //Graphics code comes here
        monitor.drawPixelAt(1200, 30, "Yellow");

    }


}
