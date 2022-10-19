<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./Style/main.css">
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
</head>
<body>

<jsp:include page="components/navbar.jsp"/>

<h1 class="text-primary">HI</h1>

<br/>
<a href="hello-servlet">Hello Servlet</a>

<jsp:include page="components/Footer.jsp"/>

</body>
</html>