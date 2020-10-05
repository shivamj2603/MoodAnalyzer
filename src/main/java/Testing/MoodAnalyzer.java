package Testing;


public class MoodAnalyzer {
	private String message;
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	public String analyseMood() throws MoodAnalysisException,NullPointerException {
		String mood = "";
		try {
		if(message.isEmpty()){
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Empty,"Cannot provide Empty Mood");
		}
		else if(message.toLowerCase().contains("sad")) {
			mood = "SAD";
		}
		else {
		mood="HAPPY";
		}
		}
		catch(NullPointerException exception) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Null,"Cannot provide Null");
		}
		return mood;
	}


}
