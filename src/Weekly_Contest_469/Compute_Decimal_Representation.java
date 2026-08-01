package Weekly_Contest_469;

public class Compute_Decimal_Representation {
    public static void main(String[] args) {
        int n = 537;
        int [] result = decimalRepresentation(n);
        for(int i =0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] decimalRepresentation(int n) {
        int c = 0;
        int tem = n;
        while(tem!=0){
            int rem = tem%10;
            if(rem!=0){
                c++;
            }
            tem/=10;
        }
        int [] temp = new int[c];
        int mul = 1;
        while(n!=0){
            int rem = n%10;
            if(rem!=0){
                temp[c-1] = rem*mul;
                c--;
            }
            mul*=10;
            n/=10;
        }
        return temp;
    }
}
