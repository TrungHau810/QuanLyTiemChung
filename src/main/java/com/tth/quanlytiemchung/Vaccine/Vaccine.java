package com.tth.quanlytiemchung.Vaccine;

/**
 *
 * @author Trung Hau
 */
public class Vaccine {

    private static int dem = 0;
    private int maVaccine = ++dem;
    private String tenVaccine;
    private String xuatXu;

    public Vaccine() {

    }

    public Vaccine(String tenVaccine, String xuatXu) {
        this.tenVaccine = tenVaccine;
        this.xuatXu = xuatXu;
    }

    public void hienThi() {
        System.out.printf("%s - %s\n", this.getTenVaccine(), this.getXuatXu());
    }

    /**
     * @return the maVaccine
     */
    public int getMaVaccine() {
        return maVaccine;
    }

    /**
     * @param maVaccine the maVaccine to set
     */
    public void setMaVaccine(int maVaccine) {
        this.maVaccine = maVaccine;
    }

    /**
     * @return the tenVaccine
     */
    public String getTenVaccine() {
        return tenVaccine;
    }

    /**
     * @param tenVaccine the tenVaccine to set
     */
    public void setTenVaccine(String tenVaccine) {
        this.tenVaccine = tenVaccine;
    }

    /**
     * @return the xuatXu
     */
    public String getXuatXu() {
        return xuatXu;
    }

    /**
     * @param xuatXu the xuatXu to set
     */
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
}
