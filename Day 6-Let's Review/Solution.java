import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<t; i++){
            String s = scan.nextLine();
            // Print even-indexed characters
            for(int j=0; j<s.length(); j+=2){
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            // Print odd-indexed characters
            for(int j=1; j<s.length(); j+=2){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        scan.close(); // Close the Scanner object
         
    }
}