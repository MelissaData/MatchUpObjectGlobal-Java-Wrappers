package com.melissadata;

public class mdMUReadWrite {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdMUReadWrite obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdMUReadWrite.ProgramStatus ErrorNone=new mdMUReadWrite.ProgramStatus("ErrorNone",0);
	public final static mdMUReadWrite.ProgramStatus ErrorConfigFile=new mdMUReadWrite.ProgramStatus("ErrorConfigFile",1);
	public final static mdMUReadWrite.ProgramStatus ErrorLicenseExpired=new mdMUReadWrite.ProgramStatus("ErrorLicenseExpired",2);
	public final static mdMUReadWrite.ProgramStatus ErrorDatabaseExpired=new mdMUReadWrite.ProgramStatus("ErrorDatabaseExpired",3);
	public final static mdMUReadWrite.ProgramStatus ErrorMatchcodeNotSpecified=new mdMUReadWrite.ProgramStatus("ErrorMatchcodeNotSpecified",4);
	public final static mdMUReadWrite.ProgramStatus ErrorMatchcodeNotFound=new mdMUReadWrite.ProgramStatus("ErrorMatchcodeNotFound",5);
	public final static mdMUReadWrite.ProgramStatus ErrorInvalidMatchcode=new mdMUReadWrite.ProgramStatus("ErrorInvalidMatchcode",6);
	public final static mdMUReadWrite.ProgramStatus ErrorKeyFile=new mdMUReadWrite.ProgramStatus("ErrorKeyFile",7);
	public final static mdMUReadWrite.ProgramStatus ErrorNoneIntersectingGroupCache=new mdMUReadWrite.ProgramStatus("ErrorNoneIntersectingGroupCache",8);
	public final static mdMUReadWrite.ProgramStatus ErrorMatchcodeObsolete=new mdMUReadWrite.ProgramStatus("ErrorMatchcodeObsolete",9);
	public final static mdMUReadWrite.ProgramStatus ErrorGlobalAddrInit=new mdMUReadWrite.ProgramStatus("ErrorGlobalAddrInit",10);
	public final static mdMUReadWrite.ProgramStatus ErrorIntlLicenseRequired=new mdMUReadWrite.ProgramStatus("ErrorIntlLicenseRequired",11);

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
	public final static mdMUReadWrite.MatchcodeComponentType PrefixComp=new mdMUReadWrite.MatchcodeComponentType("PrefixComp",1);
	public final static mdMUReadWrite.MatchcodeComponentType FirstComp=new mdMUReadWrite.MatchcodeComponentType("FirstComp",2);
	public final static mdMUReadWrite.MatchcodeComponentType MiddleComp=new mdMUReadWrite.MatchcodeComponentType("MiddleComp",3);
	public final static mdMUReadWrite.MatchcodeComponentType LastComp=new mdMUReadWrite.MatchcodeComponentType("LastComp",4);
	public final static mdMUReadWrite.MatchcodeComponentType SuffixComp=new mdMUReadWrite.MatchcodeComponentType("SuffixComp",5);
	public final static mdMUReadWrite.MatchcodeComponentType GenderComp=new mdMUReadWrite.MatchcodeComponentType("GenderComp",6);
	public final static mdMUReadWrite.MatchcodeComponentType FirstNicknameComp=new mdMUReadWrite.MatchcodeComponentType("FirstNicknameComp",7);
	public final static mdMUReadWrite.MatchcodeComponentType MiddleNicknameComp=new mdMUReadWrite.MatchcodeComponentType("MiddleNicknameComp",8);
	public final static mdMUReadWrite.MatchcodeComponentType TitleComp=new mdMUReadWrite.MatchcodeComponentType("TitleComp",9);
	public final static mdMUReadWrite.MatchcodeComponentType CompanyComp=new mdMUReadWrite.MatchcodeComponentType("CompanyComp",10);
	public final static mdMUReadWrite.MatchcodeComponentType CompanyAcronymComp=new mdMUReadWrite.MatchcodeComponentType("CompanyAcronymComp",11);
	public final static mdMUReadWrite.MatchcodeComponentType StreetNumberComp=new mdMUReadWrite.MatchcodeComponentType("StreetNumberComp",12);
	public final static mdMUReadWrite.MatchcodeComponentType StreetPreDirComp=new mdMUReadWrite.MatchcodeComponentType("StreetPreDirComp",13);
	public final static mdMUReadWrite.MatchcodeComponentType StreetNameComp=new mdMUReadWrite.MatchcodeComponentType("StreetNameComp",14);
	public final static mdMUReadWrite.MatchcodeComponentType StreetSuffixComp=new mdMUReadWrite.MatchcodeComponentType("StreetSuffixComp",15);
	public final static mdMUReadWrite.MatchcodeComponentType StreetPostDirComp=new mdMUReadWrite.MatchcodeComponentType("StreetPostDirComp",16);
	public final static mdMUReadWrite.MatchcodeComponentType POBoxComp=new mdMUReadWrite.MatchcodeComponentType("POBoxComp",17);
	public final static mdMUReadWrite.MatchcodeComponentType SecondaryComp=new mdMUReadWrite.MatchcodeComponentType("SecondaryComp",18);
	public final static mdMUReadWrite.MatchcodeComponentType AddressComp=new mdMUReadWrite.MatchcodeComponentType("AddressComp",19);
	public final static mdMUReadWrite.MatchcodeComponentType CityComp=new mdMUReadWrite.MatchcodeComponentType("CityComp",20);
	public final static mdMUReadWrite.MatchcodeComponentType StateComp=new mdMUReadWrite.MatchcodeComponentType("StateComp",21);
	public final static mdMUReadWrite.MatchcodeComponentType Zip9Comp=new mdMUReadWrite.MatchcodeComponentType("Zip9Comp",22);
	public final static mdMUReadWrite.MatchcodeComponentType Zip5Comp=new mdMUReadWrite.MatchcodeComponentType("Zip5Comp",23);
	public final static mdMUReadWrite.MatchcodeComponentType Zip4Comp=new mdMUReadWrite.MatchcodeComponentType("Zip4Comp",24);
	public final static mdMUReadWrite.MatchcodeComponentType CountryComp=new mdMUReadWrite.MatchcodeComponentType("CountryComp",28);
	public final static mdMUReadWrite.MatchcodeComponentType CanadianPCComp=new mdMUReadWrite.MatchcodeComponentType("CanadianPCComp",29);
	public final static mdMUReadWrite.MatchcodeComponentType PhoneComp=new mdMUReadWrite.MatchcodeComponentType("PhoneComp",33);
	public final static mdMUReadWrite.MatchcodeComponentType EMailComp=new mdMUReadWrite.MatchcodeComponentType("EMailComp",34);
	public final static mdMUReadWrite.MatchcodeComponentType CreditCardComp=new mdMUReadWrite.MatchcodeComponentType("CreditCardComp",35);
	public final static mdMUReadWrite.MatchcodeComponentType GeneralComp=new mdMUReadWrite.MatchcodeComponentType("GeneralComp",36);
	public final static mdMUReadWrite.MatchcodeComponentType GeoDistanceComp=new mdMUReadWrite.MatchcodeComponentType("GeoDistanceComp",38);
	public final static mdMUReadWrite.MatchcodeComponentType DateComp=new mdMUReadWrite.MatchcodeComponentType("DateComp",39);
	public final static mdMUReadWrite.MatchcodeComponentType NumericComp=new mdMUReadWrite.MatchcodeComponentType("NumericComp",40);
	public final static mdMUReadWrite.MatchcodeComponentType PremisesNumberComp=new mdMUReadWrite.MatchcodeComponentType("PremisesNumberComp",41);
	public final static mdMUReadWrite.MatchcodeComponentType ThoroughfarePreDirComp=new mdMUReadWrite.MatchcodeComponentType("ThoroughfarePreDirComp",42);
	public final static mdMUReadWrite.MatchcodeComponentType ThoroughfareLeadingTypeComp=new mdMUReadWrite.MatchcodeComponentType("ThoroughfareLeadingTypeComp",43);
	public final static mdMUReadWrite.MatchcodeComponentType ThoroughfareNameComp=new mdMUReadWrite.MatchcodeComponentType("ThoroughfareNameComp",44);
	public final static mdMUReadWrite.MatchcodeComponentType ThoroughfarePostDirComp=new mdMUReadWrite.MatchcodeComponentType("ThoroughfarePostDirComp",45);
	public final static mdMUReadWrite.MatchcodeComponentType ThoroughfareTrailingTypeComp=new mdMUReadWrite.MatchcodeComponentType("ThoroughfareTrailingTypeComp",46);
	public final static mdMUReadWrite.MatchcodeComponentType DepThoroughfarePreDirComp=new mdMUReadWrite.MatchcodeComponentType("DepThoroughfarePreDirComp",47);
	public final static mdMUReadWrite.MatchcodeComponentType DepThoroughfareLeadingTypeComp=new mdMUReadWrite.MatchcodeComponentType("DepThoroughfareLeadingTypeComp",48);
	public final static mdMUReadWrite.MatchcodeComponentType DepThoroughfareNameComp=new mdMUReadWrite.MatchcodeComponentType("DepThoroughfareNameComp",49);
	public final static mdMUReadWrite.MatchcodeComponentType DepThoroughfarePostDirComp=new mdMUReadWrite.MatchcodeComponentType("DepThoroughfarePostDirComp",50);
	public final static mdMUReadWrite.MatchcodeComponentType DepThoroughfareTrailingTypeComp=new mdMUReadWrite.MatchcodeComponentType("DepThoroughfareTrailingTypeComp",51);
	public final static mdMUReadWrite.MatchcodeComponentType LocalityComp=new mdMUReadWrite.MatchcodeComponentType("LocalityComp",52);
	public final static mdMUReadWrite.MatchcodeComponentType DependentLocalityComp=new mdMUReadWrite.MatchcodeComponentType("DependentLocalityComp",53);
	public final static mdMUReadWrite.MatchcodeComponentType DblDependentLocalityComp=new mdMUReadWrite.MatchcodeComponentType("DblDependentLocalityComp",54);
	public final static mdMUReadWrite.MatchcodeComponentType AdministrativeAreaComp=new mdMUReadWrite.MatchcodeComponentType("AdministrativeAreaComp",55);
	public final static mdMUReadWrite.MatchcodeComponentType SubAdministrativeAreaComp=new mdMUReadWrite.MatchcodeComponentType("SubAdministrativeAreaComp",56);
	public final static mdMUReadWrite.MatchcodeComponentType PostalCodeComp=new mdMUReadWrite.MatchcodeComponentType("PostalCodeComp",57);
	public final static mdMUReadWrite.MatchcodeComponentType SubNationalAreaComp=new mdMUReadWrite.MatchcodeComponentType("SubNationalAreaComp",58);
	public final static mdMUReadWrite.MatchcodeComponentType PostBoxComp=new mdMUReadWrite.MatchcodeComponentType("PostBoxComp",59);

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
	public final static mdMUReadWrite.MatchcodeStart Left=new mdMUReadWrite.MatchcodeStart("Left",8);
	public final static mdMUReadWrite.MatchcodeStart Right=new mdMUReadWrite.MatchcodeStart("Right",16);
	public final static mdMUReadWrite.MatchcodeStart StartAtPos=new mdMUReadWrite.MatchcodeStart("StartAtPos",32);
	public final static mdMUReadWrite.MatchcodeStart StartAtWord=new mdMUReadWrite.MatchcodeStart("StartAtWord",64);

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
	public final static mdMUReadWrite.MatchcodeTrim LeftTrim=new mdMUReadWrite.MatchcodeTrim("LeftTrim",2);
	public final static mdMUReadWrite.MatchcodeTrim RightTrim=new mdMUReadWrite.MatchcodeTrim("RightTrim",4);
	public final static mdMUReadWrite.MatchcodeTrim AllTrim=new mdMUReadWrite.MatchcodeTrim("AllTrim",6);

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
	public final static mdMUReadWrite.MatchcodeFuzzy Exact=new mdMUReadWrite.MatchcodeFuzzy("Exact",0);
	public final static mdMUReadWrite.MatchcodeFuzzy SoundEx=new mdMUReadWrite.MatchcodeFuzzy("SoundEx",1);
	public final static mdMUReadWrite.MatchcodeFuzzy Phonetex=new mdMUReadWrite.MatchcodeFuzzy("Phonetex",2);
	public final static mdMUReadWrite.MatchcodeFuzzy Containment=new mdMUReadWrite.MatchcodeFuzzy("Containment",4);
	public final static mdMUReadWrite.MatchcodeFuzzy Frequency=new mdMUReadWrite.MatchcodeFuzzy("Frequency",8);
	public final static mdMUReadWrite.MatchcodeFuzzy FastNear=new mdMUReadWrite.MatchcodeFuzzy("FastNear",16);
	public final static mdMUReadWrite.MatchcodeFuzzy AccurateNear=new mdMUReadWrite.MatchcodeFuzzy("AccurateNear",32);
	public final static mdMUReadWrite.MatchcodeFuzzy VowelsOnly=new mdMUReadWrite.MatchcodeFuzzy("VowelsOnly",64);
	public final static mdMUReadWrite.MatchcodeFuzzy ConsonantsOnly=new mdMUReadWrite.MatchcodeFuzzy("ConsonantsOnly",128);
	public final static mdMUReadWrite.MatchcodeFuzzy AlphasOnly=new mdMUReadWrite.MatchcodeFuzzy("AlphasOnly",256);
	public final static mdMUReadWrite.MatchcodeFuzzy NumericsOnly=new mdMUReadWrite.MatchcodeFuzzy("NumericsOnly",512);
	public final static mdMUReadWrite.MatchcodeFuzzy FrequencyNear=new mdMUReadWrite.MatchcodeFuzzy("FrequencyNear",1024);
	public final static mdMUReadWrite.MatchcodeFuzzy NGram=new mdMUReadWrite.MatchcodeFuzzy("NGram",2048);
	public final static mdMUReadWrite.MatchcodeFuzzy Jaro=new mdMUReadWrite.MatchcodeFuzzy("Jaro",4096);
	public final static mdMUReadWrite.MatchcodeFuzzy JaroWinkler=new mdMUReadWrite.MatchcodeFuzzy("JaroWinkler",8192);
	public final static mdMUReadWrite.MatchcodeFuzzy LCS=new mdMUReadWrite.MatchcodeFuzzy("LCS",16384);
	public final static mdMUReadWrite.MatchcodeFuzzy NeedlemanWunsch=new mdMUReadWrite.MatchcodeFuzzy("NeedlemanWunsch",32768);
	public final static mdMUReadWrite.MatchcodeFuzzy MDKeyboard=new mdMUReadWrite.MatchcodeFuzzy("MDKeyboard",65536);
	public final static mdMUReadWrite.MatchcodeFuzzy SmithWatermanGotoh=new mdMUReadWrite.MatchcodeFuzzy("SmithWatermanGotoh",131072);
	public final static mdMUReadWrite.MatchcodeFuzzy Dice=new mdMUReadWrite.MatchcodeFuzzy("Dice",262144);
	public final static mdMUReadWrite.MatchcodeFuzzy Jaccard=new mdMUReadWrite.MatchcodeFuzzy("Jaccard",524288);
	public final static mdMUReadWrite.MatchcodeFuzzy Overlap=new mdMUReadWrite.MatchcodeFuzzy("Overlap",1048576);
	public final static mdMUReadWrite.MatchcodeFuzzy DoubleMetaphone=new mdMUReadWrite.MatchcodeFuzzy("DoubleMetaphone",2097152);
	public final static mdMUReadWrite.MatchcodeFuzzy UTF8Near=new mdMUReadWrite.MatchcodeFuzzy("UTF8Near",4194304);

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
	public final static mdMUReadWrite.MatchcodeFieldMatch NoFieldMatch=new mdMUReadWrite.MatchcodeFieldMatch("NoFieldMatch",0);
	public final static mdMUReadWrite.MatchcodeFieldMatch BothBlankMatch=new mdMUReadWrite.MatchcodeFieldMatch("BothBlankMatch",256);
	public final static mdMUReadWrite.MatchcodeFieldMatch OneBlankMatch=new mdMUReadWrite.MatchcodeFieldMatch("OneBlankMatch",512);
	public final static mdMUReadWrite.MatchcodeFieldMatch InitialMatch=new mdMUReadWrite.MatchcodeFieldMatch("InitialMatch",1024);

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
	public final static mdMUReadWrite.MatchcodeSwap NoSwap=new mdMUReadWrite.MatchcodeSwap("NoSwap",0);
	public final static mdMUReadWrite.MatchcodeSwap SwapA=new mdMUReadWrite.MatchcodeSwap("SwapA",1);
	public final static mdMUReadWrite.MatchcodeSwap SwapB=new mdMUReadWrite.MatchcodeSwap("SwapB",2);
	public final static mdMUReadWrite.MatchcodeSwap SwapC=new mdMUReadWrite.MatchcodeSwap("SwapC",4);
	public final static mdMUReadWrite.MatchcodeSwap SwapD=new mdMUReadWrite.MatchcodeSwap("SwapD",8);
	public final static mdMUReadWrite.MatchcodeSwap SwapE=new mdMUReadWrite.MatchcodeSwap("SwapE",16);
	public final static mdMUReadWrite.MatchcodeSwap SwapF=new mdMUReadWrite.MatchcodeSwap("SwapF",32);
	public final static mdMUReadWrite.MatchcodeSwap SwapG=new mdMUReadWrite.MatchcodeSwap("SwapG",64);
	public final static mdMUReadWrite.MatchcodeSwap SwapH=new mdMUReadWrite.MatchcodeSwap("SwapH",128);
	public final static mdMUReadWrite.MatchcodeSwap BothA=new mdMUReadWrite.MatchcodeSwap("BothA",256);
	public final static mdMUReadWrite.MatchcodeSwap BothB=new mdMUReadWrite.MatchcodeSwap("BothB",512);
	public final static mdMUReadWrite.MatchcodeSwap BothC=new mdMUReadWrite.MatchcodeSwap("BothC",1024);
	public final static mdMUReadWrite.MatchcodeSwap BothD=new mdMUReadWrite.MatchcodeSwap("BothD",2048);
	public final static mdMUReadWrite.MatchcodeSwap BothE=new mdMUReadWrite.MatchcodeSwap("BothE",4096);
	public final static mdMUReadWrite.MatchcodeSwap BothF=new mdMUReadWrite.MatchcodeSwap("BothF",8192);
	public final static mdMUReadWrite.MatchcodeSwap BothG=new mdMUReadWrite.MatchcodeSwap("BothG",16384);
	public final static mdMUReadWrite.MatchcodeSwap BothH=new mdMUReadWrite.MatchcodeSwap("BothH",32768);

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
	public final static mdMUReadWrite.MatchcodeCombination Combo1=new mdMUReadWrite.MatchcodeCombination("Combo1",1);
	public final static mdMUReadWrite.MatchcodeCombination Combo2=new mdMUReadWrite.MatchcodeCombination("Combo2",2);
	public final static mdMUReadWrite.MatchcodeCombination Combo3=new mdMUReadWrite.MatchcodeCombination("Combo3",4);
	public final static mdMUReadWrite.MatchcodeCombination Combo4=new mdMUReadWrite.MatchcodeCombination("Combo4",8);
	public final static mdMUReadWrite.MatchcodeCombination Combo5=new mdMUReadWrite.MatchcodeCombination("Combo5",16);
	public final static mdMUReadWrite.MatchcodeCombination Combo6=new mdMUReadWrite.MatchcodeCombination("Combo6",32);
	public final static mdMUReadWrite.MatchcodeCombination Combo7=new mdMUReadWrite.MatchcodeCombination("Combo7",64);
	public final static mdMUReadWrite.MatchcodeCombination Combo8=new mdMUReadWrite.MatchcodeCombination("Combo8",128);
	public final static mdMUReadWrite.MatchcodeCombination Combo9=new mdMUReadWrite.MatchcodeCombination("Combo9",256);
	public final static mdMUReadWrite.MatchcodeCombination Combo10=new mdMUReadWrite.MatchcodeCombination("Combo10",512);
	public final static mdMUReadWrite.MatchcodeCombination Combo11=new mdMUReadWrite.MatchcodeCombination("Combo11",1024);
	public final static mdMUReadWrite.MatchcodeCombination Combo12=new mdMUReadWrite.MatchcodeCombination("Combo12",2048);
	public final static mdMUReadWrite.MatchcodeCombination Combo13=new mdMUReadWrite.MatchcodeCombination("Combo13",4096);
	public final static mdMUReadWrite.MatchcodeCombination Combo14=new mdMUReadWrite.MatchcodeCombination("Combo14",8192);
	public final static mdMUReadWrite.MatchcodeCombination Combo15=new mdMUReadWrite.MatchcodeCombination("Combo15",16384);
	public final static mdMUReadWrite.MatchcodeCombination Combo16=new mdMUReadWrite.MatchcodeCombination("Combo16",32768);

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
	public final static mdMUReadWrite.MatchcodeMappingTarget PrefixType=new mdMUReadWrite.MatchcodeMappingTarget("PrefixType",1);
	public final static mdMUReadWrite.MatchcodeMappingTarget FirstType=new mdMUReadWrite.MatchcodeMappingTarget("FirstType",2);
	public final static mdMUReadWrite.MatchcodeMappingTarget MiddleType=new mdMUReadWrite.MatchcodeMappingTarget("MiddleType",3);
	public final static mdMUReadWrite.MatchcodeMappingTarget LastType=new mdMUReadWrite.MatchcodeMappingTarget("LastType",4);
	public final static mdMUReadWrite.MatchcodeMappingTarget SuffixType=new mdMUReadWrite.MatchcodeMappingTarget("SuffixType",5);
	public final static mdMUReadWrite.MatchcodeMappingTarget GenderType=new mdMUReadWrite.MatchcodeMappingTarget("GenderType",6);
	public final static mdMUReadWrite.MatchcodeMappingTarget FirstNicknameType=new mdMUReadWrite.MatchcodeMappingTarget("FirstNicknameType",7);
	public final static mdMUReadWrite.MatchcodeMappingTarget MiddleNicknameType=new mdMUReadWrite.MatchcodeMappingTarget("MiddleNicknameType",8);
	public final static mdMUReadWrite.MatchcodeMappingTarget TitleType=new mdMUReadWrite.MatchcodeMappingTarget("TitleType",9);
	public final static mdMUReadWrite.MatchcodeMappingTarget CompanyType=new mdMUReadWrite.MatchcodeMappingTarget("CompanyType",10);
	public final static mdMUReadWrite.MatchcodeMappingTarget CompanyAcronymType=new mdMUReadWrite.MatchcodeMappingTarget("CompanyAcronymType",11);
	public final static mdMUReadWrite.MatchcodeMappingTarget AddressType=new mdMUReadWrite.MatchcodeMappingTarget("AddressType",12);
	public final static mdMUReadWrite.MatchcodeMappingTarget CityType=new mdMUReadWrite.MatchcodeMappingTarget("CityType",13);
	public final static mdMUReadWrite.MatchcodeMappingTarget StateType=new mdMUReadWrite.MatchcodeMappingTarget("StateType",14);
	public final static mdMUReadWrite.MatchcodeMappingTarget Zip9Type=new mdMUReadWrite.MatchcodeMappingTarget("Zip9Type",15);
	public final static mdMUReadWrite.MatchcodeMappingTarget Zip5Type=new mdMUReadWrite.MatchcodeMappingTarget("Zip5Type",16);
	public final static mdMUReadWrite.MatchcodeMappingTarget Zip4Type=new mdMUReadWrite.MatchcodeMappingTarget("Zip4Type",17);
	public final static mdMUReadWrite.MatchcodeMappingTarget CountryType=new mdMUReadWrite.MatchcodeMappingTarget("CountryType",18);
	public final static mdMUReadWrite.MatchcodeMappingTarget CanadianPCType=new mdMUReadWrite.MatchcodeMappingTarget("CanadianPCType",19);
	public final static mdMUReadWrite.MatchcodeMappingTarget PhoneType=new mdMUReadWrite.MatchcodeMappingTarget("PhoneType",23);
	public final static mdMUReadWrite.MatchcodeMappingTarget EMailType=new mdMUReadWrite.MatchcodeMappingTarget("EMailType",24);
	public final static mdMUReadWrite.MatchcodeMappingTarget CreditCardType=new mdMUReadWrite.MatchcodeMappingTarget("CreditCardType",25);
	public final static mdMUReadWrite.MatchcodeMappingTarget GeneralType=new mdMUReadWrite.MatchcodeMappingTarget("GeneralType",26);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address1Type=new mdMUReadWrite.MatchcodeMappingTarget("Address1Type",28);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address2Type=new mdMUReadWrite.MatchcodeMappingTarget("Address2Type",29);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address3Type=new mdMUReadWrite.MatchcodeMappingTarget("Address3Type",30);
	public final static mdMUReadWrite.MatchcodeMappingTarget LatitudeType=new mdMUReadWrite.MatchcodeMappingTarget("LatitudeType",34);
	public final static mdMUReadWrite.MatchcodeMappingTarget LongitudeType=new mdMUReadWrite.MatchcodeMappingTarget("LongitudeType",35);
	public final static mdMUReadWrite.MatchcodeMappingTarget DateType=new mdMUReadWrite.MatchcodeMappingTarget("DateType",36);
	public final static mdMUReadWrite.MatchcodeMappingTarget NumericType=new mdMUReadWrite.MatchcodeMappingTarget("NumericType",37);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address4Type=new mdMUReadWrite.MatchcodeMappingTarget("Address4Type",38);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address5Type=new mdMUReadWrite.MatchcodeMappingTarget("Address5Type",39);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address6Type=new mdMUReadWrite.MatchcodeMappingTarget("Address6Type",40);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address7Type=new mdMUReadWrite.MatchcodeMappingTarget("Address7Type",41);
	public final static mdMUReadWrite.MatchcodeMappingTarget Address8Type=new mdMUReadWrite.MatchcodeMappingTarget("Address8Type",42);

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
	public final static mdMUReadWrite.MatchcodeStatus MCNoError=new mdMUReadWrite.MatchcodeStatus("MCNoError",0);
	public final static mdMUReadWrite.MatchcodeStatus MCFirstComponentFuzzyOptions=new mdMUReadWrite.MatchcodeStatus("MCFirstComponentFuzzyOptions",1);
	public final static mdMUReadWrite.MatchcodeStatus MCFirstComponentNoSwapPair=new mdMUReadWrite.MatchcodeStatus("MCFirstComponentNoSwapPair",2);
	public final static mdMUReadWrite.MatchcodeStatus MCDataTypeNoFuzzy=new mdMUReadWrite.MatchcodeStatus("MCDataTypeNoFuzzy",3);
	public final static mdMUReadWrite.MatchcodeStatus MCComponentFuzzyIncorrectSize=new mdMUReadWrite.MatchcodeStatus("MCComponentFuzzyIncorrectSize",4);
	public final static mdMUReadWrite.MatchcodeStatus MCDataTypeNoMaximumNumberWords=new mdMUReadWrite.MatchcodeStatus("MCDataTypeNoMaximumNumberWords",5);
	public final static mdMUReadWrite.MatchcodeStatus MCDataTypeNoStartRightOrWordOrPos=new mdMUReadWrite.MatchcodeStatus("MCDataTypeNoStartRightOrWordOrPos",6);
	public final static mdMUReadWrite.MatchcodeStatus MCIncorrectMaximumNumberWords=new mdMUReadWrite.MatchcodeStatus("MCIncorrectMaximumNumberWords",7);
	public final static mdMUReadWrite.MatchcodeStatus MCNearOutOfRange=new mdMUReadWrite.MatchcodeStatus("MCNearOutOfRange",8);
	public final static mdMUReadWrite.MatchcodeStatus MCFirstComponentNotUsedInEveryCondition=new mdMUReadWrite.MatchcodeStatus("MCFirstComponentNotUsedInEveryCondition",9);
	public final static mdMUReadWrite.MatchcodeStatus MCCannotChangeFirstComponent=new mdMUReadWrite.MatchcodeStatus("MCCannotChangeFirstComponent",10);
	public final static mdMUReadWrite.MatchcodeStatus MCInvalidSwapPair=new mdMUReadWrite.MatchcodeStatus("MCInvalidSwapPair",11);
	public final static mdMUReadWrite.MatchcodeStatus MCIncorrectStartPosOrStartWord=new mdMUReadWrite.MatchcodeStatus("MCIncorrectStartPosOrStartWord",12);
	public final static mdMUReadWrite.MatchcodeStatus MCInvalidMatchcodeComponentType=new mdMUReadWrite.MatchcodeStatus("MCInvalidMatchcodeComponentType",13);

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
	public final static mdMUReadWrite.MatchcodeMapping Prefix=new mdMUReadWrite.MatchcodeMapping("Prefix",1);
	public final static mdMUReadWrite.MatchcodeMapping Gender=new mdMUReadWrite.MatchcodeMapping("Gender",2);
	public final static mdMUReadWrite.MatchcodeMapping First=new mdMUReadWrite.MatchcodeMapping("First",3);
	public final static mdMUReadWrite.MatchcodeMapping MixedFirst=new mdMUReadWrite.MatchcodeMapping("MixedFirst",4);
	public final static mdMUReadWrite.MatchcodeMapping Middle=new mdMUReadWrite.MatchcodeMapping("Middle",5);
	public final static mdMUReadWrite.MatchcodeMapping Last=new mdMUReadWrite.MatchcodeMapping("Last",6);
	public final static mdMUReadWrite.MatchcodeMapping MixedLast=new mdMUReadWrite.MatchcodeMapping("MixedLast",7);
	public final static mdMUReadWrite.MatchcodeMapping Suffix=new mdMUReadWrite.MatchcodeMapping("Suffix",8);
	public final static mdMUReadWrite.MatchcodeMapping FullName=new mdMUReadWrite.MatchcodeMapping("FullName",9);
	public final static mdMUReadWrite.MatchcodeMapping InverseName=new mdMUReadWrite.MatchcodeMapping("InverseName",10);
	public final static mdMUReadWrite.MatchcodeMapping GovernmentInverseName=new mdMUReadWrite.MatchcodeMapping("GovernmentInverseName",11);
	public final static mdMUReadWrite.MatchcodeMapping Title=new mdMUReadWrite.MatchcodeMapping("Title",12);
	public final static mdMUReadWrite.MatchcodeMapping Company=new mdMUReadWrite.MatchcodeMapping("Company",13);
	public final static mdMUReadWrite.MatchcodeMapping Address=new mdMUReadWrite.MatchcodeMapping("Address",14);
	public final static mdMUReadWrite.MatchcodeMapping City=new mdMUReadWrite.MatchcodeMapping("City",15);
	public final static mdMUReadWrite.MatchcodeMapping State=new mdMUReadWrite.MatchcodeMapping("State",16);
	public final static mdMUReadWrite.MatchcodeMapping Zip9=new mdMUReadWrite.MatchcodeMapping("Zip9",17);
	public final static mdMUReadWrite.MatchcodeMapping Zip5=new mdMUReadWrite.MatchcodeMapping("Zip5",18);
	public final static mdMUReadWrite.MatchcodeMapping Zip4=new mdMUReadWrite.MatchcodeMapping("Zip4",19);
	public final static mdMUReadWrite.MatchcodeMapping CityStZip=new mdMUReadWrite.MatchcodeMapping("CityStZip",20);
	public final static mdMUReadWrite.MatchcodeMapping Country=new mdMUReadWrite.MatchcodeMapping("Country",21);
	public final static mdMUReadWrite.MatchcodeMapping CanadianPostalCode=new mdMUReadWrite.MatchcodeMapping("CanadianPostalCode",22);
	public final static mdMUReadWrite.MatchcodeMapping Phone=new mdMUReadWrite.MatchcodeMapping("Phone",27);
	public final static mdMUReadWrite.MatchcodeMapping EMail=new mdMUReadWrite.MatchcodeMapping("EMail",28);
	public final static mdMUReadWrite.MatchcodeMapping CreditCard=new mdMUReadWrite.MatchcodeMapping("CreditCard",29);
	public final static mdMUReadWrite.MatchcodeMapping General=new mdMUReadWrite.MatchcodeMapping("General",30);
	public final static mdMUReadWrite.MatchcodeMapping Latitude=new mdMUReadWrite.MatchcodeMapping("Latitude",40);
	public final static mdMUReadWrite.MatchcodeMapping Longitude=new mdMUReadWrite.MatchcodeMapping("Longitude",41);
	public final static mdMUReadWrite.MatchcodeMapping Date=new mdMUReadWrite.MatchcodeMapping("Date",42);
	public final static mdMUReadWrite.MatchcodeMapping Numeric=new mdMUReadWrite.MatchcodeMapping("Numeric",43);

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
	public final static mdMUReadWrite.MatchcodeNearType NearNone=new mdMUReadWrite.MatchcodeNearType("NearNone",0);
	public final static mdMUReadWrite.MatchcodeNearType NearInteger=new mdMUReadWrite.MatchcodeNearType("NearInteger",1);
	public final static mdMUReadWrite.MatchcodeNearType NearFloat=new mdMUReadWrite.MatchcodeNearType("NearFloat",2);

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
	public final static mdMUReadWrite.ComponentCountryType US=new mdMUReadWrite.ComponentCountryType("US",1);
	public final static mdMUReadWrite.ComponentCountryType Canada=new mdMUReadWrite.ComponentCountryType("Canada",2);
	public final static mdMUReadWrite.ComponentCountryType Global=new mdMUReadWrite.ComponentCountryType("Global",4);
	public final static mdMUReadWrite.ComponentCountryType Domestic=new mdMUReadWrite.ComponentCountryType("Domestic",3);

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

