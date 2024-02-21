package leetcode.two_pointer.slow_fast_pointer.string.string_compression_443;


public class Main {
    public static void main(String[] args) {
        char [] i1 = {'a','a','b','b','c','c','c'};
        char [] i2 = {'a'};
        char [] i3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        System.out.println(compress(i1));
        System.out.println(compress(i2));
        System.out.println(compress(i3));
    }

    //case 1
    public static int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int count = 0;
        int slow  = 0, fast = slow + 1;

        int c = 1;
        while (fast < chars.length){
            if(chars[slow] == chars[fast]){
                fast++;
                c++;
            }else {
                if(c > 1){
                    String cStr = Integer.toString(c);
                    char [] cArr = cStr.toCharArray();
                    for(int i = 0 ; i < cArr.length; i++){
                        chars[slow++] = cArr[i];
                    }
                }else {
                    slow++;
                }
            }
        }

        return count;
    }
}
