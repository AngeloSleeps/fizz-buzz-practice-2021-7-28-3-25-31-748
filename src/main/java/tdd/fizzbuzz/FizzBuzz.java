package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    public String countOf(int order) {
        StringBuilder word = new StringBuilder();
        if(order % 3 == 0) {
            word.append(FIZZ);
        } else if (order % 5 == 0) {
            word.append(BUZZ);
        }
        return word.toString();
    }
}
