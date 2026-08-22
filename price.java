import java.util.Sacnner;
public class Sock{
 public static int maxProfit(int[]prices){
int minPrice=Integer.MAX_VALUE;
int maxProfit=0;
for(inti=0;i<prices.length;i++){
if(prices[i]<minPrice){
minPrice=prices[i];
int profit=prices[i]-minPrice;
if(profit>maxProfit){
maxProfit=profit;}}
return maxProfit;
}
Public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]prices=new int[n];
System.out.println("Enter stocks prices:"+0);
for(int i=0;i<n;i++){
prices[i]=sc.nextInt();}
int result=maxProfit(prices);
System.out.println("Maximum Profit="+result);
sc.close();}}
