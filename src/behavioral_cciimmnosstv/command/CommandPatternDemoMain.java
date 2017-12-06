package behavioral_cciimmnosstv.command;

/**
 * @author HossaiM
 * <br>
 * http://www.tutorialspoint.com/design_pattern/command_pattern.htm
 */
public class CommandPatternDemoMain {
		   public static void main(String[] args) {
		      Stock abcStock = new Stock();

		      BuyStock buyStockOrder = new BuyStock(abcStock);
		      SellStock sellStockOrder = new SellStock(abcStock);

		      Broker broker = new Broker();
		      broker.takeOrder(buyStockOrder);
		      broker.takeOrder(sellStockOrder);

		      broker.placeOrders();
		   }
		}