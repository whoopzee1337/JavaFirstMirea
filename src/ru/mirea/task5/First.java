package ru.mirea.task5;

public class First {
    public static String triangleOrder(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(triangleOrder(n-1) + " " + j);
        }
        return "";
    }

    public static int digitsFromRightToLeft(int n){
        if (n < 10){
            return n;
        }
        else {
            System.out.print(n%10 + " ");
            return digitsFromRightToLeft(n / 10);
        }

    }
    public static void recursion(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            }
            else if (n == max) {
                recursion(max, ++count);
            }
            else {
                recursion(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static void maximum(int max) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n >= max) {
                maximum(n);
            }
            else {
                maximum(max);
            }
        } else {
            System.out.println(max);
        }
    }

}