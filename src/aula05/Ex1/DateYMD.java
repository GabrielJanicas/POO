package aula05.Ex1;

public class DateYMD {
	int day,month,year;

	public DateYMD(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public static boolean validMonth(int month){
		if (month < 1 || month>12){
			return false;
		}
		return true;
	}

	public static int numberOfDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }


	public static boolean valid(int day,int month,int year){
		if (validMonth(month) == false){
			return false;
		}

		if (month<1 || month>12){
			return false;
		}

		if (day>numberOfDaysInMonth(month, year) || day<0){
			return false;
		}
		return true;

	}


	public void increment() {
		if (this.day == numberOfDaysInMonth(this.month, this.year)) {
			this.day = 1;
			if (this.month == 12) {
				this.month = 1;
				this.year++;
			} else {
				this.month++;
			}
		} else {
			this.day++;
		}
	}

	public void increment(int days) {
		for (int i = 0; i < days; i++)
			increment();
	}

	public void decrement() {
		if (this.day == 1) {
			if (this.month == 1) {
				this.month = 12;
				this.year--;
			} else {
				this.month--;
			}
			this.day = numberOfDaysInMonth(this.month, this.year);
		} else {
			this.day--;
		}
	}

	public void decrement(int days) {
		for (int i = 0; i < days; i++)
			decrement();
	}

	@Override
	public String toString() {
		return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
	}



}
