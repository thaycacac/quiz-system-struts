package servlet;

import dal.QuestionDAO;
import dal.StudentQuizAnswerDAO;
import dataobj.Question;
import dataobj.Quiz;
import dataobj.QuizSession;
import dataobj.Student;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thaycacac
 */
public class ProgressQuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        Quiz quiz = (Quiz) session.getAttribute("quiz");
        Student student = (Student) session.getAttribute("student");
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");

        StudentQuizAnswerDAO sqad = new StudentQuizAnswerDAO();
        ArrayList<Integer> listDone = sqad.getListIDQuestion(student.getId(), quizSession.getId(), quiz.getId());
        
        QuestionDAO qd = new QuestionDAO();
        ArrayList<Question> listNotDone = qd.getListQuestionNotDone(quiz.getId(), listDone);
        
        session.setAttribute("listQus", listNotDone);
        request.getRequestDispatcher("/student/quiz.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
