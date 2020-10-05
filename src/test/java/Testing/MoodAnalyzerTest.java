package Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {
	@Test
	public void givenMoodSad_shouldReturn_Sad() {
		String mood = "Iam in Sad Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		assertEquals("SAD", moodAnalyzer.analyseMood());
	}
	@Test
	public void givenMoodOtherThanSad_shouldReturn_Happy() {
		String mood = "Iam in Happy Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		assertEquals("HAPPY", moodAnalyzer.analyseMood());
	}
	@Test
	public void givenNull_shouldReturn_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		assertEquals("HAPPY", moodAnalyzer.analyseMood());
	}


}
