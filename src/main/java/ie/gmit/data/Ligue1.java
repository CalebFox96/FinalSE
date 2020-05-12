package ie.gmit.data;

public class Ligue1 extends Ticket{
    private String Ligue1;

    public Ligue1() {
        super();
        Ligue1 = "";
        count++;
    }


    public void setLigue1(String Ligue1) {
        this.Ligue1 = Ligue1;
    }

    public String getLigue1() {
        return Ligue1;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Ligue1;
    }
}
