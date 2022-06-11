package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=13;
		boolean flag=false;
		for (int i=2; i<=13/2; ++i) {
			if (a%i==0) {
				flag=true;
				break;
		}
	}
if(!flag)
	System.out.println("prime number");
else
	System.out.println("not a prime number");
}
}
