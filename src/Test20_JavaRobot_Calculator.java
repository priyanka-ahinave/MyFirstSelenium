import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Test20_JavaRobot_Calculator {

	public static void main(String[] args)
			throws InterruptedException, IOException, AWTException, HeadlessException, UnsupportedFlavorException {

		Runtime.getRuntime().exec("//System//Applications//Calculator.app");
		Thread.sleep(1000);

		StringSelection ss = new StringSelection("10");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(1000);

		StringSelection ss2 = new StringSelection("20");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_EQUALS);
		robot.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);

		String result = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(result);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_META);
	}
}