package lab6;

public class Teacher extends Person
{
    private int numCourses;
    private String[] courses;

    // set up teacher with empty course list
   public Teacher(String name, String Address)
    {
        super(name, Address);
        this.courses = new String[10];
        this.numCourses = 0;
    }

    // add a course
    public boolean addCourse(String course)
    {  
        if(course == null)
        {
            return false;
        }

        if(numCourses < courses.length)
        {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
        return false;
    }

    // remove a course
    public boolean removeCourse(String course)
    {
        if(course == null)
        {
            return false;
        }

        for(int i = 0; i < numCourses; i++)
        {
            if(courses[i].equals(course))
            {
                for(int j = i; j < numCourses - 1; j++)
                {
                    courses[j] = courses[j + 1];
                }
                courses[numCourses - 1] = null;
                numCourses --;
                return true;
            }
        }   
        return false;
    }

    public String toString() 
    {
        return "Teacher: " + super.toString();
    }
}
