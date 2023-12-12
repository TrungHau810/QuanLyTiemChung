package com.tth.quanlytiemchung.Info;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Trung Hau
 */
public class Nguoi {

    private int cccd;
    private String hoTen;
    // 0 : nam
    // 1 : nữ
    private int gioiTinh;
    private String sdt;
    private LocalDate ngaySinh;

    public Nguoi(int cccd, String hoTen, int gioiTinh, String sdt, LocalDate ngaySinh) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
    }

    public Nguoi(int cccd, String hoTen, int gioiTinh, String sdt, String ngaySinh) {
        this(cccd, hoTen, gioiTinh, sdt,
                LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)));
    }

    /**
     * @return the cccd
     */
    public int getCccd() {
        return cccd;
    }

    /**
     * @param cccd the cccd to set
     */
    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public int getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}
