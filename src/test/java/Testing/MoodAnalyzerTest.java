package Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {
	@Test
	public void testAnalyseMood() {
		String mood = "Iam in Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		try {
			assertEquals("HAPPY", moodAnalyzer.analyseMood());
		}
		catch(MoodAnalysisException e) {
			System.out.println(e);
		}
	}

	
}
