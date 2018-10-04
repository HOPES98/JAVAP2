/* ////////////////////////////////////////
 * //NAME: AMAL ABDULRAHAMAN AHEMD       //
 * //COURSE NUMBER: CPCS204              //
 * //SECTION:GBR                         //
 * //ID: 1705113                         //
 * //TITLE: KAU GRADE BOOK (Linked Lists)//
 * //DATE SEPTEMBER 15TH, 2018           //
 */////////////////////////////////////////
package fcitgradeboook;

/**
 *
 * @author hopes
 */
public class Student {
  private String courseNumber;
  private int ID;
  private String firstName;
  private String lastName;
  private int[]examGrades;
  private double finalGrade;
  private char letterGrade;
  private static int numStudents;
  private Student next;
  
  //constructor:
  public Student(String courseNumber, int ID, String firstName, String lastName, double finalGrade, char letterGrade){
    this. courseNumber = courseNumber;
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.finalGrade = finalGrade;
    }

    Student(int ID) {
        this.ID = ID;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getExamGrades() {
        return examGrades;
    }

    public void setExamGrades(int examGrades,int index) {
        this.examGrades[index] = examGrades;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public static void setNumStudents(int numStudents) {
        Student.numStudents = numStudents;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
  
  
    
}

