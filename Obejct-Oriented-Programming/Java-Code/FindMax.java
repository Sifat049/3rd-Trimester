package class_22;

public class FindMax extends Thread{
    int[] a;
    int max;

    public FindMax(int[] a) {
        this.a = a;
    }

    @Override
    public void run(){
        max = a[0];
        for(int i =0; i<a.length; i++){
            if(a[i] > max) max = a[i];
        }
    }
}
