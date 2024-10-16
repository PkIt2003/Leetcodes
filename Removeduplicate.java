class Removeduplicate {
    // id - 26
    public int removeDuplicates(int[] nums) {
        Set<Integer>data = new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            data.add(nums[i]);
        }
        int index = 0; 
        for (int num : data) 
        {
            nums[index++] = num;
        }
        return data.size();
    }
}