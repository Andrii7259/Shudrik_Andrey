package com.company;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //����� ��'���� ����� Student
        Student[] s = new Student[3];
        System.out.println("������ ��������� ������� �������� \n����� ����� (��'� ���� ������ ����), �������� Enter");
        //�������� ��������� ��'���� ������
        Student Tom = new Student("Tom", 179, 199, 4);
        while (true){
            try{
                for (int i = 0; i < s.length; i++) {
                    s[i] = new Student(in.next(), in.nextInt(), in.nextInt(), in.nextInt());

                }break;

            }catch (Exception e){
                System.out.println("������ ��� ���������� ����.");

            }
        }
        //������ ��'��� ��� ����������� ��������� �����
        Student s1;
        //����������� ����������

        //���������� �� ����������
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (j != s.length - 1) {
                    if (s[j].getHeight() > s[j + 1].getHeight()) {
                        s1 = s[j + 1];
                        s[j + 1] = s[j];
                        s[j] = s1;
                    }
                }
            }
        }
        System.out.println("������, ������������\n�� ���������� ������:");
        for (Student student : s) {
            System.out.println(student.getName() + "\t" + student.getHeight() + " ��;");
        }

        System.out.println("\n������, ������������\n�� ��������� ������ ���:");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (j != s.length - 1) {
                    if (s[j].getZnoMark() < s[j + 1].getZnoMark()) {
                        s1 = s[j + 1];
                        s[j + 1] = s[j];
                        s[j] = s1;
                    }
                }
            }
        }
        for (Student student : s) {
            System.out.println(student.getName() + "\t" + student.getZnoMark() + " ����;");
        }
        System.out.println("��� ������ ������" + " " + Tom.visitLections(17) + " " + "����.");
    }
}
