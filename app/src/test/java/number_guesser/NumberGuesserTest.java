package number_guesser;

import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test
    public void testGuessingTooLowReturnsHigher() {
        NumberGuesser game = new NumberGuesser(10);
        // note that the expected value comes first
        // if it helps, imagine Yoda saying "higher, it should be"
        Assert.assertEquals("higher", game.guess(5));
    }

    @Test
    public void testGuessingTooHighReturnsLower() {
        NumberGuesser game = new NumberGuesser(10);
        // note that the expected value comes first
        // if it helps, imagine Yoda saying "higher, it should be"
        Assert.assertEquals("lower", game.guess(15));
    }

    @Test
    public void testGuessingCorrectlyReturnsCorrect() {
        NumberGuesser game = new NumberGuesser(10);
        // note that the expected value comes first
        // if it helps, imagine Yoda saying "higher, it should be"
        Assert.assertEquals("correct", game.guess(10));
    }
}
