package com.tth.quanlytiemchung.Info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Trung Hau
 */
public class QuanLyTiemChung {
    private List <TiemChung> dstc = new ArrayList<>();

    public void themInfoTC(TiemChung...a) {
        this.dstc.addAll(Arrays.asList(a));
    }
    
    public  void themInfoTC() throws Exception {
        TiemChung t = new TiemChung();
        t.nhap1TiemChung();
        dstc.add(t);
    }

    public void hienThi() {
        this.dstc.forEach(h -> h.hienThi());
    }
    /**
     * @return the dstc
     */
    public List <TiemChung> getDstc() {
        return dstc;
    }

    /**
     * @param dstc the dstc to set
     */
    public void setDstc(List <TiemChung> dstc) {
        this.dstc = dstc;
    }
}
