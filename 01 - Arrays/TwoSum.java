import java.util.HashMap;
public class TwoSum {
    
    public static int [] twoSum(int [] arr, int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int temp = target - arr[i];
            if(map.containsKey(temp)){
                return new int[] {map.get(temp), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,3,2,6,7,3,4};
        int target = 9;
        int [] result = twoSum(arr, target);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}