	protected mdMUReadWrite(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdMUReadWrite() {
		this(mdMUReadWriteJNI.mdMUReadWriteCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdMUReadWriteJNI.mdMUReadWriteDestroy(I);
			}
			I=0;
		}
	}

	public void SetPathToMatchUpFiles(String Path) {
		mdMUReadWriteJNI.SetPathToMatchUpFiles(I,Path);
	}

	public void SetMatchcodeName(String MatchcodeName) {
		mdMUReadWriteJNI.SetMatchcodeName(I,MatchcodeName);
	}

	public void SetKeyFile(String KeyFile) {
		mdMUReadWriteJNI.SetKeyFile(I,KeyFile);
	}

	public ProgramStatus InitializeDataFiles() {
		return ProgramStatus.toEnum(mdMUReadWriteJNI.InitializeDataFiles(I));
	}

	public String GetInitializeErrorString() {
		return mdMUReadWriteJNI.GetInitializeErrorString(I);
	}

	public int SetLicenseString(String License) {
		return mdMUReadWriteJNI.SetLicenseString(I,License);
	}

	public void SetMaximumCharacterSize(int size) {
		mdMUReadWriteJNI.SetMaximumCharacterSize(I,size);
	}

	public int SetEncoding(String encodeName) {
		return mdMUReadWriteJNI.SetEncoding(I,encodeName);
	}

