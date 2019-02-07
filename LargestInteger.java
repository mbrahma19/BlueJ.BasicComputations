 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer result = 0;
        if(integers[0] > integers[1]){
            result = (integers[0] > integers[2]) ? integers[0] : integers[2];
        }else{
            result = (integers[1] > integers[2]) ? integers[1] : integers[2];
        }
        return result;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer result = Math.max(integers[0],(Math.max(integers[1],integers[2])));
        return result;
    }
}
