import java.until.scanner;
class product{
int pcode;
string pname;
double price;
product(){
pcode=0;
pname="unknown";
price=0;
}
product(int c,string n ,double p){
pcode=c;
pname=n;
price=p;
}
void display(){
system.out.println(pcode+"\t"+pname+"\t"+price);
}
}
public class productmain{
public static void main(string[]args){
Scanner sc=new 	Scanner(System.in);
product p1=new product(101,"laptop",4500.00);
System.out.println("enter details for product:");
System.out.println("product code:");
int c2=sc.nextInt();
sc.nextline();
System.out .print("product name:");
string n2=sc.nextline();
System.out.print("price:);
souble pr2=sc.nextDouble();
product p2=new product(c2,n2,pr2);
System.out.println("enter details for product 3:");
product p3=new product();
System.out.print("product code");
p3code=sc.nextLine();
sc.nextline();
System.out.print("product name:");
p3.pname=scnextLine();
System.out.print("price:");
p 3.price=sc.nextDouble();
System.out.println("\n-------product with lowest price---");
product low=p1;
if(p2.price<low.price){
low=p2;
}
if(p3.price<low.price){
low=p3;
}
System.out.println("code\tname\tprice";
low display();
