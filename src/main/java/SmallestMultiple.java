import java.util.*;

public class SmallestMultiple {
    public void findSmallestMultiple(){
        Long maxVal = Long.MAX_VALUE;
        Long minJ = 20L;
        for(Long i = 21L;i<maxVal;i++){
            boolean isGood = true;
            for (Long j = 20L; j > 1; j--) {
                if(i % j != 0){
                    isGood = false;
                    break;
                }
                else {
                    if (j < minJ){
                        minJ = j;
                        System.out.println("###BANG: " + i + " " + j + " Low so far: " + minJ);
                    }
                }
            }
            if(isGood){
                System.out.println("###Found Val: " + i);
                break;
            }
        }
    }


}
