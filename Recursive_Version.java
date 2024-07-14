public class Recursive_Version {
    public  int binarySearch(int[] list, int target){
        return binarySearch(list, target, 0, list.length - 1);
    }

    public int binarySearch(int[] list, int target, int min, int max) {
        if (min > max) {
            return -1;
        } else {
            int mid = (max + min) / 2;
            if (target < list[mid]) {
                return binarySearch(list, target, min, mid - 1);
            } else if (target > list[mid]) {
                return binarySearch(list, target, mid + 1, max);
            } else {
                return mid;
            }
        }
    }
}
