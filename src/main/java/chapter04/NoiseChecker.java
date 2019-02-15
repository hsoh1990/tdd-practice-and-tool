package chapter04;

public class NoiseChecker {
    public SoundType checkDecibel(INoise noise) {
        int noiseValue = noise.sound();
        if (noiseValue == 0) {
            return SoundType.MUTE;
        } else if (noiseValue > 0 && noiseValue < 10) {
            return SoundType.SILENT;
        } else if (noiseValue >= 10 && noiseValue < 100) {
            return SoundType.NOISY;
        } else if (noiseValue >= 100) {
            return SoundType.LOUD;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
