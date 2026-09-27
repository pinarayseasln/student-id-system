import java.util.UUID;

public class DEPARTMENTS {
    
    private UUID id;
    private String code;
    private String name;
    
    private FACULTİES faculty; 
    private INTRINSTRUCTORS headInstructor;
    
    private String phone;
    private String email;
    private boolean isActive;

    
    public DEPARTMENTS(UUID id, String code, String name, FACULTİES faculty, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.faculty = faculty;
        this.isActive = isActive;
    }
  
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public FACULTİES getFaculty() { return faculty; }
    public void setFaculty(FACULTİES faculty) { this.faculty = faculty; }

    public INTRINSTRUCTORS getHeadInstructor() { return headInstructor; }
    public void setHeadInstructor(INTRINSTRUCTORS headInstructor) { this.headInstructor = headInstructor; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}