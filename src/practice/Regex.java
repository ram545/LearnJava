package practice;
import java.lang.System;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {

    public static void checkRegexPattern(){
        String s = "Where there is a will there is a way, desperate times call for desperate measures way";
        Pattern p = Pattern.compile("t[a-z]{4}");
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println("The Expression was found from position " + m.start() + " to " + (m.end()-1));
        }

    }
}
