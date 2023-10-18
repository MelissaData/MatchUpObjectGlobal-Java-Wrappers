package com.melissadata;

public class mdMUIncremental {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdMUIncremental obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdMUIncremental.ProgramStatus ErrorNone=new mdMUIncremental.ProgramStatus("ErrorNone",0);
	public final static mdMUIncremental.ProgramStatus ErrorConfigFile=new mdMUIncremental.ProgramStatus("ErrorConfigFile",1);
	public final static mdMUIncremental.ProgramStatus ErrorLicenseExpired=new mdMUIncremental.ProgramStatus("ErrorLicenseExpired",2);
	public final static mdMUIncremental.ProgramStatus ErrorDatabaseExpired=new mdMUIncremental.ProgramStatus("ErrorDatabaseExpired",3);
	public final static mdMUIncremental.ProgramStatus ErrorMatchcodeNotSpecified=new mdMUIncremental.ProgramStatus("ErrorMatchcodeNotSpecified",4);
	public final static mdMUIncremental.ProgramStatus ErrorMatchcodeNotFound=new mdMUIncremental.ProgramStatus("ErrorMatchcodeNotFound",5);
	public final static mdMUIncremental.ProgramStatus ErrorInvalidMatchcode=new mdMUIncremental.ProgramStatus("ErrorInvalidMatchcode",6);
	public final static mdMUIncremental.ProgramStatus ErrorKeyFile=new mdMUIncremental.ProgramStatus("ErrorKeyFile",7);
	public final static mdMUIncremental.ProgramStatus ErrorNoneIntersectingGroupCache=new mdMUIncremental.ProgramStatus("ErrorNoneIntersectingGroupCache",8);
	public final static mdMUIncremental.ProgramStatus ErrorMatchcodeObsolete=new mdMUIncremental.ProgramStatus("ErrorMatchcodeObsolete",9);
	public final static mdMUIncremental.ProgramStatus ErrorGlobalAddrInit=new mdMUIncremental.ProgramStatus("ErrorGlobalAddrInit",10);
	public final static mdMUIncremental.ProgramStatus ErrorIntlLicenseRequired=new mdMUIncremental.ProgramStatus("ErrorIntlLicenseRequired",11);

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
	public final static mdMUIncremental.MatchcodeComponentType PrefixComp=new mdMUIncremental.MatchcodeComponentType("PrefixComp",1);
	public final static mdMUIncremental.MatchcodeComponentType FirstComp=new mdMUIncremental.MatchcodeComponentType("FirstComp",2);
	public final static mdMUIncremental.MatchcodeComponentType MiddleComp=new mdMUIncremental.MatchcodeComponentType("MiddleComp",3);
	public final static mdMUIncremental.MatchcodeComponentType LastComp=new mdMUIncremental.MatchcodeComponentType("LastComp",4);
	public final static mdMUIncremental.MatchcodeComponentType SuffixComp=new mdMUIncremental.MatchcodeComponentType("SuffixComp",5);
	public final static mdMUIncremental.MatchcodeComponentType GenderComp=new mdMUIncremental.MatchcodeComponentType("GenderComp",6);
	public final static mdMUIncremental.MatchcodeComponentType FirstNicknameComp=new mdMUIncremental.MatchcodeComponentType("FirstNicknameComp",7);
	public final static mdMUIncremental.MatchcodeComponentType MiddleNicknameComp=new mdMUIncremental.MatchcodeComponentType("MiddleNicknameComp",8);
	public final static mdMUIncremental.MatchcodeComponentType TitleComp=new mdMUIncremental.MatchcodeComponentType("TitleComp",9);
	public final static mdMUIncremental.MatchcodeComponentType CompanyComp=new mdMUIncremental.MatchcodeComponentType("CompanyComp",10);
	public final static mdMUIncremental.MatchcodeComponentType CompanyAcronymComp=new mdMUIncremental.MatchcodeComponentType("CompanyAcronymComp",11);
	public final static mdMUIncremental.MatchcodeComponentType StreetNumberComp=new mdMUIncremental.MatchcodeComponentType("StreetNumberComp",12);
	public final static mdMUIncremental.MatchcodeComponentType StreetPreDirComp=new mdMUIncremental.MatchcodeComponentType("StreetPreDirComp",13);
	public final static mdMUIncremental.MatchcodeComponentType StreetNameComp=new mdMUIncremental.MatchcodeComponentType("StreetNameComp",14);
	public final static mdMUIncremental.MatchcodeComponentType StreetSuffixComp=new mdMUIncremental.MatchcodeComponentType("StreetSuffixComp",15);
	public final static mdMUIncremental.MatchcodeComponentType StreetPostDirComp=new mdMUIncremental.MatchcodeComponentType("StreetPostDirComp",16);
	public final static mdMUIncremental.MatchcodeComponentType POBoxComp=new mdMUIncremental.MatchcodeComponentType("POBoxComp",17);
	public final static mdMUIncremental.MatchcodeComponentType SecondaryComp=new mdMUIncremental.MatchcodeComponentType("SecondaryComp",18);
	public final static mdMUIncremental.MatchcodeComponentType AddressComp=new mdMUIncremental.MatchcodeComponentType("AddressComp",19);
	public final static mdMUIncremental.MatchcodeComponentType CityComp=new mdMUIncremental.MatchcodeComponentType("CityComp",20);
	public final static mdMUIncremental.MatchcodeComponentType StateComp=new mdMUIncremental.MatchcodeComponentType("StateComp",21);
	public final static mdMUIncremental.MatchcodeComponentType Zip9Comp=new mdMUIncremental.MatchcodeComponentType("Zip9Comp",22);
	public final static mdMUIncremental.MatchcodeComponentType Zip5Comp=new mdMUIncremental.MatchcodeComponentType("Zip5Comp",23);
	public final static mdMUIncremental.MatchcodeComponentType Zip4Comp=new mdMUIncremental.MatchcodeComponentType("Zip4Comp",24);
	public final static mdMUIncremental.MatchcodeComponentType CountryComp=new mdMUIncremental.MatchcodeComponentType("CountryComp",28);
	public final static mdMUIncremental.MatchcodeComponentType CanadianPCComp=new mdMUIncremental.MatchcodeComponentType("CanadianPCComp",29);
	public final static mdMUIncremental.MatchcodeComponentType PhoneComp=new mdMUIncremental.MatchcodeComponentType("PhoneComp",33);
	public final static mdMUIncremental.MatchcodeComponentType EMailComp=new mdMUIncremental.MatchcodeComponentType("EMailComp",34);
	public final static mdMUIncremental.MatchcodeComponentType CreditCardComp=new mdMUIncremental.MatchcodeComponentType("CreditCardComp",35);
	public final static mdMUIncremental.MatchcodeComponentType GeneralComp=new mdMUIncremental.MatchcodeComponentType("GeneralComp",36);
	public final static mdMUIncremental.MatchcodeComponentType GeoDistanceComp=new mdMUIncremental.MatchcodeComponentType("GeoDistanceComp",38);
	public final static mdMUIncremental.MatchcodeComponentType DateComp=new mdMUIncremental.MatchcodeComponentType("DateComp",39);
	public final static mdMUIncremental.MatchcodeComponentType NumericComp=new mdMUIncremental.MatchcodeComponentType("NumericComp",40);
	public final static mdMUIncremental.MatchcodeComponentType PremisesNumberComp=new mdMUIncremental.MatchcodeComponentType("PremisesNumberComp",41);
	public final static mdMUIncremental.MatchcodeComponentType ThoroughfarePreDirComp=new mdMUIncremental.MatchcodeComponentType("ThoroughfarePreDirComp",42);
	public final static mdMUIncremental.MatchcodeComponentType ThoroughfareLeadingTypeComp=new mdMUIncremental.MatchcodeComponentType("ThoroughfareLeadingTypeComp",43);
	public final static mdMUIncremental.MatchcodeComponentType ThoroughfareNameComp=new mdMUIncremental.MatchcodeComponentType("ThoroughfareNameComp",44);
	public final static mdMUIncremental.MatchcodeComponentType ThoroughfarePostDirComp=new mdMUIncremental.MatchcodeComponentType("ThoroughfarePostDirComp",45);
	public final static mdMUIncremental.MatchcodeComponentType ThoroughfareTrailingTypeComp=new mdMUIncremental.MatchcodeComponentType("ThoroughfareTrailingTypeComp",46);
	public final static mdMUIncremental.MatchcodeComponentType DepThoroughfarePreDirComp=new mdMUIncremental.MatchcodeComponentType("DepThoroughfarePreDirComp",47);
	public final static mdMUIncremental.MatchcodeComponentType DepThoroughfareLeadingTypeComp=new mdMUIncremental.MatchcodeComponentType("DepThoroughfareLeadingTypeComp",48);
	public final static mdMUIncremental.MatchcodeComponentType DepThoroughfareNameComp=new mdMUIncremental.MatchcodeComponentType("DepThoroughfareNameComp",49);
	public final static mdMUIncremental.MatchcodeComponentType DepThoroughfarePostDirComp=new mdMUIncremental.MatchcodeComponentType("DepThoroughfarePostDirComp",50);
	public final static mdMUIncremental.MatchcodeComponentType DepThoroughfareTrailingTypeComp=new mdMUIncremental.MatchcodeComponentType("DepThoroughfareTrailingTypeComp",51);
	public final static mdMUIncremental.MatchcodeComponentType LocalityComp=new mdMUIncremental.MatchcodeComponentType("LocalityComp",52);
	public final static mdMUIncremental.MatchcodeComponentType DependentLocalityComp=new mdMUIncremental.MatchcodeComponentType("DependentLocalityComp",53);
	public final static mdMUIncremental.MatchcodeComponentType DblDependentLocalityComp=new mdMUIncremental.MatchcodeComponentType("DblDependentLocalityComp",54);
	public final static mdMUIncremental.MatchcodeComponentType AdministrativeAreaComp=new mdMUIncremental.MatchcodeComponentType("AdministrativeAreaComp",55);
	public final static mdMUIncremental.MatchcodeComponentType SubAdministrativeAreaComp=new mdMUIncremental.MatchcodeComponentType("SubAdministrativeAreaComp",56);
	public final static mdMUIncremental.MatchcodeComponentType PostalCodeComp=new mdMUIncremental.MatchcodeComponentType("PostalCodeComp",57);
	public final static mdMUIncremental.MatchcodeComponentType SubNationalAreaComp=new mdMUIncremental.MatchcodeComponentType("SubNationalAreaComp",58);
	public final static mdMUIncremental.MatchcodeComponentType PostBoxComp=new mdMUIncremental.MatchcodeComponentType("PostBoxComp",59);

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
	public final static mdMUIncremental.MatchcodeStart Left=new mdMUIncremental.MatchcodeStart("Left",8);
	public final static mdMUIncremental.MatchcodeStart Right=new mdMUIncremental.MatchcodeStart("Right",16);
	public final static mdMUIncremental.MatchcodeStart StartAtPos=new mdMUIncremental.MatchcodeStart("StartAtPos",32);
	public final static mdMUIncremental.MatchcodeStart StartAtWord=new mdMUIncremental.MatchcodeStart("StartAtWord",64);

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
	public final static mdMUIncremental.MatchcodeTrim LeftTrim=new mdMUIncremental.MatchcodeTrim("LeftTrim",2);
	public final static mdMUIncremental.MatchcodeTrim RightTrim=new mdMUIncremental.MatchcodeTrim("RightTrim",4);
	public final static mdMUIncremental.MatchcodeTrim AllTrim=new mdMUIncremental.MatchcodeTrim("AllTrim",6);

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
	public final static mdMUIncremental.MatchcodeFuzzy Exact=new mdMUIncremental.MatchcodeFuzzy("Exact",0);
	public final static mdMUIncremental.MatchcodeFuzzy SoundEx=new mdMUIncremental.MatchcodeFuzzy("SoundEx",1);
	public final static mdMUIncremental.MatchcodeFuzzy Phonetex=new mdMUIncremental.MatchcodeFuzzy("Phonetex",2);
	public final static mdMUIncremental.MatchcodeFuzzy Containment=new mdMUIncremental.MatchcodeFuzzy("Containment",4);
	public final static mdMUIncremental.MatchcodeFuzzy Frequency=new mdMUIncremental.MatchcodeFuzzy("Frequency",8);
	public final static mdMUIncremental.MatchcodeFuzzy FastNear=new mdMUIncremental.MatchcodeFuzzy("FastNear",16);
	public final static mdMUIncremental.MatchcodeFuzzy AccurateNear=new mdMUIncremental.MatchcodeFuzzy("AccurateNear",32);
	public final static mdMUIncremental.MatchcodeFuzzy VowelsOnly=new mdMUIncremental.MatchcodeFuzzy("VowelsOnly",64);
	public final static mdMUIncremental.MatchcodeFuzzy ConsonantsOnly=new mdMUIncremental.MatchcodeFuzzy("ConsonantsOnly",128);
	public final static mdMUIncremental.MatchcodeFuzzy AlphasOnly=new mdMUIncremental.MatchcodeFuzzy("AlphasOnly",256);
	public final static mdMUIncremental.MatchcodeFuzzy NumericsOnly=new mdMUIncremental.MatchcodeFuzzy("NumericsOnly",512);
	public final static mdMUIncremental.MatchcodeFuzzy FrequencyNear=new mdMUIncremental.MatchcodeFuzzy("FrequencyNear",1024);
	public final static mdMUIncremental.MatchcodeFuzzy NGram=new mdMUIncremental.MatchcodeFuzzy("NGram",2048);
	public final static mdMUIncremental.MatchcodeFuzzy Jaro=new mdMUIncremental.MatchcodeFuzzy("Jaro",4096);
	public final static mdMUIncremental.MatchcodeFuzzy JaroWinkler=new mdMUIncremental.MatchcodeFuzzy("JaroWinkler",8192);
	public final static mdMUIncremental.MatchcodeFuzzy LCS=new mdMUIncremental.MatchcodeFuzzy("LCS",16384);
	public final static mdMUIncremental.MatchcodeFuzzy NeedlemanWunsch=new mdMUIncremental.MatchcodeFuzzy("NeedlemanWunsch",32768);
	public final static mdMUIncremental.MatchcodeFuzzy MDKeyboard=new mdMUIncremental.MatchcodeFuzzy("MDKeyboard",65536);
	public final static mdMUIncremental.MatchcodeFuzzy SmithWatermanGotoh=new mdMUIncremental.MatchcodeFuzzy("SmithWatermanGotoh",131072);
	public final static mdMUIncremental.MatchcodeFuzzy Dice=new mdMUIncremental.MatchcodeFuzzy("Dice",262144);
	public final static mdMUIncremental.MatchcodeFuzzy Jaccard=new mdMUIncremental.MatchcodeFuzzy("Jaccard",524288);
	public final static mdMUIncremental.MatchcodeFuzzy Overlap=new mdMUIncremental.MatchcodeFuzzy("Overlap",1048576);
	public final static mdMUIncremental.MatchcodeFuzzy DoubleMetaphone=new mdMUIncremental.MatchcodeFuzzy("DoubleMetaphone",2097152);
	public final static mdMUIncremental.MatchcodeFuzzy UTF8Near=new mdMUIncremental.MatchcodeFuzzy("UTF8Near",4194304);

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
	public final static mdMUIncremental.MatchcodeFieldMatch NoFieldMatch=new mdMUIncremental.MatchcodeFieldMatch("NoFieldMatch",0);
	public final static mdMUIncremental.MatchcodeFieldMatch BothBlankMatch=new mdMUIncremental.MatchcodeFieldMatch("BothBlankMatch",256);
	public final static mdMUIncremental.MatchcodeFieldMatch OneBlankMatch=new mdMUIncremental.MatchcodeFieldMatch("OneBlankMatch",512);
	public final static mdMUIncremental.MatchcodeFieldMatch InitialMatch=new mdMUIncremental.MatchcodeFieldMatch("InitialMatch",1024);

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
	public final static mdMUIncremental.MatchcodeSwap NoSwap=new mdMUIncremental.MatchcodeSwap("NoSwap",0);
	public final static mdMUIncremental.MatchcodeSwap SwapA=new mdMUIncremental.MatchcodeSwap("SwapA",1);
	public final static mdMUIncremental.MatchcodeSwap SwapB=new mdMUIncremental.MatchcodeSwap("SwapB",2);
	public final static mdMUIncremental.MatchcodeSwap SwapC=new mdMUIncremental.MatchcodeSwap("SwapC",4);
	public final static mdMUIncremental.MatchcodeSwap SwapD=new mdMUIncremental.MatchcodeSwap("SwapD",8);
	public final static mdMUIncremental.MatchcodeSwap SwapE=new mdMUIncremental.MatchcodeSwap("SwapE",16);
	public final static mdMUIncremental.MatchcodeSwap SwapF=new mdMUIncremental.MatchcodeSwap("SwapF",32);
	public final static mdMUIncremental.MatchcodeSwap SwapG=new mdMUIncremental.MatchcodeSwap("SwapG",64);
	public final static mdMUIncremental.MatchcodeSwap SwapH=new mdMUIncremental.MatchcodeSwap("SwapH",128);
	public final static mdMUIncremental.MatchcodeSwap BothA=new mdMUIncremental.MatchcodeSwap("BothA",256);
	public final static mdMUIncremental.MatchcodeSwap BothB=new mdMUIncremental.MatchcodeSwap("BothB",512);
	public final static mdMUIncremental.MatchcodeSwap BothC=new mdMUIncremental.MatchcodeSwap("BothC",1024);
	public final static mdMUIncremental.MatchcodeSwap BothD=new mdMUIncremental.MatchcodeSwap("BothD",2048);
	public final static mdMUIncremental.MatchcodeSwap BothE=new mdMUIncremental.MatchcodeSwap("BothE",4096);
	public final static mdMUIncremental.MatchcodeSwap BothF=new mdMUIncremental.MatchcodeSwap("BothF",8192);
	public final static mdMUIncremental.MatchcodeSwap BothG=new mdMUIncremental.MatchcodeSwap("BothG",16384);
	public final static mdMUIncremental.MatchcodeSwap BothH=new mdMUIncremental.MatchcodeSwap("BothH",32768);

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
	public final static mdMUIncremental.MatchcodeCombination Combo1=new mdMUIncremental.MatchcodeCombination("Combo1",1);
	public final static mdMUIncremental.MatchcodeCombination Combo2=new mdMUIncremental.MatchcodeCombination("Combo2",2);
	public final static mdMUIncremental.MatchcodeCombination Combo3=new mdMUIncremental.MatchcodeCombination("Combo3",4);
	public final static mdMUIncremental.MatchcodeCombination Combo4=new mdMUIncremental.MatchcodeCombination("Combo4",8);
	public final static mdMUIncremental.MatchcodeCombination Combo5=new mdMUIncremental.MatchcodeCombination("Combo5",16);
	public final static mdMUIncremental.MatchcodeCombination Combo6=new mdMUIncremental.MatchcodeCombination("Combo6",32);
	public final static mdMUIncremental.MatchcodeCombination Combo7=new mdMUIncremental.MatchcodeCombination("Combo7",64);
	public final static mdMUIncremental.MatchcodeCombination Combo8=new mdMUIncremental.MatchcodeCombination("Combo8",128);
	public final static mdMUIncremental.MatchcodeCombination Combo9=new mdMUIncremental.MatchcodeCombination("Combo9",256);
	public final static mdMUIncremental.MatchcodeCombination Combo10=new mdMUIncremental.MatchcodeCombination("Combo10",512);
	public final static mdMUIncremental.MatchcodeCombination Combo11=new mdMUIncremental.MatchcodeCombination("Combo11",1024);
	public final static mdMUIncremental.MatchcodeCombination Combo12=new mdMUIncremental.MatchcodeCombination("Combo12",2048);
	public final static mdMUIncremental.MatchcodeCombination Combo13=new mdMUIncremental.MatchcodeCombination("Combo13",4096);
	public final static mdMUIncremental.MatchcodeCombination Combo14=new mdMUIncremental.MatchcodeCombination("Combo14",8192);
	public final static mdMUIncremental.MatchcodeCombination Combo15=new mdMUIncremental.MatchcodeCombination("Combo15",16384);
	public final static mdMUIncremental.MatchcodeCombination Combo16=new mdMUIncremental.MatchcodeCombination("Combo16",32768);

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
	public final static mdMUIncremental.MatchcodeMappingTarget PrefixType=new mdMUIncremental.MatchcodeMappingTarget("PrefixType",1);
	public final static mdMUIncremental.MatchcodeMappingTarget FirstType=new mdMUIncremental.MatchcodeMappingTarget("FirstType",2);
	public final static mdMUIncremental.MatchcodeMappingTarget MiddleType=new mdMUIncremental.MatchcodeMappingTarget("MiddleType",3);
	public final static mdMUIncremental.MatchcodeMappingTarget LastType=new mdMUIncremental.MatchcodeMappingTarget("LastType",4);
	public final static mdMUIncremental.MatchcodeMappingTarget SuffixType=new mdMUIncremental.MatchcodeMappingTarget("SuffixType",5);
	public final static mdMUIncremental.MatchcodeMappingTarget GenderType=new mdMUIncremental.MatchcodeMappingTarget("GenderType",6);
	public final static mdMUIncremental.MatchcodeMappingTarget FirstNicknameType=new mdMUIncremental.MatchcodeMappingTarget("FirstNicknameType",7);
	public final static mdMUIncremental.MatchcodeMappingTarget MiddleNicknameType=new mdMUIncremental.MatchcodeMappingTarget("MiddleNicknameType",8);
	public final static mdMUIncremental.MatchcodeMappingTarget TitleType=new mdMUIncremental.MatchcodeMappingTarget("TitleType",9);
	public final static mdMUIncremental.MatchcodeMappingTarget CompanyType=new mdMUIncremental.MatchcodeMappingTarget("CompanyType",10);
	public final static mdMUIncremental.MatchcodeMappingTarget CompanyAcronymType=new mdMUIncremental.MatchcodeMappingTarget("CompanyAcronymType",11);
	public final static mdMUIncremental.MatchcodeMappingTarget AddressType=new mdMUIncremental.MatchcodeMappingTarget("AddressType",12);
	public final static mdMUIncremental.MatchcodeMappingTarget CityType=new mdMUIncremental.MatchcodeMappingTarget("CityType",13);
	public final static mdMUIncremental.MatchcodeMappingTarget StateType=new mdMUIncremental.MatchcodeMappingTarget("StateType",14);
	public final static mdMUIncremental.MatchcodeMappingTarget Zip9Type=new mdMUIncremental.MatchcodeMappingTarget("Zip9Type",15);
	public final static mdMUIncremental.MatchcodeMappingTarget Zip5Type=new mdMUIncremental.MatchcodeMappingTarget("Zip5Type",16);
	public final static mdMUIncremental.MatchcodeMappingTarget Zip4Type=new mdMUIncremental.MatchcodeMappingTarget("Zip4Type",17);
	public final static mdMUIncremental.MatchcodeMappingTarget CountryType=new mdMUIncremental.MatchcodeMappingTarget("CountryType",18);
	public final static mdMUIncremental.MatchcodeMappingTarget CanadianPCType=new mdMUIncremental.MatchcodeMappingTarget("CanadianPCType",19);
	public final static mdMUIncremental.MatchcodeMappingTarget PhoneType=new mdMUIncremental.MatchcodeMappingTarget("PhoneType",23);
	public final static mdMUIncremental.MatchcodeMappingTarget EMailType=new mdMUIncremental.MatchcodeMappingTarget("EMailType",24);
	public final static mdMUIncremental.MatchcodeMappingTarget CreditCardType=new mdMUIncremental.MatchcodeMappingTarget("CreditCardType",25);
	public final static mdMUIncremental.MatchcodeMappingTarget GeneralType=new mdMUIncremental.MatchcodeMappingTarget("GeneralType",26);
	public final static mdMUIncremental.MatchcodeMappingTarget Address1Type=new mdMUIncremental.MatchcodeMappingTarget("Address1Type",28);
	public final static mdMUIncremental.MatchcodeMappingTarget Address2Type=new mdMUIncremental.MatchcodeMappingTarget("Address2Type",29);
	public final static mdMUIncremental.MatchcodeMappingTarget Address3Type=new mdMUIncremental.MatchcodeMappingTarget("Address3Type",30);
	public final static mdMUIncremental.MatchcodeMappingTarget LatitudeType=new mdMUIncremental.MatchcodeMappingTarget("LatitudeType",34);
	public final static mdMUIncremental.MatchcodeMappingTarget LongitudeType=new mdMUIncremental.MatchcodeMappingTarget("LongitudeType",35);
	public final static mdMUIncremental.MatchcodeMappingTarget DateType=new mdMUIncremental.MatchcodeMappingTarget("DateType",36);
	public final static mdMUIncremental.MatchcodeMappingTarget NumericType=new mdMUIncremental.MatchcodeMappingTarget("NumericType",37);
	public final static mdMUIncremental.MatchcodeMappingTarget Address4Type=new mdMUIncremental.MatchcodeMappingTarget("Address4Type",38);
	public final static mdMUIncremental.MatchcodeMappingTarget Address5Type=new mdMUIncremental.MatchcodeMappingTarget("Address5Type",39);
	public final static mdMUIncremental.MatchcodeMappingTarget Address6Type=new mdMUIncremental.MatchcodeMappingTarget("Address6Type",40);
	public final static mdMUIncremental.MatchcodeMappingTarget Address7Type=new mdMUIncremental.MatchcodeMappingTarget("Address7Type",41);
	public final static mdMUIncremental.MatchcodeMappingTarget Address8Type=new mdMUIncremental.MatchcodeMappingTarget("Address8Type",42);

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
	public final static mdMUIncremental.MatchcodeStatus MCNoError=new mdMUIncremental.MatchcodeStatus("MCNoError",0);
	public final static mdMUIncremental.MatchcodeStatus MCFirstComponentFuzzyOptions=new mdMUIncremental.MatchcodeStatus("MCFirstComponentFuzzyOptions",1);
	public final static mdMUIncremental.MatchcodeStatus MCFirstComponentNoSwapPair=new mdMUIncremental.MatchcodeStatus("MCFirstComponentNoSwapPair",2);
	public final static mdMUIncremental.MatchcodeStatus MCDataTypeNoFuzzy=new mdMUIncremental.MatchcodeStatus("MCDataTypeNoFuzzy",3);
	public final static mdMUIncremental.MatchcodeStatus MCComponentFuzzyIncorrectSize=new mdMUIncremental.MatchcodeStatus("MCComponentFuzzyIncorrectSize",4);
	public final static mdMUIncremental.MatchcodeStatus MCDataTypeNoMaximumNumberWords=new mdMUIncremental.MatchcodeStatus("MCDataTypeNoMaximumNumberWords",5);
	public final static mdMUIncremental.MatchcodeStatus MCDataTypeNoStartRightOrWordOrPos=new mdMUIncremental.MatchcodeStatus("MCDataTypeNoStartRightOrWordOrPos",6);
	public final static mdMUIncremental.MatchcodeStatus MCIncorrectMaximumNumberWords=new mdMUIncremental.MatchcodeStatus("MCIncorrectMaximumNumberWords",7);
	public final static mdMUIncremental.MatchcodeStatus MCNearOutOfRange=new mdMUIncremental.MatchcodeStatus("MCNearOutOfRange",8);
	public final static mdMUIncremental.MatchcodeStatus MCFirstComponentNotUsedInEveryCondition=new mdMUIncremental.MatchcodeStatus("MCFirstComponentNotUsedInEveryCondition",9);
	public final static mdMUIncremental.MatchcodeStatus MCCannotChangeFirstComponent=new mdMUIncremental.MatchcodeStatus("MCCannotChangeFirstComponent",10);
	public final static mdMUIncremental.MatchcodeStatus MCInvalidSwapPair=new mdMUIncremental.MatchcodeStatus("MCInvalidSwapPair",11);
	public final static mdMUIncremental.MatchcodeStatus MCIncorrectStartPosOrStartWord=new mdMUIncremental.MatchcodeStatus("MCIncorrectStartPosOrStartWord",12);
	public final static mdMUIncremental.MatchcodeStatus MCInvalidMatchcodeComponentType=new mdMUIncremental.MatchcodeStatus("MCInvalidMatchcodeComponentType",13);

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
	public final static mdMUIncremental.MatchcodeMapping Prefix=new mdMUIncremental.MatchcodeMapping("Prefix",1);
	public final static mdMUIncremental.MatchcodeMapping Gender=new mdMUIncremental.MatchcodeMapping("Gender",2);
	public final static mdMUIncremental.MatchcodeMapping First=new mdMUIncremental.MatchcodeMapping("First",3);
	public final static mdMUIncremental.MatchcodeMapping MixedFirst=new mdMUIncremental.MatchcodeMapping("MixedFirst",4);
	public final static mdMUIncremental.MatchcodeMapping Middle=new mdMUIncremental.MatchcodeMapping("Middle",5);
	public final static mdMUIncremental.MatchcodeMapping Last=new mdMUIncremental.MatchcodeMapping("Last",6);
	public final static mdMUIncremental.MatchcodeMapping MixedLast=new mdMUIncremental.MatchcodeMapping("MixedLast",7);
	public final static mdMUIncremental.MatchcodeMapping Suffix=new mdMUIncremental.MatchcodeMapping("Suffix",8);
	public final static mdMUIncremental.MatchcodeMapping FullName=new mdMUIncremental.MatchcodeMapping("FullName",9);
	public final static mdMUIncremental.MatchcodeMapping InverseName=new mdMUIncremental.MatchcodeMapping("InverseName",10);
	public final static mdMUIncremental.MatchcodeMapping GovernmentInverseName=new mdMUIncremental.MatchcodeMapping("GovernmentInverseName",11);
	public final static mdMUIncremental.MatchcodeMapping Title=new mdMUIncremental.MatchcodeMapping("Title",12);
	public final static mdMUIncremental.MatchcodeMapping Company=new mdMUIncremental.MatchcodeMapping("Company",13);
	public final static mdMUIncremental.MatchcodeMapping Address=new mdMUIncremental.MatchcodeMapping("Address",14);
	public final static mdMUIncremental.MatchcodeMapping City=new mdMUIncremental.MatchcodeMapping("City",15);
	public final static mdMUIncremental.MatchcodeMapping State=new mdMUIncremental.MatchcodeMapping("State",16);
	public final static mdMUIncremental.MatchcodeMapping Zip9=new mdMUIncremental.MatchcodeMapping("Zip9",17);
	public final static mdMUIncremental.MatchcodeMapping Zip5=new mdMUIncremental.MatchcodeMapping("Zip5",18);
	public final static mdMUIncremental.MatchcodeMapping Zip4=new mdMUIncremental.MatchcodeMapping("Zip4",19);
	public final static mdMUIncremental.MatchcodeMapping CityStZip=new mdMUIncremental.MatchcodeMapping("CityStZip",20);
	public final static mdMUIncremental.MatchcodeMapping Country=new mdMUIncremental.MatchcodeMapping("Country",21);
	public final static mdMUIncremental.MatchcodeMapping CanadianPostalCode=new mdMUIncremental.MatchcodeMapping("CanadianPostalCode",22);
	public final static mdMUIncremental.MatchcodeMapping Phone=new mdMUIncremental.MatchcodeMapping("Phone",27);
	public final static mdMUIncremental.MatchcodeMapping EMail=new mdMUIncremental.MatchcodeMapping("EMail",28);
	public final static mdMUIncremental.MatchcodeMapping CreditCard=new mdMUIncremental.MatchcodeMapping("CreditCard",29);
	public final static mdMUIncremental.MatchcodeMapping General=new mdMUIncremental.MatchcodeMapping("General",30);
	public final static mdMUIncremental.MatchcodeMapping Latitude=new mdMUIncremental.MatchcodeMapping("Latitude",40);
	public final static mdMUIncremental.MatchcodeMapping Longitude=new mdMUIncremental.MatchcodeMapping("Longitude",41);
	public final static mdMUIncremental.MatchcodeMapping Date=new mdMUIncremental.MatchcodeMapping("Date",42);
	public final static mdMUIncremental.MatchcodeMapping Numeric=new mdMUIncremental.MatchcodeMapping("Numeric",43);

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
	public final static mdMUIncremental.MatchcodeNearType NearNone=new mdMUIncremental.MatchcodeNearType("NearNone",0);
	public final static mdMUIncremental.MatchcodeNearType NearInteger=new mdMUIncremental.MatchcodeNearType("NearInteger",1);
	public final static mdMUIncremental.MatchcodeNearType NearFloat=new mdMUIncremental.MatchcodeNearType("NearFloat",2);

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
	public final static mdMUIncremental.ComponentCountryType US=new mdMUIncremental.ComponentCountryType("US",1);
	public final static mdMUIncremental.ComponentCountryType Canada=new mdMUIncremental.ComponentCountryType("Canada",2);
	public final static mdMUIncremental.ComponentCountryType Global=new mdMUIncremental.ComponentCountryType("Global",4);
	public final static mdMUIncremental.ComponentCountryType Domestic=new mdMUIncremental.ComponentCountryType("Domestic",3);

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

