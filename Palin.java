import java.util.*;
import java.io.*;
class Palin
{
public static void main(String arg[])
{
Scanner n=new Scanner(System.in);
int a,s=0,r,temp;
System.out.println("enter a number");
a=n.nextInt();
temp=a;
while(a>0)
{
r=a%10;
s=s*10+r;
a=a/10;
}
System.out.println(+s);
if(temp==s)
{
System.out.println("palindrome" +s);
}
else{
System.out.println("not palindrome");
}
}}
