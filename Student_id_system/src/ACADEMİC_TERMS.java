import java.util.UUID;
import java.util.Date;

public class ACADEMİC_TERMS {

    public enum Semester {
        GUZ,
        BAHAR,
        YAZ
    }

    private UUID id;
    private String code;        
    private String name;        
    private String academicYear; 
    
    private Semester semester;  
    
    private Date startDate;
    private Date endDate;
    private Date registrationStart;
    private Date registrationEnd;
    private Date addDropEnd;
    
    private boolean isActive;

    
    public ACADEMİC_TERMS(UUID id, String code, String name, String academicYear, Semester semester, 
                        Date startDate, Date endDate, Date registrationStart, Date registrationEnd, 
                        Date addDropEnd, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.academicYear = academicYear;
        this.semester = semester;
        this.startDate = startDate;
        this.endDate = endDate;
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;
        this.addDropEnd = addDropEnd;
        this.isActive = isActive;
    }

    
    public ACADEMİC_TERMS() {
    }

    
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }

    public Semester getSemester() { return semester; }
    public void setSemester(Semester semester) { this.semester = semester; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public Date getRegistrationStart() { return registrationStart; }
    public void setRegistrationStart(Date registrationStart) { this.registrationStart = registrationStart; }

    public Date getRegistrationEnd() { return registrationEnd; }
    public void setRegistrationEnd(Date registrationEnd) { this.registrationEnd = registrationEnd; }

    public Date getAddDropEnd() { return addDropEnd; }
    public void setAddDropEnd(Date addDropEnd) { this.addDropEnd = addDropEnd; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

   
    @Override
    public String toString() {
        return "AcademicTerm{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                ", isActive=" + isActive +
                '}';
    }
}