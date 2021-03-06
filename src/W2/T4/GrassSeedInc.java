package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: GrassSeedInc.java calculates the cost to sow all of the lawns
 * Link: https://open.kattis.com/contests/pp5rtp/problems/grassseed
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.12
 */

public class GrassSeedInc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        int L = sc.nextInt();
        double x;
        double y;
        double res = 0.0;

        // input and calculation of the cost
        for(int i = 0; i < L; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            res += x * y;
        }

        sc.close();
        System.out.printf("%.7f", C * res);
    }
}
