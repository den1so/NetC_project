package servlets;

import DataBase.MyDataBase;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;

public class MyServlet extends HttpServlet {


    public MyServlet() throws SQLException, ClassNotFoundException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            this.process(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            this.process(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException, ClassNotFoundException {
        MyDataBase db = new MyDataBase();


        response.setStatus(200);

        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");

        Enumeration en = request.getParameterNames();
        while(en.hasMoreElements()) {

            String name = (String)en.nextElement();
            out.println(name);

            String value = request.getParameter(name);

            String[] values = request.getParameterValues(name);

            for (int i=0; i<values.length; i++) {
                out.println(" " + values[i]);
                db.writeName(values[i]);
            }
        }
        out.close();
    }
}
