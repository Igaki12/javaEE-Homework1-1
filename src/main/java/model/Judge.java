package model;

public class Judge {
	public String Judge(String point) {
		try {
			point.trim();
			int intpoint = Integer.parseInt(point);
			if (intpoint >= 0 && intpoint < 50) {
				return "Šæ’£‚è‚Ü‚µ‚å‚¤";
			}
			else if (intpoint >= 50 && intpoint <80) {
				return "‚æ‚­‚Å‚«‚Ü‚µ‚½";
			}
			else if(intpoint >= 80 && intpoint <100) {
				return "‘å•Ï‚æ‚­‚Å‚«‚Ü‚µ‚½";
			}
			else {
				return "0~100‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢";
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return "0~100‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢";
		}
		
	}
}