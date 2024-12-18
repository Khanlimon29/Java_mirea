import java.util.ArrayList;
import java.util.List;

public class studentList {
    private List<String> students = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
    }

    public IIterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements IIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.size();
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new IllegalStateException("Больше элементов нет.");
            }
            return students.get(index++);
        }
    }
}
