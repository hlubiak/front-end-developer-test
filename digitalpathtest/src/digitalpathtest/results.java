package digitalpathtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class results extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/*This is to print the output*/
		PrintWriter out = response.getWriter();
	
		/*receive user data from the js.js file*/
		String age = request.getParameter("age");
		int personAge = Integer.parseInt(age);
		String height = request.getParameter("height");
		int personHeight = Integer.parseInt(height);
		

			out.print(" The person is a " );

			/*
			 * classify the cotegory of a person according to the age
			 * from age 0-18 is teenager, 19-35 is adult, 36-infinity is senior
			 */
			if( personAge >= 0 && personAge <= 18 ){
				
				out.print("Teenager");
				
			}else if( personAge > 18 && personAge <= 35 ){

				out.print(" Adult ");
				
			}else if( personAge > 35 ){

				out.print(" Senior ");
				
			}else{
				
				out.print( " Sorry!! Couldn't classify the person. " );
				
			}
			
				out.print(" and is ");

			/*
			 * classify the category of a person's height according to the height
			 * from age 0-5m is short, >5m but <=8m is average, >8m is tall
			 */
			if( personHeight >= 0 && personHeight <= 5 ){
				
				out.print(" Short ");
				
			}else if( personHeight > 5 && personHeight <= 8 ){

				out.print(" Average ");
				
			}else if( personHeight > 8 ){

				out.print(" Tall ");
				
			}else{
				
				out.print(" Sorry!! Couldn't determine the persons height ");
				
			}
			
	}

}
