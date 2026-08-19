import java.util.Scanner;
class main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the stock:");
int stock=sc.nextInt();
if(stock==0)
{
System.out.println("Out of Stock");
}
else if(stock>=1&&stock<=10)
{
System.out.println("Critical understock");
}
else if(stock>=11&&stock<=50)
{
System.out.println("Low stock");
}
else if(stock>=50)
{
System.out.println("Optimally stocked");
}
}
