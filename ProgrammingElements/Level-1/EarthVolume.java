public class EarthVolume {
    public static void main(String[] args) {
        int r=6378;
        double vol=(4/3)*3.14*r*r*r;
        double miles=vol*1.6;
        System.out.print("The volume of earth in cubic kilometers is " + vol + " and cubic miles is" + miles);
    }
}
