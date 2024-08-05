package homework2.iterative.loops;

import java.util.*;
public class PrimePattern
{
public static boolean isPrimeNumber(int num) {
   int c=0;
   for (int i = 1; i <= num; i++) {
      if (num % i == 0)
         c++;
      System.out.println("this is num : "+num);
   }
   if (c==2)
      return true;
   else
      return false;
}
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of rows : ");
        int rows = sc.nextInt();
        int counter = 2;    
         for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= i; j++) {
        while(!isPrimeNumber(counter)){
            counter++;
            }
        System.out.print(counter+" ");
        counter++;
      }
      System.out.println();
   }

}
}