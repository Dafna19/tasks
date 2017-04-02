package task1;

import java.util.Scanner;

public class Solver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        HashTable table = new HashTable(N);
        Scanner line = new Scanner(scanner.nextLine());
        while (line.hasNextInt())
            table.Insert(line.nextInt());

        table.print();
    }
}
