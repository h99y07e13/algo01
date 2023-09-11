package Pro01;

import java.util.Scanner;

public class algo01 {
	public void algoo(int[] arr) {
		System.out.println("출력 값");
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1])
				System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args) {

		   algo01 algo = new algo01();
	
			System.out.println("1~100 까지 값 중 사용할 개수를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			
			int[] arr = new int[size + 1];

			for (int i = 1; i <= size; i++) {
				System.out.println(i+"번째 값을 입력해주세여");
				arr[i] = sc.nextInt();
			}
			System.out.println("입력 값");
			System.out.println(size);
			
			for (int i = 1; i <= size; i++) {
			System.out.print(arr[i]+" ");
			}
			
			System.out.println();
			algo.algoo(arr);

			sc.close();

			return;
		}
	}

