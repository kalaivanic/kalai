class math
{
private int a;
private int b;
void add()
{System.out.println("a+b");
}
}
class multiply extends math
{
private int a;
private int b;
void mul()
{System.out.println("a*b");
    
}
}
class maths
{
public static void main(String args[])
{
multiply s=new multiply();
s.add();
s.mul();
}
}
