package model;
public class Kubus {
        public int s = 0;
        public final double b = 6.0;
        public void luasKubus(){

            System.out.println("Sisi = " +s+ "cm");
            double luas = b*Math.pow(s, 2);
            System.out.println("Maka Luas Kubus = "+luas+"cm");
        
      }
}