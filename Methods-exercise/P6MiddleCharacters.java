package MethodExersice;

import java.util.Scanner;

public class P6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String text= scanner.nextLine();
        printMiddleCharacters(text);

    }
    public static void printMiddleCharacters(String text){
        if(text.length()%2==1){
            int indexOfMiddleCharacters=text.length()/2;
            System.out.println(text.charAt(indexOfMiddleCharacters));
        }else {
            int indexFirstMiddleCharacter=text.length()/2-1;
            int indexSecondMiddleCharacter=text.length()/2;

            System.out.println(" " + text.charAt(indexFirstMiddleCharacter)+text.charAt(indexSecondMiddleCharacter));

        }
    }
}
