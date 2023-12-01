package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	
	public boolean checkOdd(int number) {
		return number % 2 != 0;
	}
	
	public static void main(String[] args) {
		StreamTask streamTask = new StreamTask();
		
//		1~10���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
		
//		ABCDEF�� �� ���ں��� ���
//		"ABCDEF".chars().forEach(c -> System.out.println((char)c));
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(datas::add);
//		IntStream.range(0, 50).map(data -> data * 2 + 1).forEach(datas::add);
//		System.out.println(datas); 
		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		ArrayList<Character> chars = new ArrayList<Character>();
//		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1 : c).forEach(c -> chars.add((char)c));
//		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> chars.add((char)c));
//		System.out.println(chars);
		
		
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		Apple, banana, Melon �� ù ��° ���ڰ� �빮���� ���ڿ� ���
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream()
//			.filter(data -> data.charAt(0) >= 'A')
//				.filter(data -> data.charAt(0) <= 'Z')
//					.forEach(System.out::println);
	
//		�ѱ��� ������ ����
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String data = "�ϰ��̻�";
//		
//		data.chars().map(hangle::indexOf).forEach(System.out::print);
		
//		������ �ѱ۷� ����
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String data = "1024";
//		
//		data.chars().map(c -> c - 48).forEach(i -> System.out.print(hangle.charAt(i)));
		
	}
}





















