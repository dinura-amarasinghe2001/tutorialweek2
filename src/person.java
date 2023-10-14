public class person {
    private String name;
    private String surname;
    private int age;

    /* Constructor - Create a new instance of Person */
    public person(String n){
        name = n;
    }

    // display the name
    public void displayName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
