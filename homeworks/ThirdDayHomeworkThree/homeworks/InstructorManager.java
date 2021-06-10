package homeworks;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.course + "isimli kurs eklendi");
	}
	public void deletedCourse(Instructor instructor) {
		System.out.println(instructor.course + "isimli kurs silindi");
	}
}
