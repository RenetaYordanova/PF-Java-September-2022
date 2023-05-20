package List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Double>numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numberList.size()-1; i++) {
            double currentNumber=numberList.get(i);
            double nextNum=numberList.get(i+1);
            if(currentNumber==nextNum){
                numberList.set(i,currentNumber+nextNum);
                numberList.remove(i+1);
                i=-1;
            }

        }
        System.out.println(joinElementsByDelimiter(numberList," "));

    }
    public static String joinElementsByDelimiter(List<Double>list,String delimiter){
        DecimalFormat df=new DecimalFormat("0.#");
        String result="";
        for (double item:list){
            String numDF=df.format(item)+delimiter;
            result+=numDF;
        }
        return result;

    }
}
