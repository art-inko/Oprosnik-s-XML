package oprosnik;

public class Question {

    private String questionText;
    private String[] allAnswers;
    private int chosenAnswerID = 0;
    private int rightAnswerID;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionItself) {
        this.questionText = questionItself;
    }

    public String[] getAllAnswers() {
        return allAnswers;
    }

    public void setAllAnswers(String[] allAnswers) {
        this.allAnswers = allAnswers;
    }

    public int getChosenAnswerID() {
        return chosenAnswerID;
    }

    public void setChosenAnswerID(int chosenAnswerID) {
        this.chosenAnswerID = chosenAnswerID;
    }

    public boolean checkRightAnswer() {
        if (chosenAnswerID == rightAnswerID & chosenAnswerID != 0) {
//            System.out.println("Верный ответ");
            return true;
        } else {
//            System.out.println("Неверный ответ");
            return false;
        }
    }

    public int getRightAnswerID() {
        return rightAnswerID;
    }

    public void setRightAnswerID(int rightAnswerID) {
        this.rightAnswerID = rightAnswerID;
    }

    
    
}
