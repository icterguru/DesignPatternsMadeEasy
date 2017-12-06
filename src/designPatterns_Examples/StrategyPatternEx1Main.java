/**
 * <br>
 * http://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */



interface Strategy {
	 public int doOperation(int num1, int num2);
}

class StrategyContext {
	private Strategy strategy;

	   public StrategyContext(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
}

class OperationAdd implements Strategy{
	@Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
}

class OperationMultiply implements Strategy{
	 @Override
	   public int doOperation(int num1, int num2) {
	      return num1 * num2;
	   }
}

class OperationSubstract implements Strategy{
	@Override
	   public int doOperation(int num1, int num2) {
	      return num1 - num2;
	   }
}


public class StrategyPatternEx1Main {

	public static void main(String[] args) {
		StrategyContext context = new StrategyContext(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new StrategyContext(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new StrategyContext(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}


