package assignment4;
import java.util.*;

public class apples {

	public static void main(String[] args) {
	    int[] lottery = new int[6];
	    int randomNum;
	    Random generator =new Random();

	    for (int i = 0; i < 6; i++)
	    {
	    	randomNum = generator.nextInt(49)+1;
	        for (int x = 0; x <= i; x++)
	        {
	            if (lottery[x] == randomNum)
	            {
	            	randomNum = generator.nextInt(49)+1;
	            	x = -1;
	            }
	        }
	        lottery[i] = randomNum;
	    }
	    System.out.printf("Taiwan Lottery:\n-------------------\n");
	for (int i = 0; i < lottery.length; i++)
        System.out.print(lottery[i] + " ");

	}
}
