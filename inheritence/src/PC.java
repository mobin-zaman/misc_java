public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

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
        //fancy graphichs
        monitor.drawPixelAt(1200,50,"blue");
    }
}
