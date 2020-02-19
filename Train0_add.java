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
public class Train0_add {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String a, b, c = "";
        int m = 0; // chứa kết quả cộng của từng hàng (đơn vị, chục,...)
        a = scanner.nextLine();
        b = scanner.nextLine();
        // thêm 0 vào đầu để 2 chuỗi bằng nhau
        while (a.length() < b.length()) {
            a = "0" + a;
        }
        while (a.length() > b.length()) {
            b = "0" + b;
        }
        // cộng từ phải qua trái
        for (int i = a.length(); i > 0; i--) {
            // lấy từng hàng cộng, kết quả m sẽ có 2 chữ số
            m = Integer.parseInt(a.substring(i - 1, i)) + Integer.parseInt(b.substring(i - 1, i)) + m;
            c = (m % 10) + c; // lấy phần đơn vị thêm vào kết quả
            m = m / 10; // phần chục là phần dư
        }
        if (m > 0) {
            c = (m % 10) + c; // kq cuối cùng còn dư sẽ thêm 1 vào đầu
        }
        System.out.println(c);
    }
}
