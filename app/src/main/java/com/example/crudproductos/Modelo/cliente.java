package com.example.crudproductos.Modelo;

public class cliente {
    private int id;
    private String nom;
    private String ruc;
    private String dic;

    public cliente() {
    }

    public cliente(String nom, String ruc, String dic, int id) {
        this.nom = nom;
        this.ruc = ruc;
        this.dic = dic;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDic() {
        return dic;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", ruc='" + ruc + '\'' +
                ", dic='" + dic + '\'' +
                '}';
    }
}
