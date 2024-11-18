/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    
    private int masanpham;
    private String tensanpham;
    private int dongia;
    private int maloai;
    private String hinh;
    private boolean khuyenmai;
    

    public SanPham() {
    }

    public SanPham(int masanpham, String tensanpham, int dongia, int maloai, String hinh, boolean khuyenmai) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.dongia = dongia;
        this.maloai = maloai;
        this.hinh = hinh;
        this.khuyenmai = khuyenmai;
    }

   

    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public boolean isKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(boolean khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masanpham=" + masanpham + ", tensanpham=" + tensanpham + ", dongia=" + dongia + ", maloai=" + maloai + ", hinh=" + hinh + ", khuyenmai=" + khuyenmai + '}';
    }

   
}
