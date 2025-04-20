public class LongestPalindromeSubString08 {
    public static String LPS(String s){
        if(s == null || s.length() < 1){
            return "";
        }
        int start =0;
        int end =0;

        for(int i=0;i<s.length();i++){
            int Len1 = expandAroundCeneter(s,i,i);
            int Len2 = expandAroundCeneter(s,i,i+1);
            int Len = Math.max(Len1,Len2);

            if(Len > end-start){
                start = i-(Len-1)/2;
                end=i+Len/2;
            }
        }
        return s.substring(start,end+1);
    }
    private static int expandAroundCeneter(String s,int left,int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String st = "cbbd";
        System.out.println("The longrst palidrome of substring:"+LPS(st));
    }
}
