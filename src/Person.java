public class Person {
    private String name;
    private int old;
    private String sex;
    private boolean maritalStatus;

    public Person(){

    }
    public Person(String name, int old){
        this.name = name;
        this.old = old;
    }
    public Person(String name, int old, String sex, boolean maritalStatus) {
        this.name = name;
        this.old = old;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
    }
    public Person(String name, int old, String sex){
        this.name = name;
        this.old = old;
        this.sex = sex;
    }
    public String toString(){
        return this.name + " " + this.old + " " + this.sex + " " + this.maritalStatus;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setOld(int old){
        this.old = old;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setMaritalStatus(boolean maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    public String getName(){
        return name;
    }
    public int getOld(){
        return old;
    }
    public String getSex(){
        return sex;
    }
    public boolean getMaritalStatus(){
        return maritalStatus;
    }
}
