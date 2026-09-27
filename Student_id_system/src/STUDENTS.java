import java.util.UUID;
import java.util.Date;

public class STUDENTS {

    
    public enum Gender {
        KADIN,
        ERKEK,
        DIGER
    }

    public enum Status {
        AKTIF,
        MEZUN,
        ASKI,
        AYRILDI
    }

    
    private UUID id;
    private String studentNo;  
    private String nationalId; 
    private String firstName;
    private String lastName;
    private Date birthDate;
    
    private Gender gender;    
    private String email;
    private String phone;
    private String address;
    
   
    private PROGRAMS program;   
    
    private int enrollmentYear;
    private int classYear;     
    
    private Status status;     
    
    private String photoUrl;
    private Date createdAt;

   
    public STUDENTS(UUID id, String studentNo, String nationalId, String firstName, String lastName, 
                   Date birthDate, Gender gender, String email, String phone, String address, 
                   PROGRAMS program, int enrollmentYear, int classYear, Status status, String photoUrl) {
        this.id = id;
        this.studentNo = studentNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.program = program;
        this.enrollmentYear = enrollmentYear;
        this.classYear = classYear;
        this.status = status;
        this.photoUrl = photoUrl;
        this.createdAt = new Date(); 
    }

    
    public STUDENTS() {
    }

   
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getStudentNo() { return studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public PROGRAMS getProgram() { return program; }
    public void setProgram(PROGRAMS program) { this.program = program; }

    public int getEnrollmentYear() { return enrollmentYear; }
    public void setEnrollmentYear(int enrollmentYear) { this.enrollmentYear = enrollmentYear; }

    public int getClassYear() { return classYear; }
    public void setClassYear(int classYear) { this.classYear = classYear; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public String getPhotoUrl() { return photoUrl; }
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    
    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + firstName + " " + lastName + '\'' +
                ", program=" + (program != null ? program.getName() : "Atanmadi") +
                ", classYear=" + classYear +
                ", status=" + status +
                '}';
    }
}