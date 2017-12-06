package structural_abcdffp.flyweight;

import java.util.HashMap;

public class FlwShapeFactory {
	 private static final HashMap<String, IFlwShape> circleMap = new HashMap();

	   public static IFlwShape getCircle(String color) {
	      FlwCircle circle = (FlwCircle)circleMap.get(color);

	      if(circle == null) {
	         circle = new FlwCircle(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color);
	      }
	      return circle;
	   }
}
