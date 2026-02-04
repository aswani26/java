import java.util.Scanner;
public class matrix{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("------enter dimension for matrix A---");
System.out.println("rows");
int r1=sc.nextInt();
System.out.print("cols:");
int c1=sc.nextInt();
System.out.println("----enter dimensions for matrix b----");
System.out.println("rows:");
int r2=sc.nextInt();
System.out.println("cols:");
int c2=sc.nextInt();
int[][]A=new int[r1][c1];
int[][]B=new int[r2][c2];
System.out.println("enter elements for matrix A:");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
A[i][j]=sc.nextInt();
}
}
System.out.println("enter elements for matrix B:");
for(int i=0;i<r2;i++){
for(int j=0;j<c2;j++){
B[i][j]=sc.nextInt();
}
}
while(true){
System.out.println("menu");
System.out.println("additon");
System.out.println("multiplication");
System.out.println("exit");
System.out.println("enter choice:");
int choice=sc.nextInt();
if(choice==3)break;
switch(choice){
case 1:if(r1==r2 &&c1==c2){
System.out.println("sum matrix:");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
System.out.print((A[i][j]+B[i][j]+"\t"));
}System.out.println();
}
}

else{
System.out.println("error:dimensions must be same for addition.");
}
break;
case 2:
    if(c1==r2){
    System.out.println("product matrix:");
    int[][] c=new int[r1][c2];
    for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
    c[i][j]=0;
    for(int k=0; k<c1; k++){
    c[i][j]+= A[i][j]* B[k][j];
    }
    System.out.print(c[i][j] +"\t");
    }
    System.out.println();
    }
    }
    else{
    System.out.println("error:col of a must equal row of b.");
    }
    break;
    default:
    System.out.println("ivalid choice!");
    }
    }
    }
    }
    

