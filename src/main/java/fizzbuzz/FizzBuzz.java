package fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int index) {
        String fizzBuzz = "";
        boolean dividableByThree = ((index % 3) == 0);
        boolean dividableByFive = ((index % 5) == 0);

        if (dividableByThree) fizzBuzz += "Fizz";
        if (dividableByFive) fizzBuzz += "Buzz";
        if (!dividableByFive && !dividableByThree) {
            fizzBuzz = String.valueOf(index);
        }
        return fizzBuzz;
    }
}
