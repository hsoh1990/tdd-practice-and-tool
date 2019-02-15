package chapter04;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NoiseCheckerTest {

    @Test
    public void testSound_MUTE() throws Exception {
        final INoise noise = mock(INoise.class);
        final int MUTE = 0;
        when(noise.sound()).thenReturn(MUTE);

        NoiseChecker checker = new NoiseChecker();
        assertThat(checker.checkDecibel(noise), is(SoundType.MUTE));
        verify(noise).sound();
    }

    @Test
    public void testSound_NOISY() throws Exception {
        final INoise noise = mock (INoise.class);
        final int NOISY_SOUND = 11;
        when (noise.sound()).thenReturn(NOISY_SOUND);

        NoiseChecker checker = new NoiseChecker();
        assertThat (checker.checkDecibel(noise), is (SoundType.NOISY ));
        verify(noise).sound();
    }
}