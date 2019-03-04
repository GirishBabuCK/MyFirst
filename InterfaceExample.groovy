class InterfaceExample {
   static void main(String[] args) {
      StudentInt st = new StudentInt();
      st.StudentID = 1;
      st.Marks1 = 10;
      println(st.DisplayMarks());
   } 
} 

interface MarksInt { 
   void DisplayMarks(); 
} 

class StudentInt implements MarksInt {
   int StudentID
   int Marks1;
	
   void DisplayMarks() {
      println(Marks1);
   }
}
