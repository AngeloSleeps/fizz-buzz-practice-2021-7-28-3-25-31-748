package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOf(int order) {
        StringBuilder word = new StringBuilder();
        if (isMultipleOfThree(order) && order % 5 == 0 && order % 7 == 0) {
            word.append(FIZZ)
                    .append(BUZZ)
                    .append(WHIZZ);
        }
        else if (isMultipleOfThree(order) && order % 5 == 0) {
            word.append(FIZZ)
                    .append(BUZZ);
        } else if (isMultipleOfThree(order) && order % 7 == 0) {
            word.append(FIZZ)
                    .append(WHIZZ);
        } else if (order % 5 == 0 && order % 7 == 0) {
            word.append(BUZZ)
                    .append(WHIZZ);
        } else if (order % 5 == 0) {
            word.append(BUZZ);
        } else if (order % 7 == 0) {
            word.append(WHIZZ);
        } else if (isMultipleOfThree(order)) {
            word.append(FIZZ);
        }
        return word.toString();
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }


}
