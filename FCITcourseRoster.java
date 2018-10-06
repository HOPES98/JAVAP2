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

    public String getCourseNumber() {
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
    //4.delete node
    public   void delete(int data) {
        head = delete(head, data);
    }
    //
    // LLnode | delete(LLnode, value)
    //

    private Student delete(Student head, int ID) {
        // only delete if the list is not empty
        if (!isEmpty()) {
            //when the target of delete is head
            if (head.getID()== ID) {
                head = head.getNext();
            } 
            else {
                // when its not the head by traversing with help pointer
                Student helpPtr = head;
                // Traverse to correct deletion point
                while (helpPtr.getNext() != null) {
                    if (helpPtr.getNext().getID() == ID) {
                        helpPtr.setNext(helpPtr.getNext().getNext());
                        break; //skipping the node to another to delete :)
                    }
                    helpPtr = helpPtr.getNext();
                }
            }
            // return the possibly updated head of the list
            return head;
        }
        return head;
    }
    //////////
    //5.insert node(add an new student node to the lot!)
    
    public void insert(String courseNum, int ID, String fName, String lName, double fGrade, char letterGrade) {
        head = insert(head, courseNum, ID, fName, lName, fGrade, letterGrade);
    }
    //
    // LLnode | insert(LLnode, value)
    //

    private Student insert(Student head,String courseNum, int ID, String fName, String lName, double fGrade, char letterGrade) {
        
        if (head == null || head.getID() > ID) {
            head = new Student(courseNum, ID, fName, lName, fGrade, letterGrade);// this node is going to be the head
            return head;
        } // insert the new node at the correct location
        else {
            // We need to traverse to the correct insertion location...so we need a help ptr
            Student helpPtr = head;
            // traverse to place in the correct spot
            while (helpPtr.getNext() != null) {
                if (helpPtr.getNext().getID()> ID) {
                    break;// when found break out of thr loop
                }
                helpPtr = helpPtr.getNext();
            }
            // create new node(when it is not the head). Set its next to the successor
            // And then make the predecessor node point to the new node
            Student newStudent = new Student(courseNum, ID, fName, lName, fGrade, letterGrade, helpPtr.getNext());
            helpPtr.setNext(newStudent);
        }
        // Return head
        return head;
    }
    ///////////////////////
    // find and return a specific node:
    public Student findNode(int data) {
        return findNode(head, data);
    }
    //
    // boolean | search(LLnode, int)
    //

    private Student findNode(Student p, int ID) {
        Student helpPtr = p;
        while (helpPtr != null) {
            if (helpPtr.getID()== ID) {
                return helpPtr;// if founed return that speceific help pointer
            }
            helpPtr = helpPtr.getNext();
        }
        return null;//if not return null
    }
    //////
    //printing nodes:
    public void PrintList() {
        PrintList(head);
    }
    //
    // void | PrintList(LLnode)
    //

    private void PrintList(Student head) {
        // We need to traverse...so we need a help ptr
        Student
                helpPtr = head;
        // Traverse to correct insertion point
        while (helpPtr != null) {
            // Print the data value of the node
            System.out.print(helpPtr.getLastName()+ ", ");
            // Step one node over   
            helpPtr = helpPtr.getNext();
        }
        System.out.println();
    }
            
            
    
    
    
    
   
    
    
    
    
       

}
