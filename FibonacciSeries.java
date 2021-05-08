package week1.day1.assignments;

public class FibonacciSeries {
		
	public static void main(String[] args) {
		int range = 8;
		int secNum = 1;
		int firstNum = 0;				
		System.out.println("Fibonacci series of given range "+range +" is");
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i = 1; i<=range-2; i++) {
		int sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
		}
	}
}
