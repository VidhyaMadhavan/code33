import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n,rem=0,rev=0;
n=sc.nextInt();
if(n==0)
System.out.println("Invalid");
else
{
while(n!=0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
System.out.println(rev);
}
}
}
