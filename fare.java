import java.util.Scanner;
class main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:");
int age=sc.nextInt();
System.out.println("Enter the ticket fare:");
int ticket=sc.nextInt();
if(age>=60||age<=12)
{
System.out.println("your ticket fare is:"+(ticket-ticket*0.3));
}
else
System.out.println(
}
}