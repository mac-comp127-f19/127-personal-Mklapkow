package activityStarterCode.stringPractice;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UppercaseFirstLetterTest {

    @Test
    public void uppercaseStringTest() {
        Assert.assertEquals("Uppercase", UppercaseFirstLetter.uppercaseFirstLetter("Uppercase"));
    }

    @Test
    public void longStringTest() {
        Assert.assertEquals("Uppercase", UppercaseFirstLetter.uppercaseFirstLetter("uppercase"));
    }

    @Test
    public void shortStringTest() {
        Assert.assertEquals("A", UppercaseFirstLetter.uppercaseFirstLetter("a"));
    }

    @Test
    public void emptyStringTest() {
        Assert.assertEquals("", UppercaseFirstLetter.uppercaseFirstLetter(""));
    }

    @Test
    public void sameLetterTest() {
        Assert.assertEquals("Eeee", UppercaseFirstLetter.uppercaseFirstLetter("eeee"));
    }

}
