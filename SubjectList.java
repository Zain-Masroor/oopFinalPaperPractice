import java.util.ArrayList;
import java.util.List;

public class SubjectList {

	public List<Subject> subjects;
	
	public SubjectList() {
		subjects = new ArrayList<Subject>();
	}
	
	  public void addSubject(Subject s){
		    subjects.add(s);
		  }
		  public void removeSubject(Subject s){
		    subjects.remove(s);
		  }
		  public void display(){
		    System.out.println("The list of subjects is : ");
		    for(Subject s : subjects){
		      s.display();
		    	}
		    
		    	
		  }
}