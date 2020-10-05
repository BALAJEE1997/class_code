package class_code;

import java.util.Scanner;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = 0;
		
		for(int i =2;i*i<=n;i++) {
			if(n%i==0) {
				m++;
			
				break;
			}
		}
			
			if(m==0)
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
		

	}


