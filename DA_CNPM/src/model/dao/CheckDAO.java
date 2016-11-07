package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.QuangCao;
import model.bean.Tindang;
import model.bean.Vacxin;
import model.bean.News;

public class CheckDAO extends BaseDAO {
	public boolean ThemQuangCao(String ten, String ngay, String han, String gia, String image) {
		getConnection();
		String sql = "insert into QuangCao(Ten,NgayDang,Han,Gia,Image) values(" + "'" + ten + "'" + ",'" + ngay + "'"
				+ ",'" + han + "'" + ",'" + gia + "'" + ",'" + image + "')";
		return isExcute(sql);
	}

	public boolean XoaQuangCao(String ma) {
		getConnection();
		String sql = "DELETE FROM QUANGCAO WHERE  Ten =" + "'" + ma + "'";
		return isExcute(sql);
	}

	public ArrayList<QuangCao> getQuangCao() {
		ArrayList<QuangCao> arrV = new ArrayList<QuangCao>();
		String sql = "select * from QUANGCAO";

		try {
			getConnection();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				QuangCao v = new QuangCao();
				v.setMa(rs.getString(1));
				v.setTen(rs.getString(2));
				v.setNgay(rs.getString(3));
				v.setHan(rs.getInt(4));
				v.setGia(rs.getString(5));
				v.setImage(rs.getString(6));
				arrV.add(v);
			}
			closeConnection();
			return arrV;
		} catch (SQLException e) {
			System.out.println("hello");
			closeConnection();
			e.printStackTrace();
		}
		return null;
	}

	public boolean isThemVacxin(String ma, String ten, String sl, String mota, String gia, String tensx) {
		getConnection();
		String sql = "insert into VACXIN(MaVacxin,TenVacxin,SoLuongMui,MoTa,GiaVacxin,TenHangsx) values(" + "'" + ma
				+ "'" + ",'" + ten + "'" + ",'" + sl + "'" + ",'" + mota + "'" + ",'" + gia + "'" + ",'" + tensx + "'"
				+ ")";
		return isExcute(sql);
	}

	public ArrayList<Vacxin> getVacxin() {
		ArrayList<Vacxin> arrV = new ArrayList<Vacxin>();
		String sql = "select * from VACXIN";

		try {
			getConnection();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Vacxin v = new Vacxin();
				v.setMa(rs.getString(1));
				v.setTen(rs.getString(2));
				v.setSl(rs.getInt(3));
				v.setMt(rs.getString(4));
				v.setGia(rs.getInt(5));
				v.setTensx(rs.getString(6));
				arrV.add(v);
			}
			closeConnection();
			return arrV;
		} catch (SQLException e) {
			System.out.println("hello");
			closeConnection();
			e.printStackTrace();
		}
		return null;
	}

	public boolean isCapNhatVacxin(String ma, String ten, String sl, String mota, String gia, String tensx) {
		String sql = "update VACXIN set TenVacxin='" + ten + "',SoluongMui='" + sl + "',MoTa='" + mota + "',GiaVacxin='"
				+ gia + "',TenhangSX='" + tensx + "'" + " where Mavacxin='" + ma + "'";
		System.out.println(sql);
		return isExcute(sql);
	}

	public ArrayList<String> getLichSu() {
		ArrayList<String> arrayList = new ArrayList<String>();
		String sql = "select KHACHHANG.MaKH, HoTenKH,TenBenh,VACXIN.MaVacxin,TenVacxin,SoLuongMui "
				+ " from KHACHHANG,VACXIN,LICHSUTIEMPHONG,PHONGBENH,BENH"
				+ " where KHACHHANG.MAKH = LICHSUTIEMPHONG.MaKH " + " and VACXIN.MaVacxin = LICHSUTIEMPHONG.MaVacxin"
				+ " and VACXIN.MaVacxin = PHONGBENH.MaVacxin" + " and BENH.MaBenh = PHONGBENH.MaBenh";
		try {
			getConnection();
			System.out.println(sql);
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String arr = "";
				arr += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + ","
						+ rs.getString(5) + "," + rs.getString(6);
				arrayList.add(arr);
			}
			closeConnection();
			return arrayList;
		} catch (SQLException e) {
			System.out.println("hello");
			closeConnection();
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<String> getThongKe() {
		ArrayList<String> arrayList = new ArrayList<String>();
		String sql = "select KHACHHANG.MaKH,HoTenKH,DiaChiKH,GiaVacxin from KHACHHANG,LICHSUTIEMPHONG, VACXIN"
				+ " where KHACHHANG.MaKH= LICHSUTIEMPHONG.MaKH" + " and VACXIN.MaVacxin= LICHSUTIEMPHONG.MaVacxin";
		try {
			getConnection();
			System.out.println(sql);
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String arr = "";
				arr += rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4);
				arrayList.add(arr);
			}
			closeConnection();
			return arrayList;
		} catch (SQLException e) {
			System.out.println("hello");
			closeConnection();
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Tindang> getTindang() {
		ArrayList<Tindang> arrTD = new ArrayList<Tindang>();
		String sql = "select * from dbo.vtinchuadang";

		try {
			getConnection();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Tindang td = new Tindang();
				td.setId(rs.getString(1));
				td.setUsername(rs.getString(2));
				td.setTitle(rs.getString(3));
				td.setContent(rs.getString(4));
				td.setSalebuy(rs.getBoolean(5));
				td.setAddress(rs.getString(6));
				td.setCost(rs.getString(7));
				td.setLinkImage(rs.getString(8));
				arrTD.add(td);
			}
			closeConnection();
			return arrTD;
		} catch (SQLException e) {
			System.out.println("hello sai roi kia");
			closeConnection();
			e.printStackTrace();
			return null;
		}

	}

	public boolean isThemTindang(Tindang tindang) {
		getConnection();
		String sql = "insert into DANGTIN(chuyenmuc,vung,banla,bandangtin,tieuderao,noidung,dienthoai,giatien,trangthai,thanhvien) values("
				+ "'"

				+ ")";
		return isExcute(sql);
	}

	public boolean isduyettin(String idtin, String key) {
		int b = -1;
		if ("1".equals(key))
			b = 0;
		else if ("0".equals(key) || "".equals(key))
			b = 1;
		// int id = Integer.parseInt(idtin);
		String sql = "update tindang set tindang.trangthai=" + b + " where tindang.id_tindang=" + idtin + "";
		System.out.println(sql);
		return isExcute(sql);
	}

	public boolean isxoatin(String idtin) {

		getConnection();
		String sql = "DELETE FROM tindang WHERE tindang.id_tindang=" + "" + idtin + "";
		return isExcute(sql);
	}

	public ArrayList<Tindang> getTindadang(String name) {
		ArrayList<Tindang> arrTDD = new ArrayList<Tindang>();
		String sql = "select * from vtindadang";

		try {
			getConnection();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Tindang td = new Tindang();
				td.setId(rs.getString(1));
				td.setUsername(rs.getString(2));
				td.setTitle(rs.getString(3));
				td.setContent(rs.getString(4));
				td.setSalebuy(rs.getBoolean(5));
				td.setAddress(rs.getString(6));
				td.setCost(rs.getString(7));
				td.setLinkImage(rs.getString(8));
				arrTDD.add(td);

			}
			closeConnection();
			return arrTDD;
		} catch (SQLException e) {
			System.out.println("hello sai roi kia");
			closeConnection();
			e.printStackTrace();
			return null;
		}

	}

	public ArrayList<News> getMatHang(String idnew) {
		ArrayList<News> arrTDD = new ArrayList<News>();
		String sql = "select * from fthongtinmathang('" + idnew + "');";

		try {
			getConnection();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				News mh = new News();
				mh.setIdnew(rs.getString(1));
				mh.setIdAccount(rs.getString(2));
				mh.setTitle(rs.getString(3));
				mh.setContent(rs.getString(4));
				mh.setIdcategory(rs.getString(5));
				mh.setCost(rs.getString(6));
				mh.setIdcategory(rs.getString(7));
				mh.setAddress(rs.getString(8));
				mh.setContent(rs.getString(9));
				mh.setPhoto(rs.getString(10));
				arrTDD.add(mh);

			}
			closeConnection();
			return arrTDD;
		} catch (SQLException e) {
			System.out.println("hello sai roi kia");
			closeConnection();
			e.printStackTrace();
			return null;
		}

	}
}
