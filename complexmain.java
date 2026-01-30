import java.util.Scanner;
class complex{
double real;
double img;
complex(){
real=0;
img=0;}
complex(double r,double i){
real=r;
img=i;
}
complex add(complex c2){
complex result=new complex();
result.real=real+c2.real;
result.img=img+c2.img;
return result;
}
complex multi(complex c2){
complex result=new complex();
result.real=(real*c2.real)-(img*c2.img);
result.img=(img*c2.img)-(img*c2.real);
return result;

}
complex sub(complex c2){
complex result=new complex();
result.real=real-c2.real;
result.img=img-c2.img;
return result;
}
void display(){
System.out.println(real+"+"+img+"i");
}
}
public class complexmain{
public static void main(String[]args){
Scanner sc=new 	Scanner(System.in);
System.out.println("enter real and imginary part of first number:");
double r1=sc.nextDouble();
double l1=sc. nextDouble();
complex c1=new complex(r1,l1);
System.out.println("enter real and imginary part of second number:");
double r2=sc. nextDouble();
double l2=sc .nextDouble();
complex c2=new complex(r2,l2);
System.out.println("\n--------result----");

complex sum=c1.add(c2);
complex diff=c1.sub(c2);
complex prod=c1.multi(c2);
System.out.println("sum:   ");
sum.display();
System.out.println("difference:   ");
diff.display();
System.out.println("product:");
prod.display();
}
}


