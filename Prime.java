import java.util.*;
import java.io.*;
class Prime
{
public static void main(String[] arr)
{
int i,j,n,temp;
Scanner N=new Scanner(System.in);
System.out.println("enter a value");
n=N.nextInt();
System.out.println("prime factors of "+n);
for(i=2;i<=n;i++)
{
if(n%i==0)
{temp=1;

for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
temp=0;
break;
}
}

if(temp==1)
{
System.out.print(i+" ");
}
}
}
}
}
