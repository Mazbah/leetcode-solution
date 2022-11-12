class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i:Int = 0;
        var j:Int = (numbers.size)-1;
        var newArray = intArrayOf(0,0);
        while(i<j){
            if(numbers[i]+numbers[j] > target){
                j--;
                continue;
            }else if(numbers[i]+numbers[j] < target){
                i++;
                continue;
            }else{
                newArray.set(0,i+1);
                newArray.set(1,j+1);
                break;
            }
        }
        return newArray; 
    }
}