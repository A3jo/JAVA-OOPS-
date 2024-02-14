class product{
int pcode;
String name;
double price;	

public product (int pcode,String name,double price){
this.pcode=pcode;
this.name=name;
this.price=price;
}}

public class prgm1{
public static void main(String[] args){
System.out.println("Name:Ajo Jojo\nRoll no:23mca008\nTitle:Product class\nDate:13-02-2024");
product p1=new product(1,"Apple",230);
product p2=new product(2,"Orange",150);
product p3=new product(3,"Grape",180);
product lowest=p1;

if(p2.price<lowest.price){
lowest=p2;
}
else if (p3.price<lowest.price){
lowest=p3;
}

System.out.println("\n The product having the lowest price is " +lowest.name+ " with price " +lowest.price); 
}}

