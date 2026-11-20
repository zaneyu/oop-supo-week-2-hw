class Person{
    private final String firstName,lastName;
    Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
    public String toString(){
        return lastName+","+firstName;
    }
}
public class Sol7{
    public static void main(String args[]){
        Person p = new Person("Joe","Bloggs");
        System.out.println("Person details: " + p);
    }
}