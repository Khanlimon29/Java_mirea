interface IFileComponent {
    void showDetails(String prefix);
    void add(IFileComponent fileComponent);
    void remove(IFileComponent fileComponent);
}