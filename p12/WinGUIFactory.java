public class WinGUIFactory implements IGUIFactory {
    @Override
    public IGUI createGUI() {
        return new WinGUI();
    }
}