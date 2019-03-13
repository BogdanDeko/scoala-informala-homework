package Exercitiul2;

 class Implementations implements Temperature {

     private double bodyTemp;

     public double getTempInCelsius(double farenheit) {
         try {
             if (farenheit <= 98.6) {
                 return ((farenheit - 32.0) * 5) / 9;
             } else {
                 throw new IllegalArgumentException("You are ill!");
             }
         } catch (Exception e) {
             System.out.println("Enter valid temperature");
         }
         return this.bodyTemp;
     }
 }