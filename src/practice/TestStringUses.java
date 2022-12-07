package practice;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class TestStringUses {
        public void testStrings(){
        String s1 = "Geeks", s2 = "Docks";
        String s3 = new String("Normal");
        String s4 = new String("Tone it Down");
        System.out.println(s2.toLowerCase());
        System.out.println(s4.toUpperCase());
        System.out.println(s2.concat(s4));
        s3 = s3.concat("Bills");
        System.out.println(s4.charAt(4));
        System.out.println(s4.length());
        String s5 = s4.substring(4,8);
        System.out.println(s5 + " " + s5.trim());
        System.out.println(s4.indexOf('o'));
        System.out.println(s4.lastIndexOf('n'));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.replace('l','n'));
    }

    // String Buffers and String Builders have no visible difference
    // until threading is involved.
    public void testStringBuffers(){
        StringBuffer s = new StringBuffer("Normal");
        s.append("Nutella");
        s.append("Brownie");
        s.append("Cookie");
        s.insert(0,"5 ");
        s.delete(20,26);
        System.out.println(s + " " + s.charAt(5));
        System.out.println(s.capacity());
        s.ensureCapacity(50);
        System.out.println(s.capacity());
        s.replace(2,9,"Cringe");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.codePointBefore(5)+ " " + s.codePointCount(0,15));
    }

    public void testStringTokenizer(){
            int count,i = 0;
            StringTokenizer s = new StringTokenizer("post:dictum:parsum:rooster",":");
            while(s.hasMoreTokens()){
                System.out.println(s.nextToken());
            }
            StringTokenizer s1 = new StringTokenizer("post:dictum:parsum:rooster",":",true);
            while(s1.hasMoreElements()){
                System.out.println(s1.nextElement());
            }
            StringTokenizer s2 = new StringTokenizer("post dictum parsum rooster ");
            count = s2.countTokens();
            while(i++ < count){
                System.out.println(s2.nextToken());
            }
    }

    public void testStringJoiner(){
            StringJoiner s = new StringJoiner(",");
            s.add("Raiden");
            s.add("Shogun");
            StringJoiner s1 = new StringJoiner("::");
            s1.add("Kozuko");
            s1.add("Oden");
            s.merge(s1);
            System.out.println(s);
    }
}
