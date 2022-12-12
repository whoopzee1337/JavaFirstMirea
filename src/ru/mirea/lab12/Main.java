package ru.mirea.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern[] patterns = new Pattern[3];
        patterns[0] = Pattern.compile("\\d{2}.\\d{2} USD");
        patterns[1] = Pattern.compile("\\d{2}.\\d{2} RUB");
        patterns[2] = Pattern.compile("\\d{2}.\\d{2} EU");
        Matcher matcher;
        String s = "44.35 EU 31.21 RUB 12.21 USD";
        for (int i = 0; i < 3; i++) {
            matcher = patterns[i].matcher(s);
            if (matcher.find()) System.out.println(matcher.group());
        }

        Matcher matcher1;
        String z = "31.12.2005";
        Pattern patternDate = Pattern.compile("((0[1-9]|[12][0-9]|3[01]).(0[1-9]|1[012]).(19|[2-9][0-9])[0-9]{2})");
        matcher1 = patternDate.matcher(z);
        if (matcher1.matches()) {
            System.out.println("Дата действительна");
        } else throw new RuntimeException("Дата недействительна");

        Matcher matcher2;
        String email = "bigsmoke@gmail.com";
        Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+.$");
        matcher2 = patternEmail.matcher(email);
        if (matcher2.matches()){
            System.out.println("Email валиден");
        }else throw new RuntimeException("Email не валиден");




    }
}
