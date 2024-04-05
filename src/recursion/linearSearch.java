package recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 0, 5)); // 4
    }
    static int search(int arr[], int index, int key){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }
        return search(arr, index+1, key);
    }
}
