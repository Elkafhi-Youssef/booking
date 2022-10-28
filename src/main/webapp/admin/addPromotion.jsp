<%@ page import="java.util.ArrayList" %>
<%@ include file="components/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<main class=" w-[90%] h-screen flex flex-col items-center justify-center ">
    <h3 class=" font-bold text-xl">Welcom Too Booking.ma:</h3>
    <form class=" w-[50%]" action="promotionServlet" method="post">
        <div class="mb-6">
            <label for="countries" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-400">Select an option</label>
            <select id="countries"  name="roomType" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                <option selected>Choose a room type</option>
                <c:forEach var="listReservation" items="${roomTypes}">
                <option value=<c:out value="${listReservation.getId()}"/>><c:out value="${listReservation.getName_room()}"/></option>
                </c:forEach>
            </select>
            <div class="mb-6">
                <label for="newPrice" class="block mb-2 text-sm font-medium text-gray-900 ">Enter New Price</label>
                <input type="number" name="newPrice" id="newPrice"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5"
                       required="#newprice #" placeholder="00.00">
            </div>

        <button type="submit"
                class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center">Submit</button>
        <% Object message=request.getAttribute("message"); %>
        <%if(message !=null){%>
        <div class="mt-2 bg-red-400 text-white rounded-lg px-2 py-3">
            <%=message%>
        </div>
        <%}%>
    </form>
</main>
</body>
</html>
