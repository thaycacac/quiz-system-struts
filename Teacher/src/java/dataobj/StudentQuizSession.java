package dataobj;

/**
 *
 * @author Thaycacac
 */
public class StudentQuizSession {
    private int id;
    private int quizSessionId;
    private int studentId;

    public StudentQuizSession() {
    }

    public StudentQuizSession(int id, int quizSessionId, int studentId) {
        this.id = id;
        this.quizSessionId = quizSessionId;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuizSessionId() {
        return quizSessionId;
    }

    public void setQuizSessionId(int quizSessionId) {
        this.quizSessionId = quizSessionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
}