	public String GetBuildNumber() {
		return mdMUReadWriteJNI.GetBuildNumber(I);
	}

	public String GetDatabaseDate() {
		return mdMUReadWriteJNI.GetDatabaseDate(I);
	}

	public String GetDatabaseExpirationDate() {
		return mdMUReadWriteJNI.GetDatabaseExpirationDate(I);
	}

	public String GetLicenseExpirationDate() {
		return mdMUReadWriteJNI.GetLicenseExpirationDate(I);
	}

	public long GetMatchcodeObject() {
		return mdMUReadWriteJNI.GetMatchcodeObject(I);
	}

	public void ClearMappings() {
		mdMUReadWriteJNI.ClearMappings(I);
	}

	public int AddMapping(mdMUReadWrite.MatchcodeMapping Mapping) {
		return mdMUReadWriteJNI.AddMapping(I,Mapping.toValue());
	}

	public void ClearFields() {
		mdMUReadWriteJNI.ClearFields(I);
	}

	public void AddField(String Field) {
		mdMUReadWriteJNI.AddField(I,Field);
	}

	public void BuildKey() {
		mdMUReadWriteJNI.BuildKey(I);
	}

	public void SetKey(String Key) {
		mdMUReadWriteJNI.SetKey(I,Key);
	}

	public void SetUserInfo(String UserInfo) {
		mdMUReadWriteJNI.SetUserInfo(I,UserInfo);
	}

