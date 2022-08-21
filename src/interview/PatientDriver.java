package interview;

import interview.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientDriver {
    public static void main(String[] args) {

        //adding details

        Patient p1=new Patient("p1",24,"cancer",45000);
        Patient p2=new Patient("p2",22,"corona",28000);
        Patient p3=new Patient("p3",34,"corona",32000);
        Patient p4=new Patient("p4",20,"fever",10000);
        Patient p5=new Patient("p5",18,"typhoid",12000);
        Patient p6=new Patient("p6",29,"corona",43000);


        //arrays as list
        List<Patient> patientList= Arrays.asList(p1,p2,p3,p4,p5,p6);

        //filter those patients who are suffering from corona
        patientList.stream().filter(p -> p.getDisease().equals("corona")).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        //filter the corona patients based on their age , whose age is less than 25

        patientList.stream().filter(p -> p.getDisease().equals("corona") && p.getAge() <25).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");


        //find average bill-amount of corona patient
    Double averageBillpaid =  patientList.stream().filter(p -> p.getDisease().equals("corona")).collect(Collectors.averagingDouble(Patient::getAmount));
        System.out.println("Average Bill paid " +averageBillpaid);
    }
}
