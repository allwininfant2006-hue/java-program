class dlist{
int data;
Node next;
Node prev;
Node(int data){
this.data=data;
this.prev=null;
this.next=null;}}
class Main{
static Node head=null;
static void insert(int value){
Node newNode=new Node(value);
if(head==null){
head=newNode;
return;}
Node temp=head;
while(temp.next!=null){
temp=temp.next;}
temp.next=newNode;
newNode.prev=temp;}
static void display(){aa
Node temp=head;
while(temp!=null){
System.out.print(temp.data+"<->");
temp=temp.next;}
System.out.println("null");}
public static void main(String[]args){
insert(10);
insert(20);
insert(30);
insert(40);
display();}}
