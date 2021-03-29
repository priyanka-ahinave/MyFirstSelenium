import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Test20_JavaRobot_Notes {

	public static void main(String[] args)
			throws InterruptedException, IOException, AWTException, HeadlessException, UnsupportedFlavorException {

		Runtime.getRuntime().exec("Notes.app");
		Thread.sleep(1000);

		StringSelection ss = new StringSelection("Adding some string to clipboard");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);

		StringSelection ss2 = new StringSelection(
				"kagsdf  eg dh lihv ierh iee ihfv hfv efhviuwrl dc egrfj ;e  arhviou  c ");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(1000);
	}
}