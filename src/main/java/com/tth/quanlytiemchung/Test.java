package com.tth.quanlytiemchung;

import com.tth.quanlytiemchung.Info.Nguoi;
import com.tth.quanlytiemchung.Info.QuanLyTiemChung;
import com.tth.quanlytiemchung.Info.TiemChung;
import com.tth.quanlytiemchung.Vaccine.Vaccine;

/**
 *
 * @author Trung Hau
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        Vaccine vc1 = new Vaccine("Fizer", "My");
//        vc1.hienThi();

//        Nguoi n1 = new Nguoi(123, "Nguyen Van A", 1, "02453", "14/04/2004");
//        TiemChung t1 = new TiemChung(n1, vc1, "17/12/2023", "ben tre", 0);
//        t1.hienThi();
        QuanLyTiemChung ds = new QuanLyTiemChung();
        ds.themInfoTC();
        ds.hienThi();
    }
}
