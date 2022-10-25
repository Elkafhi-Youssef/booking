<html>

<head>
  <title>Booking.ma</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css" />
  <script src="https://cdn.tailwindcss.com"></script>
  <style>
    body {
      font-family: 'Poppins', sans-serif;
    }
  </style>
</head>

<body>
  <jsp:include page="components/navbar.jsp" />
  <main>
    <div class="h-[290px] w-full bg-[#003580] flex flex-col justify-center px-20 relative">
      <p class="text-white font-bold text-4xl">RESERVER VOTRE CHAMBRE</p>
      <p class="text-white font-light">Le Lorem Ipsum est simplement du faux texte employé dans la composition et la
        mise en page avant impression.</p>
    </div>

    <%--Start search bar --%>
      <div class="w-[950px] h-[75px] bg-[#FEBB02] p-2 m-auto absolute bottom-[52%] left-[23%]">
        <form>
          <div class="h-[58px] w-full gap-3 flex items-center overflow-hidden ">
            <select
              class="h-full w-3/12 bg-withe-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2">
              <option hidden>choisiez un hotel..</option>
              <option>Hotel & Spa Riad El WalaaUne nouvelle fenêtre va s'ouvrir</option>
            </select>
            <input type="date" placeholder="Aujourd'hui"
              class="w-3/12 h-full bg-gray-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2 w-full" />
            <select
              class="h-full w-3/12 bg-withe-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2">
              <option hidden>choisiez room type..</option>
              <option>Une chambre double</option>
              <option>Une chambre triple</option>
              <option>Une chambre individuelle</option>
              <option>Une suite</option>
            </select>
            <input type="number" value="1"
              class="w-1/12 h-full bg-gray-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2" />
            <button
              class="w-2/12 h-full text-white  bg-[#0071C2] font-medium rounded-lg text-sm px-5 py-2.5">Chercher</button>
          </div>
        </form>
      </div>

      <div class="h-[500px]">
      </div>
      <%--end search bar--%>
  </main>
  <jsp:include page="components/Footer.jsp" />
  <script src="https://unpkg.com/flowbite@1.5.3/dist/flowbite.js"></script>
</body>

</html>
