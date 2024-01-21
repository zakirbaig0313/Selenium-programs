package zakirbaigselenium;

public class Homepage {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Home_page_1 page = new Home_page_1();
		// Elementpage epage = new Elementpage();

		page.lunch();
		page.email(Elementpage.e);
		page.pass(Elementpage.p);
		page.cclick();
		Thread.sleep(9000);
		page.close();
	}

}
