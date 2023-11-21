package com.melissadata;

public class mdMUMatchcodeComponentJNI {
	static {
		try {
			System.loadLibrary("mdMatchupJavaWrapper");
		} catch (UnsatisfiedLinkError ule) {
			System.out.println(ule);
			System.out.println("java.library.path="+System.getProperty("java.library.path"));
		}
	}

	public final static native long mdMUMatchcodeComponentCreate();
	public final static native void mdMUMatchcodeComponentDestroy(long I);
	public final static native int GetComponentType(long I);
	public final static native void SetComponentType(long I,int Type);
	public final static native int GetSize(long I);
	public final static native void SetSize(long I,int Size);
	public final static native String GetLabel(long I);
	public final static native void SetLabel(long I,String Label);
	public final static native int GetWordCount(long I);
	public final static native void SetWordCount(long I,int WordCount);
	public final static native int GetStart(long I);
	public final static native void SetStart(long I,int Start);
	public final static native int GetStartPos(long I);
	public final static native void SetStartPos(long I,int StartPos);
	public final static native int GetTrim(long I);
	public final static native void SetTrim(long I,int Trim);
	public final static native int GetFuzzy(long I);
	public final static native void SetFuzzy(long I,int Fuzzy);
	public final static native int GetNear(long I);
	public final static native void SetNear(long I,int Near);
	public final static native double GetNearDbl(long I);
	public final static native void SetNearDbl(long I,double Near);
	public final static native int GetFieldMatch(long I);
	public final static native void SetFieldMatch(long I,int Match);
	public final static native int GetSwap(long I);
	public final static native void SetSwap(long I,int Swap);
	public final static native int GetCombination(long I);
	public final static native void SetCombination(long I,int Combination);
	public final static native int GetComponentCountryTypeFromEnum(long I,int Value);
	public final static native String GetComponentDescription(long I,int UseLabel);
	public final static native String GetComponentDescriptionFromEnum(long I,int Value);
	public final static native String GetComponentAbbreviation(long I);
	public final static native int ParseComponentDescription(long I,String Value);
	public final static native String GetSizeDescription(long I);
	public final static native int ParseSizeDescription(long I,String Value);
	public final static native int ParseWordCountDescription(long I,String Value);
	public final static native String GetStartDescription(long I);
	public final static native int ParseStartDescription(long I,String Value);
	public final static native int ParseStartPosDescription(long I,String Value);
	public final static native String GetFuzzyDescription(long I,int Decorated);
	public final static native String GetFuzzyDescriptionFromEnum(long I,int Value);
	public final static native int ParseFuzzyDescription(long I,String Value);
	public final static native double ParseNearDescription(long I,String Value);
	public final static native String GetFieldMatchDescription(long I);
	public final static native int ParseFieldMatchDescription(long I,String Value);
	public final static native String GetSwapDescription(long I);
	public final static native int CanChangeComponentType(long I);
	public final static native int CanChangeLabel(long I);
	public final static native int CanChangeSize(long I);
	public final static native int CanChangeWordCount(long I);
	public final static native int CanChangeStart(long I);
	public final static native int CanChangeTrim(long I);
	public final static native int CanChangeFuzzy(long I);
	public final static native int GetSizeMinimum(long I);
	public final static native int GetSizeMaximum(long I);
	public final static native int GetAllowedStarts(long I);
	public final static native int GetAllowedFuzzies(long I);
	public final static native int IsAllowedFuzzy(long I,int Value);
	public final static native int GetFuzzyNearType(long I);
	public final static native double GetNearMinimum(long I);
	public final static native double GetNearMaximum(long I);
	public final static native int GetAllowedFieldMatches(long I);
	public final static native int GetAllowedCombinations(long I);
	public final static native int GetAllowedSwaps(long I);
	public final static native String GetComponentTypeEnum(long I);
	public final static native String GetFuzzyEnum(long I);
	public final static native void SetReserved(long I,String Property,String Value);
	public final static native String GetReserved(long I,String Property);
}
