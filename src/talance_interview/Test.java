package talance_interview;

import java.util.*;
import java.io.*;
import java.net.*;


public class Test {
    public static void main(String[] args) throws IOException {

        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();

                String readJson = new String(inputStream.readAllBytes());
                String [] readJsonSplit = readJson.split(":");

                String readHobbies = readJsonSplit[3].replace("}","").replace("[","").replace("]","").replace("\"","");
                String [] hobbies = readHobbies.split(",");

                StringJoiner s = new StringJoiner(", ");
                for(String h: hobbies){
                    s.add(h);
                }
                System.out.println(s);

            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }

    public static String MathChallenge(String str){
        String in = str;
        String s1 = "";

        for (int i =0;i<(str.length()/2)+1;i++){
            s1+=String.valueOf(str.charAt(i));
            String r = in.replace(s1,"");

            if(r.equals("")){
                return s1;
            }
        }

        return "-1";
    }

    public static int ArrayChallenge(int [] arr){
        int res1 = Integer.MIN_VALUE;
        int res2 = 0;

        for(int i =0 ; i<arr.length ; i++){
            res2+= arr[i];
            if(res1 < res2){
                res1 = res2;
            }
            if(res2 < 0){
                res2 = 0;
            }
        }
        return res1;
    }
}
