import javax.sound.sampled.SourceDataLine;

public class aggregation {
    String name, section, SRN_NO, sem;
    aggregationconcept agg;

    aggregation(String name, String section, String SRN_NO, String sem, aggregationconcept agg) {
        this.name = name;
        this.section = section;
        this.SRN_NO = SRN_NO;
        this.sem = sem;
        this.agg = agg;

    }

    public void display() {
        System.out.println(
                "Name  : " + name + "\nSRN_ NO :" + SRN_NO + "\nSection : " + section + "\nsemester : " + sem);
        System.out.println("Adrress : " + agg.city + " , " + agg.state + " , " + agg.country);

    }

    public static void main(String[] args) {
        aggregationconcept A = new aggregationconcept("bangalore", "karnataka", "india");
        aggregationconcept B = new aggregationconcept("jaipur", "rajasthan", "india");
        aggregation C = new aggregation("PINTA RAM ", "F", " R21EF314", "|||", A);
        aggregation D = new aggregation("RAM", "F", "R21666", "|||", B);
        System.out.println("===================================================================================\n");
        C.display();
        System.out.println(
                "===============================================================================================\n");
        D.display();

    }

}
