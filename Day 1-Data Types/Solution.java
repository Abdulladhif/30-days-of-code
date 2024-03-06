import java.util.Scanner;


public class Solution {

    public static void main(String[] args){
         int i;
        double d;
        String s;
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        d = scan.nextDouble();
        scan.nextLine();
        s = scan.nextLine();
        scan.close();
        System.out.println(i + 4);
        System.out.println(d + 4);
        System.out.println("HackerRank " + s);
    }
}