package Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {
	@Test
	public void givenMoodSad_shouldReturn_Sad() {
		String mood = "Iam in Sad Mood";
		String resultMood = "";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		try{
			resultMood = moodAnalyzer.analyseMood();
		}
		catch(MoodAnalysisException exception) {
			exception.printStackTrace();
		}
		assertEquals("SAD", resultMood);
	}
	@Test
	public void givenMoodOtherThanSad_shouldReturn_Happy() {
		String mood = "Iam in Happy Mood";
		String resultMood = "";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(mood);
		try{
			resultMood = moodAnalyzer.analyseMood();
		}
		catch(MoodAnalysisException exception) {
			exception.printStackTrace();
		}
		assertEquals("HAPPY", resultMood);
	}
	@Test
	public void givenNull_shouldReturn_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> moodAnalyzer.analyseMood());
		assertEquals(exception.getType() ,MoodAnalysisException.ExceptionType.Null);
	}
	@Test
	public void givenNull_shouldThrow_MoodAnalysisException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> moodAnalyzer.analyseMood());
		assertEquals(exception.getType() ,MoodAnalysisException.ExceptionType.Null);
	}
	@Test
	public void givenEmpty_shouldThrow_MoodAnalysisException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> moodAnalyzer.analyseMood());
		assertEquals(exception.getType() ,MoodAnalysisException.ExceptionType.Empty);
	}


}
