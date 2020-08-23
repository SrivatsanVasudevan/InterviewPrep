/*
MeanderingArray
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Constraints:
Array Contains Duplicate Values.
*/

public static int[] meanderingArray(int[] arr){
        if(arr == null || arr.length<1) return new int[]{};
        
        int min[] = new int[arr.length];
        int max[] = new int[arr.length];
        int index = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i:arr){
            heap.add(i);
        }
        for(int i=0;i<arr.length;i++){
            min[i] = heap.remove();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b) -> b-a);
        for(int i:arr){
            maxHeap.add(i);
        }
        for(int i=0;i<arr.length;i++){
            max[i] = maxHeap.remove();
        }
        int len = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(index<=len)
                arr[index++] = max[i];
            else break;
            if(index<=len)
                arr[index++] = min[i];
            else break;
        }
        return arr;
    }
