package com.kn.bean;

public class Student {

		int  id;
		String name;
		int marks;	

	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	
		public Student(int id, String name, int marks) {
			this.id = id;
			this.name = name;
			this.marks = marks;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
		}

	

}
