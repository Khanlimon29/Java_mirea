public class Main {
    public static void main(String[] args) {

        studentList studentList = new studentList();
        studentList.addStudent("Авдеев Александр Юрьевич");
        studentList.addStudent("Алтухов Игорь Максимович");
        studentList.addStudent("Ахметов Алихан Солтанович");
        studentList.addStudent("Бондарев Георгий Сергеевич");
        studentList.addStudent("Бухарова Вероника Тимофеевна");

        IIterator iterator = studentList.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
