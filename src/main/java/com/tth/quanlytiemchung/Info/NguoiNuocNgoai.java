package com.tth.quanlytiemchung.Info;

import java.time.LocalDate;

/**
 *
 * @author Trung Hau
 */
public class NguoiNuocNgoai extends Nguoi{
    private int hoChieu;
    private String quocTinh;

    public NguoiNuocNgoai(int hoChieu, String quocTinh, int cccd, String hoTen, int gioiTinh, String sdt, LocalDate ngaySinh) {
        super(cccd, hoTen, gioiTinh, sdt, ngaySinh);
        this.hoChieu = hoChieu;
        this.quocTinh = quocTinh;
    }

    
    
    
}
