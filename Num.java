import java.util.*;
import java.io.*;
class Num
{
public static void main(String[] arr)
{
int a,b,c,d,e,min,max;
Scanner T=new Scanner(System.in);

System.out.println("enter some numbers");
a=T.nextInt();
b=T.nextInt();
c=T.nextInt();
d=T.nextInt();
e=T.nextInt();
min=a;
max=a;
if(b<min)
{
min=b;
}
if(c<min)
{
min=c;
}
if(d<min)
{
min=d;
}
if(e<min)
{
min=e;
}
if(b>max)
{
max=b;
}
if(c>max)
{
max=c;
}
if(d>max)
{
max=d;
}if(e>max)
{
max=e;
}
System.out.println("greatest="+max);
System.out.println("smallest="+min);
}
}
