package HW0913;

import java.util.ArrayList;

public class P1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ListByArray array = new ListByArray();
		
		for(int i = 0; i < 2000000; i++) {
			arrayList.add(i);
			array.add(i);
		}
		System.out.println("데이터 1000개 삭제 시간 측정======================");
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			arrayList.remove(i);
		}
		long endTime = System.currentTimeMillis();
		long arrayListTime = (endTime - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			arrayList.remove(i);
		}
		endTime = System.currentTimeMillis();
		long arrayTime = (endTime - startTime);
		long time = arrayTime - arrayListTime;
		if(time<0)
			time *= -1;
		System.out.println();
		System.out.println("ArrayList elapse time : "+arrayListTime+"ms");
		System.out.println("Array elapse time : "+arrayTime+"ms");
		System.out.println();
		System.out.print("결과 : ");
		System.out.print((arrayTime < arrayListTime)?"Array가 ":"ArrayList가 ");
		System.out.println(time+"ms 만큼 빠릅니다.");
	}
}
