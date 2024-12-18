package p1;
import java.util.Scanner;

class First_practice {
    public static void main(String[] args) {
        final double RUBLES_PER_YUAN = 11.91;
        int yuan;
        double rubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Сумма в юанях: ");
        yuan = input.nextInt();

        rubles = RUBLES_PER_YUAN * yuan; // конвертация 

        if (rubles % 1 != 0) { // округление в пользу покупателя
            rubles++;
        }

        int lastDigit = (int)yuan % 10;
        int lastTwoDigits = (int)yuan % 100;

        if (lastTwoDigits >= 5 && lastTwoDigits <= 19|| lastDigit == 0){
            System.out.println(yuan + " китайских юаней в рублях = " + (int)rubles);
        }
        else if (lastDigit >= 2 && lastDigit <= 4){
            System.out.println(yuan + " китайских юаня в рублях = " + (int)rubles);
        }
        else if (lastDigit == 1){
            System.out.print(yuan + " китайский юань в рублях = " + (int)rubles);
        }
    }
}