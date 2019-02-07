 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int result = Math.abs((angle % 360));
        return result;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int result = Math.floorMod(integer, 360);
        return result;
    }

    public static void main(String[] args){

    }
}
