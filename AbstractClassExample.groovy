class AbstractClassExample { 
   static void main(String[] args) { 
      StudentAb st = new StudentAb(); 
      st.StudentIdentity = 1;
		
      st.Marks1 = 10; 
      st.name="Joe"; 
		
      println(st.name); 
      println(st.DisplayMarks()); 
   } 
} 

abstract class PersonAb { 
   public String name; 
   public PersonAb() { } 
   abstract void DisplayMarks();
}
 
class StudentAb extends PersonAb { 
   int StudentIdentity 
   int Marks1; 
	
   public StudentAb() { 
      super(); 
   } 
	
   void DisplayMarks() { 
      println(Marks1); 
   }  
} 

