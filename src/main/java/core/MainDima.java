package core;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class MainDima {
	    @Parameter(names={"--length", "-l"})
	    int length;
	    @Parameter(names={"--pattern", "-p"})
	    int pattern;
	    @Parameter(names={"--debug", "-d"})
	    int debug;
	   
	    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
	    private Integer verbose = 1;
	   
	    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
	    private String groups;
	   
/*	    @Parameter(names = "--debug", description = "Debug mode")
	    private boolean debug = false;*/

	 
	    public static void main(String ... args) {
	        MainDima main = new MainDima();
	        new JCommander(main, args);
	        main.run();
	    }
	 
	    public void run() {
	        System.out.printf("%d %d %d", length, pattern, debug);
	    }
	}
