
public class BodyData {
	private int weight;
	private int height;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int idealWeight() {
		int rslt;
		
		rslt = height - 110;
		
		return rslt;
	}
	
	public boolean isTallerThan(BodyData b) {
		boolean rslt;
		
		if (this.height > b.height) {
			rslt = true;
		}
		else {
			rslt = false;
		}
		
		return rslt;
	}
	
	public boolean needDiet() {
		boolean rslt;
	
		if (weight > idealWeight()) {
			rslt = true;
		}
		else {
			rslt = false;
		}
		
		return rslt;
	}
}
