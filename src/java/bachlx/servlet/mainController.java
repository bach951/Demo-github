/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachlx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AD
 */
public class mainController extends HttpServlet {

    private String url = "errorpage.html";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");

            if (action == null || action.equals("search")) {
                url = "index.jsp";
            } else if (action.equals("login")) {
                url = "loginServlet";
            } else if (action.equals("register")) {
                url = "registerServlet";
            } else if (action.equals("logout")) {
                url = "logoutServlet";
            } else if (action.equals("addtocart")) {
                url = "addToCartServlet";
            } else if (action.equals("viewcart")) {
                url = "viewCart.jsp";
            } else if (action.equals("update")) {
                url = "updateCartServlet";
            } else if (action.equals("delete")) {
                url = "deleteCartServlet";
            } else if (action.equals("saveOrder")) {
                url = "saveShoppingCartServlet";
            } else if (action.equals("changeProfile")) {
                url = "changeProfileServlet";
            } else if (action.equals("canceledOrders")) {
                url = "canceledOrdersServlet";
            } else if (action.equals("ordersAgain")) {
                url = "ordersAgainServlet";
            } else if (action.equals("canceledOrdersInPersonalPage")) {
                url = "canceledOrdersInPersonalPageServlet";
            } else if (action.equals("OrderAgainInPersonalPage")) {
                url = "OrderAgainInPersonalPageServlet";
            } else if (action.equals("searchDate")) {
                url = "searchDateServlet";
            } else if (action.equals("manageAccounts")) {
                url = "manageAccountsServlet";
            } else if (action.equals("updateStatusAccount")) {
                url = "updateStatusAccountServlet";
            } else if (action.equals("searchAccount")) {
                url = "searchAccountServlet";
            } else if (action.equals("manageOrders")) {
                url = "manageOrdersServlet";
            } else if (action.equals("saveShipDate")) {
                url = "saveShipDateServlet";
            } else if (action.equals("addNewPlant")) {
                url = "addNewPlant.jsp";
            } else if (action.equals("createNewPlant")) {
                url = "addNewPlantServlet";
            } else if (action.equals("managePlants")) {
                url = "managePlantsServlet";
            } else if (action.equals("viewUpdatePlant")) {
                url = "viewUpdatePlantServlet";
            } else if (action.equals("updatePlant")) {
                url = "updatePlantServlet";
            } else if (action.equals("viewPlantsPage")) {
                url = "updatePlant.jsp";
            } else if (action.equals("manageCategories")) {
                url = "manageCategoriesServlet";
            } else if (action.equals("addNewCate")) {
                url = "addNewCate.jsp";
            } else if (action.equals("createNewCate")) {
                url = "addNewCateServlet";
            } else if (action.equals("viewUpdateCategories")) {
                url = "viewUpdateCateServlet";
            } else if (action.equals("updateCate")) {
                url = "updateCateServlet";
            } else if (action.equals("searchDateManageOrders")) {
                url = "searchDateManageOrderServlet";
            }
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
