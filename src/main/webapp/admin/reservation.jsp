<%@ page import="java.util.ArrayList" %>
<%--<%@ page import="com.marocair.marocair.model.Flight" %>--%>
<%@ include file="components/header.jsp" %>

<%--<table class="table-auto mt-6 w-full">--%>
<%--  <thead>--%>
<%--  <tr class="bg-gray-200">--%>
<%--    <th>Id reservation</th>--%>
<%--    <th>Id Client</th>--%>
<%--    <th>Name</th>--%>
<%--    <th>Room Type</th>--%>
<%--    <th>price</th>--%>
<%--    <th>Status</th>--%>
<%--    <th>Action</th>--%>

<%--  </tr>--%>
<%--  </thead>--%>
<%--  <tbody>--%>
<%--&lt;%&ndash;  <c:forEach var="flight" items="${flights}">&ndash;%&gt;--%>
<%--    <tr class="border border-3 border-blue-6 h-15 odd:bg-blue-100">--%>
<%--      <td class="p-3">1</td>--%>
<%--      <td class="p-3">3</td>--%>
<%--      <td class="p-3">youssef</td>--%>
<%--      <td class="p-3">simple room</td>--%>
<%--      <td class="p-3">6746 $</td>--%>
<%--      <td class="p-3">pending</td>--%>
<%--&lt;%&ndash;      <td class="p-3">${flight.getNbrOfSeats()}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;      <td class="p-3">${flight.getAvailableSeats()}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;      <td class="p-3">${flight.getPrice()}</td>&ndash;%&gt;--%>
<%--      <td>--%>
<%--        <form>--%>
<%--          <input name="flight-id"  hidden>--%>
<%--          <button>Submit</button>--%>
<%--        </form>--%>
<%--      </td>--%>
<%--    </tr>--%>
<%--&lt;%&ndash;  </c:forEach>&ndash;%&gt;--%>
<%--  </tbody>--%>
<%--</table>--%>
<div class="" flex>

    <nav class="bg-white border-gray-200 px-2 sm:px-4 py-2.5 rounded border-1 border-black-500 ">
        <div class="container flex flex-wrap justify-between items-center mx-auto">
            <div class="flex items-center md:order-2">
                <button type="button"
                        class="flex mr-3 text-sm bg-gray-800 rounded-full md:mr-0 focus:ring-4 focus:ring-gray-300 dark:focus:ring-gray-600"
                        id="user-menu-button" aria-expanded="false" data-dropdown-toggle="user-dropdown"
                        data-dropdown-placement="bottom">
                    <%--          <span class="sr-only">Open user menu</span>--%>
                    <img class="w-8 h-8 rounded-full"
                         src="https://cdn.searchenginejournal.com/wp-content/uploads/2022/04/reverse-image-search-627b7e49986b0-sej-760x400.png"
                         alt="user photo">
                </button>
                <!-- Dropdown menu -->

            </div>
        </div>
    </nav>

    <div class="overflow-x-auto relative shadow-md sm:rounded-lg">
        <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
            <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
            <tr>
                <th scope="col" class="py-3 px-6">
                    #
                </th>
                <th scope="col" class="py-3 px-6">
                    Date start
                </th>
                <th scope="col" class="py-3 px-6">
                    Date end
                </th>
                <th scope="col" class="py-3 px-6">
                    Name
                </th>
                <th scope="col" class="py-3 px-6">
                    Room type
                </th>
                <th scope="col" class="py-3 px-6">
                    Status
                </th>
                <th scope="col" class="py-3 px-6">
                    Action
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="listReservation" items="${listReservations}">
                <tr class="bg-white border-b dark:bg-gray-900 dark:border-gray-700">
                    <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                        <c:out value="${listReservation.getId()}"/>
                        1
                    </th>
                    <td class="py-4 px-6">
                        12/12/2222
                    </td>
                    <td class="py-4 px-6">
                        12/12/2222
                    </td>
                    <td class="py-4 px-6">
                        jilali 9ador
                    </td>
                    <td class="py-4 px-6">
                        xi room
                    </td>
                    <td class="py-4 px-6">
                        pending
                    </td>
                    <td class="py-4 px-6">
                        <a href="#" class="font-medium text-blue-600 dark:text-blue-500 hover:underline">Edit</a>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>

<%--<%@include file="../admin/components/footer.jsp" %>--%>