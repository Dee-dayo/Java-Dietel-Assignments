public class Clock {

	private int hour;
	private int minute;
	private int second;

	public Clock (int hour, int minute, int second) {
	this.hour = hour ;
		if (hour > 23) {
			this.hour = 0; }
	if (minute > 59) {
	this.minute = 0; }
	if (minute > 59) {
	this.second = 0 ; }
	}
	
	public void putHour (int hour) {
		this.hour = hour;
	}
	public int collectHour () {
		return hour ;
	}
	public void putMinute (int min) {
		minute = min;
	}
	public int collectMinute () {
		return minute;
	}
	public void putSecond (int sec) {
		second = sec;
	}
	public int collectSecond () {
		return second;
	}
	public void displayTime () {
		System.out.printf("%d: %d: %d", hour, minute, second) ;
	}
}