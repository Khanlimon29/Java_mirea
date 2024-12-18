import java.util.ArrayList;

public class MyStackArray extends ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Пустой стек");
        }
        return super.get(super.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Пустой стек");
        }
        return super.remove(super.size() - 1);
    }

    public void push(Object o) {
        super.add(o);
    }

    @Override
    public String toString() {
        return "Элементы в стеке: " + super.toString();
    }
}
