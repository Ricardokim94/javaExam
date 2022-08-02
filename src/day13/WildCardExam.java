package day13;

import java.util.Arrays;

public class WildCardExam {
	
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : ");
		System.out.println(Arrays.toString(course.getStudents()));
		for(int i=0; i<= course.getStudents().length; i++) {
			if(course.getStudents()[i] != null) {
			Person p = (Person)course.getStudents()[i];
			System.out.println(p.getName() + ", ");
		}}}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : ");
		System.out.println(Arrays.toString(course.getStudents()));
		for(int i=0; i<= course.getStudents().length; i++) {
			if(course.getStudents()[i] != null) {
			Student p = (Student)course.getStudents()[i];
			System.out.println(p.getName() + ", ");
		}}}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : ");
		System.out.println(Arrays.toString(course.getStudents()));
		for(int i=0; i<= course.getStudents().length; i++) {
			if(course.getStudents()[i] != null) {
			Worker p = (Worker)course.getStudents()[i];
			System.out.println(p.getName() + ", ");
		}}}
		

	
	public static void main(String[] args) {
	//와일드 카드 : ?
	//Course<?>
	//Course<? extends 최상위 타입>
	//Course<? super 부모클래스타입>
	
		Course<Person> PersonCourse = new Course<Person>("일반인과정", 5);
		PersonCourse.add(new Person("일반인"));
		PersonCourse.add(new Worker("직장인"));
		PersonCourse.add(new Student("학생"));
		PersonCourse.add(new HighStudent("고등학생"));

		registerCourse(PersonCourse);
		
		Course<Student> PersonCourseStudent = new Course<Student>("학생과정", 5);
//		PersonCourseStudent.add(new Person("일반인"));
//		PersonCourseStudent.add(new Worker("직장인"));
		PersonCourseStudent.add(new Student("학생"));
		PersonCourseStudent.add(new HighStudent("고등학생"));

		registerCourseStudent(PersonCourseStudent);
		
		Course<Worker> PersonCourseWorker = new Course<Worker>("학생과정", 5);
//		PersonCourseStudent.add(new Person("일반인"));
		PersonCourseWorker.add(new Worker("직장인"));
//		PersonCourseWorker.add(new Student("학생"));
//		PersonCourseWorker.add(new HighStudent("고등학생"));
		
		registerCourseWorker(PersonCourseWorker);
	}}






