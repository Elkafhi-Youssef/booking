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
<jsp:include page="./navbar.jsp"/>
