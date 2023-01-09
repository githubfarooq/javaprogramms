package Basic;

public class Operations {
	
	public int add(int a,int b) {
		
		int c=a+b;
		return c;
	}
	public void subract(int x,int y) {
		int z=x-y;
		System.out.println(z);
}
	public int multiply(int m,int n) {
		int p=m*n;
		return p;
	}
	public int factorial() {
		int fact=8;
		for(int i=1;i<8;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public int sumnumber() {
		int num=1234567;
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
			
		}return sum;
		
		
	}
	public static void main(String[] args) {
		Operations O=new Operations();
		int value=O.add(567,897);
		System.out.println(value);
		O.subract(899, 567);
		int mul=O.multiply(56,78);
		System.out.println(mul);
		int fac=O.factorial();
		System.out.println(fac);
		int sum=O.sumnumber();
		System.out.println(sum);
	}

}
