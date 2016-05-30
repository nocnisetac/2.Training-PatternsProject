package project.seventh.patterns;

import java.util.Calendar;

public class OnDutyFactory {

	private int checkDate() {
		Calendar c = Calendar.getInstance();
		// c.setTime(date);
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		if (day_of_week == 1 | day_of_week == 7)
			return 3; // weekend
		else if (hour >= 6 & hour <= 16)
			return 1;
		else
			return 2;
	}

	public OnDuty getOnDuty() {
		int day = this.checkDate();
		if (day == 1) {
			return new WorkingLive();
		} else if (day == 2) {
			return new WorkingEmergency();
		} else if (day == 3) {
			return new Automaton();
		}
		return null;
	}
}
