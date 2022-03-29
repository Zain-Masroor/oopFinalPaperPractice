
public class Subject {
	
	private int code;
	private String department, name;
	public static int totalSubject = 0;
	public static int[] codeArray = new int[10];
	
	public Subject(int code, String department, String name) throws Exception{
		if(code <= 0) {
			throw new InvalidCodeException("Code must be a positive integer");
		}
		for(int i = 0; i < totalSubject; i++) {
			if(codeArray[i]==code) {
				throw new InvalidCodeException("Code already exists!");
			}
		}
		this.code = code;
		this.department = department;
		this.name = name;
		codeArray[totalSubject] = code;
		totalSubject++;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println("code = " + code + ", department = " + department + ", name = " + name);
	}

}
