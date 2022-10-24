<!DOCTYPE html>
<html lang="en">

<head>
  <title>Login</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;700&display=swap" rel="stylesheet">
  <script src="https://cdn.tailwindcss.com"></script>
  <style>
    body {
      font-family: 'Poppins', sans-serif;
    }
  </style>
</head>

<body>
  <main class="w-screen h-screen flex flex-col items-center justify-center ">
    <h3 class="mb-20 font-bold text-xl">Welcom Too Booking.ma:</h3>
    <form action="login" method="post">
      <div class="mb-6">
        <label for="email" class="block mb-2 text-sm font-medium text-gray-900 ">Your email</label>
        <input type="email" name="email" id="email"
          class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5"
          placeholder="name@example.com" required="">
      </div>
      <div class="mb-6">
        <label for="psswd" class="block mb-2 text-sm font-medium text-gray-900 ">Your password</label>
        <input type="password" name="psswd" id="psswd"
          class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5"
          required="">
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
