package Testing;


public class MoodAnalyzer {
	private String message;
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	public String analyseMood() throws MoodAnalysisException{
		String mood = "";
		if(message.toLowerCase().contains("sad")) {
			mood = "SAD";
		}
		else if(message.toLowerCase().contains("happy")) {
			mood = "HAPPY";
		}
		else {
			throw new MoodAnalysisException("Invalid Mood");
		}
		return mood;
	}
}
