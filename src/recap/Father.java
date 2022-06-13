package recap;

public class Father {

    //1. directly assign value to the var
    //2. using const
    //3. using setters -> encapsulation

    private String name; //default
    private String property;

    public void doBusiness() {
        System.out.println("Gold business!");
    }

    //setters
    //init the field variables
    public void setName(String name) {
        this.name = name;
    }

    //getter
    //access the values of field variables
    public String getName() {
        return this.name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String toString() {
        return "name: " + this.name + "\nproperty: " + this.property;
    }

}