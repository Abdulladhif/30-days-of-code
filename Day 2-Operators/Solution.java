import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();

    }

  class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));
    }
  }
}