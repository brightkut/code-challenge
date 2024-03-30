package leetcode.two_pointer.slow_fast_pointer.string.string_compression_443;


public class Main {
    public static void main(String[] args) {
        char [] i1 = {'a','a','b','b','c','c','c'};
        char [] i2 = {'a'};
        char [] i3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char [] i4 = {'a','b','c'};

//        System.out.println(compress(i1));
//        System.out.println(compress(i2));
//        System.out.println(compress(i3));
        System.out.println(compress(i4));
    }

    //case 1
    // do by myself
    public static int compress(char[] chars) {
        if(chars.length == 1) return 1;

        int slow = 0;
        int u = 0;
        int count = 1;
        int res = 0;
        for(int i = 1 ; i < chars.length; i++){
//            System.out.println("u: "+ u+" slow : "+slow + " i: "+i+ "char[slow]: "+ chars[slow]+" char[i]: "+chars[i]);
            if(chars[slow] == chars[i]){
                count++;
            }else {
                //1
                int v = count;
                //1
                String vStr = Integer.toString(v);
                // b +1
                String s = "";
                if(v > 1){
                    res+=vStr.length() + 1;
                    s = chars[slow]+ vStr;
                }else {
                    res+=1;
                    s = String.valueOf(chars[slow]);
                }

                // update
                for(int j = 0; j <s.length() ; j++){
                    chars[u] = s.charAt(j);
                    u++;
                }
                //u ==2
                // slow =2
                slow = i;
                count = 1;
            }
//            System.out.println("res: "+res);
        }

        //u ==2
        // slow =2
        //1
        String vS = Integer.toString(count);
        //c + 1
        String s2 = count > 1 ? chars[slow] + vS : String.valueOf(chars[slow]);

        for(int j = 0; j <s2.length() ; j++){
            chars[u] = s2.charAt(j);
            u++;
            res++;
        }

        return res;
    }
}
