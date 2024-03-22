import java.util.*;
import java.io.*;
import java.lang.Math;
class Root
{
public static void main(String arr[])
{
double a,b,c,d,r1,r2,S,e;
Scanner T=new Scanner(System.in);
System.out.print("enter a,b,c values");
a=T.nextDouble();
b=T.nextDouble();
c=T.nextDouble();
//System.out.println("enter a,b,c values");
//d=T.nextDouble();
//d=(Math.sqrt(b*b-4*a*c));
//r1=((-b+Math.sqrt (d))/2*a);
//r2=((-b-Math.sqrt (d))/2*a);
d=(b*b-(4*a*c));
e=(Math.sqrt(b*b-(4*a*c)));
r1=((-b+e)/(2*a));
r2=((-b-e)/(2*a));
System.out.println("roots are "+r1+" "+r2);
System.out.print("\n");
if(d==0)
{

System.out.println("roots are real & unique"+r1+" "+r2);
}
else if(d>0)
{
System.out.println("roots are real&distinct"+r1+" "+r2);
}
else
{
System.out.println("roots are imaginary"+r1+" "+r2);
}
}
}
