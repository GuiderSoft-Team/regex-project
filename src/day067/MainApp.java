package day067;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {
    public static void main(String[] args) {
        String regex="\\w+";
        String str="ama bu mesaj deneme amaçlıdır.";

        Pattern pattern=Pattern.compile(regex,Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println("Match : "+matcher.group(0));

            for (int i = 1; i < matcher.groupCount(); i++) {
                System.out.println("Group "+i+": "+matcher.group(i));
            }

        }
    }
}
