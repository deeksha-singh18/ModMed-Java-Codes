public class BarkingDog {
    public static boolean wakeUp(boolean barking,int hour){
        if(hour<0 || hour>23){
            return false;
        }
        if(barking==true && (hour<8 || hour>22)){
            return true;
        }
        return false;
    }

}
