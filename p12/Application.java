public class Application {
    private final IGUI gui;

    public Application(IGUIFactory factory) {
        this.gui = factory.createGUI();
    }

    public void render() {
        gui.drawGUI();
    }
}