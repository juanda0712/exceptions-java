package checkedException.person;

public class Person {

    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) throws Exception {
        if (age <= 0 ){
            throw new Exception("La edad debe ser positiva...");
        }
        this.age = age;
    }
}
