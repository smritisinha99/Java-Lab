import java.io.BufferedReader;
 import java.io.IOException;
import java.io.InputStreamReader; public class Main extends Functions
{

public static void main(String args[])throws IOException
{
UserInput obj=new UserInput();
 int arr[]=new int[100];
int t=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); while(t!=1)
{
System.out.println("Enter 1 to operate on two numbers. Enter 2 to operate on list of  numbers: ");
int num = Integer.parseInt(br.readLine()); if(num==1)
{
System.out.println("Enter your choice: \n1) Addition \n2) Subtraction \n3) Multiplication \n)4 Division"); 
int a= Integer.parseInt(br.readLine());
if(a==1)
 
{

arr=obj.input_1(a);
long sum=sumTwo(arr); System.out.println(sum);
}
else if (a==2)
{
arr=obj.input_1(a); long val=subtract(arr);
System.out.println(val);
}
else if (a==3)
{
arr=obj.input_1(a); 
long val=multiply(arr);
System.out.println(val);
}
else if (a==4)
{
arr=obj.input_1(a); double val=divide(arr); System.out.println(val);
}

}
else if(num==2)
{
System.out.println("Enter array size: "); int n= Integer.parseInt(br.readLine());
arr=obj.input_2(n);
 
int a=100000; while(a!=0)
{
System.out.println("Enter choice: \n1) Sum \n2) Mean \n3)Standard deviation \n4)Variance \n0) Exit array");
a=Integer.parseInt(br.readLine()); if (a==1)
{
long x=sum(arr,n); System.out.println("Sum is ="+x);
}
else if (a==2)
{
double x=mean(arr,n); System.out.println("Mean is ="+x);
}
else if (a==3)
{
double x=SD(arr,n); System.out.println("Standard Deviation is = "+x);
}
else if (a==4)
{
double x=getVariance(arr); System.out.println("Standard Deviation = "+x);
}
}
}
System.out.println("Enter 1 to exit calculator: ");
 
t=Integer.parseInt(br.readLine());

}

}

}
