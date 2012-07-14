package ar.edu.unlam.cdp.patterns.command;

import java.io.File;

import org.junit.Test;

public class App {

	@Test
	public void test() {
		CompositeCommand theUselessCommand = new CompositeCommand();
		
		theUselessCommand.add(new CopyFile("Copies file", new File("a"), new File("b")));
		theUselessCommand.add(new DeleteFile("Deletes file", "b"));
		
		Button button = new Button(theUselessCommand);
		
		button.click();
		
	}
	
	
}
