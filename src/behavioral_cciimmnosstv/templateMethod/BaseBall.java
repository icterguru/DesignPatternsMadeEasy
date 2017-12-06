package behavioral_cciimmnosstv.templateMethod;

public class BaseBall extends GameTemplate {

	   @Override
	   void endPlay() {
	      System.out.println("BaseBall Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("BaseBall Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("BaseBall Game Started. Enjoy the game!");
	   }
	}
