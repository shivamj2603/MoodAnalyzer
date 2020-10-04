package Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {
	@Test
	void testAnalyseMood() {
		String mood = "Iam in Sad Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		assertEquals("SAD", moodAnalyzer.analyseMood());
	}

}
