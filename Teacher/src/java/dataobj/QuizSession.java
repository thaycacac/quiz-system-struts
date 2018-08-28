package dataobj;

import java.sql.Date;

/**
 *
 * @author Thaycacac
 */
public class QuizSession {

    private int id;
    private String code;
    private int quizId;
    private int startedBy;
    private Date startedDate;
    private Date endDate;
    private boolean isInProgress;
    private String titleQuiz;

    public QuizSession() {
    }

    public QuizSession(int id, String code, int quizId, int startedBy, Date startedDate, Date endDate, boolean isInProgress, String titleQuiz) {
        this.id = id;
        this.code = code;
        this.quizId = quizId;
        this.startedBy = startedBy;
        this.startedDate = startedDate;
        this.endDate = endDate;
        this.isInProgress = isInProgress;
        this.titleQuiz = titleQuiz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public int getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(int startedBy) {
        this.startedBy = startedBy;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isIsInProgress() {
        return isInProgress;
    }

    public void setIsInProgress(boolean isInProgress) {
        this.isInProgress = isInProgress;
    }

    public String getTitleQuiz() {
        return titleQuiz;
    }

    public void setTitleQuiz(String titleQuiz) {
        this.titleQuiz = titleQuiz;
    }
}
