package fit.jvode.bridj.sundials;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : include\sundials\sundials_spbcgs.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class SpbcgMemRec extends StructObject {
	public SpbcgMemRec() {
		super();
	}
	public SpbcgMemRec(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int l_max() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public SpbcgMemRec l_max(int l_max) {
		this.io.setIntField(this, 0, l_max);
		return this;
	}
	/// C type : N_Vector
	@Field(1) 
	public Pointer<_generic_N_Vector > r_star() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : N_Vector
	@Field(1) 
	public SpbcgMemRec r_star(Pointer<_generic_N_Vector > r_star) {
		this.io.setPointerField(this, 1, r_star);
		return this;
	}
	/// C type : N_Vector
	@Field(2) 
	public Pointer<_generic_N_Vector > r() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : N_Vector
	@Field(2) 
	public SpbcgMemRec r(Pointer<_generic_N_Vector > r) {
		this.io.setPointerField(this, 2, r);
		return this;
	}
	/// C type : N_Vector
	@Field(3) 
	public Pointer<_generic_N_Vector > p() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : N_Vector
	@Field(3) 
	public SpbcgMemRec p(Pointer<_generic_N_Vector > p) {
		this.io.setPointerField(this, 3, p);
		return this;
	}
	/// C type : N_Vector
	@Field(4) 
	public Pointer<_generic_N_Vector > q() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : N_Vector
	@Field(4) 
	public SpbcgMemRec q(Pointer<_generic_N_Vector > q) {
		this.io.setPointerField(this, 4, q);
		return this;
	}
	/// C type : N_Vector
	@Field(5) 
	public Pointer<_generic_N_Vector > u() {
		return this.io.getPointerField(this, 5);
	}
	/// C type : N_Vector
	@Field(5) 
	public SpbcgMemRec u(Pointer<_generic_N_Vector > u) {
		this.io.setPointerField(this, 5, u);
		return this;
	}
	/// C type : N_Vector
	@Field(6) 
	public Pointer<_generic_N_Vector > Ap() {
		return this.io.getPointerField(this, 6);
	}
	/// C type : N_Vector
	@Field(6) 
	public SpbcgMemRec Ap(Pointer<_generic_N_Vector > Ap) {
		this.io.setPointerField(this, 6, Ap);
		return this;
	}
	/// C type : N_Vector
	@Field(7) 
	public Pointer<_generic_N_Vector > vtemp() {
		return this.io.getPointerField(this, 7);
	}
	/// C type : N_Vector
	@Field(7) 
	public SpbcgMemRec vtemp(Pointer<_generic_N_Vector > vtemp) {
		this.io.setPointerField(this, 7, vtemp);
		return this;
	}
}