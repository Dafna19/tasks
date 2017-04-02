package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solver {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Double> freq = new ArrayList<>();

        int width = 0;
        Scanner scanner = new Scanner(new Scanner(System.in).nextLine());
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > width)
                width = word.length();

            if (!words.contains(word))
                words.add(word);
            if (freq.size() < words.size())
                freq.add(words.indexOf(word), 1.0);
            else
                freq.set(words.indexOf(word), freq.get(words.indexOf(word)) + 1);
        }

        Word[] table = new Word[words.size()];
        for (int i = 0; i < words.size(); i++)
            table[i] = new Word(words.get(i), freq.get(i));
        Arrays.sort(table, (w1, w2) -> w1.freq < w2.freq ? -1 : w1.freq == w2.freq ? 0 : 1);

        double maxF = table[words.size() - 1].freq;
        for (int i = 0; i < words.size(); i++) {
            table[i].freq = Math.round(table[i].freq * 10 / maxF);
            System.out.print(String.format("%" + width + "s", table[i].word).replace(' ', '_') + " ");
            if(table[i].freq == 0)
                System.out.println();
            else
                System.out.println(String.format("%" + table[i].freq + "s", "").replace(' ', '.'));
        }

    }

    private static class Word {
        String word;
        double freq;

        public Word(String word, double freq) {
            this.freq = freq;
            this.word = word;
        }

    }
}
