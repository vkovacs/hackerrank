package hu.crs.hackerrank.java.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {

    private Optional<Integer> sum(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        SimpleArraySum simpleArraySum = new SimpleArraySum();
        List<Integer> integers = scanIntegers();

        System.out.println(simpleArraySum.sum(integers).orElse(null));
    }

    private static List<Integer> scanIntegers() {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            integers.add(in.nextInt());
        }
        return integers;
    }
}
