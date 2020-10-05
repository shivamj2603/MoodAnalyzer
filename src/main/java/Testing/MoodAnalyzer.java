package Testing;


public class MoodAnalyzer {
	private String message;
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	public String analyseMood() {
		String mood = "";
		try {
			if(message.toLowerCase().contains("sad")) {
				mood = "SAD";
			}
			else {
				mood = "HAPPY";
			}
		}
		catch(NullPointerException exception) {
			return "HAPPY";
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		return mood;
	}


}
