import java.util.Scanner;
public class String_man{
public static void main(String[] args) {
System.out.println(" \nName:Ajo Jojo\nRoll no:23MCA008\nTitle:String-Manipulation\nDate:26-FEB-2024\n");
System.out.println("Enter The String");
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
System.out.println("Length of String = "+str1.length());
System.out.println("Character at First position = "+str1.charAt(1));
System.out.println("String Contains 'o' sequence :"+str1.contains("o"));
System.out.println("String ends with e : "+str1.endsWith("e"));
System.out.println("Replace'o' with 'u' : "+str1.replaceAll("o","u"));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
