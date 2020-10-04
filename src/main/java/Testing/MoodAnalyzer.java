package Testing;


public class MoodAnalyzer {
	private String message;
	public MoodAnalyzer(String message){
		this.message = message;
	}
	public String analyseMood() {
		String mood = "";
		if(message.toLowerCase().contains("sad")) {
			mood = "SAD";
		}
		return mood;
	}
	
	
}
