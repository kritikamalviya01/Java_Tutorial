public class Traingle {
    public static void main(String[] args) {
       int angle3 =  calculateThridAngle(60, 70);
       System.out.println(angle3);
    }

    // To check the 3rd Angle of triange with 180 degree
    static int calculateThridAngle(int angle1, int angle2){
        int angle3 = 180 - (angle1 + angle2);

        return angle3;
    }
}
