public class QuickParallel {

    public static void main(String[] args) throws InterruptedException {
         int arr[] = {10,6,4,7,3,1,4,15,7,9,11,5,13,4,0,2,8,7,3,9,2,4,5,16,12,20,1};
         int fin=(arr.length-1);

         int m= Quickthread.partition(arr,0,fin);
        Quickthread obj1= new Quickthread(arr,0,m-1);
        Quickthread obj2 = new Quickthread(arr,m+1,fin);

        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();
        System.out.println("Parallel Merge sort");

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
