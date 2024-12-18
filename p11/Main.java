public class Main {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(1);
        stack.push(5);

        System.out.println(stack);
        System.out.println("Верхний элемент: " + stack.top());
        System.out.println("Удалённый верхний элемент: " + stack.pop());
        System.out.println("Пустой стек? " + stack.empty());
        System.out.println(stack);

        System.out.println("\nВерхний элемент: " + stack.top());
        System.out.println("Удалённый верхний элемент: " + stack.pop());
        System.out.println("Пустой стек? " + stack.empty());
        System.out.println(stack);
    }
}