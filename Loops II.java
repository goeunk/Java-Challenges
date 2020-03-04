import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i = 0; i < t; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double firstNum = a + Math.pow(2, 0) * b;
            double addedNum;
            double result = 0;
            double[] resultSet = new double[n];
            int[] finalResultSet = new int[n];
            String sFinalResultSet;

            for (int j = 1; j < n; j++)
            {
                resultSet[0] = firstNum;
                addedNum = Math.pow(2, j) * b;
                if (j == 1)
                {
                    result = firstNum + addedNum;
                }
                else
                {
                    result += addedNum;
                }
                resultSet[j] = result;               
            }

            for (int k = 0; k < resultSet.length; k++)
            {
                finalResultSet[k] = (int)resultSet[k];
               
            }
            //sFinalResultSet = Arrays.toString(finalResultSet);
            sFinalResultSet = Arrays.toString(finalResultSet).replace("[", "").replace("]", "").replace(",", "");
            System.out.print(sFinalResultSet);

            System.out.println();
        }
        in.close();
    }
}
