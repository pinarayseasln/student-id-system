import java.util.UUID;

public class COURSES {

   
    public enum CourseType {
        ZORUNLU,
        SECMELI,
        ASD
    }

    
    private UUID id;
    private String code;         
    private String name;
    
    
    private DEPARTMENTS department; 
    
    private int credits;         
    private int theoryHours;     
    private int labHours;        
    
    private CourseType courseType;
    
    private String language;     
    private String description;  
    private boolean isActive;

   
    public COURSES(UUID id, String code, String name, DEPARTMENTS department, int credits, 
                  int theoryHours, int labHours, CourseType courseType, String language, 
                  String description, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.department = department;
        this.credits = credits;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.courseType = courseType;
        this.language = language;
        this.description = description;
        this.isActive = isActive;
    }

    
    public COURSES() {
    }

    
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DEPARTMENTS getDepartment() { return department; }
    public void setDepartment(DEPARTMENTS department) { this.department = department; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public int getTheoryHours() { return theoryHours; }
    public void setTheoryHours(int theoryHours) { this.theoryHours = theoryHours; }

    public int getLabHours() { return labHours; }
    public void setLabHours(int labHours) { this.labHours = labHours; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    
    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", type=" + courseType +
                '}';
    }
}