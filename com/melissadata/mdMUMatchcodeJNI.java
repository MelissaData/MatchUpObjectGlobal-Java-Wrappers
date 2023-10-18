package com.melissadata;

public class mdMUMatchcodeJNI {
	static {
		try {
			System.loadLibrary("mdMatchupJavaWrapper");
		} catch (UnsatisfiedLinkError ule) {
			System.out.println(ule);
			System.out.println("java.library.path="+System.getProperty("java.library.path"));
		}
	}

	public final static native long mdMUMatchcodeCreate();
	public final static native void mdMUMatchcodeDestroy(long I);
	public final static native void SetPathToMatchUpFiles(long I,String Path);
	public final static native int InitializeDataFiles(long I);
	public final static native String GetInitializeErrorString(long I);
	public final static native int FindMatchcode(long I,String Matchcode);
	public final static native String GetMatchcodeName(long I);
	public final static native void SetDescription(long I,String Description);
	public final static native String GetDescription(long I);
	public final static native void SetNGram(long I,int NGram);
	public final static native int GetNGram(long I);
	public final static native int GetMatchcodeItemCount(long I);
	public final static native long GetMatchcodeItem(long I,int Pos);
	public final static native int GetMappingItemCount(long I);
	public final static native int GetMappingItemType(long I,int Pos);
	public final static native String GetMappingItemLabel(long I,int Pos);
	public final static native int DeleteMatchcodeItem(long I,int Pos);
	public final static native int RenameMatchcode(long I,String Name);
	public final static native int DeleteMatchcode(long I);
	public final static native void Save(long I);
	public final static native void SaveToFile(long I,String Path);
	public final static native int CreateNewMatchcode(long I,String Matchcode);
	public final static native String GetRuleDescription(long I,int Rule_,int Abbreviated_);
	public final static native int GetMaximumCombinations(long I);
	public final static native int GetAllowedInputMappingCount(long I,int Mapping_);
	public final static native int GetAllowedInputMappingType(long I,int Mapping_,int Pos_);
	public final static native String GetAllowedInputMappingLabel(long I,int Mapping_,int Pos_);
	public final static native String GetInputMappingLabel(long I,int Mapping_);
	public final static native int ParseInputMappingLabel(long I,String Value_);
	public final static native int GetBestInputMappingType(long I,int Target_);
	public final static native int IsDirectConversion(long I,int Source_,int Target_);
	public final static native int IsConvertable(long I,int Source_,int Target_);
	public final static native String GetInputMappingEnum(long I);
	public final static native void SetReserved(long I,String Property,String Value);
	public final static native String GetReserved(long I,String Property);
}
