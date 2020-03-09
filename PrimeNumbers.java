package important;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prime numbers 1,3,5,7,11,13,17,19,23
		int n=23;
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=1;
			}
		}
		if (count==0) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("no");
		}
		}}