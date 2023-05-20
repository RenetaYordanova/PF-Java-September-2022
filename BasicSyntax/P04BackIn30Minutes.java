package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes=hours*60+minutes;
        int timeAfter30Minutes=allMinutes+30;

        int finalHour=timeAfter30Minutes/60;
        int finalMinutes =timeAfter30Minutes%60;

        if(finalHour>=24){
            finalHour=0;
        }
        System.out.printf("%d:%02d",finalHour,finalMinutes);



    }
}
