
public class Item {
			
		private String title;
		private	boolean borrowed;
		//Borrow Date
		private int year;
		private int month;
		private int dayOfMonth;
		
		
	 int getTime() {
		return dayOfMonth;
		 
	 }
		

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDayOfMonth() {
			return dayOfMonth;
		}

		public void setDayOfMonth(int dayOfMonth) {
			this.dayOfMonth = dayOfMonth;
		}
		
		int borrowDate(int year, int month, int day) {
			return day + month + year;
			
		}
	
		void print () {
			System.out.print(title + " " + borrowed + " " + year + " " +
		month + " " + dayOfMonth);
		}

}
