/*
 * Complete the code segment to find the standard deviation of the 1-D array.
 * Use the following formula:
 * σ=1N∑Ni=1(Xi−μ)2−−−−−−−−−−−−−−√
 * 
 * Here,
 * σ = Population standard deviation
 * N = Number of observations in the population
 * Xi = ith observation in the population
 * μ = Population mean
 * 
 */

import java.util.Scanner;

public class W6A4 {

    public static void main(String[] args) {
        double sum = 0.0;
        double mean = 0.0;
        double res = 0.0;
        double sq = 0.0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double arr[] = new double[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextDouble();
        }
        
        // from here
        for (int i = 0; i < num; i++) {
            sum = sum + arr[i];
        }
        mean = sum / num;
        for (int i = 0; i < num; i++) {
            res = arr[i] - mean;
            sq = sq + (res * res);
        }
        res = Math.sqrt(sq / num);
        // to here
        
        System.out.print("Standard Deviation: " + res);
        sc.close();
    }
}