	protected mdMUIncremental(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdMUIncremental() {
		this(mdMUIncrementalJNI.mdMUIncrementalCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdMUIncrementalJNI.mdMUIncrementalDestroy(I);
			}
			I=0;
		}
	}

	public void SetPathToMatchUpFiles(String Path) {
		mdMUIncrementalJNI.SetPathToMatchUpFiles(I,Path);
	}

	public void SetMatchcodeName(String MatchcodeName) {
		mdMUIncrementalJNI.SetMatchcodeName(I,MatchcodeName);
	}

	public void SetMustExist(boolean bMustExist) {
		mdMUIncrementalJNI.SetMustExist(I,bMustExist);
	}

	public void SetKeyFile(String KeyFile) {
		mdMUIncrementalJNI.SetKeyFile(I,KeyFile);
	}

	public ProgramStatus InitializeDataFiles() {
		return ProgramStatus.toEnum(mdMUIncrementalJNI.InitializeDataFiles(I));
	}

	public String GetInitializeErrorString() {
		return mdMUIncrementalJNI.GetInitializeErrorString(I);
	}

	public int SetLicenseString(String License) {
		return mdMUIncrementalJNI.SetLicenseString(I,License);
	}

	public void SetMaximumCharacterSize(int size) {
		mdMUIncrementalJNI.SetMaximumCharacterSize(I,size);
	}

