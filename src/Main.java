import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Read each line int the text file.
		List<String> lines = Files.readAllLines(Paths.get("input.txt"));
		
		int[] x = new int[4];
		System.out.println(lines);
		int p = Integer.valueOf(lines.get(0));
		int r = Integer.valueOf(lines.get(1));
		
		
		for(int i = 0 ;i<4 ; i++)
		{
			x[i] = Integer.valueOf(lines.get(i+2));
		}
//		for(int a:x)
//		{
//			System.out.println(a);
//		}
		int t1 = (int)Math.pow(r, 0);
		int a1=0,a2=0,a3=0,flag=0;
		for(int j=1;j<=p;j++)
		{
			int t2 = t1+j;
			for(int k=1;k<=p;k++)
			{
				int t3=t1+k;
				for(int l=1;l<=p;l++)
				{
					int t4=t1+1;
					int diff = t2*t3*t4 - x[0];
					if(diff%p==0)
					{
						a1=j;
						a2=k;
						a3=l;
						int temp1 = (int)Math.pow(r, 1);
						int temp2 = (int)Math.pow(r, 2);
						int temp3 = (int)Math.pow(r, 3);
						int diff1 = ((temp1+a1)*(temp1+a2)*(temp1+a3)-x[1]%p);
						int diff2 = ((temp2+a1)*(temp2+a2)*(temp2+a3)-x[2]%p);
						int diff3 = ((temp3+a1)*(temp3+a2)*(temp3+a3)-x[3]%p);
						if(diff1==0 && diff2 ==0 && diff3==0)
						{
							System.out.println("a1: "+ a1);
							System.out.println("a2: "+ a2);
							System.out.println("a3: "+ a3);
							
						}
						flag++;
						break;
					}
				}	
			}
			if(flag>0)
			{
				break;
			}
			
			
		}
		if(flag>0)
		{
			int output1 = (a1+a2+a3)%p;
			int output2 = (a1*a2+a1*a3+a2*a3)%p;
			int output3 = (a1*a2*a3)%p;
			
			System.out.println(output1);
			System.out.println(output2);
			System.out.println(output3);
		}
	}


}
