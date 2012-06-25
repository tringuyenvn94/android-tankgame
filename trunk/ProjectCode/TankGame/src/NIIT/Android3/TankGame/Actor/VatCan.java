package NIIT.Android3.TankGame.Actor;

public class VatCan extends NhanVatChung{
	private Boolean ChoTankDiQua;
	private Boolean ChoDanDiQua;
	
	public VatCan(){
		super();
		this.ChoDanDiQua = false;
		this.ChoTankDiQua = false;
	}
	
	public VatCan(String ten, int toaDoAnhX, int toaDoAnhY, int toaDoX, int toaDoY,
			Boolean ChoTankDiQua, Boolean ChoDanDiQua){
		super(ten, toaDoAnhX, toaDoAnhY, toaDoX, toaDoY);
		this.ChoDanDiQua = ChoDanDiQua;
		this.ChoTankDiQua = ChoTankDiQua;
	}
	
	public Boolean getChoTankDiQua() {
		return ChoTankDiQua;
	}
	public void setChoTankDiQua(Boolean choTankDiQua) {
		ChoTankDiQua = choTankDiQua;
	}
	
	public Boolean getChoDanDiQua() {
		return ChoDanDiQua;
	}
	public void setChoDanDiQua(Boolean choDanDiQua) {
		ChoDanDiQua = choDanDiQua;
	}	
}