	public int SetEncoding(String encodeName) {
		return mdMUIncrementalJNI.SetEncoding(I,encodeName);
	}

	public String GetBuildNumber() {
		return mdMUIncrementalJNI.GetBuildNumber(I);
	}

	public String GetDatabaseDate() {
		return mdMUIncrementalJNI.GetDatabaseDate(I);
	}

	public String GetDatabaseExpirationDate() {
		return mdMUIncrementalJNI.GetDatabaseExpirationDate(I);
	}

	public String GetLicenseExpirationDate() {
		return mdMUIncrementalJNI.GetLicenseExpirationDate(I);
	}

	public long GetMatchcodeObject() {
		return mdMUIncrementalJNI.GetMatchcodeObject(I);
	}

	public void ClearMappings() {
		mdMUIncrementalJNI.ClearMappings(I);
	}

	public int AddMapping(mdMUIncremental.MatchcodeMapping Mapping) {
		return mdMUIncrementalJNI.AddMapping(I,Mapping.toValue());
	}

	public void ClearFields() {
		mdMUIncrementalJNI.ClearFields(I);
	}

	public void AddField(String Field) {
		mdMUIncrementalJNI.AddField(I,Field);
	}

	public void BuildKey() {
		mdMUIncrementalJNI.BuildKey(I);
	}

