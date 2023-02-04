class Main {
  public static void main(String[] args) {
    System.out.println("Sliding Windows Algorithm");

    int[] arr = { 10, 4, 5, 2, 3, 6, 7, 20, 3, 4, 5, 2, 1, 8 };
    int size = 2;

    String output = String.format("The maximum subarray of size %d is %d", size, maxSum(arr, size));
    System.out.println(output);
  }

    public static int maxSum(int[] arr, int size) {
    int maxsum = 0;
    int windowsum = 0;

    for (int index = 0; index < size; index++) {
      windowsum += arr[index];
      maxsum = windowsum;
    }
    for (int index = size; index < arr.length; index++) {

      windowsum += arr[index]-arr[index - size] ;
      maxsum = Math.max(windowsum, maxsum);

    }

    return maxsum;
  }

}