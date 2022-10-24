<!DOCTYPE html>
<html>

<head>
  <title>JSP - Hello World</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://cdn.tailwindcss.com"></script>
  <script>
    tailwind.config = {
      theme: {
        extend: {
          colors: {
            primary: '#003580',
            sacendary: '#0071C2',
          }
        }
      }
    }
  </script>
  <style>
    body {
      font-family: 'Poppins', sans-serif;
    }
  </style>
</head>

<body>
  <jsp:include page="./navbar.jsp" />
