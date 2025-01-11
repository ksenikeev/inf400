package ru.itis.inf400.lab15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //System.out.println(Pattern.matches("j\\D*a","java"));

/*
        String regex_email = "^[A-Za-z0-9+_.-]+@(.+)$";

        System.out.println(Pattern.matches(regex_email,"KSEnkeev@kpfu.ru"));
*/

        // 1. Компилируем регулярку
/*
        Pattern pattern = Pattern.compile("(java)+");
        // 2. создаем экземпляр Matcher для работы с текстом
        Matcher matcher = pattern.matcher("javajava");

        System.out.println(matcher.matches());
*/

        // Поиск по шаблону
        String str = "pascal java python java";
        Pattern pattern = Pattern.compile("j\\D+?a");
        Matcher matcher = pattern.matcher(str);


        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
