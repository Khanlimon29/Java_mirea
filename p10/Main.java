public class Main {
    public static void main(String[] args) {
        MyStackArray stackArray = new MyStackArray();
        stackArray.push("Ананас");
        stackArray.push("Апельсин");
        stackArray.push("Яблоко");
        stackArray.push("Арбуз");
        stackArray.push("Арбуз");
        stackArray.push("Мандарин");

        System.out.print("\nСтроки в обратном порядке: ");
        while (!stackArray.isEmpty()) {
            System.out.print(stackArray.pop() + ", ");
        }

        MyStack stack = new MyStack();
        stack.push("Первый элемент");
        stack.push("Второй элемент");
        stack.push("Третий элемент");

        MyStack clonedStack = stack.clone();

        System.out.println("\n\nОригинальный стек: " + stack);
        System.out.println("Клонированный стек: " + clonedStack);
    }
}