package ch12Ex10;

public class DataEntryException extends Exception{
	public DataEntryException(int num) {
		super("DataEntryException - " + num);
    }

}
