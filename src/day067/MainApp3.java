package day067;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp3 {
    public static void main(String[] args) {
        String regex="^(\\d+)$";
        String str="15\n" +
                "12.3\n" +
                "56,7";
        Pattern pattern = Pattern.compile(regex,Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);
        //System.out.println(matcher.find());
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
