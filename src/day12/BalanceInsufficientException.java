package day12;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String msg) { //생성자오버로딩
		super(msg); //String msg 받아서 Exception한테 던진다.
	}
}
