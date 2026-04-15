package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin>coinBox = new Stack<>();
		
		//동전넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전을 하나씩 꺼내기
		//coinBox 가 비어있지않다면 반복
		while(!coinBox.isEmpty()) {
		Coin coin = coinBox.pop();
		System.out.println(coin.getValue());
		}
		

	}

}
