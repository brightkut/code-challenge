package coder_byte.tree_constructor_coder_byte;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String [] input = {"(1,2)", "(3,2)", "(2,12)", "(5,2)"};

        System.out.print(TreeConstructor(input));
    }

    public static Boolean TreeConstructor(String[] strArr) {
        Map<String,Integer> children = new TreeMap<>();
        Map<String,Integer> parents = new TreeMap<>();

        for (String pair: strArr){
            String[] vals = pair.substring(1,pair.length()-1).split(",");
            String child = vals[0];
            String parent = vals[1];

            if(!children.containsKey(child)) children.put(child,1);
            else children.put(child,children.get(child)+1);

            if(!parents.containsKey(parent)) parents.put(parent,1);
            else parents.put(parent,parents.get(parent)+1);

            if (children.get(child) > 1 || parents.get(parent) > 2){
                return false;
            }
        }

        return true;
    }
}
