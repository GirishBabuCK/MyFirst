class InterfaceExample {
   static void main(String[] args) {
      StudentInt st = new StudentInt();
      st.StudentID = 1;
      st.Marks1 = 10;
      println(st.DisplayMarks());
   } 
} 

interface MarksInt { 
   void DisplayMarksInt(); 
} 

class StudentInt implements MarksInt {
   int StudentID
   int Marks1;
	
   void DisplayMarksInt() {
      println(Marks1);
   }
}
