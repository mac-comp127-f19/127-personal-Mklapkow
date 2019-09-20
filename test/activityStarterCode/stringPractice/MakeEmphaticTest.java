package activityStarterCode.stringPractice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeEmphaticTest {

    @Test
    public void longStringTest() {
        Assert.assertEquals("EMPHASIS!!!", MakeEmphatic.makeEmphatic("emphasis"));
    }


    @Test
    public void shortStringTest() {
        Assert.assertEquals("I!!!", MakeEmphatic.makeEmphatic("i"));
    }

    @Test
    public void emptyStringTest() {
        Assert.assertEquals("!!!", MakeEmphatic.makeEmphatic(""));
    }
}
