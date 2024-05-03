public class SelectionSort {
    public static int[] selectionSort(int[] arr){
      for(int i= 0; i< arr.length;i++){
          for(int j=i+1;j< arr.length;j++){
              if(arr[i]>arr[j]){
                  int temp =arr[j];
                  arr[j]=arr[i];
                  arr[i] = temp;
              }
          }
      }
      return  arr;
    }
}
class Main{
    public static void main(String[] args) {
        int[] arr = {5,2,1,6,4};
        arr = SelectionSort.selectionSort(arr);
        System.out.println("arr");
    }
}