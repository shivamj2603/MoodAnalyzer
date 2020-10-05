package Testing;


public class MoodAnalysisException extends Exception {
	enum ExceptionType {
		Null,Empty,InvalidMood;
	}
	public ExceptionType type; 
	public ExceptionType getType() {
		return this.type;
	}
	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
