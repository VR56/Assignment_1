class Student{
	private String Name;
	private String Enrollment_Number;
	private String Stream;

	public String getName()
	{
		return Name;
	}

	public String getEnrollment_Number()
	{
		return Enrollment_Number;
	}

	public String getStream()
	{
		return Stream;
	}

	public void setName(String Name)
	{
		this.Name=Name;
	}

	public void setEnrollment_Number(String Enrollment_Number)
	{
		this.Enrollment_Number=Enrollment_Number;
	}

	public void setStream(String Stream)
	{
		this.Stream=Stream;
	}
}

class main
{
	public static void main(String[] args) {
		
		Student Student1=new Student();
		Student1.setName("VISHAL");
		Student1.setEnrollment_Number("SWW12111");
		Student1.setStream("CSE");
		System.out.println(Student1.getName());
		System.out.println(Student1.getEnrollment_Number());
		System.out.println(Student1.getStream());
	}
}