import java.util.*;

public class TwoSum1{
    
    
    public int[] twoSum(int[] numbers, int target) {
        
        
        HashMap<Integer,Integer> hMap = new HashMap<>();
        if(numbers.length >= 2)
        for(int i = 0; i < numbers.length; i++){
            int diff = target - numbers[i];
            if(hMap.containsKey(diff)){
                int[] ans = {hMap.get(diff),i};
                return ans;
            }
            hMap.put(numbers[i], i);
        }
        int[] k = {-1,-1};
       return k;
    }

    
    public static void main(String[] args){
        
    int[] sol = {3,2,4,4};
    int[] ans = new TwoSum1().twoSum(sol,8);
    
    System.out.print("[ ");
    for(int i: ans){
        System.out.print(i+" ");
    }
    System.out.print("]");
        
    }
}