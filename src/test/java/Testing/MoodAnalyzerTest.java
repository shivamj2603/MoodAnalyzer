package Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {
	@Test
	void testAnalyseMood() {
		String mood = "Iam in Happy Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		assertEquals("HAPPY", moodAnalyzer.analyseMood());
	}

}
