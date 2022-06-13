package recap;

public class Son extends Father{

    private String job;

    public void hobbies(){
        System.out.println("Playing football!");
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString(){
        return "Name: "+this.getName()+"\nProperty: "+this.getProperty()+"\nJob: "+this.job;
    }
}
