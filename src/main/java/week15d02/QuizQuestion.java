package week15d02;

public class QuizQuestion {

    private String question;
    private String answer;
    private int score;
    private String topic;

    public QuizQuestion(String question, String answer, int score, String topic) {
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "QuizQuestions{" +
                " Kérdés: '" + question + '\'' +
                ", Válasz: '" + answer + '\'' +
                ", Pontszám: '" + score + '\'' +
                ", Téma: '" + topic + '\'' + " " +
                '}';
    }
}