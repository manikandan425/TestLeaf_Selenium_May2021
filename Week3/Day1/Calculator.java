package week3.day1;

public class Calculator {
	
	public void add(int add1, int add2) {
		int sumOf2Var=add1+add2;
		System.out.println(sumOf2Var);
	}
	
	public void add(int add1, int add2, int add3) {
		int sumOf3Var=add1+add2+add3;
		System.out.println(sumOf3Var);
	}
	
	public void mul(int mul1, int mul2) {
		int mulOf2Int=mul1*mul2;
		System.out.println(mulOf2Int);
	}
	
	public void mul(int mul1, double mul2) {
		double mulOf2IntandDouble=mul1*mul2;
		System.out.println(mulOf2IntandDouble);
	}

	public void sub(int sub1, int sub2) {
		int diffOf2Var=sub1-sub2;
		System.out.println(diffOf2Var);
	}
	
	public void sub(double sub1, double sub2) {
		double divOf2Var=sub1-sub2;
		System.out.println(divOf2Var);
	}
	
	public void div(int div1, int div2) {
		int divOf2IntVar=div1/div2;
		System.out.println(divOf2IntVar);
	}
	
	public void div(double div1, double div2) {
		double divOf2DoubleVar=div1/div2;
		System.out.println(divOf2DoubleVar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(5, 5);
		cal.add(5, 5, 5);
		cal.mul(5, 5);
		cal.mul(5, 5);
		cal.sub(10, 5);
		cal.sub(10, 5);
		cal.div(10, 2);
		cal.div(20, 5);
		
	}

}
