import java.util.Scanner;
public class InsertAtPosition{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	int[]arr={10,20,30,40};
	int[]newArr=new int[arr.length+1];
System.out.println("Enter the position(0 to"+arr.length+"):");
int position =sc.nextInt();
System.out.println("Enter the element:");
	int value=sc.nextInt();
	for(int i=0;i<position;i++){
	newArr[i]=arr[i];}
	newArr[position]=value;
	for(int i=position;i<arr.length;i++){
newArr[i+1]=arr[i];}
System.out .println("Array after insertion:");
for(int num:newArr){
System.out.println(num+"");
}
}
}