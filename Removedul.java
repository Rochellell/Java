import java.util.*;
public class Removedul 
{
    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++) // first loop, outter
        {
            int j;
            for (j = 0; j < i; j++) // compare j with i, if loop is not done
            {
                if (str[i] == str[j])
                {   break;  }
            }
            if (j == i) // add to new string
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index)); // copy of the array 
    }
    public static void main(String[] args)
    {
        char str[] = "aaabbbaaaccc".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}





//Hashset & Hashmap from class
class DuplicateExample{

    public static void main(String[] args) {
        
        int [] arrayOfInt = {1,1,2,3,3,5,4,5,6};
        new DuplicateExample().findDuplicatesUsingHashSet(arrayOfInt);
    }  
    private static void findDuplicatesUsingHashSet(int[] inputArray)
    {
        Set<Integer> set = new HashSet<Integer>(); //O(n)
        Map<Integer, Integer> map = new HashMap();
        
        for(int i=0;i<inputArray.length;i++) {
            if(map.containsKey(inputArray[i])) {
                System.out.println("Duplicate Element in map : "+inputArray[i]);
            }
            else {
                map.put(inputArray[i], inputArray[i]);
            }
        }
//          
//      for (int element : inputArray) 
//      {
//          if( ! set.add(element))
//          {
//              System.out.println("Duplicate Element : "+element);
//          }
//      }
    }
}