import javax.swing.JOptionPane;

public class Bai1_5_2 {
	public static void main(String[] args) {
		String strThang, strNam;
		int iThang, iNam;
		strThang=JOptionPane.showInputDialog(null,"Nhap thang : ","Le Trong Dai-20155320",JOptionPane.INFORMATION_MESSAGE);
		iThang=Integer.parseInt(strThang);
		while(iThang<1||iThang>12){
			strThang=JOptionPane.showInputDialog(null,"nhap lai thang : ","Le Trong Dai-20155320",JOptionPane.ERROR_MESSAGE);
			iThang=Integer.parseInt(strThang);
		}
		strNam = JOptionPane.showInputDialog(null, "Nhap nam : ", "Le Trong Dai-20155320",
				JOptionPane.INFORMATION_MESSAGE);
		iNam = Integer.parseInt(strNam);
		if (iNam % 4 == 0) {
			switch (iThang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				JOptionPane.showMessageDialog(null, "Thang " + iThang +" nam "+iNam+ " co 31 ngay", "Le Trong Dai-20155320",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 2: {
				JOptionPane.showMessageDialog(null, "Thang 2 nam "+iNam+ " co 29 ngay", "Le Trong Dai-20155320",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				JOptionPane.showMessageDialog(null, "Thang " + iThang +" nam "+iNam+ " co 30 ngay", "Le Trong Dai-20155320",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}

			}
		}
		else {
			switch (iThang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				JOptionPane.showMessageDialog(null, "Thang " + iThang +" nam "+iNam+ " co 31 ngay", "Le Trong Dai-20155320",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 2: {
				JOptionPane.showMessageDialog(null, "Thang 2 nam "+iNam+" co 28 ngay", "Le Trong Dai-20155320",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				JOptionPane.showMessageDialog(null, "Thang " + iThang +" nam "+iNam+ " co 30 ngay", "Le Trong Dai-20155320",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}

			}
		}
	}
}
