package fit;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.bridj.*;

import com.google.common.collect.*;


import fit.compile.*;
import fit.jvode.bridj.cvode.*;
import fit.jvode.bridj.nvector.*;
import fit.jvode.bridj.sundials.*;

import struct.inst.*;
import temp.*;
import util.*;

/**
 * Contains all necessary information needed to simulate a system of ODEs
 * 
 * 
 */

public class ODEModel1 extends CvodeLibrary.CVRhsFn {
	private static class CircleODE implements FirstOrderDifferentialEquations {

	    private double[] c;
	    private double omega;

	    public CircleODE(double[] c, double omega) {
	        this.c     = c;
	        this.omega = omega;
	    }

	    public int getDimension() {
	        return 2;
	    }

	    public void computeDerivatives(double t, double[] y, double[] yDot) {
	        yDot[0] = omega * (c[1] - y[1]);
	        yDot[1] = omega * (y[0] - c[0]);
	    }

	}
	private static int problemSize;
	Pointer<_generic_N_Vector> yVector = NvectorLibrary.N_VNew_Serial(problemSize);
	 Pointer<Double> yVectorData = NvectorLibrary.N_VGetArrayPointer_Serial(yVector);
	 Pointer<_generic_N_Vector> yVectorD = NvectorLibrary.N_VNew_Serial(problemSize);
	 Pointer<Double> yVectorDataD = NvectorLibrary.N_VGetArrayPointer_Serial(yVectorD);
	 FirstOrderDifferentialEquations ode = new CircleODE(new double[] { 1.0, 1.0 }, 0.2);
	@Override
	public int apply(double t, Pointer<_generic_N_Vector> y, Pointer<_generic_N_Vector> ydot,
			Pointer<?> user_data) {
		
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			try {
				double[] yArray = new double[problemSize];
				_generic_N_Vector.pointerToArray(yVectorData, yArray);
				double[] yArrayD = new double[problemSize];
				
				//assert N == yVector.
				//ssert N == ydot.getLength();
				//y.get(state);
				ode.computeDerivatives(t,yArray,yArrayD);
				
				_generic_N_Vector.arrayToPointer(yArrayD,yVectorD);
				//ydot.set(rate);
				return 0;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
			}
			// return negative value to indicate unrecoverable error
			return -1;
		}
	public double getT0() {
		return 0d;
	}
	public Pointer<_generic_N_Vector> getY() {
		// TODO Auto-generated method stub
		return null;
	}
	public int size() {
		// TODO Auto-generated method stub
		return problemSize;
	}
	public double[] getTimeCol() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object[] getStateNames() {
		// TODO Auto-generated method stub
		return null;
	}
	};