import java.util.*;
import java.io.*;
interface Bank
{
float getRate_Of_Interest();
}
class Sbi implements Bank
{
public float getRate_Of_Interest()
{
return 4;
}
}
class Hdfc implements Bank
{
public float getRate_Of_Interest()
{
return 5;
}
}class Test
{
public static void main(String arg[])
{
Bank b= new Sbi();
System.out.println(b.getRate_Of_Interest());
Bank a=new Hdfc();
System.out.println(a.getRate_Of_Interest());
}
}

