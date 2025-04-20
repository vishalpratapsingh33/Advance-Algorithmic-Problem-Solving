import java.util.*;
public class LongestSubstringwithoutRepeartingCharacter06 {
    public static int  LengthOfSubSting(String s){
        Set<Character> st = new HashSet<>();
        int start =0;
        int Maxlength =0;


        for(int end =0;end<s.length();end++){
            while(st.contains(s.charAt(end))){
                st.remove(s.charAt(start));
                start++;
            }
            st.add(s.charAt(end));
            Maxlength = Math.max(Maxlength,end-start+1);
        }
        return Maxlength;
    }

    public static void main(String[] args) {
        String st = "abcabcbb";
        System.out.println("The length of sunsting without repreating character :"+ LengthOfSubSting(st));
    }
}
