import javax.swing.JOptionPane;

public class LuaChon {
	public static void main(String[] args) {
		int iLuaChon;
		String strLuaChon;
		
		iLuaChon=JOptionPane.showConfirmDialog(null, "Ban co muon chuyen sang ve hang nhat khong?");
		if(iLuaChon==JOptionPane.YES_OPTION){
			strLuaChon="co";
		}
		else{
			strLuaChon="khong";
		}
		JOptionPane.showMessageDialog(null, "ban da chon "+strLuaChon,"Le Trong Dai - 20155320",JOptionPane.INFORMATION_MESSAGE);
	}
}
