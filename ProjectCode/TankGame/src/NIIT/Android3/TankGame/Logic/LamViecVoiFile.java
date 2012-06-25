package NIIT.Android3.TankGame.Logic;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import NIIT.Android3.TankGame.Actor.VatCan;
import NIIT.Android3.TankGame.Constant.*;

public class LamViecVoiFile {	
	/**
	 * Đọc dữ liệu từ file bản đồ và lưu nó vào 1 list kiểu VatCan
	 * @return trả về danh sách VatCan
	 * */
	public ArrayList<VatCan> DocTuFileBanDo(String tenFile) {
		ArrayList<VatCan> danhSachVatCan = new ArrayList<VatCan>();

		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(tenFile);

			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			int dong = 0;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Cho biết trong 1 dòng có bao nhiêu nhân vật
				int soLuongMotDong = SoLuongDauPhay(strLine) + 1;

				// Cắt chuỗi
				String[] diemNhanVat = strLine.split(Constant.DIEMCAT_1);

				// Xét dữ liệu cho một nhân vật
				for (int i = 0; i < soLuongMotDong; i++) {
					VatCan vc = new VatCan();
					vc = XetThuocTinhVatCan(diemNhanVat[i]);
					vc.setToaDoX(i * Constant.DORONG_TUNGPHANTUMAP);
					vc.setToaDoY(dong * Constant.CHIEUDAI_TUNGPHANTUMAP);
					
					//Thêm 1 vật cản vào danh sách
					danhSachVatCan.add(vc);

					// Gắn giá trị cho 1 string
					strLine = br.readLine();

					// Gắn dữ liệu cho Dong
					dong = dong + 1;
				}

			}

			// Close the input stream
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return danhSachVatCan;
	}

	/**
	 * Hàm để đếm số dấu phẩy của một chuỗi bất kỳ
	 * 
	 * @param chuoiKyTu
	 *            : là chuỗi ký tự bất kỳ
	 * @return trả về số lượng dấu phảy trong chuỗi đó
	 * */
	private int SoLuongDauPhay(String chuoiKyTu) {
		int soLuong = 0;
		if (chuoiKyTu != null) {
			char[] mangPhanTuCuaChuoi = chuoiKyTu.toCharArray();

			for (int i = 0; i < mangPhanTuCuaChuoi.length; i++) {
				if (mangPhanTuCuaChuoi[i] == Constant.DIEMCAT_2) {
					soLuong = soLuong + 1;
				}
			}
		}

		return soLuong;
	}

	/**
	 * Hàm để xét các thuộc tính cho vật cản
	 * 
	 * @param tenVietTat
	 *            : tên viết tắt của vật cản
	 * @return trả về vật cản đã được xét các thuộc tính tương ứng
	 * */
	private VatCan XetThuocTinhVatCan(String tenVietTat) {
		VatCan vc = new VatCan();
		if (tenVietTat.equals(Constant.NAME_NEN_VIETTAT) == true) {
			vc.setTen(Constant.NAME_NEN_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_0);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else if (tenVietTat.equals(Constant.NAME_GACH_VIETTAT) == true) {
			vc.setTen(Constant.NAME_GACH_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_0);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(false);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_BETONG_VIETTAT) == true) {
			vc.setTen(Constant.NAME_BETONG_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_20);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(false);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_RAOTHEP_VIETTAT) == true) {
			vc.setTen(Constant.NAME_RAOTHEP_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_20);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_TUONGREU_VIETTAT) == true) {
			vc.setTen(Constant.NAME_TUONGREU_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_40);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else if (tenVietTat.equals(Constant.NAME_HONUOC_VIETTAT) == true) {
			vc.setTen(Constant.NAME_HONUOC_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_40);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_MATBANG_VIETTAT) == true) {
			vc.setTen(Constant.NAME_MATBANG_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_60);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else if (tenVietTat.equals(Constant.NAME_LOCOT1_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOT1_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_80);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(false);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_LOCOT2_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOT2_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_100);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(false);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_LOCOT3_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOT3_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_100);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(false);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_LOCOT4_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOT4_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_80);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(false);
			vc.setChoTankDiQua(false);
		} else if (tenVietTat.equals(Constant.NAME_LOCOTNO1_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOTNO1_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_120);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else if (tenVietTat.equals(Constant.NAME_LOCOTNO2_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOTNO2_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_140);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else if (tenVietTat.equals(Constant.NAME_LOCOTNO3_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOTNO3_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_140);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else if (tenVietTat.equals(Constant.NAME_LOCOTNO4_VIETTAT) == true) {
			vc.setTen(Constant.NAME_LOCOTNO4_DAYDU);
			vc.setToaDoAnhX(Constant.TOADO_120);
			vc.setToaDoAnhY(Constant.TOADO_20);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		} else {
			vc.setTen(Constant.NO_NAME);
			vc.setToaDoAnhX(Constant.TOADO_0);
			vc.setToaDoAnhY(Constant.TOADO_0);
			vc.setChoDanDiQua(true);
			vc.setChoTankDiQua(true);
		}

		return vc;
	}
}