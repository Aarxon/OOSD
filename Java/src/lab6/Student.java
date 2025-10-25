package lab6;

public class Student extends Person
{
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String Address)
    {
        super(name, Address);
        this.numCourses = 0;
        this.courses = new String[10];
        this.grades = new int[10];
    }

    // add course and grade
    public void addCourseGrade(String course, int grade)
    {  
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // print all courses and grades
    public void printGrades()
    {
        for (int i = 0; i < numCourses; i++) 
        {
            System.out.println(courses[i] + ":" + grades[i]);
        }
    }

    // calculate average grade
    public double getAverageGrade()
    {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    @Override
    public String toString() 
    {
        return "Student: " + super.toString();
    }

    


}
