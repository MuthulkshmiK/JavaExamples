package javaexamples;

public class TestPrac3 {
	public static void main(String[] args) {
		long primeNum = 600851475143L;
		//long primeNum=13195L;
		long i = 1L;
		long primeHalf = primeNum/2;
		System.out.println("primeHalf"+primeHalf);
		//long largePrime=1;
		boolean primeCheck=false;
		while(i<=primeHalf) {
			System.out.println("current i::"+i);
			if(primeNum%i==0) {
				//System.out.println("mod is i:"+i);
			long primeHalfCheck = i/2;
				for(int j=2;j<=primeHalfCheck;j++) {
					if(i%j==0) {
						//System.out.println("not a prime");
						primeCheck=true;
						break;
					}
				}
				if(!primeCheck) {
					System.out.println("prime number::"+i);
				}
				
			}
			
			i++;
		}
	}
}

