package sourceCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution2 {
	 
    public static void main(String[] args) {
         
        ArrayList<String> input = new ArrayList<String>();
        input.add("one");
        input.add("one");
        input.add("one");
        input.add("two");
        input.add("three");
        input.add("four");
        input.add("five");
        input.add("five");
        input.add("six");
         
        System.out.println(Solution2.getDuplicates(input));
         
    }
 
    static HashSet<String> getDuplicates(ArrayList<String> input){
         
        HashSet<String> duplicates = new HashSet<String>();
        Collections.sort(input);
         
        for(int i=0, j=i+1 ; j<input.size() ; i++,j++){
             
            String a = input.get(i);
            String b = input.get(j);
             
            if(a.equals(b)){
                duplicates.add(a);
            }
             
        }
        return duplicates;
    }
}