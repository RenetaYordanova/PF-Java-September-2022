package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersListList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        numbersListList.removeIf(e->e<0);

        Collections.reverse(numbersListList);

        if(numbersListList.size()==0){
            System.out.println("empty");
        }else{
            System.out.println(numbersListList.toString().replaceAll("[\\[\\],]",""));
        }

    }
}
