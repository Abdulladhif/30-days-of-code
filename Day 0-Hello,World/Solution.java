
import java.util.Scanner;
public class Solution{
    /**
     * The "static" keyword in Java is used to declare a member (variable or method) that belongs to the class itself, rather than to any specific instance of the class.
     * In the context of the "main" method, the "static" keyword indicates that the method can be called without creating an instance of the class.
     */
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
        
    }
}