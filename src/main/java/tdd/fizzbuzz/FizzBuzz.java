package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    public String countOf(int order) {
        StringBuilder word = new StringBuilder();
        if(order % 3 == 0 && order % 5 == 0) {
            word.append(FIZZ)
                    .append(BUZZ);
        } else if (order % 3 == 0 && order % 7 == 0) {
            word.append(FIZZ)
                    .append(WHIZZ);
        } else if (order % 5 == 0) {
            word.append(BUZZ);
        } else if (order % 7 == 0) {
            word.append(WHIZZ);
        } else if (order % 3 == 0) {
            word.append(FIZZ);
        }
        return word.toString();
    }
}
