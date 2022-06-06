package day067;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp2 {
    public static void main(String[] args) {
        String regex="bu";
        String str="ama bu mesaj deneme amaçlıdır.\nVesaire vesaire";

        String subst="şu";

        Pattern pattern = Pattern.compile(regex,Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll(subst);
        System.out.println("Result : "+result);
    }
}
