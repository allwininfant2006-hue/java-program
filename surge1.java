import java.util.Scanner;
class surge1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base fare:");
double baseFare=sc.nextDouble();
System.out.println("Enter the hour:");
int hour=sc.nextInt();
boolean rain=sc.nextBoolean();
if((hour>=7&&hour<=9)||(hour>=17&&hour<=20))
baseFare = baseFare+(baseFare*0.2);
if(rain)
System.out.println("final fare is:"+(baseFare+(baseFare*0.1)));
else
System.out.println("final fare is:"+baseFare);

}
}
