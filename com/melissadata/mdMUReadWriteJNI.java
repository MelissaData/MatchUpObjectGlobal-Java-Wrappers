package com.melissadata;

public class mdMUReadWriteJNI {
	static {
		try {
			System.loadLibrary("mdMatchupJavaWrapper");
		} catch (UnsatisfiedLinkError ule) {
			System.out.println(ule);
			System.out.println("java.library.path="+System.getProperty("java.library.path"));
		}
	}

	public final static native long mdMUReadWriteCreate();
	public final static native void mdMUReadWriteDestroy(long I);
	public final static native void SetPathToMatchUpFiles(long I,String Path);
	public final static native void SetMatchcodeName(long I,String MatchcodeName);
	public final static native void SetKeyFile(long I,String KeyFile);
	public final static native int InitializeDataFiles(long I);
	public final static native String GetInitializeErrorString(long I);
	public final static native int SetLicenseString(long I,String License);
	public final static native void SetMaximumCharacterSize(long I,int size);
	public final static native int SetEncoding(long I,String encodeName);
	public final static native String GetBuildNumber(long I);
	public final static native String GetDatabaseDate(long I);
	public final static native String GetDatabaseExpirationDate(long I);
	public final static native String GetLicenseExpirationDate(long I);
	public final static native long GetMatchcodeObject(long I);
	public final static native void ClearMappings(long I);
	public final static native int AddMapping(long I,int Mapping);
	public final static native void ClearFields(long I);
	public final static native void AddField(long I,String Field);
	public final static native void BuildKey(long I);
	public final static native void SetKey(long I,String Key);
	public final static native void SetUserInfo(long I,String UserInfo);
	public final static native void WriteRecord(long I);
	public final static native void Process(long I);
	public final static native int ReadRecord(long I);
	public final static native String GetKey(long I);
	public final static native String GetUserInfo(long I);
	public final static native long GetDupeGroup(long I);
	public final static native String GetStatusCode(long I);
	public final static native int GetCount(long I);
	public final static native int GetEntry(long I);
	public final static native int GetError(long I);
	public final static native long GetCombinations(long I);
	public final static native double GetFuzzyPercentage(long I);
	public final static native String GetResults(long I);
	public final static native int GetKeySize(long I);
	public final static native void SetGroupSorting(long I,boolean bGroupSorting);
	public final static native void SetReserved(long I,String Property,String Value);
	public final static native String GetReserved(long I,String Property);
}
