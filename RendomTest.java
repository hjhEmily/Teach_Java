import java.util.Random;
import java.util.Scanner;

public class RendomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int[] num=new int[3];
		int[] usernum=new int[3];
		int strick=0;
		int ball=0;
		int cunt=0;
		
		num[0]=rd.nextInt(9)+0;
		num[1]=rd.nextInt(9)+0;
		num[2]=rd.nextInt(9)+0;
		
		System.out.print(num[0]);
		System.out.print(num[1]);
		System.out.print(num[2]);
		
		while(true)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("숫자를 입력해주세요.");
			usernum[0]=input.nextInt(9)+0;
			usernum[1]=input.nextInt(9)+0;
			usernum[2]=input.nextInt(9)+0;
			
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(num[i]==usernum[j])
						if(num[j]==usernum[j])
							strick++;
						else
							ball++;
				}
			}
			
			System.out.println("스트라이크: "+strick+"볼: "+ball);
			cunt++;
			
			if(strick==3)
				break;
		}
		
		System.out.println(cunt+"번만에 스트라이크 아웃!!");
		
	}

}
