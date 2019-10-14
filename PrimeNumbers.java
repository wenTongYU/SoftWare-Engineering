
public class Prime {
	public static void main(String[] args)
	{
		int k = 0;
		for(int i = 2; i < 20000; i++)
			if(isPrimeNumber(i)) {
				System.out.println("%d ", i);
				k++;
				if(k % 5 == 0)
					System.out.println("\n");
			}
	}
	
	public static boolean isPrimeNumber(double i) 
	{
		int k = 2;
		int n = (int)Math.sqrt(i);
		while(k <= n) {
			if(i % k == 0)
				return false;
			else k++;
		}
		return true;
	}
 
}