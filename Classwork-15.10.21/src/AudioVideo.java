
public class AudioVideo extends Item {
	int MAX_BORROW_DAY = 7;

	public int getMAX_BORROW_DAY() {
		return MAX_BORROW_DAY;
	}

	public void setMAX_BORROW_DAY(int mAX_BORROW_DAY) {
		MAX_BORROW_DAY = mAX_BORROW_DAY;
	}
	
	int dueDate() {
		return MAX_BORROW_DAY;
		
	}

}
