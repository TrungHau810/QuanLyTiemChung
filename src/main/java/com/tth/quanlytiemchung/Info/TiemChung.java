package com.tth.quanlytiemchung.Info;

import com.tth.quanlytiemchung.Vaccine.Vaccine;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author TH
 */
public class TiemChung {

    private Nguoi nguoi;
    private Vaccine vaccine;
    private LocalDate ngayTiem;
    private String diaDiem;
    private int soMui;

    public TiemChung(Nguoi nguoi, Vaccine vaccine, LocalDate ngayTiem, String diaDiem, int soMui) throws Exception {
        if (ngayTiem.getYear() - this.nguoi.getNgaySinh().getYear() >= 18) {
            this.nguoi = nguoi;
            this.vaccine = vaccine;
            this.ngayTiem = ngayTiem;
            this.diaDiem = diaDiem;
            this.soMui = soMui;

        } else {
            throw new Exception("Invalid data!");
        }
    }

    public TiemChung(Nguoi nguoi, Vaccine vaccine, String ngayTiem, String diaDiem, int soMui) throws Exception {
        if (LocalDate.parse(ngayTiem, DateTimeFormatter.ofPattern(CauHinh.FOMAT_DATE)).getYear() - this.nguoi.getNgaySinh().getYear() >= 18) {
            this.nguoi = nguoi;
            this.vaccine = vaccine;
            this.ngayTiem = LocalDate.parse(ngayTiem, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            this.diaDiem = diaDiem;
        } else {
            throw new Exception("Invalid data!");
        }
    }

    public void hienThi() {
        System.out.printf("Ho ten: %s\nCCCD: %d\nNgay sinh: %t\nTen vaccine: %s\nNgay tiem: %t\nDia diem tiem: %s",
                this.nguoi.getHoTen(),
                this.nguoi.getCccd(),
                this.nguoi.getNgaySinh(),
                this.vaccine.getTenVaccine(),
                this.ngayTiem, this.diaDiem);
    }

}
