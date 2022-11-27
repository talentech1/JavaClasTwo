package com.tech.four;

public class ClassRoom {
	int roomNumber;
	int seats;
	int availableSeats;
	
	Student[] students = new Student[10];
	// [null][null][null]
	
	public ClassRoom(int roomNumber, int seats) {
		this.roomNumber = roomNumber;
		this.seats = seats;
		this.availableSeats = seats;
	}
	
	public void addStudent(Student student) {
		availableSeats = availableSeats - 1;
		
		for(int i = 0; i <seats; i++ ) {
			if(students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	
	public void printRoomInfo() {
		System.out.println(roomNumber);
		System.out.println(seats);
		System.out.println(availableSeats);
		System.out.println("--------------------");
	}
	
	public void printStudents() {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				break;
			}else {
				students[i].printInfo();
				System.out.println("----------");
			}
		}
	}
	

}
