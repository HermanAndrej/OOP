package people;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public int getAge(){
        return this.age;
    }

    public String getCountry(){
        return this.country;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCountry(String country){
        this.country = country;
    }

    @Override
    public String toString() {
        return name + "\n " + address;
    }
}
