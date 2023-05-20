package Methods;

import java.util.Scanner;

public class P7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input= scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());

        String resultText=repeatString(n,input);
        System.out.println(resultText);



    }
    public static String repeatString(int n,String text){
        String result=" ";
        for (int i = 0; i <n ; i++) {
            result=result+text;
        }
        return result;
    }
}
