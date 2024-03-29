import java.io.*;
import java.util.*;

public class Solution {
    static  class Person {
       int age;
       
       public Person(int initialAge){
           if(initialAge < 0){
             System.out.println("Age is not valid, setting age to 0.");
                age = 0;
           }else{
             age = initialAge;
           }
       }
       public void yearPasses(){
           age++;
       }
       public void amIOld(){
              if(age < 13){
                System.out.println("You are young.");
              }else if(age >= 13 && age < 18){
                System.out.println("You are a teenager.");
              }else{
                System.out.println("You are old.");
              }
       }
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0 ; i<T; i++){
            int age = scan.nextInt();
            Person p = new Person(age);
            p.amIOld();
            // 3 years pass
            for(int j=0; j<3; j++){
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}