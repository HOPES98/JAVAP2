/* ////////////////////////////////////////
 * //NAME: AMAL ABDULRAHAMAN AHEMD       //
 * //COURSE NUMBER: CPCS204              //
 * //SECTION:GBR                         //
 * //ID: 1705113                         //
 * //TITLE: KAU GRADE BOOK (Linked Lists)//
 * //DATE SEPTEMBER 15TH, 2018           //
 */////////////////////////////////////////
package fcitgradeboook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author hopes
 */
public class FCITgradeBoook {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws FileNotFoundException {
        // Open file and check if it exists or not
        File inputFile = new File("input.txt");
        if (!inputFile.exists()) {
            System.out.println("this file does not exist");
            System.exit(0);
        }

        //Create Scanner for input file
        Scanner input = new Scanner(inputFile); //create PrintWriter to print on the output file.
        PrintWriter output = new PrintWriter("output.txt");
        output.println("Welcome to the FCIT Grade Book.");
        output.println();

        //start reading file and store data:
        int numCourses = input.nextInt();//the length of the array
        FCITcourseRoster[] courses = new FCITcourseRoster[numCourses];


        //Loop to create FCITcourse roaster objs:
        output.println("The following course(s) have been added to the database:");
        for (int i=0; i<numCourses; i++) {
        String courseNum = input.next();
        courses[i] = new FCITcourseRoster(); courses[i].setCourseNumber(courseNum);
            output.println(courses[i].getCourseNumber());
        }// end of for loop
        output.println();
        //loop over student and make commands.
        while (input.hasNext()) {

            switch (input.next()) {
                case "ADDRECORD": {
                   addRecord(input, output, courses);
                }break;

                case "SEARCHBYID": {
                   //searchStudentsByID(input, output, students);
                }break;
                        
                case "DELETERECORD": {
                   deleteRecord(input, output, courses);
                }break;
                case "SEARCHBYNAME": {
                    //searchStudentsByName(input, output, students);
                }
                case "DISPLAYSTATS": {
                   // displayStatistics(input, output, students, courseName, instructorFirstName, instructorLastName);
                }
                case "QUIT": {
                    //output.print("Thank you for using the KAU Grade Book."
                      //      + "/nGoodBye.");
                   //close files
                    

                }

            }

        }
        input.close();
        output.close();
        courses[1].PrintList();
        System.out.println(courses[0].getCourseNumber());
    }


public static void  addRecord(Scanner input, PrintWriter output, FCITcourseRoster [] courses){
        String course = input.next();
        int id = input.nextInt();
        String fName = input.next();
        String lName = input.next();
        int firstExam = input.nextInt();
        int secondExam = input.nextInt();
        int finalExam = input.nextInt();

//2 . calculate and save the final grade of student:
        double fGrade = (firstExam * 0.3) + (secondExam * 0.3) + (finalExam * 0.4);

//3 . determine the lettetr grade
        char letterGrade = getLetterGrade(fGrade);

//4 .  make a new Student object to add.
        //5 .now we insert the new student in the correct course number:
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getCourseNumber().equalsIgnoreCase(course)) {
                courses[i].insert(course, id, fName, lName, fGrade, letterGrade);
                output.println("Command: ADDRECORD");
                output.println("\t\t" + fName + " " + lName + " (ID# " + id + ") has been added to " + course);
                output.print("\t\tHis final grade is " + fGrade + " (" + letterGrade + ")");
                output.println();

            }
        }
    }
/////////////////
public static void deleteRecord(Scanner input, PrintWriter output, FCITcourseRoster [] courses){
    output.println("Command: DELETERECORD");
    String targetID = input.next();
    int targetIDInt = Integer.parseInt(targetID);//did double identifying becaus it was making mismatch exception
    Student target = courses[1].findNode(111);
    output.println(target.getFirstName());
   
//    for (int i = 0; i < courses.length; i++) {
//        target = courses[i].findNode(targetIDInt);
//        if(target == null)
//            continue;
//        output.println("\t\t"+target.getFirstName()+" "+ target.getLastName()+" (ID# "+target.getID()+") has been deleted from "+courses[i]);
//        courses[i].delete(targetIDInt);
//
//    }
//}
}

public static char getLetterGrade(double fGrade) {
        //1. determin the letter grade of the student from their final
        //numerical grade(Standard Scale) then return letter Grade
        if (fGrade > +90) {
            //aCount++;
            return 'A';

        } else if ((fGrade < 90) && (fGrade >= 80)) {
           // bCount++;
            return 'B';

        } else if ((fGrade < 80) && (fGrade >= 70)) {
           // cCount++;
            return 'C';

        } else if ((fGrade < 70) && (fGrade >= 60)) {
            //dCount++;
            return 'D';

        } else {
           // fCount++;
            return 'F';
        }

    }
}
    

