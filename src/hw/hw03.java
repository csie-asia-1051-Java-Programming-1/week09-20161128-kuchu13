package hw;

import java.util.ArrayList;
import java.util.Scanner;


/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 105021033 黃苡珊
 */
public class hw03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add(new Student("David", "1899"));
		studList.add(new Student("Jack", "1085"));
		studList.add(new Student("Keven", "1985"));
		studList.get(0).showInfo();
		studList.get(0).addCourse("程式1", "1050807");
		studList.get(0).showInfo();
	}
}

class Student {

	private String id, name;
	private ArrayList<Course> CouList = new ArrayList<Course>();

	public Student(String name1, String id1) {
		name = name1;
		id = id1;
	}

	public void showInfo() {
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("# of Course:" + CouList.size());
		for (int i = 0; i < CouList.size(); i++) {
			System.out.println("Course name:" + CouList.get(i).getName());
			System.out.println("Course id:" + CouList.get(i).getID());
		}
	}

	public void addCourse(String name1, String id1) {
		CouList.add(new Course(name1, id1));
	}
}

class Course {
	private String couName, couID, teacher;
	private int score;

	public Course(String name1, String id1) {
		couName = name1;
		couID = id1;
	}

	public String getName() {
		return couName;
	}

	public String getID() {
		return couID;
	}
}
