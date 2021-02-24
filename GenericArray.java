/**
 * Created by xenon on 2/24/2021.
 */
public class GenericArray<T> {
    T arr[];
    int num=0;
    public GenericArray(){
        arr=(T[]) new Object[4];

    }
    public void add(T element){
        if(num<=arr.length-1){
            arr[num++]=element;
        }
    }
    public void reverse(){
        int n= arr.length;
        for (int i = 0; i <arr.length/2 ; i++) {
            T t=arr[i];
            arr[i]=arr[n];
            arr[n]=t;
            n--;}}
    public void print (){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if(i==arr.length-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+",");}
        System.out.println("]");}
    public static void main(String[] args) {
        GenericArray<Integer> a1=new GenericArray<>();
        a1.add(12);
        a1.add(14);
        a1.add(15);
        a1.add(17);
        a1.print();
        a1.reverse();
        a1.print();
        GenericArray<String> a2=new GenericArray<>();
        a2.add("aaaa");
        a2.add("ddd");
        a2.add("ooo");
        a2.add("ddd");
        a2.print();
        a2.reverse();
        a1.print();
    }}
