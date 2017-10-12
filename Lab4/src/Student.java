
public class Student {
	
	private String fname, lname, email, major, fac, stuid;
	
	public Student(String fn, String ln, String em, String ma, String fa, String si) {
		fname = fn;
		lname = ln;
		email = em;
		major = ma;
		fac	  = fa;
		stuid = si;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getFac() {
		return fac;
	}

	public void setFac(String fac) {
		this.fac = fac;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String toString() {
		return stuid+"\t"+fname+" "+lname+"\t"+email+"\t"+major+"\t"+fac;
	}
	
	
}
