<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<jsp:include page="components/Header.jsp"/>


<div class="h-[290px] w-full bg-primary flex flex-col justify-center px-20 relative">
    <p class="text-white font-bold text-4xl">RESERVER VOTRE CHAMBRE</p>
    <p class="text-white font-light">Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.</p>
</div>

<%--Start search bar --%>
<div class="mb-32 w-[950px] h-[75px] bg-[#FEBB02] p-2 m-auto absolute bottom-[37%] left-[23%]">
        <form>
            <div class="h-[58px] w-full gap-3 flex items-center overflow-hidden ">
                <select class="h-full w-3/12 bg-withe-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2">
                    <option hidden>choisiez un hotel..</option>
                    <option>hotel</option>
                </select>
                <input type="date" placeholder="Aujourd'hui" class="w-3/12 h-full bg-gray-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2 w-full" />
                <select class="h-full w-3/12 bg-withe-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2">
                    <option hidden>choisiez room type..</option>
                    <option>type 1</option>
                    <option>type 2</option>
                    <option>type 3</option>
                    <option>type 4</option>
                </select>
                <input type="number" value="1" class="w-1/12 h-full bg-gray-50 text-gray-800 border rounded outline-none transition duration-100 px-3 py-2"/>
                <button class="w-2/12 h-full text-white bg-sacendary hover:bg-primary font-medium rounded-lg text-sm px-5 py-2.5 ">Chercher</button>
            </div>
        </form>
</div>

<div class="h-[500px]"></div>
<%--end search bar--%>

<jsp:include page="components/Footer.jsp"/>


