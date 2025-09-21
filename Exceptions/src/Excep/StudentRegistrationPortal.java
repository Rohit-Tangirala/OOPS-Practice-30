package Excep;
import java.util.Scanner;
public class  StudentRegistrationPortal {

    // Custom Exception for full course
    static class CourseFullException extends Exception {
        public CourseFullException(String message) {
            super(message);
        }
    }

     private String courseName;
    private int maxSeats;
    private int currentSeats;
    public  void CourseRegistration(String courseName, int maxSeats) {
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.currentSeats = 0;
    }

    // Register method
    public void register() throws CourseFullException {
        if (currentSeats < maxSeats) {
            currentSeats++;
            System.out.println("Registered successfully for " + courseName + ". Seats filled: " + currentSeats + "/" + maxSeats);
        } else {
            throw new CourseFullException(" Registration failed! " + courseName + " is already full.");
        }
    }

    public static void main(String[] args) {
        CourseRegistration javaCourse = new CourseRegistration("Java Programming", 2);

        try {
            javaCourse.register(); 
            javaCourse.register(); 
            javaCourse.register(); 
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        }
    }
}
