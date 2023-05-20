package MethodExersice;

import java.util.Scanner;

public class P5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        int number3=Integer.parseInt(scanner.nextLine());

        int sumNum=sum(number1,number2);
        int subtractNum=subtract(sumNum,number3);
        System.out.println(subtractNum);


    }

    public static int sum(int n1,int n2){
        return n1+n2;
    }
    public static int subtract(int n1,int n2){
        return n1-n2;
    }
}
