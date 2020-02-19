/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsapplied;

import java.util.Scanner;

/**
 *
 * @author qcuon
 */
public class Train0_subseqmax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[1000001];
        int n, max, amax;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        max = a[0];
        amax = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > amax + a[i]) {
                amax = a[i];
            } else amax += a[i];
            if (amax > max) {
                max = amax;
            }
        }
        System.out.println(max);
    }
}
