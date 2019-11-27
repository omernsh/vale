package com.example.vale_yeni;



public class Eski_Veriler {

    String ad_soyad;
    String plaka;
    String tel_no;
    String tarih;
    String vale_ücreti;
    String ekstra;
    String ekstra_ücreti;
    String not;
    String toplam_ücret;


    public Eski_Veriler(){

    }

    public Eski_Veriler(String ad_soyad, String plaka, String tel_no, String tarih, String vale_ücreti, String ekstra, String ekstra_ücreti,String not,String toplam_ücret) {
        this.ad_soyad = ad_soyad;
        this.plaka = plaka;
        this.tel_no = tel_no;
        this.tarih = tarih;
        this.ekstra = ekstra;
        this.ekstra_ücreti = ekstra_ücreti;
        this.vale_ücreti = vale_ücreti;
        this.not = not;
        this.toplam_ücret = toplam_ücret;


    }


    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public void setVale_ücreti(String vale_ücreti) {
        this.vale_ücreti = vale_ücreti;
    }

    public void setEkstra(String ekstra) {
        this.ekstra = ekstra;
    }

    public void setEkstra_ücreti(String ekstra_ücreti) {
        this.ekstra_ücreti = ekstra_ücreti;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public void setToplam_ücret(String toplam_ücret) {
        this.toplam_ücret = toplam_ücret;
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public String getPlaka() {
        return plaka;
    }

    public String getTel_no() {
        return tel_no;
    }

    public String getTarih() {
        return tarih;
    }

    public String getVale_ücreti() {
        return vale_ücreti;
    }

    public String getEkstra() {
        return ekstra;
    }

    public String getEkstra_ücreti() {
        return ekstra_ücreti;
    }

    public String getNot() {
        return not;
    }

    public String getToplam_ücret() {
        return toplam_ücret;
    }
}
