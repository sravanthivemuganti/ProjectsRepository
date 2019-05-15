package com.apex.customer.service.bean;

import java.util.Arrays;
import java.util.List;

public class UsersPage {

	int page;
    int per_page;
    int  total;
    int total_pages;
    List<UserPageDetails> data;
	
	public UsersPage() {
		super();
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	
	public List<UserPageDetails> getData() {
		return data;
	}
	public void setData(List<UserPageDetails> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "UsersPage [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + data + "]";
	}
	
   
}
