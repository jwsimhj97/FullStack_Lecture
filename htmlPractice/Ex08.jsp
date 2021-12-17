<html>
    <head>
        <meta charset="utf-8">
    </head>
    <body>
        <h1>java code</h1>
        <table border="1">
            <%
            String[] arr1={"java1","java2","java3","java4"};
            String[] arr2={"web1","web2","web3","web4"};
            String[] arr3={"framework1","framework2","framework3","framework4"};

            String[][] arr=new String[][]{arr1,arr2,arr3,arr4};
            for(int i=0; i<4; i++){
            %>
                <tr>
                    <td><%=arr[i][1]%>-1</td>
                    <td><%=arr[i][3]%>-2</td>
                    <td><%=arr[i][0]%>-3</td>
                    <!-- 출력하기 위해서 =을 쓴다 -->
                </tr>
            <% } %>
        </table>
        <!-- 여기서 자바코드는 6번과 8번 -->
    </body>
</html>
