package dataobj;

import java.util.ArrayList;

/**
 *
 * @author Thaycacac
 */
public class ResultRecord {
    
    private int id;
    private int questionId;
    private int studentId;
    private String name;
    private double process;
    ArrayList<Boolean> listAns;

    public ResultRecord() {
    }

    public ResultRecord(int id, int questionId, int studentId, String name, double process, ArrayList<Boolean> listAns) {
        this.id = id;
        this.questionId = questionId;
        this.studentId = studentId;
        this.name = name;
        this.process = process;
        this.listAns = listAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProcess() {
        return process;
    }

    public void setProcess(double process) {
        this.process = process;
    }

    public ArrayList<Boolean> getListAns() {
        return listAns;
    }

    public void setListAns(ArrayList<Boolean> listAns) {
        this.listAns = listAns;
    }

   
}
