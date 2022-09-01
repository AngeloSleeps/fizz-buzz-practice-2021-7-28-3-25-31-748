package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOf(int order) {
        StringBuilder word = new StringBuilder();
        if(order % 3 == 0) {
            word.append("Fizz");
        }
        return word.toString();
    }
}
