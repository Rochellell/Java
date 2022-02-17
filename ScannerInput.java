 import java.io.*;
 import java.util.Scanner;
 public class ScannerInput{
     public static void main(String[] args) throws IOException{
         
         InputStreamReader r = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(r);
         System.out.println("Enter name : "); 
         String name = br.readLine();
         
         System.out.println(name);
         
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter age: "); 
         int age = sc.nextInt();
         
         System.out.println("Age" + age);
         
     }
 }