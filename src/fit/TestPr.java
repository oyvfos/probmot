package fit;
import static fit.NonlinearSolver.FUNCTIONAL;
import static fit.ODESolver.ADAMS;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.bridj.Pointer;

import fit.jvode.bridj.cvode.CvodeLibrary;
import fit.jvode.bridj.cvode.CvodeLibrary.CVRhsFn;
import fit.jvode.bridj.nvector.NvectorLibrary;
import fit.jvode.bridj.sundials._generic_N_Vector;

public class TestPr {
	
	
	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub111111
		ODEModel1 odeModel= new ODEModel1();
		
		System.setProperty("java.library.path", CVodeSimulator.JVODE_LIB_PATH);
		CVodeSimulator sim = new CVodeSimulator(ADAMS,FUNCTIONAL);
		sim.initialize(odeModel);
	}

}
