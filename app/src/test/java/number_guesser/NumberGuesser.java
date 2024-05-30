package number_guesser;

public class NumberGuesser {
    int number;

    public NumberGuesser(int number) {
        this.number = number;
    }

    public String guess(Integer guessedNumber) {
        if (guessedNumber < this.number) {
            return "higher";
        } else if (guessedNumber > this.number) {
            return "lower";
        } else {
            return "correct";
        }
    }
}
