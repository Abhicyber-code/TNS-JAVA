package com.getset.java;

public class StudentApp {

    // Inner class with getter and setter
    static class GetterSetter {
        private String studentName;
        private int rollNumber;

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }
    }

    // Main method
    public static void main(String[] args) {
        GetterSetter student = new GetterSetter();

        student.setStudentName("Abhijeet Gitte");
        student.setRollNumber(101);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
