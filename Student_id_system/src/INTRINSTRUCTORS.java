import java.util.UUID;
import java.util.Date;


public class INTRINSTRUCTORS {
    
   
public enum Title {
    OGRETIM_GOREVLISI,
    DOKTOR,
    DOKTOR_OGRETIM_UYESI,
    DOCENT_DOKTOR,
    PROFESOR_DOKTOR
}

    
    private UUID id;
    private String employeeNo; 
    private String nationalId; 
    private String firstName;
    private String lastName;
    private String email;
    
    
    private Title title; 
    
    private String specialization; 
    private Date hireDate;         
    private boolean isActive;

   
    private DEPARTMENTS department; 

    
    public INTRINSTRUCTORS(UUID id, String employeeNo, String nationalId, String firstName, String lastName, Title title, DEPARTMENTS department) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.department = department;
        this.hireDate = new Date(); 
        this.isActive = true;       
    }

    public INTRINSTRUCTORS() {
    }

    
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getEmployeeNo() { return employeeNo; }
    public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Title getTitle() { return title; }
    public void setTitle(Title title) { this.title = title; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    public DEPARTMENTS getDepartment() { return department; }
    public void setDepartment(DEPARTMENTS department) { this.department = department; }

    
    @Override
    public String toString() {
        return "Instructor{" +
                "employeeNo='" + employeeNo + '\'' +
                ", name='" + firstName + " " + lastName + '\'' +
                ", title=" + title +
                ", isActive=" + isActive +
                '}';
    }
}