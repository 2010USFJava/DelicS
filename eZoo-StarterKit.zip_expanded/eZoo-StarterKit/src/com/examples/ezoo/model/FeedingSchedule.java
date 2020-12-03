package com.examples.ezoo.model;

public class FeedingSchedule {
	
	private String ScheduleID = "";

	private String FeedingTime = "";
	private String Recurrence = "";
	private String Food = "";
	private String Notes = "";

	public FeedingSchedule(){}

	public FeedingSchedule(String ScheduleID, String FeedingTime, String Recurrence, String Food, String Notes) {
		super();
		this.ScheduleID = ScheduleID;
		this.FeedingTime = FeedingTime;
		this.Recurrence = Recurrence;
		this.Food = Food;
		this.Notes = Notes;
	}
	
		public String getScheduleID() {
			return ScheduleID;
		}

		public void setScheduleID(String ScheduleID) {
			this.ScheduleID = ScheduleID;
		}

		public String getFeedingTime() {
			return FeedingTime;
		}

		public void setFeedingTime(String FeedingTime) {
			this.FeedingTime = FeedingTime;
		}

		public String getRecurrence() {
			return Recurrence;
		}

		public void setRecurrence(String Recurrence) {
			this.Recurrence = Recurrence;
		}

		public String getFood() {
			return Food;
		}

		public void setFood(String Food) {
			this.Food = Food;
		}

		public String getNotes() {
			return Notes;
		}

		public void setNotes(String Notes) {
			this.Notes = Notes;

		}
}
