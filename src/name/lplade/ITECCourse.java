package name.lplade;

import java.util.ArrayList;

//can be 'package-private' (default scope)
class ITECCourse {

	private String name;
	private int code;
	private ArrayList<String> students;
	private int maxStudents;
	private String room;

	//legacy version for backwards compatibility with existing code with no room number
	//no fourth parameter
	ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
		name = courseName;
		code = courseCode;
		maxStudents = courseMaxStudents;
		students = new ArrayList<String>();
		room = "UNDEF";

	}

	//constructor -- no return type
	//fourth parameter = room number
	ITECCourse(String courseName, int courseCode, int courseMaxStudents, String roomNumber) {
		name = courseName;
		code = courseCode;
		maxStudents = courseMaxStudents;
		students = new ArrayList<String>();
		room = roomNumber;

	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int newcode) {
		code = newcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	void addStudents(String studentName) {
		if (students.size() == maxStudents) {
			System.out.println("Sorry, course is full");
		} else {
			students.add(studentName);
		}

	}

	int getNumberOfStudents() {
		return students.size();
	}

	int getFreeSpaces(){
		//should we use getter method here?
		return maxStudents - students.size();

	}

	void removeStudent(String name) {
		if (students.contains(name)) {
			students.remove(name);
		}

	}

}
