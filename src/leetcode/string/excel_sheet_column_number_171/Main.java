package leetcode.string.excel_sheet_column_number_171;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("AAA"));
    }

    public static int titleToNumber(String columnTitle) {
        int sums = 0;
        int p = columnTitle.length()-1;

        for(int j = 0 ; j < columnTitle.length(); j++){
            int ascii = columnTitle.charAt(j);
            int v = ascii-64;
            sums+=v*Math.pow(26,p);
            p--;
        }

        return sums;
    }
}
