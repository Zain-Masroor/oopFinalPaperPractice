import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			
		//ElectricityBillCalculator ebc2020 = new ElectricityBill2020();
		ElectricityBillCalculator ebc2021 = new ElectricityBill2021();
		
		
		/*
		 * CalculateElectricityBill ceb2020 = new CalculateElectricityBill(ebc2020);
		 * double eb20 = ceb2020.calculateBill2020Discount();
		 * System.out.println("Your calculated bill = " + String.format("%.1f", eb20));
		 */
		
		
		
		  CalculateElectricityBill ceb2021 = new CalculateElectricityBill(ebc2021);
		  double eb21 = ceb2021.calculateBill2021Discount();
		  System.out.println("Your calculated bill = " + String.format("%.1f", eb21));
		 
		
		
		
		/*
		 * Room room1 = new Room("Bed", 2, 15, 22, "Glass"); Room room2 = new
		 * Room("dining", 2, 20, 40, "Wood"); Room room3 = new Room("class", 1, 25, 38,
		 * "Concrete"); Room room4 = new Room("IT", 1, 38, 25, "Concrete"); Room room5 =
		 * new Room("Cabin", 2, 44, 58, "Concrete");
		 * 
		 * String print = ""; print = (room1.equals(room2))?"room 1 and room 2 are same"
		 * :"room 1 and room 2 are different"; System.out.println(print);
		 * 
		 * print = (room3.equals(room4))?"room 3 and room 4 are same"
		 * :"room 3 and room 4 are different"; System.out.println(print);
		 * 
		 * print = room1.compare(room2); System.out.println("room1 is " + print +
		 * " compared to room2"); print = room3.compare(room5);
		 * System.out.println("room3 is " + print + " compared to room5");
		 * 
		 * 
		 * List<Room> rooms = new ArrayList<>(); rooms.add(room1); rooms.add(room2);
		 * rooms.add(room3); rooms.add(room4); rooms.add(room5);
		 * 
		 * for(Room r: rooms) { System.out.println(r); }
		 * 
		 * 
		 * System.out.println("Original Room1 -> " + room1); room1.resize(10, 15);
		 * System.out.println("Resized room1 -> " + room1); room1.resize(room2);
		 * System.out.println("Resized room1 pt2-> " + room1);
		 */
	
		/*
		 * Person p1 = new Person("ham", 23, 3.42F); Person p2 = new Person("sam", 23,
		 * 3.78F); System.out.println(p1.equals(p2)); System.out.println(p1.name
		 * +" has cgpa " + p1.compare(p2) + " " + p2.name);
		 */
		
		/*
		 * SubjectList myList = new SubjectList(); Subject s1 = new
		 * Subject(101,"CSE","DBMS"); Subject s2 = new Subject(102,"CSE","JAVA");
		 * Subject s3 = new Subject(103,"CSE","C++"); Subject s4 = new
		 * Subject(104,"CSE","IOT"); Subject s5 = new Subject(105,"CSE","DCCN");
		 * myList.addSubject(s1); myList.addSubject(s2); myList.addSubject(s3);
		 * myList.addSubject(s4); myList.addSubject(s5);
		 * System.out.println("After adding 5 subjects to the SubjectList.");
		 * myList.display();
		 */
		   
		
		}	
	}
	

	



/*
 * ArrayList<Integer> number = new ArrayList<>(); int sum = 0, average = 0;
 * for(int i = 1; i < 6; i++) { System.out.print("Enter number " + i + " = ");
 * int num = new Scanner(System.in).nextInt(); number.add(num); }
 * 
 * 
 * for(int k = 0; k < number.size(); k++) { sum += number.get(k); }
 * 
 * for(int j = 0; j < number.size(); j++) { average = sum/number.size(); }
 * 
 * System.out.print("Elements = " + number); Collections.sort(number);
 * System.out.print("\nElements (Sorted) = " + number);
 * System.out.println("\nSum = " + sum + "\nAverage = " + average);
 */