	public void WriteRecord() {
		mdMUReadWriteJNI.WriteRecord(I);
	}

	public void Process() {
		mdMUReadWriteJNI.Process(I);
	}

	public int ReadRecord() {
		return mdMUReadWriteJNI.ReadRecord(I);
	}

	public String GetKey() {
		return mdMUReadWriteJNI.GetKey(I);
	}

	public String GetUserInfo() {
		return mdMUReadWriteJNI.GetUserInfo(I);
	}

	public long GetDupeGroup() {
		return mdMUReadWriteJNI.GetDupeGroup(I);
	}

	public String GetStatusCode() {
		return mdMUReadWriteJNI.GetStatusCode(I);
	}

	public int GetCount() {
		return mdMUReadWriteJNI.GetCount(I);
	}

	public int GetEntry() {
		return mdMUReadWriteJNI.GetEntry(I);
	}

	public int GetError() {
		return mdMUReadWriteJNI.GetError(I);
	}

	public long GetCombinations() {
		return mdMUReadWriteJNI.GetCombinations(I);
	}

	public double GetFuzzyPercentage() {
		return mdMUReadWriteJNI.GetFuzzyPercentage(I);
	}

	public String GetResults() {
		return mdMUReadWriteJNI.GetResults(I);
	}

	public int GetKeySize() {
		return mdMUReadWriteJNI.GetKeySize(I);
	}

	public void SetGroupSorting(boolean bGroupSorting) {
		mdMUReadWriteJNI.SetGroupSorting(I,bGroupSorting);
	}

	public void SetReserved(String Property, String Value) {
		mdMUReadWriteJNI.SetReserved(I,Property,Value);
	}

	public String GetReserved(String Property) {
		return mdMUReadWriteJNI.GetReserved(I,Property);
	}

}
