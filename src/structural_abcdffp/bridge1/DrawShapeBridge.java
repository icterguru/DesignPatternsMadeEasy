package structural_abcdffp.bridge1;

public abstract class DrawShapeBridge {
	   protected DrawAPI drawAPI;

	   protected DrawShapeBridge(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();
	}