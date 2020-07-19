 

/**
 * The LabClass class represents an enrollment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 */
public class LabClass
{
    private String instructor;
    private String room;
    private String timeAndDay;
   // private ArrayList<Student> students;
    private Student[] students;
    private int currentEnrollCount;
    
    private int capacity;
 
    
    /**
     * Create a LabClass with a maximum number of enrollments. All other details
     * are set to default values.
     */
    public LabClass(int maxNumberOfStudents)
    {
        instructor = "unknown";
        room = "unknown";
        timeAndDay = "unknown";
        students = new Student[maxNumberOfStudents];
        
        capacity = maxNumberOfStudents;
        currentEnrollCount = 0;
    }

    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student newStudent)
    {
        if(currentEnrollCount == capacity) {
            System.out.println("The class is full, you cannot enroll.");
        }
        else {
            students[currentEnrollCount] = newStudent;
            currentEnrollCount++;
        }
        
 }
    
    /**
     * Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents()
    {
        return students.length;
    	 
    }
    
    /**
     * Set the room number for this LabClass.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * Set the time for this LabClass. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    /**
     * Set the name of the instructor for this LabClass.
     */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }
    
    /**
     * Print out a class list with other LabClass details to the standard
     * terminal.
     */
    public void printList()
    {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + "   Room: " + room);
        System.out.println("Class list:");
        for(int i = 0; i < currentEnrollCount; i++) {
            students[i].print();
        }
        System.out.println("Number of students: " + numberOfStudents());
    }
}
