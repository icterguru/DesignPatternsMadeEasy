package behavioral_cciimmnosstv.templateMethod;

public class FootBall extends GameTemplate {

	   @Override
	   void endPlay() {
	      System.out.println("FootBall Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("FootBall Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("FootBall Game Started. Enjoy the game!");
	   }
	}
