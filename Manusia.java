// Manusia.java
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvjadul = (TelevisiJadul) perangkat;
            System.out.println("Nyalakan televisi jadul dengan input: " + tvjadul.getModelInput());
            System.out.println("Voltase televisi: " + tvjadul.getVoltase());
        }
        else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvmodern = (TelevisiModern) perangkat;
            System.out.println("Nyalakan televisi modern dengan input: " + tvmodern.getModelInput());
            System.out.println("Voltase televisi: " + tvmodern.getVoltase());
        }
        else {
            System.out.println("Menyalakan perangkat elektronik umum. Voltase: " + perangkat.getVoltase());
        }
    }
}