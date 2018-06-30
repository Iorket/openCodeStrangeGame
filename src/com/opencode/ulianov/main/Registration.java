package com.opencode.ulianov.main;

import com.opencode.ulianov.jdbc.JDBCDataManager;
import com.opencode.ulianov.jdbc.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


@WebServlet(name = "Registration", urlPatterns = { "/Registration" })
public class Registration extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String eMail = request.getParameter("eMail");
        String password = request.getParameter("password");


        if(name.isEmpty() || eMail.isEmpty()  || password.isEmpty() )
        {
            RequestDispatcher req = request.getRequestDispatcher("register.jsp");
            req.include(request, response);
        }
        else
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            ///TEST VERSION(исправить)
            JDBCDataManager jdbcDataManager= new JDBCDataManager();
            jdbcDataManager.getConnection();
            try {
                jdbcDataManager.addUser(new User(name,eMail,password));
            } catch (SQLException e) {
                e.printStackTrace();
            }


            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
            req.forward(request, response);
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
