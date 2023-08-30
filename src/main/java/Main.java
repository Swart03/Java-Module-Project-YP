import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleAmount;
        peopleAmount = scanner.nextInt();
        System.out.println("На скольких человек нужно разделить счет?");//"На скольких человек нужно разделить счет?"
        //Неверное количество гостей. Количество гостей должно быть введено в виде цифрового значения, и гостей должно быть больше одного.
        while(true){
            System.out.println("На скольких человек нужно разделить счет?");
            if(scanner.hasNextInt()) {
             if(peopleAmount > 1);
             break;
            } else {
                System.out.println("Неверное количество гостей. Количество гостей должно быть введено в виде цифрового значения, " +
                        "и гостей должно быть больше одного.");
                System.out.println("На скольких человек нужно разделить счет?");
            }



        }





    }
}