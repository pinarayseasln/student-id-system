import java.util.UUID;

public class PROGRAMS {

    
    public enum DegreeLevel {
        ONLISANS,
        LISANS,
        YUKSEK_LISANS,
        DOKTORA
    }

    
    private UUID id;
    private String code;
    private String name;
    
    
    private DEPARTMENTS department; 
    
   
    private DegreeLevel degreeLevel;
    
    private int totalCredits;
    private int durationYears;
    private String language; 
    private boolean isActive;

    
    public PROGRAMS(UUID id, String code, String name, DEPARTMENTS department, DegreeLevel degreeLevel, 
                   int totalCredits, int durationYears, String language, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.department = department;
        this.degreeLevel = degreeLevel;
        this.totalCredits = totalCredits;
        this.durationYears = durationYears;
        this.language = language;
        this.isActive = isActive;
    }

    
    public PROGRAMS() {
    }

    
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DEPARTMENTS getDepartment() { return department; }
    public void setDepartment(DEPARTMENTS department) { this.department = department; }

    public DegreeLevel getDegreeLevel() { return degreeLevel; }
    public void setDegreeLevel(DegreeLevel degreeLevel) { this.degreeLevel = degreeLevel; }

    public int getTotalCredits() { return totalCredits; }
    public void setTotalCredits(int totalCredits) { this.totalCredits = totalCredits; }

    public int getDurationYears() { return durationYears; }
    public void setDurationYears(int durationYears) { this.durationYears = durationYears; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

   
    @Override
    public String toString() {
        return "Program{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", degreeLevel=" + degreeLevel +
                ", durationYears=" + durationYears +
                '}';
    }
}