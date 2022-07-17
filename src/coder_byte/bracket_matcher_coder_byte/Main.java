//package coder_byte.bracket_matcher_coder_byte;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print(BracketMatcher(s.nextLine()));
//    }
//
//    public static String BracketMatcher(String str) {
//        boolean start = false;
//        boolean end = false;
//
//        for(int i =0;i<str.length();i++){
//            if(i==0 && !String.valueOf(str.charAt(i)).equals("(")){
//                return "1";
//            }else if(i==0 && String.valueOf(str.charAt(i)).equals("(")){
//                start = true;
//            } else if(start == true && end == true && ){
//                start = false;
//                end = false;
//            }
//        }
//
//        return str;
//    }
//}
