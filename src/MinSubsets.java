import java.util.Arrays;
import java.util.Scanner;
public class MinSubsets{
    public static void main(String ar[]){ 
    	 int n; 
         Scanner s = new Scanner(System.in);
         n = s.nextInt(); 
         int arr[] = new int[n]; int number=0; 
         for(int i=0;i<n;i++){ 
        	 arr[i] = s.nextInt(); }
         Arrays.sort(arr);
         for (int j=0;j<n;j++) {
                int cnt=1;
                for (;j<n-1;j++){
                    if (arr[j]==arr[j+1])
                        cnt++;
                    else
                        break;}
                number = Math.max(number, cnt);}
         System.out.println(number);}}