import java.util.HashSet;
public class palindrome{
public static int longestPalindrome(String s){
HashSet<Character>set=new HashSet<>();
int length=0;
for(char ch:s.toCharArray()){
if(set.contains(ch)){
set.remove(ch);
length+=2;}
else{set.add(ch);}}
if(!set.isEmpty()){length++;}
return length;}
public static void main(String[]args){
String s="abccccdd";
System.out.println(longestPalindrome(s));
}
}

