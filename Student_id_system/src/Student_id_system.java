import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Student_id_system {

    public static void main(String[] args) {
        
        ArrayList<STUDENTS> studentList = new ArrayList<>();

        PROGRAMS softwareEng = new PROGRAMS(
                UUID.randomUUID(), 
                "SWE", 
                "Yazilim Muhendisligi", 
                null, 
                PROGRAMS.DegreeLevel.LISANS, 
                240, 
                4, 
                "EN", 
                true
        );

        
        STUDENTS student1 = new STUDENTS(
                UUID.randomUUID(),          
                "240504002",               
                "12345678910",             
                "Pinar Ayse",              
                "ASLAN",                   
                new Date(),                
                STUDENTS.Gender.KADIN,     
                "pinarayse.3913@gmail.com",
                "5462462646",              
                "Istanbul",                
                softwareEng,                
                2026,                       
                2,                          
                STUDENTS.Status.AKTIF,      
                "pinar_photo.jpg"           
        );

        studentList.add(student1);

        System.out.println("--- SISTEME KAYITLI OGRENCILER ---");
        for (STUDENTS s : studentList) {
            System.out.println(s.toString());
        }
    }
}