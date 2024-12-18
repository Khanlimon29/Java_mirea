import java.util.ArrayList;
import java.util.List;

class Directory implements IFileComponent {
    private String name;
    private List<IFileComponent> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void showDetails(String prefix) {
        System.out.println(prefix + "└── " + name);
        
        for (IFileComponent component : components) {
            component.showDetails(prefix + "    ");
        }
    }

    @Override
    public void add(IFileComponent fileComponent) {
        components.add(fileComponent);
    }

    @Override
    public void remove(IFileComponent fileComponent) {
        components.remove(fileComponent);
    }
}