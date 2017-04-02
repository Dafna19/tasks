package task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Solver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new Scanner(System.in).nextLine());
        LinkedList<Integer> numbers = new LinkedList<>();

        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                numbers.add(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                int a, b;
                switch (token) {
                    case "+":
                        numbers.add(numbers.pollLast() + numbers.pollLast());
                        break;
                    case "-":
                        b = numbers.pollLast();
                        a = numbers.pollLast();
                        numbers.add(a - b);
                        break;
                    case "/":
                        b = numbers.pollLast();
                        a = numbers.pollLast();
                        numbers.add(a / b);
                        break;
                    case "*":
                        numbers.add(numbers.pollLast() * numbers.pollLast());
                        break;
                }
            }
        }
        System.out.println(numbers.pollLast());
    }
}
