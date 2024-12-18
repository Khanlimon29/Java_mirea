import java.util.ArrayList;


public class Main {
    public static <T> ArrayList<T> noRepeats(ArrayList<T> arr){
        ArrayList<T> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++){
            if (!arr2.contains(arr.get(i))){
                arr2.add(arr.get(i));
            }
        }
        return arr2;
    }

    public static <T> int linSearch(ArrayList <T> arr, T str){
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == str){
                return i;
            }
        }
        return -1;
    }

    public static Circle circleCompare(Circle[][] circles) {
        if (circles == null || circles.length == 0) return null;

        Circle largest = circles[0][0];
        for (Circle[] row : circles) {
            for (Circle circle : row) {
                if (circle.compareTo(largest) > 0) {
                    largest = circle;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ананас");
        arr.add("Апельсин");
        arr.add("Яблоко");
        arr.add("Арбуз");
        arr.add("Арбуз");
        arr.add("Мандарин");

        //1.1
        System.out.print("\n1.1\n");
        System.out.print(arr + "\n");
        System.out.print(noRepeats(arr) + "\n");

        //1.2
        System.out.print("\n1.2\n");
        System.out.print(linSearch(arr, "Мандарин") + "\n");

        //1.3
        System.out.print("\n1.3\n");
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        if (circle1.compareTo(circle2) > 0) {
            System.out.println("Больший радиус: " + circle1.getRadius());
        } else if (circle1.compareTo(circle2) < 0) {
            System.out.println("Больший радиус: " + circle2.getRadius());
        } else {
            System.out.println("Оба круга имеют одинаковый радиус: " + circle1.getRadius());
        }

        //1.4
        System.out.print("\n1.4\n");
        Circle[][] circles = {
                { new Circle(1.5), new Circle(2.0), new Circle(2.5) },
                { new Circle(10.0), new Circle(1.5), new Circle(1.0) },
                { new Circle(3.5), new Circle(55.0), new Circle(2.15) }
        };
        Circle largestCircle = circleCompare(circles);
        System.out.println("Самый большой радиус: " + largestCircle.getRadius());


        //2.1
        System.out.print("\n2.1\n");
        GenericStack1<String> stack1 = new GenericStack1<>();

        stack1.push("Машина");
        stack1.push("Мотоцикл");
        stack1.push("Самолёт");
        stack1.push("Велосипед");
        stack1.push("Ролики");

        System.out.println("Размер стека: " + stack1.getSize());
        System.out.println("Верхний элемент: " + stack1.peek());

        //2.2
        System.out.print("\n2.2\n");
        GenericStack2<String> stack2 = new GenericStack2<>();

        stack2.push("Яблоко");
        stack2.push("Морковь");
        stack2.push("Лимон");
        stack2.push("Корова");
        stack2.push("Метла");

        System.out.println("Элементы наоборот:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}