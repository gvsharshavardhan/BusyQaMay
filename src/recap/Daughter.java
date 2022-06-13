package recap;

public class Daughter extends Father{

    private String skill;

    public String toString(){
        return "Name: "+this.getName()+
                "\nProperty: "+
                this.getProperty()+
                "\nskill: "+this.skill;
    }

    public void cooking(){
        System.out.println("can cook all dishes!");
    }
}
