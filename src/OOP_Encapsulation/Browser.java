package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launching the browser..");
		checkBrowserVersion();
		checkOSCompatibility();
		checkBrowserIsUpgraded();
		checkRAMisAvailable();
		System.out.println("Launch Chrome Browser successfully...");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility");
	}

	private void checkBrowserIsUpgraded() {
		System.out.println("checkBrowserIsUpgraded");
	}

	private void checkRAMisAvailable() {
		System.out.println("checkRAMIsAvailable");
	}

}
