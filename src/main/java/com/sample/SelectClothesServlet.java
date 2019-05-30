package com.sample;

import com.sample.model.ClothesType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (
        name = "selectclothesservlet",
        urlPatterns = "/SelectClothes"
)

public class SelectClothesServlet extends HttpServlet {

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String clothesType = request.getParameter("Type");

            ClothesService clothesService = new ClothesService();
            ClothesType t = ClothesType.valueOf(clothesType);

            List clothesBrands = clothesService.getAvailableBrands(t);

            request.setAttribute("brands", clothesBrands);
            RequestDispatcher view = request.getRequestDispatcher("result.jsp");
            view.forward(request, response);
        }

}
