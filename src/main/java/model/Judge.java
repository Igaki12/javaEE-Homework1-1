package model;

public class Judge {
	public String Judge(String point) {
		try {
			point.trim();
			int intpoint = Integer.parseInt(point);
			if (intpoint >= 0 && intpoint < 50) {
				return "�撣��܂��傤";
			}
			else if (intpoint >= 50 && intpoint <80) {
				return "�悭�ł��܂���";
			}
			else if(intpoint >= 80 && intpoint <100) {
				return "��ς悭�ł��܂���";
			}
			else {
				return "0~100����͂��Ă�������";
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return "0~100����͂��Ă�������";
		}
		
	}
}