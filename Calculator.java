import java.util.*;
import java.io.*;
class Calculator
{
public static void main(String arr[])
{
int a,b,c;
Scanner N=new Scanner(System.in);
System.out.println("enter a,b values");
a=N.nextInt();
b=N.nextInt();
char ch;
System.out.println("enter your choice +,-,*");
ch=N.next().charAt(0);
//System.out.println("enter a,b values");
//System.out.println("enter your choice +,-,*");
switch(ch)
{
case '+':c=a+b;
System.out.println(c);
break;
case '-':c=a-b;
System.out.println(c);
break;
case '*':c=a*b;
System.out.println(c);
break;
default:System.out.println("invalid");
}
}
}
