package Testing;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		String mood = "";
		if(message.toLowerCase().contains("happy")) {
			mood = "Happy Mood";
		}
		else{
			mood = "Sad Mood";
		}
		return mood;
	}
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyseMood("This is an happy message");
		System.out.println(mood);
	}

}
