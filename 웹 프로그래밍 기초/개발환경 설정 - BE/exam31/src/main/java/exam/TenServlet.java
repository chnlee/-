package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TenServlet
 */
@WebServlet("/ttt")
public class TenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Webservlet은 URL mapping 값으로 요청하는 주솟값이다.

   /** 클라이언트가 요청하면 서버는 응답한다. 이 때, 클라이언트가 요청할 때 서버는 요청을 받아내는 객체와 응답을 하기 위한 객체 두 개를 자동으로 만들어낸다.
    응답에 대한 부분은 HttpServletResponse 객체 안에, 요청에 대한 부분은 HttpServletRequest에 가지고 있다. 즉, 응답으로 뭔가 돌려줘야겠다 했을 때는 반드시 HttpServletResponse에 내용들을 넣어줘야 된다.
    setContentType()는 브라우저가 응답을 받았을 때 응답하는 정보가 이미지인지, 텍스트인지 알려주는 역할을 한다.
    text/html은 이 text는 html이다라고 알려주는 것이다.
    charset은 클라이언트와 서버에서 보내주는 정보를 일치시키기 위해 존재한다. 이 character를 utf-8 형식으로 보낼 것이다라는 의미이다.
    response()에 속한 getWriter()라는 메서드를 통해 PrintWriter라는 객체가 return되는 것을 알 수 있다. PrintWriter()를 통해 지정된 out이라는 통로를 생성하고 원하는 문구를 출력할 수 있다. **/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>1-10까지 출력!<h1>");
		for(int i = 1; i <=10; i++) {
			out.print(i+"<br>");
		}
		out.close();
	}

}
