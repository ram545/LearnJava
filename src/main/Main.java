package main;

import practice.*;

public class Main {

    public static void main(String[] args) {
//        new DataTypes().dataTypes();
//        new Operators().callAllOperators();
//        TestStringUses tsu = new TestStringUses();
//        tsu.testStrings();
//        tsu.testStringBuffers();
//        tsu.testStringTokenizer();
//        tsu.testStringJoiner();
        new Regex().checkRegexPattern();
        try
        {
            // calling the method
            new TestCustomException().validate(13);
        }
        catch (CustomException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }
    }
}


