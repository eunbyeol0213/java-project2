package com.example.javaproject2.codeup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}
public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    //addAStudent() 에서만 사용되기때문에 private
    private boolean isExist(Student pStudent){
        //중복 여부 체크
        for (Student student : students){
            if (pStudent.getTestId() == student.getTestId()) return  true;
        }
        return false;
    }

    public void addAStudent(Student student){
        //중복 체크한 후 삽입
        if (!isExist(student)){
            students.add(student);
        }
    }

    //명단 출력
    public void printStudents(){
        for(Student student : students){
            System.out.printf("%s %d %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    //코드가 'D'이면 해당 수험번호를 찾아 삭제
    //코드가 'D'이고 해당 수험번호가 존재하지 않으면 아무 작업 하지 않는다
    //수험 번호가 존재하면 삭제
    public void deleteStudent(Student pStudent){
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }


    public void process(Student pStudent){
        switch (pStudent.getCode()){
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }
    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");

        CodeUp3108 codeUp3108 = new CodeUp3108();
        Student student = codeUp3108.makeStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        codeUp3108.process(student);
        codeUp3108.printStudents();


        //코드가 'I' 이면 수험번호 순서에 맞게 삽입
        //이미 존재하는 수험 번호이면 아무 작업도 하지않는다
    }
}
