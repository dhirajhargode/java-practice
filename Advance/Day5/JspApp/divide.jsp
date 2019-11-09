<%!
	int res;
    void div(int i,int j){
    	res = i/j;
    }
    
%>

<%
	String s1 = request.getParameter("num1");
	String s2 = request.getParameter("num2");
	int a = Integer.parseInt(s1);
	int b = Integer.parseInt(s2);
	div(a, b);
%>

<%="Result   "+res %>

