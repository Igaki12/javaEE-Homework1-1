package model;

public class Judge {
	public String Judge(String point) {
		try {
			point.trim();
			int intpoint = Integer.parseInt(point);
			if (intpoint >= 0 && intpoint < 50) {
				return "頑張りましょう";
			}
			else if (intpoint >= 50 && intpoint <80) {
				return "よくできました";
			}
			else if(intpoint >= 80 && intpoint <100) {
				return "大変よくできました";
			}
			else {
				return "0~100を入力してください";
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return "0~100を入力してください";
		}
		
	}
}