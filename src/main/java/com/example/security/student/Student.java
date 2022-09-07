package com.example.security.student;

public class Student {
    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studeneName) {
        this.studentId = studentId;
        this.studentName = studeneName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student { " +
                "studentID= " + studentId +
                ", studentName='" + studentName + '\'' + '}';
    }
}
