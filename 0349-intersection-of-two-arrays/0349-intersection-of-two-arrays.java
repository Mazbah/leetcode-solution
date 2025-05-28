class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(s1.contains(nums2[i])){
                arr1.add(nums2[i]);
                s1.remove(nums2[i]);
            }
        }

        int[] arr = new int[arr1.size()];
        for(int i=0; i<arr1.size();i++){
            arr[i] = arr1.get(i);
        }

        return arr;

    }
}