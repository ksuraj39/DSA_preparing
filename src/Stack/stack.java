package Stack;

public class stack {
    private int [] arr;
    private  int idx;

    public stack(){
        this(5);
    }
    public stack(int n){
        arr = new int[n];
    }
}
