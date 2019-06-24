import java.util.ArrayList;

public class Question {
	private String question;
	private String correctAnswer;
	private ArrayList<String> answers;
	
	public Question (String[] ans) {
		this.question = ans[0];
		this.correctAnswer = ans[1];
		this.answers = new ArrayList<String>();
		this.answers.add(correctAnswer);
		for(int i=2;i<ans.length;i++) {
			this.answers.add(ans[i]);
		}
		
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}	
}
