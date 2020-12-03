package com.examples.ezoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.examples.ezoo.model.FeedingSchedule;




public class FeedingScheduleDAOImpl implements FeedingScheduleDAO {
	
	public List<FeedingSchedule> getAllFeedingSchedules() {
		List<FeedingSchedule> FeedingSchedule = new ArrayList<>();
		Connection connection = null;
		Statement stmt = null;

		try {
			connection = DAOUtilities.getConnection();

			stmt = connection.createStatement();

			String sql = "SELECT * FROM FEEDING_SCHEDULE";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				FeedingSchedule fs = new FeedingSchedule();

				fs.setScheduleID(rs.getString("scheduleID"));
				fs.setFeedingTime(rs.getString("feedingtime"));
				fs.setRecurrence(rs.getString("recurrence"));
				fs.setFood(rs.getString("food"));
				fs.setNotes(rs.getString("notes"));
				
				FeedingSchedule.add(fs);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return FeedingSchedule;
	}

	@Override
	public boolean addFeedingSchedule(FeedingSchedule fs) {
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DAOUtilities.getConnection();
			String sql = "INSERT INTO FeedingSchedule VALUES (?, ?, ?, ?, ?)"; 
			stmt = connection.prepareStatement(sql);
			

			((PreparedStatement) stmt).setString(1, fs.getScheduleID());
			((PreparedStatement) stmt).setString(2, fs.getFeedingTime());
			((PreparedStatement) stmt).setString(3, fs.getRecurrence());
			((PreparedStatement) stmt).setString(4, fs.getFood());
			((PreparedStatement) stmt).setString(5, fs.getNotes());


			if (stmt.executeUpdate(sql) != 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}

	@Override
	public boolean deleteFeedingSchedule(String ScheduleID) {
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DAOUtilities.getConnection();
			String sql = "DELETE FeedingSchedule WHERE ScheduleID=?";
			stmt = connection.prepareStatement(sql);
			
			((PreparedStatement) stmt).setString(1, ScheduleID);

			if (stmt.executeUpdate(sql) != 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}

	private void closeResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FeedingSchedule> getFeedingScheduleByAnimal() {
		List<FeedingSchedule> fs = new ArrayList<>();
		Connection connection = null;
		Statement stmt = null;
		 try {
			 connection = DAOUtilities.getConnection();
			 String sql = "SELECT animals.animalid, FEEDING_SCHEDULE.schedule_ID FROM animals FULL OUTER JOIN FEEDING_SCHEDULE ON animals.feeding_schedule=FEEDING_SCHEDULE.schedule_ID ORDER BY animal.animalid";
			 stmt = connection.prepareStatement(sql);
			 ResultSet rs = stmt.executeQuery(sql);
			 while (rs.next() ) {
				 FeedingSchedule fs1 = new FeedingSchedule();
				 fs1.setScheduleID(rs.getNString("ScheduleID"));
				 fs1.setScheduleID(rs.getNString("ScheduleID"));
				 fs.add(fs1);
			 }
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeResources();
			}
			
			return fs;
	 }
		

	public boolean assignFeedingSchedule(String fs) {
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DAOUtilities.getConnection();
			String sql = "INSERT INTO animals.feeding_schedule VALUES (?) FULL OUTER JOIN FEEDING_SCHEDULE ON animals.feeding_schedule=FEEDING_SCHEDULE.schedule_ID";
			stmt = connection.prepareStatement(sql);

			((PreparedStatement) stmt).setString(1, fs);
			((PreparedStatement) stmt).setString(2, fs);

			if (stmt.executeUpdate(sql) != 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}

	public boolean removeFeedingSchedule(String fs) {
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DAOUtilities.getConnection();
			String sql = "DELETE animals.feeding_schedule WHERE animalid=? FULL OUTER JOIN FEEDING_SCHEDULE ON animals.feeding_schedule=FEEDING_SCHEDULE.schedule_ID";
			stmt = connection.prepareStatement(sql);
			
			((PreparedStatement) stmt).setString(1, fs);

			if (stmt.executeUpdate(sql) != 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}
}
