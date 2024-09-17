package datatype.javapro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	//int rent=500;
	//int day=6;
	//int time=22;
	
	//if(day==1 && time>=21) {
		//System.out.println(rent+200);
	//}
	//else if(day>1 && time<=21) {
		//System.out.println(rent);
		
		
	//}else {
	//	System.out.println(rent+100);
	//}
	
    /*  double amount=11000;
      double discount=5;
      
      if(amount>=1000 && amount<5000) {
    	  discount=5;
    	  System.out.println("the discount will be");
    	  System.out.println(discount);
      }else if(amount>=5000 && amount<8000) {
    	  discount=7;
    	  System.out.println("the discount will be");
    	  System.out.println(discount);
      }else if(amount>=8000 && amount<10000) {
    	  discount=10;
    	  System.out.println("the discount will be");
    	  System.out.println(discount);
      }else {
    	  discount=0;
    	  System.out.println("the discount will be");
    	  System.out.println(discount);
      }*/
		
	/*	int a=10;
		int b=30;
		int c=40;
		if(a>b)
		{
			System.out.println("a is greater");
		}else if(b>c)
		{
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
			System.out.println(c);
		}*/
		
	/*	int num=20;
		System.out.println("prime number up to"+num+":");
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				System.out.println(i+"");
			}
		}
   
	}

	private static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
		
			if(num%i==0) {
				return false;
		}}
		return true; */
	/*	int num=12;
		boolean p=true;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				p=false;
				break;
			}if(p==true) {
				System.out.println("is a prime");
			}else {
				System.out.println("is not a prime number");
			}
		}*/
		/*int num=6;
		if(isPrime(num)) {
			System.out.println(num+"is prime");
		}else {
			System.out.println(num+"is not prime");
		}
	}

	public static boolean isPrime(int num) {
		if(num<=1) {
		return false;
	}
		return true;*/
		/*int start=10;
		int stop=50;
		boolean p=true;
		for(int i=start;i<=stop;i++) {
			 p=false;
			 for(int j=2;j<i;j++) {
				 if(i%j==0) {
					 p=true;
					 break;
				 }
			 }if(p==false) {
				 System.out.println("is prime:");
				 System.out.println(i);
			 }
		}*/
		/*int num1=100;
		int num2=200;
		int count=0;
		int num=5;
		for(int i=num1;i<=num2;i++) {
			if(i%num==0) {
				count++;
			}
		}
		System.out.println(count);*/
		/*int num=9353;
		int sum=0;
		int r;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
			
		}
		System.out.printint n=scn.nextInt();ln(sum);*/
		
		/*int num;
		int sum=0;
		int r;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		num=scn.nextInt();
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);*/
		/*int num=123,r;
		int rev=0;
		while(num!=0) {
		r=num%10;
		rev=rev*10+r;
		num=num/10;
		}
		System.out.println(rev);*/
		/*for(int i=1;i<=100;i++) {
			if(isPalindrome(i)) {
				System.out.println(i+"");
			}
		}
	}

	public static boolean isPalindrome(int num) {
		{
			String str=String.valueOf(num);
			return str.equals(new StringBuilder(str).reverse().toString());
		}*/
		 /*int num1 =7;
	        int num2 =49; 

	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }

	        System.out.println(num1);*/
		/* Scanner scanner = new Scanner(System.in);

	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();

	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }

	        System.out.println(num1);
	        scanner.close();*/
	/*	 for (int i = 1; i <= 100; i++) {
	            if (i == reverse(i)) System.out.println(i);
	        }
	    }

	    public static int reverse(int num) {
	        int rev = 0;
	        while (num > 0) {
	            rev = rev * 10 + num % 10;
	            num /= 10;
	        }
	        return rev;*/
	/*	int S=10,E=100;
		for(int i=S;i<=E;i++) {
			int num=i;
			int rev=0;
			while(num!=0)
			{
				int r=num%10;
				rev=rev*10+r;
				num=num/10;
			}
			if(i==rev)
			System.out.println(i);
		}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the task number");
		 int n =sc.nextInt();
		 
		 switch(n){
			 case 1: 
				 System.out.println("easy level task");
				 break;
			 
			 case 2:
				 System.out.println("intermediate level task");
			     break;
			 
			 case 3:
				 System.out.println("hard level task");
			     break;
			 default:
				 System.out.println("not valid task");
			 
				 
		 }*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		 String months =sc.nextLine();
		 switch(months){
			 case "jan","mar","may","july","aug","oct","dec":
				 System.out.println("31days");
				 break;
			 
			 case "apr","jun","sept","nov":
				 System.out.println("30 days");
			     break;
			 
			 
			 default :
				 System.out.println("28 days");
	}*/
		/*for(int i=6;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}*/
		
		
		
		/*int[] age= {21,20,18,30,15};
		for(int i=0;i<age.length;i++) {
			if(age[i]<=18) {
				System.out.println("invalid age:"+age[i]);
				break;
		}
			System.out.println("valid age:"+age[i]);
	}*/
		
		
		
		/* //inverted number pyramid
	       int n=5;   
	       //outer loop                                                     
	        for(int i=1;i<=n;i++){                                            
	        //innerloop                                                         
	            for(int j=1;j<=n-i+1;j++){                                        
	                System.out.print(j);                                            
	            }                                                                     
	            System.out.println();
	        } */
	}
}











































































































































































































































































































































































































































































































































































































































































































































































































