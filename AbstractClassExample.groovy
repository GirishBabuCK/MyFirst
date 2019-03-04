class AbstractClassExample { 
   static void main(String[] args) { 
      StudentAb st = new StudentAb(); 
      st.StudentID = 1;
		
      st.Marks1 = 10; 
      st.person_name="Joe"; 
		
      println(st.person_name); 
      println(st.DisplayMarks()); 
   } 
} 

abstract class PersonAb { 
   public String person_name; 
   public PersonAb() { } 
   abstract void DisplayMarks();
}
 
class StudentAb extends PersonAb { 
   int StudentID 
   int Marks3; 
	
   public StudentAb() { 
      super(); 
   } 
	
   void DisplayMarks() { 
      println(Marks3); 
   }  
} 

