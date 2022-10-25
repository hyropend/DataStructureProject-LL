public class StudentNode {

    private int no;
    private String name;
    private String surName;
    int vise;
    int fin;
    double avarage;
    String situation;
    StudentNode next;

    public StudentNode(int no, String name, String surName, int vise, int fin){
        this.no=no;
        this.name=name;
        this.surName=surName;
        this.vise=vise;
        this.fin=fin;
        avarage=vise*0.4+fin*0.6;
        if(avarage>=50)
            situation="passed";
        else
            situation="fail";
        next=null;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getVise() {
        return vise;
    }

    public void setVise(int vise) {
        this.vise = vise;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
