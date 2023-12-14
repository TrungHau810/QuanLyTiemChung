package com.tth.quanlytiemchung.Info;

import com.tth.quanlytiemchung.Vaccine.Vaccine;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author TH
 */
public class TiemChung {

    private Nguoi nguoi = new Nguoi();
    private Vaccine vaccine = new Vaccine();
    private LocalDate ngayTiem;
    private String diaDiem;
    private int soMui;

    public TiemChung() {

    }

    public void nhap1TiemChung() throws Exception {
        System.out.println("Nhap thong tin tiem chung");
        nguoi.nhapInfo();
        vaccine.nhapInfo();
        System.out.print("Ngay tiem (dd/MM/yyyy): ");
        String date = CauHinh.sc.nextLine();
        if (LocalDate.parse(date, DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)).getYear() - nguoi.getNgaySinh().getYear() >= 18) {
            this.setNgayTiem(LocalDate.parse(date, DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)));
        } else {
            throw new Exception("Nguoi nay chua du 18 tuoi!");
        }
        System.out.print("Dia diem tiem: ");
        this.setDiaDiem(CauHinh.sc.nextLine());
    }

    public TiemChung(Nguoi nguoi, Vaccine vaccine, LocalDate ngayTiem, String diaDiem, int soMui) throws Exception {
        if (ngayTiem.getYear() - nguoi.getNgaySinh().getYear() >= 18) {
            this.vaccine = vaccine;
            this.ngayTiem = ngayTiem;
            this.diaDiem = diaDiem;
            this.soMui = soMui;

        } else {
            throw new Exception("Invalid data!");
        }
    }

    public TiemChung(Nguoi nguoi, Vaccine vaccine, String ngayTiem, String diaDiem, int soMui) throws Exception {
        if (LocalDate.parse(ngayTiem, DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)).getYear() - nguoi.getNgaySinh().getYear() >= 18) {
            this.vaccine = vaccine;
            this.ngayTiem = LocalDate.parse(ngayTiem, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            this.diaDiem = diaDiem;
        } else {
            throw new Exception("Nguoi nay chua du 18 tuoi de tiem chung!");
        }
    }

    public void hienThi() {
        nguoi.hienThi();
        vaccine.hienThi();
        System.out.printf("Ngay tiem: %s\nDia diem tiem: %s",
                this.getNgayTiem().format(DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)), this.getDiaDiem());
    }

    /**
     * @return the vaccine
     */
    public Vaccine getVaccine() {
        return vaccine;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    /**
     * @return the ngayTiem
     */
    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    /**
     * @param ngayTiem the ngayTiem to set
     */
    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    /**
     * @return the diaDiem
     */
    public String getDiaDiem() {
        return diaDiem;
    }

    /**
     * @param diaDiem the diaDiem to set
     */
    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    /**
     * @return the soMui
     */
    public int getSoMui() {
        return soMui;
    }

    /**
     * @param soMui the soMui to set
     */
    public void setSoMui(int soMui) {
        this.soMui = soMui;
    }
}
