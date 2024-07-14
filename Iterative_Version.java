public class Iterative_Version{
    public int binarySearch(int[] list , int key){
        int low = 0;
        int high = list.length - 1;

        while (low <= high){
            int middle = (low + high) / 2;
            if(key < list[middle]){
                high = middle - 1;
            } else if (key > list[middle]) {
                low = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}