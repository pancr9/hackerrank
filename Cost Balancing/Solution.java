import java.util.Scanner;

/**
 * @author Rekhansh Panchal (rekhanshpanchal@gmail.com)
 *         Developed for Hackerrank competition.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        //Generate Array to store values.
        int[] values = new int[m];
        int currentValue, totalSum = 0;

        for (int a0 = 0; a0 < n; a0++) {
            int id_number = in.nextInt();
            int amount = in.nextInt();
            //Calculating the total sum.
            totalSum += amount;

            //Getting the current store value.
            currentValue = values[id_number - 1];
            amount += currentValue;

            //Setting new amount to the id.
            values[id_number - 1] = amount;
        }
        in.close();

        //Calculating the average of the amount to be paid.
        int average = totalSum / m;
        int extraAmount = totalSum - average * m;

        //Updating expenses for Anita.
        values[0] -= average + extraAmount;
        System.out.println(1 + " " + values[0]);

        //Updating expenses for rest.
        for (int i = 1; i < m; i++) {
            values[i] -= average;
            System.out.println(i + 1 + " " + values[i]);
        }
    }
}
