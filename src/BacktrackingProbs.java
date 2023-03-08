
public class BacktrackingProbs {
	
	public void printBinary(int digits)
	{
		printBinaryHelper(digits, "");
		
	}
	private static void printBinaryHelper(int n, String result)
	{
		if(result.length()==n)
		{
			System.out.print(result + " ");
		}
		
		else
		{
			printBinaryHelper(n, result + 0);
			printBinaryHelper(n, result + 1);
		}
	}
	
	public void climbStairs(int steps)
	{
		climbStairsHelper(steps, 0);
	}
	
	private static void climbStairsHelper(int n, int result)
	{
		if(result==n)
		{
			System.out.print(result + " ");
		}
		
		else
		{
			climbStairsHelper(n, result + 1);
			climbStairsHelper(n, result + 2);
		}
	}



public static void main(String [] args)
{
	BacktrackingProbs tester = new BacktrackingProbs();
	tester.printBinary(3);
	tester.climbStairs(4);
}

}