package com.company;
// ��������� ����� Student
public class Student {
    //���������� ��������� �����
    public String name;
    public int height;
    public int znoMark;
    public int grade;
    public int visitLections(int times){
        return times;
    }

    //���� � �����������
    public Student(String name, int height, int znoMark, int grade) {
        super();
        this.name = name;
        this.height = height;
        this.znoMark = znoMark;
        this.grade = grade;
    }

    //��������� ��������� ������
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getZnoMark() {
        return znoMark;
    }
    public int getGrade() { return grade; }
}
