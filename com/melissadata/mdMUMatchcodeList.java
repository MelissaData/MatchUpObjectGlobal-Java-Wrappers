package com.melissadata;

public class mdMUMatchcodeList {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdMUMatchcodeList obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdMUMatchcodeList.ProgramStatus ErrorNone=new mdMUMatchcodeList.ProgramStatus("ErrorNone",0);
	public final static mdMUMatchcodeList.ProgramStatus ErrorConfigFile=new mdMUMatchcodeList.ProgramStatus("ErrorConfigFile",1);
	public final static mdMUMatchcodeList.ProgramStatus ErrorLicenseExpired=new mdMUMatchcodeList.ProgramStatus("ErrorLicenseExpired",2);
	public final static mdMUMatchcodeList.ProgramStatus ErrorDatabaseExpired=new mdMUMatchcodeList.ProgramStatus("ErrorDatabaseExpired",3);
	public final static mdMUMatchcodeList.ProgramStatus ErrorMatchcodeNotSpecified=new mdMUMatchcodeList.ProgramStatus("ErrorMatchcodeNotSpecified",4);
	public final static mdMUMatchcodeList.ProgramStatus ErrorMatchcodeNotFound=new mdMUMatchcodeList.ProgramStatus("ErrorMatchcodeNotFound",5);
	public final static mdMUMatchcodeList.ProgramStatus ErrorInvalidMatchcode=new mdMUMatchcodeList.ProgramStatus("ErrorInvalidMatchcode",6);
	public final static mdMUMatchcodeList.ProgramStatus ErrorKeyFile=new mdMUMatchcodeList.ProgramStatus("ErrorKeyFile",7);
	public final static mdMUMatchcodeList.ProgramStatus ErrorNoneIntersectingGroupCache=new mdMUMatchcodeList.ProgramStatus("ErrorNoneIntersectingGroupCache",8);
	public final static mdMUMatchcodeList.ProgramStatus ErrorMatchcodeObsolete=new mdMUMatchcodeList.ProgramStatus("ErrorMatchcodeObsolete",9);
	public final static mdMUMatchcodeList.ProgramStatus ErrorGlobalAddrInit=new mdMUMatchcodeList.ProgramStatus("ErrorGlobalAddrInit",10);
	public final static mdMUMatchcodeList.ProgramStatus ErrorIntlLicenseRequired=new mdMUMatchcodeList.ProgramStatus("ErrorIntlLicenseRequired",11);

	private final String enumName;
	private final int enumValue;
	private static ProgramStatus[] enumValues={ErrorNone,ErrorConfigFile,ErrorLicenseExpired,ErrorDatabaseExpired,ErrorMatchcodeNotSpecified,ErrorMatchcodeNotFound,ErrorInvalidMatchcode,ErrorKeyFile,ErrorNoneIntersectingGroupCache,ErrorMatchcodeObsolete,ErrorGlobalAddrInit,ErrorIntlLicenseRequired};

