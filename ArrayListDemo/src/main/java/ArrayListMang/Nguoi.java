/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListMang;

import java.util.Objects;

/**
 *
 * @author Chi Thuc
 */
public class Nguoi {
    private String soCMND;
    private String ten;
    private int tuoi;

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Nguoi(String soCMND, String ten, int tuoi) {
        this.soCMND = soCMND;
        this.ten = ten;
        this.tuoi = tuoi;
    }
    
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "soCMND=" + soCMND + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.soCMND);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nguoi other = (Nguoi) obj;
        if (!Objects.equals(this.soCMND, other.soCMND)) {
            return false;
        }
        return true;
    }
    
}
