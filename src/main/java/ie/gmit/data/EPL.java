package ie.gmit.data;

public class EPL extends Ticket {

    private String epl;

    public EPL() {
        super();
        epl = "";
        count++;
    }

    public void setEpl(String epl) {
        this.epl = epl;
    }

    public String getEpl() {
        return epl;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + epl;
    }
}
