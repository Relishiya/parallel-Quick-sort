public class Quickthread extends Thread {

    int[]arr;
    int low;
    int high;



    public static int partition(int arr[], int lo, int hi)
    {
        int piv = arr[hi];
        int i = (lo-1);
        for (int j=lo; j<hi; j++)
        {

            if (arr[j] < piv)
            {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[hi];
        arr[hi] = temp;

        return i+1;
    }

    public Quickthread(int []a, int l,int h)
    {
        this.arr=a;
        this.high=h;
        this.low=l;
    }

    void qsort(int arr[], int lo, int hi)
    {
        if (lo < hi)
        {

            int pi = partition(arr, lo, hi);


            qsort(arr, lo, pi-1);
            qsort(arr, pi+1, hi);
        }
    }

    /*void parallelmerge(int arr[], int low,int high)
    {

        Quickthread sort = new Quickthread(arr, 0, arr.length / 2);
        Quickthread sort = new Quickthread(arr, 0, arr.length / 2);
    }
*/
     @Override
    public void run(){
        qsort(arr,low,high);

    }

}
