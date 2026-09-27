import java.util.UUID;

public class COURSE_PREREQUİSİTES {

    
    public enum PrerequisiteType {
        ZORUNLU,
        ONERILEN
    }

    
    private UUID id;
    
    
    private COURSES course;             
    private COURSES prerequisiteCourse; 
    
    private PrerequisiteType type;     
    
    private String minGrade;          

   
    public COURSE_PREREQUİSİTES(UUID id, COURSES course, COURSES prerequisiteCourse, 
                              PrerequisiteType type, String minGrade) {
        this.id = id;
        this.course = course;
        this.prerequisiteCourse = prerequisiteCourse;
        this.type = type;
        this.minGrade = minGrade;
    }

    
    public COURSE_PREREQUİSİTES() {
    }

    
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public COURSES getCourse() { return course; }
    public void setCourse(COURSES course) { this.course = course; }

    public COURSES getPrerequisiteCourse() { return prerequisiteCourse; }
    public void setPrerequisiteCourse(COURSES prerequisiteCourse) { this.prerequisiteCourse = prerequisiteCourse; }

    public PrerequisiteType getType() { return type; }
    public void setType(PrerequisiteType type) { this.type = type; }

    public String getMinGrade() { return minGrade; }
    public void setMinGrade(String minGrade) { this.minGrade = minGrade; }

    
    @Override
    public String toString() {
        return "CoursePrerequisite{" +
                "course=" + (course != null ? course.getCode() : "Yok") +
                ", prerequisite=" + (prerequisiteCourse != null ? prerequisiteCourse.getCode() : "Yok") +
                ", type=" + type +
                ", minGrade='" + minGrade + '\'' +
                '}';
    }
}