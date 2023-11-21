package com.melissadata;

public class mdMUMatchcodeListJNI {
	static {
		try {
			System.loadLibrary("mdMatchupJavaWrapper");
		} catch (UnsatisfiedLinkError ule) {
			System.out.println(ule);
			System.out.println("java.library.path="+System.getProperty("java.library.path"));
		}
	}

	public final static native long mdMUMatchcodeListCreate();
	public final static native void mdMUMatchcodeListDestroy(long I);
	public final static native void SetPathToMatchUpFiles(long I,String Path);
	public final static native int InitializeDataFiles(long I);
	public final static native String GetInitializeErrorString(long I);
	public final static native int GetMatchcodeCount(long I);
	public final static native String GetMatchcodeName(long I,int Pos);
}
