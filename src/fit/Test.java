package fit;
import static fit.ODESolver.ADAMS;
import static fit.NonlinearSolver.FUNCTIONAL;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("java.library.path", CVodeSimulator.JVODE_LIB_PATH);
		CVodeSimulator sim = new CVodeSimulator(ADAMS,FUNCTIONAL);
	}

}
