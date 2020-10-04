package Testing;


public class MoodAnalyzer {
	public String analyseMood(String message) {
		String mood = "";
		if(message.toLowerCase().contains("sad")) {
			mood = "SAD";
		}
		else {
			mood="HAPPY";
		}
		return mood;
	}
	
	
}
