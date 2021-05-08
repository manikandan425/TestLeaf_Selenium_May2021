package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=13;
		boolean flag=false;
		for (int i =2; i <= input/2; i++) {
			int rem=input%i;
				if (rem==0) {
				System.out.println(input +" is divisible by " +i);
				System.out.println(input +" is a not a prime number");
			break;
			}
			else
			{
				flag=true;
			}
					
			}
		if(flag==true)
		{
			System.out.println(input +" is a prime number");
		}
		}
}
