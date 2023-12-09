package leetcode.string.other.longest_common_prefix_14;

public class Main {
    public static void main(String[] args) {
        String [] input = new String[3];
        input[0] = "flower";
        input[1] = "flow";
        input[2] = "flight";

        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        String s1= strs[0];
        boolean isCharZeroEqual = false;

        String res = "";

        //cir car
        for (int i=0;i<s1.length();i++){
            String  a = "";
            int count = 0;
            for(int j=1;j< strs.length;j++){
                if(i > strs[j].length()-1){
                    break;
                }
                if(s1.charAt(i) != strs[j].charAt(i)){
                    isCharZeroEqual = true;
                    break;
                }if(s1.charAt(i) == strs[j].charAt(i) && !String.valueOf(s1.charAt(i)).equals(a)){
                    a+=s1.charAt(i);
                }
                count++;
            }
            if(count == strs.length-1){
                res+= a;
            }
            if(isCharZeroEqual){
                break;
            }
        }

        return res;
    }

}
