package behavioral_cciimmnosstv.templateMethod;

public class TemplateMethodPatternMainApp {

	public static void main(String[] args) {
		 GameTemplate game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new FootBall();
	      game.play();
	      game = new BaseBall();
	      game.play();
	}

}
