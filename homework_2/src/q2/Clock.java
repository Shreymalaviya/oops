package q2;

class Clock {
	
	private int hours, minutes, seconds, totalSeconds;
	private static int t = 0;
	
	//constructors
	
	public Clock() {
		this.hours = 12;
		this.minutes = 0;
		this.seconds =0;	
	}

	public Clock(int hours, int minutes, int seconds) {
		
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59 ) {
			throw new IllegalArgumentException("Invalid time value");
		}
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Clock(int totalSeconds) {
		this.hours = totalSeconds / 3600;
		this.minutes = (totalSeconds % 3600) / 60;
		this.seconds = totalSeconds % 60;
		
		this.totalSeconds = totalSeconds;
	}

	//getter and setter methods
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		try {
			if(hours >= 0 && hours < 24) {
				this.hours = hours;
			}else {
				throw new IllegalArgumentException("Invalid time value");
			}
		}catch(Exception e){
			throw new IllegalArgumentException(e);
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		try {
			if(minutes >= 0 && hours < 59) {
				this.minutes = minutes;
			}else {
				throw new IllegalArgumentException("Invalid hours value : " + minutes);
			}
		}catch(Exception e){
			throw new IllegalArgumentException(e);
		}
	}

	public void setTotalSeconds(int seconds) {
		try {
			if(seconds >= 0 && hours < 59) {
				this.seconds = seconds;
			}else {
				throw new IllegalArgumentException("Invalid seconds value : " + seconds);
			}
		}catch(Exception e){
			throw new IllegalArgumentException(e);
		}
	}
	
	public void tick() {
		this.seconds++;
		if(this.seconds==60) {
			this.seconds =0;
			this.minutes++;
			if(this.minutes==60) {
				this.minutes=0;
				this.hours++;
				if(this.hours==24) {
					this.hours=0;			
				}
			}
		}
		System.out.println(hours + ":" + minutes + ":" +  seconds);
	}
	
	public void tickDown() {
		this.seconds--;
		if(this.seconds==0) {
			this.seconds=59;
			this.minutes--;
			if(this.minutes==0) {
				this.minutes=59;
				this.hours--;
				if(this.hours==1) {
					this.hours--;
				}
			}
		}
		System.out.println(hours + ":" + minutes + ":" +  seconds);
	}

	@Override
	public String toString() {
		return "Clock [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
}