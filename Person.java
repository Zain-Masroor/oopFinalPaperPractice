
public class Person {

	 String name;
	 int age;
	 float cgpa;
	
	public Person(String name, int age, float cgpa){
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Person)) {
			return false;
		}
		if(this == null) {
			return false;
		}
		Person p = (Person) obj;
		return this.name == p.name && this.age == p.age;
	}
	
	public String compare(Object obj) {
		Person c = (Person) obj; 
		if(this.cgpa == c.cgpa) {
			return "same";
		}else if(this.cgpa > c.cgpa) {
			return "more than";
		}else
			return "less than";
	}
	
}
