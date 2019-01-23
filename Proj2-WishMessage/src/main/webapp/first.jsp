<%@page import="java.util.Calendar"%>
<%! public String generateWishMsg(String name)
{
	Calendar cal = null;
	int hour =0;
	cal = Calendar.getInstance();
	hour = cal.get(Calendar.HOUR_OF_DAY);
	if(hour<12)
	{
	  return "Good Mornng "+name;
	}
	else if(hour<16)
	{
		  return "Good Afternoon "+name;
	}
	else if(hour<20){
		  return "Good Eveniing "+name;
	}
	else
	{
		  return "Good Night "+name;
	}
		
}
%>

<h1><center>Welcome to jsp</center></h1>
<br>
<%= new java.util.Date() %><br>
<% String user = "abhilash"; %><br>

   Wish Message ::<%= generateWishMsg(user) %>
   
   <br><br>
   <a href="http://localhost:3030/Proj2-WishMessage/index.html/">TO GO home</a>

