package com.examples.ezoo.servlets;

import java.io.IOException;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.ezoo.dao.FeedingScheduleDAO;

import com.examples.ezoo.dao.DAOUtilities;

import com.examples.ezoo.model.FeedingSchedule;

public class CreateFeedingScheduleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("CreateFeedingSchedule.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scheduleID = request.getParameter("scheduleID");

		String feedingTime = request.getParameter("feeding_time");
		String recurrence = request.getParameter("recurrence");
		String food = request.getParameter("food");
		String notes = request.getParameter("notes");
		
		FeedingSchedule FeedingScheduleToSave = new FeedingSchedule(
				scheduleID, 
				feedingTime,
				recurrence,
				food,
				notes);
		
		//Call DAO method
		FeedingScheduleDAO dao = DAOUtilities.getFeedingScheduleDao();
		try {
			dao.addFeedingSchedule(FeedingScheduleToSave);
			request.getSession().setAttribute("message", "Feeding Schedule successfully created");
			request.getSession().setAttribute("messageClass", "alert-success");
			response.sendRedirect("animalCare");


		}catch (Exception e){
			e.printStackTrace();
			
			//change the message
			request.getSession().setAttribute("message", "There was a problem creating the animal at this time");
			request.getSession().setAttribute("messageClass", "alert-danger");
			
			request.getRequestDispatcher("CreateFeedingSchedule.jsp").forward(request, response);

		}
	}

}

