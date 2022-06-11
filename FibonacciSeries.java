package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int range = 7;
				{
				System.out.println(firstNum);
				System.out.println(secNum);
				}
		for (int i=2; i<=range; ++i)
		{
			int sum = firstNum + secNum;	
						System.out.println(sum);		
					firstNum=secNum;
					secNum=sum;
		}
	}
}