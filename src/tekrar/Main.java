package tekrar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="\\?$";
        String str="Bu bir deneme mesajıdır.\nNasılsınız?";
        Pattern pattern = Pattern.compile(regex,
                Pattern.MULTILINE|Pattern.UNICODE_CHARACTER_CLASS|Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()){
            System.out.println("\""+regex+"\" bulundu.");
        }else {
            System.out.println("Bulunamadı.");
        }
    }
}
