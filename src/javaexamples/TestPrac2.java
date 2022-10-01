package javaexamples;

import java.util.ArrayList;

public class TestPrac2 {
	public static void main(String []abc) {
		int sumEvenFib = 0;
		int fibStart1 = 1;
		int fibStart2 = 2;
		int fibSeries = 2;
		int fibNext=0;
		while(fibNext<4000000) {
			fibNext = fibStart1+fibStart2;
			fibStart1=fibStart2;
			fibStart2=fibNext;
			if(fibNext%2==0) {
				fibSeries = fibSeries+fibNext;
			}
			System.out.println("fibNext::"+fibNext);
		}
		System.out.println("sum of even number fib="+fibSeries);
	}

}
