package Practice2;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Alisa", 'f', 33, 5, 100);
        Student st2 = new Student("Kate", 'f', 19, 2, 75);
        Student st3 = new Student("Denis", 'm', 34, 1, 30);
        Student st4 = new Student("Vadym", 'm', 39, 5, 95);
        Student st5 = new Student("Alex", 'm', 18, 1, 80);
        Student st6 = new Student("Nasty", 'f', 28, 3, 60);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students,60);
        System.out.println("--------------------------");
        info.printStudentsUnderAge(students,30);
        System.out.println("--------------------------");
        info.printStudentsMixCondition(students,20,75, 'f');

    }

    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
        for (Student s: al){
            if (s.avgGrade > grade){
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s: al) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
