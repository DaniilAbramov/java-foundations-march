package final_mode;

public class MusicShop {
    public static void main(String[] args) {
        HeadPhones airPods = new HeadPhones(true,"Vitalik");
        HeadPhones philips = new HeadPhones(false,"Margo");


        System.out.println("HeadPhones.MINIMUM_VOLUME = " + HeadPhones.MINIMUM_VOLUME);
    }
}
