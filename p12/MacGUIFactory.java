public class MacGUIFactory implements IGUIFactory {
    @Override
    public IGUI createGUI() {
        return new MacGUI();
    }
} 