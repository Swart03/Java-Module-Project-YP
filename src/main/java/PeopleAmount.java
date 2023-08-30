import java.util.Scanner;

public class PeopleAmount {
int readPeopleAmount(Scanner scanner) {
    int amount;
    System.out.println("На скольких человек делим счёт?");
    while(true) {
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
            if (amount <= 1) {
                System.out.println("Количество человек должно быть больше одного.");
            } else {
                scanner.nextLine();
                return amount;
            }
        } else {
            System.out.println("Количпество человек болжно быть введено в виде числа.");
            scanner.next();
        }
    }

}

}
