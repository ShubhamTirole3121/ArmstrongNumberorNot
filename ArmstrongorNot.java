package Schoollevel;

public class ArmstrongorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		System.out.println(armstrongNumber(n));

	}

	 static String armstrongNumber(int n){
	       int sumDigit = 0;
	int origNum = n;
	while( n != 0){
	int r = n % 10;
	sumDigit += r*r*r;
	n/= 10;
	}
	return sumDigit == origNum ? "Yes":"No";
	    }
}
