package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// 큐는 인터페이스 타입이다.
		Queue<Message> messageQueue  = new LinkedList<>();
		
		// 메시지 넣기
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","응우옌"));
		messageQueue.offer(new Message("sendKakaoTalk","콩푸엉"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			
		// 큐 방식으로 출력된다.
		switch(message.command) {
		
		case "sendMail" :
			System.out.println(message.to +"님에게 메일을 보냅니다");
			break;
			
		case "sendSMS" :
			System.out.println(message.to + "님에게 SMS를 보냅니다");
			break;
			
		case "sendKakaoTalk" :
			System.out.println(message.to + "님에게 KakaoTalk를 보냅니다");	
			break;
		}
		}

	}

}
