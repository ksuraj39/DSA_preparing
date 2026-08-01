    package assignment_5;

    import java.util.Scanner;

    public class Strings_Remove_Duplicates {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            char[] str =s.toCharArray();
            int k = 1;
            for (int i = 1; i < str.length ; i++) {
                if(str[i]!=str[k-1]){
                    str[k] = str[i];
                    k++;
                }
            }
            for (int i = 0; i <k ; i++) {
                System.out.print(str[i]);
            }
        }

    }
