import javax.swing.JOptionPane;

public class Bai1_5_1 {
	public static void main(String[] args) {
		String strSo;
		double iLuaChon;
		double sum=0,number;
		do{
		strSo=JOptionPane.showInputDialog(null,"Nhap so : ","Le Trong Dai- 20155320",JOptionPane.INFORMATION_MESSAGE);
		iLuaChon=JOptionPane.showConfirmDialog(null, "Ban co muon nhap tiep khong?", "Le Trong Dai- 20155320", JOptionPane.INFORMATION_MESSAGE);
		number=Double.parseDouble(strSo);
		sum+=number;
		}while(iLuaChon==JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "Tong cac so da nhap la: "+sum, "Le Trong Dai- 20155320", JOptionPane.INFORMATION_MESSAGE);
	}

}
