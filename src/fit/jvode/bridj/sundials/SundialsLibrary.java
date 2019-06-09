package fit.jvode.bridj.sundials;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.cpp.CPPRuntime;
/**
 * Wrapper for library <b>sundials</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
public class SundialsLibrary {
	/// <i>native declaration : include\sundials\sundials_iterative.h</i>
	public static final int PREC_NONE = (int)0;
	public static final int PREC_LEFT = (int)1;
	public static final int PREC_RIGHT = (int)2;
	public static final int PREC_BOTH = (int)3;

	/// <i>native declaration : include\sundials\sundials_spbcgs.h</i>
	public static final int SPBCG_PSET_FAIL_REC = (int)5;
	public static final int SPBCG_ATIMES_FAIL_REC = (int)4;
	public static final int SPBCG_PSOLVE_FAIL_REC = (int)3;
	public static final int SPBCG_CONV_FAIL = (int)2;
	public static final int SPBCG_RES_REDUCED = (int)1;

	public static final int SPBCG_SUCCESS = (int)0;
	
	public static final int SPBCG_MEM_NULL = (int)-1;
	public static final int SPBCG_ATIMES_FAIL_UNREC = (int)-2;
	public static final int SPBCG_PSOLVE_FAIL_UNREC = (int)-3;
	public static final int SPBCG_PSET_FAIL_UNREC = (int)-4;

	/// <i>native declaration : include\sundials\sundials_spgmr.h</i>
	public static final int SPGMR_PSET_FAIL_REC = (int)6;
	public static final int SPGMR_ATIMES_FAIL_REC = (int)5;
	public static final int SPGMR_PSOLVE_FAIL_REC = (int)4;
	public static final int SPGMR_QRFACT_FAIL = (int)3;
	public static final int SPGMR_CONV_FAIL = (int)2;
	public static final int SPGMR_RES_REDUCED = (int)1;

	public static final int SPGMR_SUCCESS = (int)0;
	
	public static final int SPGMR_MEM_NULL = (int)-1;
	public static final int SPGMR_ATIMES_FAIL_UNREC = (int)-2;
	public static final int SPGMR_PSOLVE_FAIL_UNREC = (int)-3;
	public static final int SPGMR_GS_FAIL = (int)-4;
	public static final int SPGMR_QRSOL_FAIL = (int)-5;
	public static final int SPGMR_PSET_FAIL_UNREC = (int)-6;

	/// <i>native declaration : include\sundials\sundials_sptfqmr.h</i>
	public static final int SPTFQMR_PSET_FAIL_REC = (int)5;
	public static final int SPTFQMR_ATIMES_FAIL_REC = (int)4;
	public static final int SPTFQMR_PSOLVE_FAIL_REC = (int)3;
	public static final int SPTFQMR_CONV_FAIL = (int)2;
	public static final int SPTFQMR_RES_REDUCED = (int)1;

	public static final int SPTFQMR_SUCCESS = (int)0;
	
	public static final int SPTFQMR_MEM_NULL = (int)-1;
	public static final int SPTFQMR_ATIMES_FAIL_UNREC = (int)-2;
	public static final int SPTFQMR_PSOLVE_FAIL_UNREC = (int)-3;
	public static final int SPTFQMR_PSET_FAIL_UNREC = (int)-4;

	/// <i>native declaration : include\sundials\sundials_fnvector.h</i>
	public static final int FCMIX_KINSOL = (int)3;
	public static final int FCMIX_IDA = (int)2;
	public static final int FCMIX_CVODE = (int)1;

	/// <i>native declaration : include\sundials\sundials_config.h</i>
	public static final String SUNDIALS_PACKAGE_VERSION = (String)"2.4.0";
	public static final int SUNDIALS_BLAS_LAPACK = (int)0;
	public static final int SUNDIALS_DOUBLE_PRECISION = (int)1;
	public static final int SUNDIALS_DENSE = (int)1;
	public static final int SUNDIALS_BAND = (int)2;

	/// <i>native declaration : include\sundials\sundials_types.h</i>
	public static final int TRUE = (int)1;
	public static final int FALSE = (int)0;

	/// <i>native declaration : include\sundials\sundials_iterative.h</i>
	public static abstract class ATimesFn extends Callback<ATimesFn > {
		public abstract int apply(Pointer<? > A_data, Pointer<_generic_N_Vector > v, Pointer<_generic_N_Vector > z);
	};
	
	/// <i>native declaration : include\sundials\sundials_iterative.h</i>
	public static abstract class PSolveFn extends Callback<PSolveFn > {
		public abstract int apply(Pointer<? > P_data, Pointer<_generic_N_Vector > r, Pointer<_generic_N_Vector > z, int lr);
	};

	
//	public static native Pointer<_generic_N_Vector > N_VClone(Pointer<_generic_N_Vector > w);
//	public static native Pointer<_generic_N_Vector > N_VCloneEmpty(Pointer<_generic_N_Vector > w);
//	public static native void N_VDestroy(Pointer<_generic_N_Vector > v);
//	public static native void N_VSpace(Pointer<_generic_N_Vector > v, Pointer<Integer > lrw, Pointer<Integer > liw);
//	public static native Pointer<Double > N_VGetArrayPointer(Pointer<_generic_N_Vector > v);
//	public static native void N_VSetArrayPointer(Pointer<Double > v_data, Pointer<_generic_N_Vector > v);
//	public static native void N_VLinearSum(double a, Pointer<_generic_N_Vector > x, double b, Pointer<_generic_N_Vector > y, Pointer<_generic_N_Vector > z);
//	public static native void N_VConst(double c, Pointer<_generic_N_Vector > z);
//	public static native void N_VProd(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > y, Pointer<_generic_N_Vector > z);
//	public static native void N_VDiv(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > y, Pointer<_generic_N_Vector > z);
//	public static native void N_VScale(double c, Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > z);
//	public static native void N_VAbs(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > z);
//	public static native void N_VInv(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > z);
//	public static native void N_VAddConst(Pointer<_generic_N_Vector > x, double b, Pointer<_generic_N_Vector > z);
//	public static native double N_VDotProd(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > y);
//	public static native double N_VMaxNorm(Pointer<_generic_N_Vector > x);
//	public static native double N_VWrmsNorm(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > w);
//	public static native double N_VWrmsNormMask(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > w, Pointer<_generic_N_Vector > id);
//	public static native double N_VMin(Pointer<_generic_N_Vector > x);
//	public static native double N_VWL2Norm(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > w);
//	public static native double N_VL1Norm(Pointer<_generic_N_Vector > x);
//	public static native void N_VCompare(double c, Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > z);
//	public static native int N_VInvTest(Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > z);
//	public static native int N_VConstrMask(Pointer<_generic_N_Vector > c, Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > m);
//	public static native double N_VMinQuotient(Pointer<_generic_N_Vector > num, Pointer<_generic_N_Vector > denom);
//	public static native Pointer<Pointer<_generic_N_Vector > > N_VCloneEmptyVectorArray(int count, Pointer<_generic_N_Vector > w);
//	public static native Pointer<Pointer<_generic_N_Vector > > N_VCloneVectorArray(int count, Pointer<_generic_N_Vector > w);
//	public static native void N_VDestroyVectorArray(Pointer<Pointer<_generic_N_Vector > > vs, int count);
//	public static native Pointer<_DlsMat > NewDenseMat(int M, int N);
//	public static native Pointer<_DlsMat > NewBandMat(int N, int mu, int ml, int smu);
//	public static native void DestroyMat(Pointer<_DlsMat > A);
//	public static native Pointer<Integer > NewIntArray(int N);
//	public static native Pointer<Double > NewRealArray(int N);
//	public static native void DestroyArray(Pointer<? > p);
//	public static native void AddIdentity(Pointer<_DlsMat > A);
//	public static native void SetToZero(Pointer<_DlsMat > A);
//	public static native void PrintMat(Pointer<_DlsMat > A);
//	public static native Pointer<Pointer<Double > > newDenseMat(int m, int n);
//	public static native Pointer<Pointer<Double > > newBandMat(int n, int smu, int ml);
//	public static native void destroyMat(Pointer<Pointer<Double > > a);
//	public static native Pointer<Integer > newIntArray(int n);
//	public static native Pointer<Double > newRealArray(int m);
//	public static native void destroyArray(Pointer<? > v);
//	public static native int BandGBTRF(Pointer<_DlsMat > A, Pointer<Integer > p);
//	public static native int bandGBTRF(Pointer<Pointer<Double > > a, int n, int mu, int ml, int smu, Pointer<Integer > p);
//	public static native void BandGBTRS(Pointer<_DlsMat > A, Pointer<Integer > p, Pointer<Double > b);
//	public static native void bandGBTRS(Pointer<Pointer<Double > > a, int n, int smu, int ml, Pointer<Integer > p, Pointer<Double > b);
//	public static native void BandCopy(Pointer<_DlsMat > A, Pointer<_DlsMat > B, int copymu, int copyml);
//	public static native void bandCopy(Pointer<Pointer<Double > > a, Pointer<Pointer<Double > > b, int n, int a_smu, int b_smu, int copymu, int copyml);
//	public static native void BandScale(double c, Pointer<_DlsMat > A);
//	public static native void bandScale(double c, Pointer<Pointer<Double > > a, int n, int mu, int ml, int smu);
//	public static native void bandAddIdentity(Pointer<Pointer<Double > > a, int n, int smu);
//	public static native int DenseGETRF(Pointer<_DlsMat > A, Pointer<Integer > p);
//	public static native void DenseGETRS(Pointer<_DlsMat > A, Pointer<Integer > p, Pointer<Double > b);
//	public static native int denseGETRF(Pointer<Pointer<Double > > a, int m, int n, Pointer<Integer > p);
//	public static native void denseGETRS(Pointer<Pointer<Double > > a, int n, Pointer<Integer > p, Pointer<Double > b);
//	public static native int DensePOTRF(Pointer<_DlsMat > A);
//	public static native void DensePOTRS(Pointer<_DlsMat > A, Pointer<Double > b);
//	public static native int densePOTRF(Pointer<Pointer<Double > > a, int m);
//	public static native void densePOTRS(Pointer<Pointer<Double > > a, int m, Pointer<Double > b);
//	public static native int DenseGEQRF(Pointer<_DlsMat > A, Pointer<Double > beta, Pointer<Double > wrk);
//	public static native int DenseORMQR(Pointer<_DlsMat > A, Pointer<Double > beta, Pointer<Double > vn, Pointer<Double > vm, Pointer<Double > wrk);
//	public static native int denseGEQRF(Pointer<Pointer<Double > > a, int m, int n, Pointer<Double > beta, Pointer<Double > v);
//	public static native int denseORMQR(Pointer<Pointer<Double > > a, int m, int n, Pointer<Double > beta, Pointer<Double > v, Pointer<Double > w, Pointer<Double > wrk);
//	public static native void DenseCopy(Pointer<_DlsMat > A, Pointer<_DlsMat > B);
//	public static native void denseCopy(Pointer<Pointer<Double > > a, Pointer<Pointer<Double > > b, int m, int n);
//	public static native void DenseScale(double c, Pointer<_DlsMat > A);
//	public static native void denseScale(double c, Pointer<Pointer<Double > > a, int m, int n);
//	public static native void denseAddIdentity(Pointer<Pointer<Double > > a, int n);
//	public static native void dcopy_(Pointer<Integer > n, Pointer<Double > x, Pointer<Integer > inc_x, Pointer<Double > y, Pointer<Integer > inc_y);
//	public static native void dscal_(Pointer<Integer > n, Pointer<Double > alpha, Pointer<Double > x, Pointer<Integer > inc_x);
//	public static native void dgemv_(Pointer<Byte > trans, Pointer<Integer > m, Pointer<Integer > n, Pointer<Double > alpha, Pointer<Double > a, Pointer<Integer > lda, Pointer<Double > x, Pointer<Integer > inc_x, Pointer<Double > beta, Pointer<Double > y, Pointer<Integer > inc_y, int len_trans);
//	public static native void dtrsv_(Pointer<Byte > uplo, Pointer<Byte > trans, Pointer<Byte > diag, Pointer<Integer > n, Pointer<Double > a, Pointer<Integer > lda, Pointer<Double > x, Pointer<Integer > inc_x, int len_uplo, int len_trans, int len_diag);
//	public static native void dsyrk_(Pointer<Byte > uplo, Pointer<Byte > trans, Pointer<Integer > n, Pointer<Integer > k, Pointer<Double > alpha, Pointer<Double > a, Pointer<Integer > lda, Pointer<Double > beta, Pointer<Double > c, Pointer<Integer > ldc, int len_uplo, int len_trans);
//	public static native void dgbtrf_(Pointer<Integer > m, Pointer<Integer > n, Pointer<Integer > kl, Pointer<Integer > ku, Pointer<Double > ab, Pointer<Integer > ldab, Pointer<Integer > ipiv, Pointer<Integer > info);
//	public static native void dgbtrs_(Pointer<Byte > trans, Pointer<Integer > n, Pointer<Integer > kl, Pointer<Integer > ku, Pointer<Integer > nrhs, Pointer<Double > ab, Pointer<Integer > ldab, Pointer<Integer > ipiv, Pointer<Double > b, Pointer<Integer > ldb, Pointer<Integer > info, int len_trans);
//	public static native void dgeqp3_(Pointer<Integer > m, Pointer<Integer > n, Pointer<Double > a, Pointer<Integer > lda, Pointer<Integer > jpvt, Pointer<Double > tau, Pointer<Double > work, Pointer<Integer > lwork, Pointer<Integer > info);
//	public static native void dgeqrf_(Pointer<Integer > m, Pointer<Integer > n, Pointer<Double > a, Pointer<Integer > lda, Pointer<Double > tau, Pointer<Double > work, Pointer<Integer > lwork, Pointer<Integer > info);
//	public static native void dgetrf_(Pointer<Integer > m, Pointer<Integer > n, Pointer<Double > a, Pointer<Integer > lda, Pointer<Integer > ipiv, Pointer<Integer > info);
//	public static native void dgetrs_(Pointer<Byte > trans, Pointer<Integer > n, Pointer<Integer > nrhs, Pointer<Double > a, Pointer<Integer > lda, Pointer<Integer > ipiv, Pointer<Double > b, Pointer<Integer > ldb, Pointer<Integer > info, int len_trans);
//	public static native void dormqr_(Pointer<Byte > side, Pointer<Byte > trans, Pointer<Integer > m, Pointer<Integer > n, Pointer<Integer > k, Pointer<Double > a, Pointer<Integer > lda, Pointer<Double > tau, Pointer<Double > c, Pointer<Integer > ldc, Pointer<Double > work, Pointer<Integer > lwork, Pointer<Integer > info, int len_side, int len_trans);
//	public static native void dpotrf_(Pointer<Byte > uplo, Pointer<Integer > n, Pointer<Double > a, Pointer<Integer > lda, Pointer<Integer > info, int len_uplo);
//	public static native void dpotrs_(Pointer<Byte > uplo, Pointer<Integer > n, Pointer<Integer > nrhs, Pointer<Double > a, Pointer<Integer > lda, Pointer<Double > b, Pointer<Integer > ldb, Pointer<Integer > info, int len_uplo);
//	public static native int ModifiedGS(Pointer<Pointer<_generic_N_Vector > > v, Pointer<Pointer<Double > > h, int k, int p, Pointer<Double > new_vk_norm);
//	public static native int ClassicalGS(Pointer<Pointer<_generic_N_Vector > > v, Pointer<Pointer<Double > > h, int k, int p, Pointer<Double > new_vk_norm, Pointer<_generic_N_Vector > temp, Pointer<Double > s);
//	public static native int QRfact(int n, Pointer<Pointer<Double > > h, Pointer<Double > q, int job);
//	public static native int QRsol(int n, Pointer<Pointer<Double > > h, Pointer<Double > q, Pointer<Double > b);
//	public static native Pointer<SpbcgMem_struct > SpbcgMalloc(int l_max, Pointer<_generic_N_Vector > vec_tmpl);
//	public static native int SpbcgSolve(Pointer<SpbcgMem_struct > mem, Pointer<? > A_data, Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > b, int pretype, double delta, Pointer<? > P_data, Pointer<_generic_N_Vector > sx, Pointer<_generic_N_Vector > sb, Pointer<SundialsLibrary.ATimesFn > atimes, Pointer<SundialsLibrary.PSolveFn > psolve, Pointer<Double > res_norm, Pointer<Integer > nli, Pointer<Integer > nps);
//	public static native void SpbcgFree(Pointer<SpbcgMem_struct > mem);
//	public static native Pointer<SpgmrMemRec > SpgmrMalloc(int l_max, Pointer<_generic_N_Vector > vec_tmpl);
//	public static native int SpgmrSolve(Pointer<SpgmrMemRec > mem, Pointer<? > A_data, Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > b, int pretype, int gstype, double delta, int max_restarts, Pointer<? > P_data, Pointer<_generic_N_Vector > s1, Pointer<_generic_N_Vector > s2, Pointer<SundialsLibrary.ATimesFn > atimes, Pointer<SundialsLibrary.PSolveFn > psolve, Pointer<Double > res_norm, Pointer<Integer > nli, Pointer<Integer > nps);
//	public static native void SpgmrFree(Pointer<SpgmrMemRec > mem);
//	public static native Pointer<SptfqmrMem_struct > SptfqmrMalloc(int l_max, Pointer<_generic_N_Vector > vec_tmpl);
//	public static native int SptfqmrSolve(Pointer<SptfqmrMem_struct > mem, Pointer<? > A_data, Pointer<_generic_N_Vector > x, Pointer<_generic_N_Vector > b, int pretype, double delta, Pointer<? > P_data, Pointer<_generic_N_Vector > sx, Pointer<_generic_N_Vector > sb, Pointer<SundialsLibrary.ATimesFn > atimes, Pointer<SundialsLibrary.PSolveFn > psolve, Pointer<Double > res_norm, Pointer<Integer > nli, Pointer<Integer > nps);
//	public static native void SptfqmrFree(Pointer<SptfqmrMem_struct > mem);
//	public static native double RPowerI(double base, int exponent);
//	public static native double RPowerR(double base, double exponent);
//	public static native double RSqrt(double x);
//	public static native double RAbs(double x);
//	public static native double RExp(double x);
}