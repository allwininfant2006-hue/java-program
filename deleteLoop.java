class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;}}
public class DetectLoopLinkedList{
Node head=null;
void insert(int value){
if (head==null){
head=newNode;

return;}
Node temp=head;
while(temp.next!=null){
temp=temp.next;}
temp.next=newNode;}
boolean detectLoop(){
Node slow=head;
Node fast=head;
while(fast!=null&&fast.next!=null){
slow=slow.next;fast=fast.next.next;
if(slow==false){
return true;}}
return false;}
public static void main(String[]args){
DetectLoopLinkedList=new DetectLoopLinkedList();
list.insert(10);list.insert(20);
list.insert(30);list.insert(40);
list.head.next.next.next.next=list.head.next;
if(list.detectLoop)()){
System.out.println("loop detected in the linked list");}
else{
System.out.println("no loop");
}
}
}

