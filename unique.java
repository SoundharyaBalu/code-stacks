import java.util.*;

public class unique {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 0) {
             System.out.println("Unique element is:"+arr[i]);
            }
        }
}
}
   
