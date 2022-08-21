package interview;

//class of patients having 4 fields , filter based on the disease and on age as well, find average bill amount
public class Patient {

    //fields
    private String name;
    private int age;
    private String disease;
    private int amount;

    //default constructor
    public Patient() {

    }
//parameterised constructor
    public Patient(String name, int age, String disease, int amount) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.amount = amount;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //tostring method

    @Override
    public String toString() {
        return "interview.Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", amount=" + amount +
                '}';
    }
}
