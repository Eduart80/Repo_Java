package practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayCompare333 {
    /**
     *Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
     * The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
     *
     * The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
     *
     * If a[i] > b[i], then Alice is awarded 1 point.
     * If a[i] < b[i], then Bob is awarded 1 point.
     * If a[i] = b[i], then neither person receives a point.
     * Comparison points is the total points a person earned.
     *
     * Given a and b, determine their respective comparison points.
     */
    public static void main(String[] args) {

        int[][][] B =new int [3][2][1];
        List<Integer> ListA = new ArrayList<>();
        ListA.add(1);
        ListA.add(2);
        ListA.add(3);
        List<Integer> ListB = new ArrayList<>();
        ListA.add(3);
        ListA.add(2);
        ListA.add(1);

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        System.out.println(a);
        System.out.println(b);
        int d =0;

        System.out.println();
        return a;
    }
}
