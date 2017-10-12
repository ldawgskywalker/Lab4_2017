
public class StudentList {
	private List<Student> students;
	
	public StudentList() {
		students = new List<Student>();
	}
	
	public void add(Student stu) {
		students.add(stu);
	}
	
	public boolean isEmpty() {
		return students.isEmpty();
	}
	
	public boolean contains(Student stu) {
		return students.contains(stu);
	}
	
	public Student first() {
		return students.first();
	}
	
	public Student next() {
		return students.next();
	}
	
	public void enumerate() {
		students.enumerate();
	}
	
	public void remove(Student stu) {
		students.remove(stu);
	}
	public void sameMajor(String maj) {
		Student curr = students.first();
		while(curr!=null) {
			if(curr.getMajor().equals(maj))
				System.out.println(curr.toString());
			
			curr=students.next();
		}
	}
	
	public void sameFac(String fac) {
		Student curr = students.first();
		while(curr!=null) {
			if(curr.getMajor().equals(fac))
				System.out.println(curr.toString());
			
			curr=students.next();
		}
	}
	
	public Student search(String id) {
		
		Student curr = students.first();
		while(curr!=null) {
			//if finds student with correct id
			if(curr.getStuid().equals(id))
				return curr;
			
			curr=students.next();
		}
		//if does not find student with correct id
		return null;
		
		
	}

}
