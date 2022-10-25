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
    <div class="w-full flex min-w-[100vh] mt-24 mb-24">
      <div class="w-4/6 flex flex-col">
        <div class="px-5 mx-auto lg:px-12">
          <%--roomeTitle--%>
            <p class="font-bold text-4xl">Chambre double</p>
            <p class="font-light">Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en
              page
              avant impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie depuis les années</p>
        </div>
        <div>
          <%--gallery--%>
            <%--Start Gallery--%>
              <section class="overflow-hidden text-gray-700">
                <div class="container px-5 py-2 mx-auto lg:pt-12 lg:px-12">
                  <div class="flex flex-wrap -m-1 md:-m-2">
                    <div class="flex flex-wrap w-1/2">
                      <div class="w-1/2 p-1 md:p-2">
                        <img alt="gallery" class="block object-cover object-center w-full h-full rounded-lg"
                          src="./img/roomTest/1.jpg">
                      </div>
                      <div class="w-1/2 p-1 md:p-2">
                        <img alt="gallery" class="block object-cover object-center w-full h-full rounded-lg"
                          src="./img/roomTest/2.jpg">
                      </div>
                      <div class="w-full p-1 md:p-2">
                        <img alt="gallery" class="block object-cover object-center w-full h-full rounded-lg"
                          src="./img/roomTest/3.jpg">
                      </div>
                    </div>
                    <div class="flex flex-wrap w-1/2">
                      <div class="w-full p-1 md:p-2">
                        <img alt="gallery" class="block object-cover object-center w-full h-full rounded-lg"
                          src="./img/roomTest/4.jpg">
                      </div>
                      <div class="w-1/2 p-1 md:p-2">
                        <img alt="gallery" class="block object-cover object-center w-full h-full rounded-lg"
                          src="./img/roomTest/5.jpg">
                      </div>
                      <div class="w-1/2 p-1 md:p-2">
                        <img alt="gallery" class="block object-cover object-center w-full h-full rounded-lg"
                          src="./img/roomTest/6.jpg">
                      </div>
                    </div>
                  </div>
                </div>
              </section>
              <%--End Gallery--%>
        </div>
      </div>
      <div class="px-12 w-2/6">
        <%--reservationCard--%>
          <div
            class="w-[100%] h-full border-2 border-gray w-2/6 border-2 border-[#FEBB02] rounded-md drop-shadow-md bg-gray-50 bg-[#FEBB02]">
            <form>
              <div class="h-full w-full gap-3 flex flex-col items-center overflow-hidden px-12 py-16">
                <select
                  class="h-full w-full bg-withe-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2">
                  <option hidden>choisiez un hotel..</option>
                  <option>Hotel & Spa Riad El WalaaUne nouvelle fenêtre va s'ouvrir</option>
                </select>
                <input type="date" placeholder="Aujourd'hui"
                  class="w-full h-full bg-gray-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2 w-full" />
                <select
                  class="h-full w-full bg-withe-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2">
                  <option hidden>choisiez room type..</option>
                  <option>Une chambre double</option>
                  <option>Une chambre triple</option>
                  <option>Une chambre individuelle</option>
                  <option>Une suite</option>
                </select>
                <input type="number" value="1"
                  class="w-full h-full bg-gray-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2" />
                <%--extra--%>
                  <div class="w-full flex flex-col gap-3">
                    <div class="flex items-center pl-4 rounded border border-gray-200 ">
                      <input id="bordered-radio-1" type="radio" value="" name="bordered-radio1"
                        class=" w-4 h-4 text-blue-600 bg-gray-100 border-gray-300">
                      <label for="bordered-radio-1" class="py-4 ml-2 w-full text-sm font-medium text-gray-900">petit
                        dejeuner</label>
                    </div>
                    <div class="flex items-center pl-4 rounded border border-gray-200 ">
                      <input id="bordered-radio-2" type="radio" value="" name="bordered-radio2"
                        class=" w-4 h-4 text-blue-600 bg-gray-100 border-gray-300">
                      <label for="bordered-radio-2"
                        class="py-4 ml-2 w-full text-sm font-medium text-gray-900">dejeuner</label>
                    </div>
                    <div class="flex items-center pl-4 rounded border border-gray-200 ">
                      <input id="bordered-radio-4" type="radio" value="" name="bordered-radio4"
                        class=" w-4 h-4 text-blue-600 bg-gray-100 border-gray-300">
                      <label for="bordered-radio-4"
                        class="py-4 ml-2 w-full text-sm font-medium text-gray-900">diner</label>
                    </div>
                    <div class="flex items-center pl-4 rounded border border-gray-200 ">
                      <input id="bordered-radio-5" type="radio" value="" name="bordered-radio5"
                        class=" w-4 h-4 text-blue-600 bg-gray-100 border-gray-300">
                      <label for="bordered-radio-5"
                        class="py-4 ml-2 w-full text-sm font-medium text-gray-900">spa</label>
                    </div>
                    <div class="flex items-center pl-4 rounded border border-gray-200 ">
                      <input id="bordered-radio-6" type="radio" value="" name="bordered-radio6"
                        class=" w-4 h-4 text-blue-600 bg-gray-100 border-gray-300">
                      <label for="bordered-radio-6"
                        class="py-4 ml-2 w-full text-sm font-medium text-gray-900">soin</label>
                    </div>
                  </div>
                  <%-- ///////////--%>
                    <button
                      class="w-full h-full text-white bg-sacendary hover:bg-primary font-medium rounded-lg text-sm px-5 py-2.5 ">Reserver</button>
              </div>
            </form>
          </div>
      </div>
    </div>

  </main>
  <jsp:include page="components/Footer.jsp" />
</body>

</html>
