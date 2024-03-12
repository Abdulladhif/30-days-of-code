import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        // Convert the number to binary
        String binary = Integer.toBinaryString(n);
        // Split the binary number by 0
        String[] binaryArray = binary.split("0");
        int max = 0;
        for (String s : binaryArray) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
