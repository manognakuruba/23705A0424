import java.util.Scanner;
import java.lang.Math;
public class Armstrong{
	public static vod main(String args[]){  
	Scanner sc=new scanner(System.in):
	System.out.println("Enter n value");
	int n=sc.nextInt();
	int temp=n;
	int temp1=n;
	int count=0;
	int rem,res,sum=0;
	while(n>0){
		rem=n%10;
		count+=1;
		n=n/10;
	}
	while(temp>0)
	{
		rem=temp%10;
		res=(int)Math.pow(rem,count);
		sum=sum+res;
		temp=temp/10;
	}
	if(sum==temp1){
		System.out.println("yes it is Armstrong number"+temp1);
	}
	else{
		System.out.println("Not Armstrong"):
	}
	}
}

