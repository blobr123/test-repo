import java.util.Scanner;
import java.util.Random;
public class Lottery
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int[] lotteryNumber =  new int[5];
      int[] yourLottery = new int[5];
      lotteryNumber = generateLotteryNumber();
      System.out.print("welcome to play Lottery ..."
                       + "\n1. enter your own lottery number"
                       + "\n2. get a computer-generated lottery number"
                       + "\nyour choice: ");
      int choice = kb.nextInt();
      kb.nextLine();
      switch(choice)
      {
         case 1:
            System.out.print("enter 5 single-digit numbers, separated by space: ");
            for(int i  = 0; i < 5; i++)
               {
                  yourLottery[i] = kb.nextInt();
               }
            System.out.print("\nThe Lottery Number is:\n\t\t\t\t");
            for(int val: lotteryNumber)
            {
               System.out.print(val + " ");
            }
            System.out.print("\nYour Number is:\n\t\t\t\t");
            for(int val: yourLottery)
            {
               System.out.print(val + " ");
            }
            System.out.println("\nThere are " + compareNumbers(lotteryNumber, yourLottery) 
                               + " matching digits.");
            break;
         case 2:
         yourLottery = generateLotteryNumber();
         System.out.print("\nThe Lottery Number is:\n\t\t\t\t");
         for(int val: lotteryNumber)
         {
            System.out.print(val + " ");
         }
         System.out.print("\nYour Number is:\n\t\t\t\t");
         for(int val: yourLottery)
         {
            System.out.print(val + " ");
         }
         System.out.println("\nThere are " + compareNumbers(lotteryNumber, yourLottery) 
                            + " matching digits.");
            break;
         default:
            System.out.println("Sorry, improper input, now exiting...");
      }

   }
   public static int[] generateLotteryNumber()
   {
      int[] lotteryNumber = new int[5];
      Random rand = new Random();
      for(int i = 0; i < 5; i++)
      {
         lotteryNumber[i] = rand.nextInt(10);
      }
      return lotteryNumber;
   }
   public static int compareNumbers(int[] lottery, int[] picks)
   {
      int sameNums = 0;
      for(int i = 0; i < 5; i++)
      {
         if(lottery[i] == picks[i])
            sameNums++;
      }
      return sameNums;
   }
}