	private ProgramStatus(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static ProgramStatus toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+ProgramStatus.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeComponentType {
	public final static mdMUMatchcodeList.MatchcodeComponentType PrefixComp=new mdMUMatchcodeList.MatchcodeComponentType("PrefixComp",1);
	public final static mdMUMatchcodeList.MatchcodeComponentType FirstComp=new mdMUMatchcodeList.MatchcodeComponentType("FirstComp",2);
	public final static mdMUMatchcodeList.MatchcodeComponentType MiddleComp=new mdMUMatchcodeList.MatchcodeComponentType("MiddleComp",3);
	public final static mdMUMatchcodeList.MatchcodeComponentType LastComp=new mdMUMatchcodeList.MatchcodeComponentType("LastComp",4);
	public final static mdMUMatchcodeList.MatchcodeComponentType SuffixComp=new mdMUMatchcodeList.MatchcodeComponentType("SuffixComp",5);
	public final static mdMUMatchcodeList.MatchcodeComponentType GenderComp=new mdMUMatchcodeList.MatchcodeComponentType("GenderComp",6);
	public final static mdMUMatchcodeList.MatchcodeComponentType FirstNicknameComp=new mdMUMatchcodeList.MatchcodeComponentType("FirstNicknameComp",7);
	public final static mdMUMatchcodeList.MatchcodeComponentType MiddleNicknameComp=new mdMUMatchcodeList.MatchcodeComponentType("MiddleNicknameComp",8);
	public final static mdMUMatchcodeList.MatchcodeComponentType TitleComp=new mdMUMatchcodeList.MatchcodeComponentType("TitleComp",9);
	public final static mdMUMatchcodeList.MatchcodeComponentType CompanyComp=new mdMUMatchcodeList.MatchcodeComponentType("CompanyComp",10);
	public final static mdMUMatchcodeList.MatchcodeComponentType CompanyAcronymComp=new mdMUMatchcodeList.MatchcodeComponentType("CompanyAcronymComp",11);
	public final static mdMUMatchcodeList.MatchcodeComponentType StreetNumberComp=new mdMUMatchcodeList.MatchcodeComponentType("StreetNumberComp",12);
	public final static mdMUMatchcodeList.MatchcodeComponentType StreetPreDirComp=new mdMUMatchcodeList.MatchcodeComponentType("StreetPreDirComp",13);
	public final static mdMUMatchcodeList.MatchcodeComponentType StreetNameComp=new mdMUMatchcodeList.MatchcodeComponentType("StreetNameComp",14);
	public final static mdMUMatchcodeList.MatchcodeComponentType StreetSuffixComp=new mdMUMatchcodeList.MatchcodeComponentType("StreetSuffixComp",15);
	public final static mdMUMatchcodeList.MatchcodeComponentType StreetPostDirComp=new mdMUMatchcodeList.MatchcodeComponentType("StreetPostDirComp",16);
	public final static mdMUMatchcodeList.MatchcodeComponentType POBoxComp=new mdMUMatchcodeList.MatchcodeComponentType("POBoxComp",17);
	public final static mdMUMatchcodeList.MatchcodeComponentType SecondaryComp=new mdMUMatchcodeList.MatchcodeComponentType("SecondaryComp",18);
	public final static mdMUMatchcodeList.MatchcodeComponentType AddressComp=new mdMUMatchcodeList.MatchcodeComponentType("AddressComp",19);
	public final static mdMUMatchcodeList.MatchcodeComponentType CityComp=new mdMUMatchcodeList.MatchcodeComponentType("CityComp",20);
	public final static mdMUMatchcodeList.MatchcodeComponentType StateComp=new mdMUMatchcodeList.MatchcodeComponentType("StateComp",21);
	public final static mdMUMatchcodeList.MatchcodeComponentType Zip9Comp=new mdMUMatchcodeList.MatchcodeComponentType("Zip9Comp",22);
	public final static mdMUMatchcodeList.MatchcodeComponentType Zip5Comp=new mdMUMatchcodeList.MatchcodeComponentType("Zip5Comp",23);
	public final static mdMUMatchcodeList.MatchcodeComponentType Zip4Comp=new mdMUMatchcodeList.MatchcodeComponentType("Zip4Comp",24);
	public final static mdMUMatchcodeList.MatchcodeComponentType CountryComp=new mdMUMatchcodeList.MatchcodeComponentType("CountryComp",28);
	public final static mdMUMatchcodeList.MatchcodeComponentType CanadianPCComp=new mdMUMatchcodeList.MatchcodeComponentType("CanadianPCComp",29);
	public final static mdMUMatchcodeList.MatchcodeComponentType PhoneComp=new mdMUMatchcodeList.MatchcodeComponentType("PhoneComp",33);
	public final static mdMUMatchcodeList.MatchcodeComponentType EMailComp=new mdMUMatchcodeList.MatchcodeComponentType("EMailComp",34);
	public final static mdMUMatchcodeList.MatchcodeComponentType CreditCardComp=new mdMUMatchcodeList.MatchcodeComponentType("CreditCardComp",35);
	public final static mdMUMatchcodeList.MatchcodeComponentType GeneralComp=new mdMUMatchcodeList.MatchcodeComponentType("GeneralComp",36);
	public final static mdMUMatchcodeList.MatchcodeComponentType GeoDistanceComp=new mdMUMatchcodeList.MatchcodeComponentType("GeoDistanceComp",38);
	public final static mdMUMatchcodeList.MatchcodeComponentType DateComp=new mdMUMatchcodeList.MatchcodeComponentType("DateComp",39);
	public final static mdMUMatchcodeList.MatchcodeComponentType NumericComp=new mdMUMatchcodeList.MatchcodeComponentType("NumericComp",40);
	public final static mdMUMatchcodeList.MatchcodeComponentType PremisesNumberComp=new mdMUMatchcodeList.MatchcodeComponentType("PremisesNumberComp",41);
	public final static mdMUMatchcodeList.MatchcodeComponentType ThoroughfarePreDirComp=new mdMUMatchcodeList.MatchcodeComponentType("ThoroughfarePreDirComp",42);
	public final static mdMUMatchcodeList.MatchcodeComponentType ThoroughfareLeadingTypeComp=new mdMUMatchcodeList.MatchcodeComponentType("ThoroughfareLeadingTypeComp",43);
	public final static mdMUMatchcodeList.MatchcodeComponentType ThoroughfareNameComp=new mdMUMatchcodeList.MatchcodeComponentType("ThoroughfareNameComp",44);
	public final static mdMUMatchcodeList.MatchcodeComponentType ThoroughfarePostDirComp=new mdMUMatchcodeList.MatchcodeComponentType("ThoroughfarePostDirComp",45);
	public final static mdMUMatchcodeList.MatchcodeComponentType ThoroughfareTrailingTypeComp=new mdMUMatchcodeList.MatchcodeComponentType("ThoroughfareTrailingTypeComp",46);
	public final static mdMUMatchcodeList.MatchcodeComponentType DepThoroughfarePreDirComp=new mdMUMatchcodeList.MatchcodeComponentType("DepThoroughfarePreDirComp",47);
	public final static mdMUMatchcodeList.MatchcodeComponentType DepThoroughfareLeadingTypeComp=new mdMUMatchcodeList.MatchcodeComponentType("DepThoroughfareLeadingTypeComp",48);
	public final static mdMUMatchcodeList.MatchcodeComponentType DepThoroughfareNameComp=new mdMUMatchcodeList.MatchcodeComponentType("DepThoroughfareNameComp",49);
	public final static mdMUMatchcodeList.MatchcodeComponentType DepThoroughfarePostDirComp=new mdMUMatchcodeList.MatchcodeComponentType("DepThoroughfarePostDirComp",50);
	public final static mdMUMatchcodeList.MatchcodeComponentType DepThoroughfareTrailingTypeComp=new mdMUMatchcodeList.MatchcodeComponentType("DepThoroughfareTrailingTypeComp",51);
	public final static mdMUMatchcodeList.MatchcodeComponentType LocalityComp=new mdMUMatchcodeList.MatchcodeComponentType("LocalityComp",52);
	public final static mdMUMatchcodeList.MatchcodeComponentType DependentLocalityComp=new mdMUMatchcodeList.MatchcodeComponentType("DependentLocalityComp",53);
	public final static mdMUMatchcodeList.MatchcodeComponentType DblDependentLocalityComp=new mdMUMatchcodeList.MatchcodeComponentType("DblDependentLocalityComp",54);
	public final static mdMUMatchcodeList.MatchcodeComponentType AdministrativeAreaComp=new mdMUMatchcodeList.MatchcodeComponentType("AdministrativeAreaComp",55);
	public final static mdMUMatchcodeList.MatchcodeComponentType SubAdministrativeAreaComp=new mdMUMatchcodeList.MatchcodeComponentType("SubAdministrativeAreaComp",56);
	public final static mdMUMatchcodeList.MatchcodeComponentType PostalCodeComp=new mdMUMatchcodeList.MatchcodeComponentType("PostalCodeComp",57);
	public final static mdMUMatchcodeList.MatchcodeComponentType SubNationalAreaComp=new mdMUMatchcodeList.MatchcodeComponentType("SubNationalAreaComp",58);
	public final static mdMUMatchcodeList.MatchcodeComponentType PostBoxComp=new mdMUMatchcodeList.MatchcodeComponentType("PostBoxComp",59);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeComponentType[] enumValues={PrefixComp,FirstComp,MiddleComp,LastComp,SuffixComp,GenderComp,FirstNicknameComp,MiddleNicknameComp,TitleComp,CompanyComp,CompanyAcronymComp,StreetNumberComp,StreetPreDirComp,StreetNameComp,StreetSuffixComp,StreetPostDirComp,POBoxComp,SecondaryComp,AddressComp,CityComp,StateComp,Zip9Comp,Zip5Comp,Zip4Comp,CountryComp,CanadianPCComp,PhoneComp,EMailComp,CreditCardComp,GeneralComp,GeoDistanceComp,DateComp,NumericComp,PremisesNumberComp,ThoroughfarePreDirComp,ThoroughfareLeadingTypeComp,ThoroughfareNameComp,ThoroughfarePostDirComp,ThoroughfareTrailingTypeComp,DepThoroughfarePreDirComp,DepThoroughfareLeadingTypeComp,DepThoroughfareNameComp,DepThoroughfarePostDirComp,DepThoroughfareTrailingTypeComp,LocalityComp,DependentLocalityComp,DblDependentLocalityComp,AdministrativeAreaComp,SubAdministrativeAreaComp,PostalCodeComp,SubNationalAreaComp,PostBoxComp};

	private MatchcodeComponentType(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeComponentType toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeComponentType.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeStart {
	public final static mdMUMatchcodeList.MatchcodeStart Left=new mdMUMatchcodeList.MatchcodeStart("Left",8);
	public final static mdMUMatchcodeList.MatchcodeStart Right=new mdMUMatchcodeList.MatchcodeStart("Right",16);
	public final static mdMUMatchcodeList.MatchcodeStart StartAtPos=new mdMUMatchcodeList.MatchcodeStart("StartAtPos",32);
	public final static mdMUMatchcodeList.MatchcodeStart StartAtWord=new mdMUMatchcodeList.MatchcodeStart("StartAtWord",64);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeStart[] enumValues={Left,Right,StartAtPos,StartAtWord};

	private MatchcodeStart(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeStart toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeStart.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeTrim {
	public final static mdMUMatchcodeList.MatchcodeTrim LeftTrim=new mdMUMatchcodeList.MatchcodeTrim("LeftTrim",2);
	public final static mdMUMatchcodeList.MatchcodeTrim RightTrim=new mdMUMatchcodeList.MatchcodeTrim("RightTrim",4);
	public final static mdMUMatchcodeList.MatchcodeTrim AllTrim=new mdMUMatchcodeList.MatchcodeTrim("AllTrim",6);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeTrim[] enumValues={LeftTrim,RightTrim,AllTrim};

	private MatchcodeTrim(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeTrim toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeTrim.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeFuzzy {
	public final static mdMUMatchcodeList.MatchcodeFuzzy Exact=new mdMUMatchcodeList.MatchcodeFuzzy("Exact",0);
	public final static mdMUMatchcodeList.MatchcodeFuzzy SoundEx=new mdMUMatchcodeList.MatchcodeFuzzy("SoundEx",1);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Phonetex=new mdMUMatchcodeList.MatchcodeFuzzy("Phonetex",2);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Containment=new mdMUMatchcodeList.MatchcodeFuzzy("Containment",4);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Frequency=new mdMUMatchcodeList.MatchcodeFuzzy("Frequency",8);
	public final static mdMUMatchcodeList.MatchcodeFuzzy FastNear=new mdMUMatchcodeList.MatchcodeFuzzy("FastNear",16);
	public final static mdMUMatchcodeList.MatchcodeFuzzy AccurateNear=new mdMUMatchcodeList.MatchcodeFuzzy("AccurateNear",32);
	public final static mdMUMatchcodeList.MatchcodeFuzzy VowelsOnly=new mdMUMatchcodeList.MatchcodeFuzzy("VowelsOnly",64);
	public final static mdMUMatchcodeList.MatchcodeFuzzy ConsonantsOnly=new mdMUMatchcodeList.MatchcodeFuzzy("ConsonantsOnly",128);
	public final static mdMUMatchcodeList.MatchcodeFuzzy AlphasOnly=new mdMUMatchcodeList.MatchcodeFuzzy("AlphasOnly",256);
	public final static mdMUMatchcodeList.MatchcodeFuzzy NumericsOnly=new mdMUMatchcodeList.MatchcodeFuzzy("NumericsOnly",512);
	public final static mdMUMatchcodeList.MatchcodeFuzzy FrequencyNear=new mdMUMatchcodeList.MatchcodeFuzzy("FrequencyNear",1024);
	public final static mdMUMatchcodeList.MatchcodeFuzzy NGram=new mdMUMatchcodeList.MatchcodeFuzzy("NGram",2048);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Jaro=new mdMUMatchcodeList.MatchcodeFuzzy("Jaro",4096);
	public final static mdMUMatchcodeList.MatchcodeFuzzy JaroWinkler=new mdMUMatchcodeList.MatchcodeFuzzy("JaroWinkler",8192);
	public final static mdMUMatchcodeList.MatchcodeFuzzy LCS=new mdMUMatchcodeList.MatchcodeFuzzy("LCS",16384);
	public final static mdMUMatchcodeList.MatchcodeFuzzy NeedlemanWunsch=new mdMUMatchcodeList.MatchcodeFuzzy("NeedlemanWunsch",32768);
	public final static mdMUMatchcodeList.MatchcodeFuzzy MDKeyboard=new mdMUMatchcodeList.MatchcodeFuzzy("MDKeyboard",65536);
	public final static mdMUMatchcodeList.MatchcodeFuzzy SmithWatermanGotoh=new mdMUMatchcodeList.MatchcodeFuzzy("SmithWatermanGotoh",131072);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Dice=new mdMUMatchcodeList.MatchcodeFuzzy("Dice",262144);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Jaccard=new mdMUMatchcodeList.MatchcodeFuzzy("Jaccard",524288);
	public final static mdMUMatchcodeList.MatchcodeFuzzy Overlap=new mdMUMatchcodeList.MatchcodeFuzzy("Overlap",1048576);
	public final static mdMUMatchcodeList.MatchcodeFuzzy DoubleMetaphone=new mdMUMatchcodeList.MatchcodeFuzzy("DoubleMetaphone",2097152);
	public final static mdMUMatchcodeList.MatchcodeFuzzy UTF8Near=new mdMUMatchcodeList.MatchcodeFuzzy("UTF8Near",4194304);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeFuzzy[] enumValues={Exact,SoundEx,Phonetex,Containment,Frequency,FastNear,AccurateNear,VowelsOnly,ConsonantsOnly,AlphasOnly,NumericsOnly,FrequencyNear,NGram,Jaro,JaroWinkler,LCS,NeedlemanWunsch,MDKeyboard,SmithWatermanGotoh,Dice,Jaccard,Overlap,DoubleMetaphone,UTF8Near};

	private MatchcodeFuzzy(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeFuzzy toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeFuzzy.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeFieldMatch {
	public final static mdMUMatchcodeList.MatchcodeFieldMatch NoFieldMatch=new mdMUMatchcodeList.MatchcodeFieldMatch("NoFieldMatch",0);
	public final static mdMUMatchcodeList.MatchcodeFieldMatch BothBlankMatch=new mdMUMatchcodeList.MatchcodeFieldMatch("BothBlankMatch",256);
	public final static mdMUMatchcodeList.MatchcodeFieldMatch OneBlankMatch=new mdMUMatchcodeList.MatchcodeFieldMatch("OneBlankMatch",512);
	public final static mdMUMatchcodeList.MatchcodeFieldMatch InitialMatch=new mdMUMatchcodeList.MatchcodeFieldMatch("InitialMatch",1024);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeFieldMatch[] enumValues={NoFieldMatch,BothBlankMatch,OneBlankMatch,InitialMatch};

	private MatchcodeFieldMatch(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeFieldMatch toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeFieldMatch.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeSwap {
	public final static mdMUMatchcodeList.MatchcodeSwap NoSwap=new mdMUMatchcodeList.MatchcodeSwap("NoSwap",0);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapA=new mdMUMatchcodeList.MatchcodeSwap("SwapA",1);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapB=new mdMUMatchcodeList.MatchcodeSwap("SwapB",2);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapC=new mdMUMatchcodeList.MatchcodeSwap("SwapC",4);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapD=new mdMUMatchcodeList.MatchcodeSwap("SwapD",8);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapE=new mdMUMatchcodeList.MatchcodeSwap("SwapE",16);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapF=new mdMUMatchcodeList.MatchcodeSwap("SwapF",32);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapG=new mdMUMatchcodeList.MatchcodeSwap("SwapG",64);
	public final static mdMUMatchcodeList.MatchcodeSwap SwapH=new mdMUMatchcodeList.MatchcodeSwap("SwapH",128);
	public final static mdMUMatchcodeList.MatchcodeSwap BothA=new mdMUMatchcodeList.MatchcodeSwap("BothA",256);
	public final static mdMUMatchcodeList.MatchcodeSwap BothB=new mdMUMatchcodeList.MatchcodeSwap("BothB",512);
	public final static mdMUMatchcodeList.MatchcodeSwap BothC=new mdMUMatchcodeList.MatchcodeSwap("BothC",1024);
	public final static mdMUMatchcodeList.MatchcodeSwap BothD=new mdMUMatchcodeList.MatchcodeSwap("BothD",2048);
	public final static mdMUMatchcodeList.MatchcodeSwap BothE=new mdMUMatchcodeList.MatchcodeSwap("BothE",4096);
	public final static mdMUMatchcodeList.MatchcodeSwap BothF=new mdMUMatchcodeList.MatchcodeSwap("BothF",8192);
	public final static mdMUMatchcodeList.MatchcodeSwap BothG=new mdMUMatchcodeList.MatchcodeSwap("BothG",16384);
	public final static mdMUMatchcodeList.MatchcodeSwap BothH=new mdMUMatchcodeList.MatchcodeSwap("BothH",32768);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeSwap[] enumValues={NoSwap,SwapA,SwapB,SwapC,SwapD,SwapE,SwapF,SwapG,SwapH,BothA,BothB,BothC,BothD,BothE,BothF,BothG,BothH};

	private MatchcodeSwap(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeSwap toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeSwap.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeCombination {
	public final static mdMUMatchcodeList.MatchcodeCombination Combo1=new mdMUMatchcodeList.MatchcodeCombination("Combo1",1);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo2=new mdMUMatchcodeList.MatchcodeCombination("Combo2",2);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo3=new mdMUMatchcodeList.MatchcodeCombination("Combo3",4);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo4=new mdMUMatchcodeList.MatchcodeCombination("Combo4",8);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo5=new mdMUMatchcodeList.MatchcodeCombination("Combo5",16);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo6=new mdMUMatchcodeList.MatchcodeCombination("Combo6",32);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo7=new mdMUMatchcodeList.MatchcodeCombination("Combo7",64);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo8=new mdMUMatchcodeList.MatchcodeCombination("Combo8",128);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo9=new mdMUMatchcodeList.MatchcodeCombination("Combo9",256);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo10=new mdMUMatchcodeList.MatchcodeCombination("Combo10",512);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo11=new mdMUMatchcodeList.MatchcodeCombination("Combo11",1024);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo12=new mdMUMatchcodeList.MatchcodeCombination("Combo12",2048);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo13=new mdMUMatchcodeList.MatchcodeCombination("Combo13",4096);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo14=new mdMUMatchcodeList.MatchcodeCombination("Combo14",8192);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo15=new mdMUMatchcodeList.MatchcodeCombination("Combo15",16384);
	public final static mdMUMatchcodeList.MatchcodeCombination Combo16=new mdMUMatchcodeList.MatchcodeCombination("Combo16",32768);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeCombination[] enumValues={Combo1,Combo2,Combo3,Combo4,Combo5,Combo6,Combo7,Combo8,Combo9,Combo10,Combo11,Combo12,Combo13,Combo14,Combo15,Combo16};

	private MatchcodeCombination(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeCombination toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeCombination.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeMappingTarget {
	public final static mdMUMatchcodeList.MatchcodeMappingTarget PrefixType=new mdMUMatchcodeList.MatchcodeMappingTarget("PrefixType",1);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget FirstType=new mdMUMatchcodeList.MatchcodeMappingTarget("FirstType",2);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget MiddleType=new mdMUMatchcodeList.MatchcodeMappingTarget("MiddleType",3);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget LastType=new mdMUMatchcodeList.MatchcodeMappingTarget("LastType",4);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget SuffixType=new mdMUMatchcodeList.MatchcodeMappingTarget("SuffixType",5);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget GenderType=new mdMUMatchcodeList.MatchcodeMappingTarget("GenderType",6);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget FirstNicknameType=new mdMUMatchcodeList.MatchcodeMappingTarget("FirstNicknameType",7);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget MiddleNicknameType=new mdMUMatchcodeList.MatchcodeMappingTarget("MiddleNicknameType",8);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget TitleType=new mdMUMatchcodeList.MatchcodeMappingTarget("TitleType",9);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget CompanyType=new mdMUMatchcodeList.MatchcodeMappingTarget("CompanyType",10);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget CompanyAcronymType=new mdMUMatchcodeList.MatchcodeMappingTarget("CompanyAcronymType",11);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget AddressType=new mdMUMatchcodeList.MatchcodeMappingTarget("AddressType",12);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget CityType=new mdMUMatchcodeList.MatchcodeMappingTarget("CityType",13);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget StateType=new mdMUMatchcodeList.MatchcodeMappingTarget("StateType",14);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Zip9Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Zip9Type",15);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Zip5Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Zip5Type",16);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Zip4Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Zip4Type",17);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget CountryType=new mdMUMatchcodeList.MatchcodeMappingTarget("CountryType",18);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget CanadianPCType=new mdMUMatchcodeList.MatchcodeMappingTarget("CanadianPCType",19);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget PhoneType=new mdMUMatchcodeList.MatchcodeMappingTarget("PhoneType",23);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget EMailType=new mdMUMatchcodeList.MatchcodeMappingTarget("EMailType",24);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget CreditCardType=new mdMUMatchcodeList.MatchcodeMappingTarget("CreditCardType",25);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget GeneralType=new mdMUMatchcodeList.MatchcodeMappingTarget("GeneralType",26);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address1Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address1Type",28);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address2Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address2Type",29);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address3Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address3Type",30);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget LatitudeType=new mdMUMatchcodeList.MatchcodeMappingTarget("LatitudeType",34);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget LongitudeType=new mdMUMatchcodeList.MatchcodeMappingTarget("LongitudeType",35);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget DateType=new mdMUMatchcodeList.MatchcodeMappingTarget("DateType",36);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget NumericType=new mdMUMatchcodeList.MatchcodeMappingTarget("NumericType",37);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address4Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address4Type",38);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address5Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address5Type",39);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address6Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address6Type",40);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address7Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address7Type",41);
	public final static mdMUMatchcodeList.MatchcodeMappingTarget Address8Type=new mdMUMatchcodeList.MatchcodeMappingTarget("Address8Type",42);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeMappingTarget[] enumValues={PrefixType,FirstType,MiddleType,LastType,SuffixType,GenderType,FirstNicknameType,MiddleNicknameType,TitleType,CompanyType,CompanyAcronymType,AddressType,CityType,StateType,Zip9Type,Zip5Type,Zip4Type,CountryType,CanadianPCType,PhoneType,EMailType,CreditCardType,GeneralType,Address1Type,Address2Type,Address3Type,LatitudeType,LongitudeType,DateType,NumericType,Address4Type,Address5Type,Address6Type,Address7Type,Address8Type};

	private MatchcodeMappingTarget(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeMappingTarget toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeMappingTarget.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeStatus {
	public final static mdMUMatchcodeList.MatchcodeStatus MCNoError=new mdMUMatchcodeList.MatchcodeStatus("MCNoError",0);
	public final static mdMUMatchcodeList.MatchcodeStatus MCFirstComponentFuzzyOptions=new mdMUMatchcodeList.MatchcodeStatus("MCFirstComponentFuzzyOptions",1);
	public final static mdMUMatchcodeList.MatchcodeStatus MCFirstComponentNoSwapPair=new mdMUMatchcodeList.MatchcodeStatus("MCFirstComponentNoSwapPair",2);
	public final static mdMUMatchcodeList.MatchcodeStatus MCDataTypeNoFuzzy=new mdMUMatchcodeList.MatchcodeStatus("MCDataTypeNoFuzzy",3);
	public final static mdMUMatchcodeList.MatchcodeStatus MCComponentFuzzyIncorrectSize=new mdMUMatchcodeList.MatchcodeStatus("MCComponentFuzzyIncorrectSize",4);
	public final static mdMUMatchcodeList.MatchcodeStatus MCDataTypeNoMaximumNumberWords=new mdMUMatchcodeList.MatchcodeStatus("MCDataTypeNoMaximumNumberWords",5);
	public final static mdMUMatchcodeList.MatchcodeStatus MCDataTypeNoStartRightOrWordOrPos=new mdMUMatchcodeList.MatchcodeStatus("MCDataTypeNoStartRightOrWordOrPos",6);
	public final static mdMUMatchcodeList.MatchcodeStatus MCIncorrectMaximumNumberWords=new mdMUMatchcodeList.MatchcodeStatus("MCIncorrectMaximumNumberWords",7);
	public final static mdMUMatchcodeList.MatchcodeStatus MCNearOutOfRange=new mdMUMatchcodeList.MatchcodeStatus("MCNearOutOfRange",8);
	public final static mdMUMatchcodeList.MatchcodeStatus MCFirstComponentNotUsedInEveryCondition=new mdMUMatchcodeList.MatchcodeStatus("MCFirstComponentNotUsedInEveryCondition",9);
	public final static mdMUMatchcodeList.MatchcodeStatus MCCannotChangeFirstComponent=new mdMUMatchcodeList.MatchcodeStatus("MCCannotChangeFirstComponent",10);
	public final static mdMUMatchcodeList.MatchcodeStatus MCInvalidSwapPair=new mdMUMatchcodeList.MatchcodeStatus("MCInvalidSwapPair",11);
	public final static mdMUMatchcodeList.MatchcodeStatus MCIncorrectStartPosOrStartWord=new mdMUMatchcodeList.MatchcodeStatus("MCIncorrectStartPosOrStartWord",12);
	public final static mdMUMatchcodeList.MatchcodeStatus MCInvalidMatchcodeComponentType=new mdMUMatchcodeList.MatchcodeStatus("MCInvalidMatchcodeComponentType",13);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeStatus[] enumValues={MCNoError,MCFirstComponentFuzzyOptions,MCFirstComponentNoSwapPair,MCDataTypeNoFuzzy,MCComponentFuzzyIncorrectSize,MCDataTypeNoMaximumNumberWords,MCDataTypeNoStartRightOrWordOrPos,MCIncorrectMaximumNumberWords,MCNearOutOfRange,MCFirstComponentNotUsedInEveryCondition,MCCannotChangeFirstComponent,MCInvalidSwapPair,MCIncorrectStartPosOrStartWord,MCInvalidMatchcodeComponentType};

	private MatchcodeStatus(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeStatus toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeStatus.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeMapping {
	public final static mdMUMatchcodeList.MatchcodeMapping Prefix=new mdMUMatchcodeList.MatchcodeMapping("Prefix",1);
	public final static mdMUMatchcodeList.MatchcodeMapping Gender=new mdMUMatchcodeList.MatchcodeMapping("Gender",2);
	public final static mdMUMatchcodeList.MatchcodeMapping First=new mdMUMatchcodeList.MatchcodeMapping("First",3);
	public final static mdMUMatchcodeList.MatchcodeMapping MixedFirst=new mdMUMatchcodeList.MatchcodeMapping("MixedFirst",4);
	public final static mdMUMatchcodeList.MatchcodeMapping Middle=new mdMUMatchcodeList.MatchcodeMapping("Middle",5);
	public final static mdMUMatchcodeList.MatchcodeMapping Last=new mdMUMatchcodeList.MatchcodeMapping("Last",6);
	public final static mdMUMatchcodeList.MatchcodeMapping MixedLast=new mdMUMatchcodeList.MatchcodeMapping("MixedLast",7);
	public final static mdMUMatchcodeList.MatchcodeMapping Suffix=new mdMUMatchcodeList.MatchcodeMapping("Suffix",8);
	public final static mdMUMatchcodeList.MatchcodeMapping FullName=new mdMUMatchcodeList.MatchcodeMapping("FullName",9);
	public final static mdMUMatchcodeList.MatchcodeMapping InverseName=new mdMUMatchcodeList.MatchcodeMapping("InverseName",10);
	public final static mdMUMatchcodeList.MatchcodeMapping GovernmentInverseName=new mdMUMatchcodeList.MatchcodeMapping("GovernmentInverseName",11);
	public final static mdMUMatchcodeList.MatchcodeMapping Title=new mdMUMatchcodeList.MatchcodeMapping("Title",12);
	public final static mdMUMatchcodeList.MatchcodeMapping Company=new mdMUMatchcodeList.MatchcodeMapping("Company",13);
	public final static mdMUMatchcodeList.MatchcodeMapping Address=new mdMUMatchcodeList.MatchcodeMapping("Address",14);
	public final static mdMUMatchcodeList.MatchcodeMapping City=new mdMUMatchcodeList.MatchcodeMapping("City",15);
	public final static mdMUMatchcodeList.MatchcodeMapping State=new mdMUMatchcodeList.MatchcodeMapping("State",16);
	public final static mdMUMatchcodeList.MatchcodeMapping Zip9=new mdMUMatchcodeList.MatchcodeMapping("Zip9",17);
	public final static mdMUMatchcodeList.MatchcodeMapping Zip5=new mdMUMatchcodeList.MatchcodeMapping("Zip5",18);
	public final static mdMUMatchcodeList.MatchcodeMapping Zip4=new mdMUMatchcodeList.MatchcodeMapping("Zip4",19);
	public final static mdMUMatchcodeList.MatchcodeMapping CityStZip=new mdMUMatchcodeList.MatchcodeMapping("CityStZip",20);
	public final static mdMUMatchcodeList.MatchcodeMapping Country=new mdMUMatchcodeList.MatchcodeMapping("Country",21);
	public final static mdMUMatchcodeList.MatchcodeMapping CanadianPostalCode=new mdMUMatchcodeList.MatchcodeMapping("CanadianPostalCode",22);
	public final static mdMUMatchcodeList.MatchcodeMapping Phone=new mdMUMatchcodeList.MatchcodeMapping("Phone",27);
	public final static mdMUMatchcodeList.MatchcodeMapping EMail=new mdMUMatchcodeList.MatchcodeMapping("EMail",28);
	public final static mdMUMatchcodeList.MatchcodeMapping CreditCard=new mdMUMatchcodeList.MatchcodeMapping("CreditCard",29);
	public final static mdMUMatchcodeList.MatchcodeMapping General=new mdMUMatchcodeList.MatchcodeMapping("General",30);
	public final static mdMUMatchcodeList.MatchcodeMapping Latitude=new mdMUMatchcodeList.MatchcodeMapping("Latitude",40);
	public final static mdMUMatchcodeList.MatchcodeMapping Longitude=new mdMUMatchcodeList.MatchcodeMapping("Longitude",41);
	public final static mdMUMatchcodeList.MatchcodeMapping Date=new mdMUMatchcodeList.MatchcodeMapping("Date",42);
	public final static mdMUMatchcodeList.MatchcodeMapping Numeric=new mdMUMatchcodeList.MatchcodeMapping("Numeric",43);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeMapping[] enumValues={Prefix,Gender,First,MixedFirst,Middle,Last,MixedLast,Suffix,FullName,InverseName,GovernmentInverseName,Title,Company,Address,City,State,Zip9,Zip5,Zip4,CityStZip,Country,CanadianPostalCode,Phone,EMail,CreditCard,General,Latitude,Longitude,Date,Numeric};

	private MatchcodeMapping(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeMapping toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeMapping.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class MatchcodeNearType {
	public final static mdMUMatchcodeList.MatchcodeNearType NearNone=new mdMUMatchcodeList.MatchcodeNearType("NearNone",0);
	public final static mdMUMatchcodeList.MatchcodeNearType NearInteger=new mdMUMatchcodeList.MatchcodeNearType("NearInteger",1);
	public final static mdMUMatchcodeList.MatchcodeNearType NearFloat=new mdMUMatchcodeList.MatchcodeNearType("NearFloat",2);

	private final String enumName;
	private final int enumValue;
	private static MatchcodeNearType[] enumValues={NearNone,NearInteger,NearFloat};

	private MatchcodeNearType(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static MatchcodeNearType toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+MatchcodeNearType.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class ComponentCountryType {
	public final static mdMUMatchcodeList.ComponentCountryType US=new mdMUMatchcodeList.ComponentCountryType("US",1);
	public final static mdMUMatchcodeList.ComponentCountryType Canada=new mdMUMatchcodeList.ComponentCountryType("Canada",2);
	public final static mdMUMatchcodeList.ComponentCountryType Global=new mdMUMatchcodeList.ComponentCountryType("Global",4);
	public final static mdMUMatchcodeList.ComponentCountryType Domestic=new mdMUMatchcodeList.ComponentCountryType("Domestic",3);

	private final String enumName;
	private final int enumValue;
	private static ComponentCountryType[] enumValues={US,Canada,Global,Domestic};

	private ComponentCountryType(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static ComponentCountryType toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+ComponentCountryType.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

	protected mdMUMatchcodeList(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdMUMatchcodeList() {
		this(mdMUMatchcodeListJNI.mdMUMatchcodeListCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdMUMatchcodeListJNI.mdMUMatchcodeListDestroy(I);
			}
			I=0;
		}
	}

	public void SetPathToMatchUpFiles(String Path) {
		mdMUMatchcodeListJNI.SetPathToMatchUpFiles(I,Path);
	}

	public ProgramStatus InitializeDataFiles() {
		return ProgramStatus.toEnum(mdMUMatchcodeListJNI.InitializeDataFiles(I));
	}

	public String GetInitializeErrorString() {
		return mdMUMatchcodeListJNI.GetInitializeErrorString(I);
	}

	public int GetMatchcodeCount() {
		return mdMUMatchcodeListJNI.GetMatchcodeCount(I);
	}

	public String GetMatchcodeName(int Pos) {
		return mdMUMatchcodeListJNI.GetMatchcodeName(I,Pos);
	}

}
