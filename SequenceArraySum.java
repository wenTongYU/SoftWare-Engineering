import java.util.Scanner;

public class SquenceArraySum
{
	public static void main(String []args)
	{
		int sum = 0, value = 0;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println( "Input(less than 10 numbers)：" );
		int n = in.nextInt();
	   	for(int i = 0; i<n ; i++)
			arr[i] = in.nextInt();
	    for(int i = 0; i < n; i++){
			if(value <= 0)
				value = arr[i];
	        else
				value += arr[i];
	       
		if(value > sum)
			sum = value;
		}	
	    System.out.printf("Sum：%d",sum);
	}
}