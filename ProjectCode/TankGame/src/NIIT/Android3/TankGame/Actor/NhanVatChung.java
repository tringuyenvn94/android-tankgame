package NIIT.Android3.TankGame.Actor;

import NIIT.Android3.TankGame.Constant.Constant;

public abstract class NhanVatChung {
	private String ten;
	private int toaDoAnhX;
	private int toaDoAnhY;
	private int toaDoX;
	private int toaDoY;
	
	public NhanVatChung(){
		this.ten = Constant.NO_NAME;
		this.toaDoAnhX = 0;
		this.toaDoAnhY = 0;
		this.toaDoX = 0;
		this.toaDoY = 0;
	}
	
	public NhanVatChung(String ten, int toaDoAnhX, int toaDoAnhY, int toaDoX, int toaDoY){
		this.ten = ten;
		this.toaDoAnhX = toaDoAnhX;
		this.toaDoAnhY = toaDoAnhY;
		this.toaDoX = toaDoX;
		this.toaDoY = toaDoY;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getToaDoAnhX() {
		return toaDoAnhX;
	}
	public void setToaDoAnhX(int toaDoAnhX) {
		this.toaDoAnhX = toaDoAnhX;
	}
	
	public int getToaDoAnhY() {
		return toaDoAnhY;
	}
	public void setToaDoAnhY(int toaDoAnhY) {
		this.toaDoAnhY = toaDoAnhY;
	}
	
	public int getToaDoX() {
		return toaDoX;
	}
	public void setToaDoX(int toaDoX) {
		this.toaDoX = toaDoX;
	}
	
	public int getToaDoY() {
		return toaDoY;
	}
	public void setToaDoY(int toaDoY) {
		this.toaDoY = toaDoY;
	}
}
