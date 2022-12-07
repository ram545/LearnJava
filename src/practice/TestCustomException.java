package practice;

// class that uses custom exception CustomException
public class TestCustomException {

    // method to check the age
    public static void validate(int age) throws CustomException {
        if (age < 18) {

            // throw an object of user defined exception
            throw new CustomException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }
}
