//id-2469.// 

//Convert the Temperature//

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] fina = new double[2];
        double kelvin =celsius + 273.15;
        double Fahren = (celsius*1.80)+32.00;
         fina[0]=kelvin;
         fina[1]=Fahren;
        return fina;
    }
}