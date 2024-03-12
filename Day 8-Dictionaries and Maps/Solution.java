import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         Map<String, Integer> phoneBook = new HashMap<String, Integer>();
            for(int i = 0; i < n; i++){
                String name = scan.next();
                int phone = scan.nextInt();
                phoneBook.put(name, phone);
            }
            while(scan.hasNext()){
                String name = scan.next();
                if(phoneBook.containsKey(name)){
                    System.out.println(name + "=" + phoneBook.get(name));
                } else {
                    System.out.println("Not found");
                }
            }
    }
}