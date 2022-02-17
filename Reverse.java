import java.util.*; 
 
public class Reverse{ 
 
    static void reverse(Integer myArray[]) 
    { 
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed: " + Arrays.asList(myArray)); 
    } 
 
     public static void main(String[] args) 
    { 
        Integer [] myArray = {1,3,5,7,9,11,13,15}; 
        System.out.println("Original: " + Arrays.asList(myArray));
        reverse(myArray); 
    } 
}