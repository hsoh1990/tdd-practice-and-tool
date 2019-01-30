package chapter02;

import org.junit.Test;

import static chapter02.IsNotANumber.notANumber;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IsNotANumberTest {

    @Test
    public void testSquareRootOfMinusOneIsNotANumber() {
        assertThat(Math.sqrt(-1), is(notANumber()));
    }

}