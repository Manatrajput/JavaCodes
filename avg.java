
import java.util,*;
class main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;

		for(int i=0;i<n;i++ arr) 
		{
            arr[i]=sc.nextInt();
			sum+=arr[i];
		}
        double avg=(double)sum/(arr.length);
		System.out.print(avg);
	}
}