/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package dao;

import context.DbContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TheLoai;

/**
 *
 * @author ADMIN
 */
public class TheLoaiDAO  {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
   
   
    public ArrayList<TheLoai> getAll()
    {
        ArrayList<TheLoai> ds = new ArrayList<>();
        String sql = "select * from TheLoai";
        conn =new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new TheLoai(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;    
    }
   
    public static void main(String[] args) {
         TheLoaiDAO cDAO = new TheLoaiDAO();
         for(TheLoai c: cDAO.getAll())
         {
             System.out.println(c);
         }
    }
}