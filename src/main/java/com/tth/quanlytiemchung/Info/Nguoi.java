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
    private byte gioiTinh;
    private String sdt;
    private LocalDate ngaySinh;

    public Nguoi() {
    }

    public Nguoi(int cccd, String hoTen, byte gioiTinh, String sdt, LocalDate ngaySinh) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
    }

    public Nguoi(int cccd, String hoTen, byte gioiTinh, String sdt, String ngaySinh) {
        this(cccd, hoTen, gioiTinh, sdt,
                LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)));
    }

    public void nhapInfo() {
        System.out.print("CCCD: ");
        this.cccd = CauHinh.sc.nextInt();
        CauHinh.sc.nextLine();
        System.out.print("Ho ten: ");
        this.hoTen = CauHinh.sc.nextLine();
        System.out.print("Gioi tinh (nam: 0, nu: 1): ");
        this.gioiTinh = CauHinh.sc.nextByte();
        CauHinh.sc.nextLine();
        System.out.print("Ngay sinh (dd/MM/yyyy): ");
        this.ngaySinh = LocalDate.parse(CauHinh.sc.nextLine(), DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE));
    }

    public void hienThi() {
        System.out.printf("CCCD: %s\nHo ten: %s\nGioi tinh (nam: 0, nu: 1): %d\nNgay sinh: %s\n", cccd, hoTen, gioiTinh, ngaySinh);
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
    public void setGioiTinh(byte gioiTinh) {
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
