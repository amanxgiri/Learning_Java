package college_lab.lab8;

import java.util.Scanner;

interface Series {
    int getNext();

    void reset();

    void setStart(int start);
}

class ByTwos implements Series {
    private int start;
    private int current;

    // Default constructor
    ByTwos() {
        start = 0;
        current = start;
    }

    // Parameterized constructor
    ByTwos(int start) {
        this.start = start;
        this.current = start;
    }

    @Override
    public int getNext() {
        int value = current;
        current += 2;
        return value;
    }

    @Override
    public void reset() {
        current = start;
    }

    @Override
    public void setStart(int start) {
        this.start = start;
        current = start;
    }

    void displayCurrentValue() {
        System.out.println("Current value: " + current);
    }
}

class Student {
    private int rollNum;
    private int marks;

    // Default constructor
    Student() {
        Scanner sc = new Scanner(System.in);
        getRollNum();
        getMarks();
    }

    // Parameterized constructor
    Student(int rollNum, int marks) {
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public void getRollNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNum = sc.nextInt();
    }

    public void putRollNum() {
        System.out.println("Roll Number: " + rollNum);
    }

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Academic Marks: ");
        marks = sc.nextInt();
    }

    public void putMarks() {
        System.out.println("Academic Marks: " + marks);
    }

    public int getMarksValue() {
        return marks;
    }
}

interface Sports {
    void putSportsScore();
}

class Result extends Student implements Sports {
    private int sportsScore;
    private int totalScore;

    // Default constructor
    Result() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextInt();
        calculateTotal();
    }

    // Parameterized constructor
    Result(int rollNum, int marks, int sportsScore) {
        super(rollNum, marks);
        this.sportsScore = sportsScore;
        calculateTotal();
    }

private void calculateTotal() {
        totalScore = getMarksValue() + sportsScore;