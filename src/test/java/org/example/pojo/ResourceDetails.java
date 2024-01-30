package org.example.pojo;

import java.util.List;

public class ResourceDetails {
    private String page;
    private String per_page;
    private  String total;
    private String total_pages;

    private List<Data> data;
    private Support support;

    public String getPage() {
        return page;
    }

    // Setter
    public void setPage(String newName) {
        this.page = newName;
    }
    public String getPer_page() {
        return per_page;
    }

    // Setter
    public void setPer_page(String per_page) {
        this.per_page = per_page;
    }
    public String getTotal() {
        return page;
    }

    // Setter
    public void setTotal(String newName) {
        this.page = newName;
    }
    public String getTotal_pages() {
        return total_pages;
    }

    // Setter
    public void setTotal_pages(String newName) {
        this.total_pages = newName;
    }
    public List<Data> getData() {
        return data;
    }

    // Setter
    public void setData(List<Data> newName) {
        this.data = newName;
    }
    public Support getSupport() {
        return support;
    }

    // Setter
    public void setSupport(Support newName) {
        this.support = newName;
    }


}
