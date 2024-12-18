class File implements IFileComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String prefix) {
        System.out.println(prefix + "└── " + name);
    }

    @Override
    public void add(IFileComponent fileComponent) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }

    @Override
    public void remove(IFileComponent fileComponent) {
        throw new UnsupportedOperationException("Cannot remove from a file");
    }
}