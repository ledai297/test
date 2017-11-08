import javax.swing.JOptionPane;

public class HienThiHaiSo {
	public static void main(String[] args) {
		String strSo1,strSo2;
		strSo1=JOptionPane.showInputDialog(null,"Hay nhap so thu nhat : ","Le Trong Dai- 20155320",JOptionPane.INFORMATION_MESSAGE);
		strSo2=JOptionPane.showInputDialog(null,"Hay nhap so thu hai : ","Le Trong Dai- 20155320",JOptionPane.INFORMATION_MESSAGE);
		int sum=0;
		int so1=Integer.parseInt(strSo1);
		int so2=Integer.parseInt(strSo2);
		sum=so1+so2;
		JOptionPane.showMessageDialog(null, "Tong hai so la: "+sum,"Le Trong Dai- 20155320",JOptionPane.INFORMATION_MESSAGE);
		
		
		}

}
