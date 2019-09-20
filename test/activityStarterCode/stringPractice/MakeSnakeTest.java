package activityStarterCode.stringPractice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeSnakeTest {

    @Test
    public void mixedSsTest() {
        Assert.assertEquals("SSSnake sssoundsss", MakeSnake.makeSnake("Snake sounds"));
    }

    @Test
    public void emptyStringTest() {
        Assert.assertEquals("", MakeSnake.makeSnake(""));
    }
}
