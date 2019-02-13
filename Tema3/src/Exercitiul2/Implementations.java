package Exercitiul2;

 class Implementations implements Temperature {

     private double bodyTemp;

     public double getTempInCelsius(double farenheit) {
         if (farenheit <= 98.6) {
             return ((farenheit - 32.0) * 5) / 9;
         } else {
             throw new IllegalArgumentException("You are ill!");
         }
     }
 }


//     public double setTemp(double celsius) {
//         if (celsius <= 37) {
//             return ((farenheit - 32.0) * 5) / 9;
//         } else {
//             throw new IllegalArgumentException("You are ill!");
//         }
//     }
// }
//
//                 return this.bodytemp = bodyCelsius;