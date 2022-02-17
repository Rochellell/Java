//Swap two numnber without creating new variable
public class Swap {
 
    public static void main(String a[])
    {
        int x = 10;
        int y = 5;
        x = x + y;

        y = x - y;
        x = x - y;
        System.out.println("Now, x = " + x + ", y = " + y);
    }
}