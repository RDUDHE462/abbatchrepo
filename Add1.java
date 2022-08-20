import java.util.*;
class Add
{
int n;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("Enter a no:");
n=sc.nextInt();
System.out.println("entered no:"+n);
}
}
class Add1
{
public static void main(String args[])
{
Add x=new Add();
x.input();
}
}