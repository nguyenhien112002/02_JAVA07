package com.myclass.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myclass.dao.JobDao;
import com.myclass.entity.Job;
import com.myclass.entity.Role;

@WebServlet(urlPatterns = { "/job", "/job/add", "/job/edit", "/job/delete" })
public class JobController extends HttpServlet {
    JobDao jobDao = null;

    public JobController() {
        jobDao = new JobDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        System.out.println(action);
        switch (action) {
        case "/job":
            List<Job> listJob = jobDao.findAll();
            req.setAttribute("jobs", listJob);
            req.getRequestDispatcher("/WEB-INF/views/job/index.jsp").forward(req, resp);
            break;
        case "/job/add":
            req.getRequestDispatcher("/WEB-INF/views/job/add.jsp").forward(req, resp);
            break;
        case "/job/edit":
            int idEdit = Integer.valueOf(req.getParameter("id"));
            Job job = jobDao.findById(idEdit);
            req.setAttribute("job", job);
            req.getRequestDispatcher("/WEB-INF/views/job/edit.jsp").forward(req, resp);
            break;
        case "/job/delete":
            int idDel = Integer.valueOf(req.getParameter("id"));
            jobDao.deleteById(idDel);
            resp.sendRedirect(req.getContextPath() + "/job");
            return;
        default:
            break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();

        String name = req.getParameter("name");
        Date startDate = Date.valueOf(req.getParameter("startDate"));
        Date endDate = Date.valueOf(req.getParameter("endDate"));
        Job job = null;

        switch (action) {
        case "/job/add":
            job = new Job(name, startDate, endDate);
            if (jobDao.add(job) == -1) {
                req.setAttribute("message", "Thêm mới thất bại");
                req.getRequestDispatcher("/WEB-INF/views/job/add.jsp").forward(req, resp);
            }
            break;
        case "/job/edit":
            int idEdit = Integer.valueOf(req.getParameter("id"));
            job = new Job(idEdit,name, startDate, endDate);
            if (jobDao.update(job) == -1) {
                req.setAttribute("message", "Cập nhật thất bại");
                req.getRequestDispatcher("/WEB-INF/views/job/job.jsp").forward(req, resp);
            }
            break;
        default:
            break;
        }
        resp.sendRedirect(req.getContextPath() + "/job");

    }
}
