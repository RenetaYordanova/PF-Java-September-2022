package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    static class Student{
        private String firstName;
        private String secondName;
        private int age;
        private String town;

        public Student(String firstName, String secondName, int age, String town) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Student>studentList=new ArrayList<>();

        String inputLine= scanner.nextLine();
        while(!inputLine.equals("end")){
            String[]arrStudentData=inputLine.split("\\s+");
            String firstName=arrStudentData[0];
            String secondName=arrStudentData[1];
            int age=Integer.parseInt(arrStudentData[2]);
            String town=arrStudentData[3];

            Student currentStudent= new Student(firstName,secondName,age,town);

            studentList.add(currentStudent);
            inputLine= scanner.nextLine();
        }

        String homeTown= scanner.nextLine();
        for (Student item:studentList){
            if(item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getSecondName(),item.getAge());
            }
        }


    }
}
