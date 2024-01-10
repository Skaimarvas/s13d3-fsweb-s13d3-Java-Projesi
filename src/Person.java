public class Person {

    public static void main(String[] args) {

        Person person1 = new Person("Chris", "Brown", 20);
        Person person2 = new Person("Harold", "Smile", 40, "Afyon", true, "222-555");

        System.out.println("*****NewPersonSameOldMistakes*******");
        System.out.println("PERSON1 FIRSTNAME: " + person1.getFirstName());
        System.out.println("PERSON1 LASTNAME: " + person1.getLastName());
        System.out.println("PERSON1 AGE: " + person1.getAge());
        System.out.println("*****NewPersonSameOldMistakes*******");
        System.out.println("PERSON2 FIRSTNAME: " + person2.getFirstName());
        System.out.println("PERSON2 LASTNAME: " + person2.getLastName());
        System.out.println("PERSON2 AGE: " + person2.getAge());
        System.out.println("PERSON2 ADRESS: " + person2.getAdress());
        System.out.println("PERSON2 PHONENUMBER: " + person2.getPhoneNumber());
        System.out.println("PERSON2 ISWORKING: " + person2.isWorking());

    }

    String firstName;
    String lastName;
    int age;
    String adress;
    boolean isWorking;

    String phoneNumber;

    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public Person (String firstName, String lastName, int age,String adress,boolean isWorking, String phoneNumber){
        this(firstName,lastName,age);
        this.adress = adress;
        this.isWorking = isWorking;
        this.phoneNumber = phoneNumber;
    }
    //getter metotlar
    public  String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <=19;
    }

    public boolean isWorking(){
        return isWorking;
    }
    public String getAdress(){
        return adress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
