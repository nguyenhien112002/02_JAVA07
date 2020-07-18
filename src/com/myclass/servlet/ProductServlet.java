package com.myclass.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myclass.entity.Category;
import com.myclass.entity.Product;

@WebServlet(urlPatterns = {"/product","/product/add","/product/edit","product/delete"})
public class ProductServlet extends HttpServlet{
    private List<Product> list = null;
    private List<Category> listCate =null;
    
    public ProductServlet() {
        list = new ArrayList<Product>();
        list.add(new Product(1,"Nokia",1000, 3500000,1));
        list.add(new Product(2,"Samsung",2000, 6000000,2));

        listCate = new ArrayList<Category>();
        listCate.add(new Category(1,"Điện Thoại"));
        listCate.add(new Category(2,"Tablet"));
        listCate.add(new Category(3,"Laptop"));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
       
        String action = req.getServletPath();
        System.out.println(action);
        
        switch(action) {
            case "/product":
                //thêm list vào request để chuyển sang trang index.jsp sử dụng
                req.setAttribute("listProduct", list);
                req.setAttribute("listCategory", listCate);
                req.getRequestDispatcher("WEB-INF/product/index.jsp").forward(req, resp);
                break;
            case "/product/add":
                req.setAttribute("listCategory", listCate);
                req.getRequestDispatcher("/WEB-INF/product/add.jsp").forward(req, resp);
                break;
            case "/product/edit":
                //lấy id từ URL sau đó chạy vòng lặp tìm kiếm sản phẩm lặp trong list theo id
                req.setAttribute("category", listCate);
                int id = Integer.valueOf(req.getParameter("id"));
                for(Product product: list) {
                    if(product.getId() == id) {
                        req.setAttribute("product", product);
                        break;
                    }
                }
                //thêm sản phẩm tìm thấy vào request để chuyển qua trang edit
                req.getRequestDispatcher("/WEB-INF/product/edit.jsp").forward(req, resp);
                break;
            case "/product/delete":
                //lấy id từ URL sau đó chạy vòng lặp tìm kiếm sản phẩm lặp trong list theo id
                int idDel = Integer.valueOf(req.getParameter("id"));
                for(Product product: list) {
                    if(product.getId() == idDel) {
                        list.remove(product);
                        break;
                    }
                }
                //thêm sản phẩm tìm thấy vào request để chuyển qua trang edit
                resp.sendRedirect(req.getContextPath()+"/product");
                break;
            default:
                break;
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        
        String action = req.getServletPath();
        System.out.println(action);
        
      //b1: lấy thông tin từ form
        int id = Integer.valueOf(req.getParameter("id"));
        String name = req.getParameter("name");
        int quantity = Integer.valueOf(req.getParameter("quantity"));
        float price = Float.valueOf(req.getParameter("price"));
        int categoryId = Integer.valueOf(req.getParameter("categoryid"));
        
        switch(action) {
            case "/product/add":
                //b2: tạo đối tượng Product
                Product product = new Product();
                product = new Product();
                product.setId(id);
                product.setName(name);
                product.setQuantity(quantity);
                product.setPrice(price);
                product.setCategoryId(categoryId);
                //b3: thêm đối tượng vừa tạo vào list
                list.add(product);
                //b4:chuyển hướng về trang danh sách (index.jsp)
                //resp.sendRedirect(req.getContextPath()+"/product");
                break;
            case "/product/edit":
                for(Product item: list) {
                    if(item.getId() == id) {
                        item.setName(name);
                        item.setQuantity(quantity);
                        item.setPrice(price);
                        item.setCategoryId(categoryId);
                        break;
                    }
                }
                //b4:chuyển hướng về trang danh sách (index.jsp)
                //resp.sendRedirect(req.getContextPath()+"/product");
                break;
            default:
                break;
        }
        resp.sendRedirect(req.getContextPath() + "/product");
    }

/*    private void layThongTinSanPham() {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/product/add.jsp");
        dispatcher.forward(req,resp);
        String teSanPham = req.getParameter("fullname");
//      int namSinh = Integer.valueOf(req.getParameter("year"));
//      int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
    }*/

}
