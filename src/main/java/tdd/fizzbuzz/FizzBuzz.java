package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOf(int order) {
        StringBuilder word = new StringBuilder();

        if (isMultipleOfThree(order))
            word.append(FIZZ);
        if (isMultipleOfFive(order))
            word.append(BUZZ);
        if (isMultipleOfSeven(order))
            word.append(WHIZZ);

        return word.toString();
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfSeven(int number) {
        return number % 7 == 0;
    }
}
