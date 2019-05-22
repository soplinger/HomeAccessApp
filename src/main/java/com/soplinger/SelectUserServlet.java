package com.soplinger;

import com.soplinger.UserService;
import com.soplinger.model.UserType;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
        name = "selectuserservlet",
        urlPatterns = "/SelectUser"
)

public class SelectUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userType = req.getParameter("Type");

        UserService userService = new UserService();
        UserType l = UserType.valueOf(userService.toString());

        List userBrands = userService.getAvailableTypes(l);

        req.setAttribute("brands", userBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }

}
