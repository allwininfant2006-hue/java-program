public class main{
public static int thirdMax(int[]nums){
Long first=null;
Long second=null;
Long third=null;
for(int  num:nums){
if((first!=null&&num==first)||(third!=null&num==third)){
continue;
if(first==null||num>first){
third=second;
first=(long)num;
}
else if(second ==null||num>second){
third=second;
second=(long)num;
}
else if(third==null||num>third){
third=(long)num;}}
return third.intValue();}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the array size:");
int n=sc.nextInt();
int[]nums=new int[n];
System.out.println("Enter the array element:");
int result=thirdMax(nums);
System.out.println("third Maximum Number="+result);
sc.close();}}