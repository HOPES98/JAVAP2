/* ////////////////////////////////////////
 * //NAME: AMAL ABDULRAHAMAN AHEMD       //
 * //COURSE NUMBER: CPCS204              //
 * //SECTION:GBR                         //
 * //ID: 1705113                         //
 * //TITLE: KAU GRADE BOOK WITH FILE I/O //
 * //DATE SEPTEMBER 15TH, 2018           //
 */////////////////////////////////////////
package fcitgradeboook;

/**
 *
 * @author hopes
 */
public class FCITcourseRoster {

    private Student head;
    private String courseNumber;

    //operations methods:
    public boolean isEmpty() {
        return head == null;
    }

    //////////

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    private String getCourseNumber() {
        return courseNumber;
    }

    //////////
    //2.search the by id
    public boolean searchID(int id) {
        return searchID(head, id);
    }

    private boolean searchID(Student p, int search) {
        Student helpPtr = p;
        while (helpPtr != null) {
            if (helpPtr.getID() == search) {
                return true;
            }
            helpPtr = helpPtr.getNext();
        }
        return false;
    }
    
    ////////
    //3. search by Name:
   public boolean searchName(int id) {
        return searchID(head, id);
    }

    private boolean searchName(Student p, int search) {
        Student helpPtr = p;
        while (helpPtr != null) {
            if (helpPtr.getID() == search) {
                return true;
            }
            helpPtr = helpPtr.getNext();
        }
        return false;
    } 
    /////////
    //4.find node: looks like it is not needed atm
    //////////
    //5.inser node(add an new student node to the lot!)
    
    public void insert(int newStudentID){//change and modify
    head = insert(head, newStudentID);
    }
    
    private Student insert(Student head, int newStudentID ){
    //if there is no list then this node will be the first
        if(head ==null || head.getID()> newStudentID){
            head = new Student(newStudentID);
            return head;
        }
        else{//(that there exists a list) insert it at the right location:
            Student pointer = head;//help pointer to traverse
            //now we will traverse the nodes for the correct location:
            while(pointer.getNext()!=null){
                if(pointer.getNext().getID()>newStudentID){
                    //so the correct location is found
                break;
                }
                pointer = pointer.getNext();//means correct location is still not found
        
        }// end of while loop, now is time to make the next node point to its successor
         //while the predessessor is ointing the  new node!
        Student newStudent = new Student(newStudentID);
        pointer.setNext(newStudent);
        }
        return head;
    }
    
    
    
   
    
    
    
    
       

}
