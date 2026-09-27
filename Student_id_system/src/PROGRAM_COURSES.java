import java.util.UUID;

public class PROGRAM_COURSES {

    
    public enum CourseType {
        ZORUNLU,
        SECMELI
    }

   
    private UUID id;
    
  
    private PROGRAMS program; 
    private COURSES course;
    
    private int semesterOrder;     
    private CourseType courseType; 
    private boolean isActive;

   
    public PROGRAM_COURSES(UUID id, PROGRAMS program, COURSES course, int semesterOrder, 
                         CourseType courseType, boolean isActive) {
        this.id = id;
        this.program = program;
        this.course = course;
        this.semesterOrder = semesterOrder;
        this.courseType = courseType;
        this.isActive = isActive;
    }

    
    public PROGRAM_COURSES() {
    }

   
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public PROGRAMS getProgram() { return program; }
    public void setProgram(PROGRAMS program) { this.program = program; }

    public COURSES getCourse() { return course; }
    public void setCourse(COURSES course) { this.course = course; }

    public int getSemesterOrder() { return semesterOrder; }
    public void setSemesterOrder(int semesterOrder) { this.semesterOrder = semesterOrder; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    
    @Override
    public String toString() {
        return "ProgramCourse{" +
                "program=" + (program != null ? program.getName() : "Yok") +
                ", course=" + (course != null ? course.getCode() : "Yok") +
                ", semesterOrder=" + semesterOrder +
                ", type=" + courseType +
                '}';
    }
}