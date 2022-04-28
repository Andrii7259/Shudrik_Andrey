package com.company;

// Створюємо класс Student
public class Student {
    //Ініціалізуємо параметри класу
    public String name;
    public float height;
    public float znoMark;
    public int grade;

    public Student(String name) {
        super();
        this.name = name;
    }

    //Параметри задаєються окремо
    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getZnoMark() {
        return znoMark;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setZnoMark(float znoMark) {
        this.znoMark = znoMark;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
