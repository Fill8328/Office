package fill.jma;


public class Offer {



    public int middleOffer(String department){
        int offerMid = 0;
        int count = 0;
       // System.out.println(Main.people().stream().toList().get(0).department);
        for (int i = 0; i < Main.people().size(); i++) {
            if (Main.people().stream().toList().get(i).department.equals(department)) {
                count++;
                offerMid += Main.people().stream().toList().get(i).offer;
            }
        }
        offerMid = offerMid/count;
        System.out.println(department + " mid offer is " + offerMid);
        return offerMid;
        }
}
