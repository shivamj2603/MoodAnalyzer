package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void testAnalyseMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = "Iam in Sad Mood";
		assertEquals("SAD",moodAnalyzer.analyseMood(mood));
	}

}
