import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeopleAmount peopleAmount = new PeopleAmount();
        Calculator calculator = new Calculator();
        int people = peopleAmount.readPeopleAmount(scanner);
        calculator.addNewProduct(scanner);
        calculator.printProductList(people);

    }
}