	public void SetKey(String Key) {
		mdMUIncrementalJNI.SetKey(I,Key);
	}

	public void SetUserInfo(String UserInfo) {
		mdMUIncrementalJNI.SetUserInfo(I,UserInfo);
	}

	public void MatchRecord() {
		mdMUIncrementalJNI.MatchRecord(I);
	}

	public void AddRecord() {
		mdMUIncrementalJNI.AddRecord(I);
	}

	public int NextMatchingRecord() {
		return mdMUIncrementalJNI.NextMatchingRecord(I);
	}

	public String GetKey() {
		return mdMUIncrementalJNI.GetKey(I);
	}

	public String GetUserInfo() {
		return mdMUIncrementalJNI.GetUserInfo(I);
	}

	public long GetDupeGroup() {
		return mdMUIncrementalJNI.GetDupeGroup(I);
	}

	public String GetStatusCode() {
		return mdMUIncrementalJNI.GetStatusCode(I);
	}

	public int GetCount() {
		return mdMUIncrementalJNI.GetCount(I);
	}

	public int GetEntry() {
		return mdMUIncrementalJNI.GetEntry(I);
	}

	public long GetCombinations() {
		return mdMUIncrementalJNI.GetCombinations(I);
	}

	public String GetResults() {
		return mdMUIncrementalJNI.GetResults(I);
	}

	public double GetFuzzyPercentage() {
		return mdMUIncrementalJNI.GetFuzzyPercentage(I);
	}

	public void SetReserved(String Property, String Value) {
		mdMUIncrementalJNI.SetReserved(I,Property,Value);
	}

	public String GetReserved(String Property) {
		return mdMUIncrementalJNI.GetReserved(I,Property);
	}

	public boolean BeginTransaction() {
		return mdMUIncrementalJNI.BeginTransaction(I);
	}

	public boolean CommitTransaction() {
		return mdMUIncrementalJNI.CommitTransaction(I);
	}

	public boolean RollbackTransaction() {
		return mdMUIncrementalJNI.RollbackTransaction(I);
	}

}
