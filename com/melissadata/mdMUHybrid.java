package com.melissadata;

public class mdMUHybrid {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdMUHybrid obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdMUHybrid.ProgramStatus ErrorNone=new mdMUHybrid.ProgramStatus("ErrorNone",0);
	public final static mdMUHybrid.ProgramStatus ErrorConfigFile=new mdMUHybrid.ProgramStatus("ErrorConfigFile",1);
	public final static mdMUHybrid.ProgramStatus ErrorLicenseExpired=new mdMUHybrid.ProgramStatus("ErrorLicenseExpired",2);
	public final static mdMUHybrid.ProgramStatus ErrorDatabaseExpired=new mdMUHybrid.ProgramStatus("ErrorDatabaseExpired",3);
	public final static mdMUHybrid.ProgramStatus ErrorMatchcodeNotSpecified=new mdMUHybrid.ProgramStatus("ErrorMatchcodeNotSpecified",4);
	public final static mdMUHybrid.ProgramStatus ErrorMatchcodeNotFound=new mdMUHybrid.ProgramStatus("ErrorMatchcodeNotFound",5);
	public final static mdMUHybrid.ProgramStatus ErrorInvalidMatchcode=new mdMUHybrid.ProgramStatus("ErrorInvalidMatchcode",6);
	public final static mdMUHybrid.ProgramStatus ErrorKeyFile=new mdMUHybrid.ProgramStatus("ErrorKeyFile",7);
	public final static mdMUHybrid.ProgramStatus ErrorNoneIntersectingGroupCache=new mdMUHybrid.ProgramStatus("ErrorNoneIntersectingGroupCache",8);
	public final static mdMUHybrid.ProgramStatus ErrorMatchcodeObsolete=new mdMUHybrid.ProgramStatus("ErrorMatchcodeObsolete",9);
	public final static mdMUHybrid.ProgramStatus ErrorGlobalAddrInit=new mdMUHybrid.ProgramStatus("ErrorGlobalAddrInit",10);
	public final static mdMUHybrid.ProgramStatus ErrorIntlLicenseRequired=new mdMUHybrid.ProgramStatus("ErrorIntlLicenseRequired",11);

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
	public final static mdMUHybrid.MatchcodeComponentType PrefixComp=new mdMUHybrid.MatchcodeComponentType("PrefixComp",1);
	public final static mdMUHybrid.MatchcodeComponentType FirstComp=new mdMUHybrid.MatchcodeComponentType("FirstComp",2);
	public final static mdMUHybrid.MatchcodeComponentType MiddleComp=new mdMUHybrid.MatchcodeComponentType("MiddleComp",3);
	public final static mdMUHybrid.MatchcodeComponentType LastComp=new mdMUHybrid.MatchcodeComponentType("LastComp",4);
	public final static mdMUHybrid.MatchcodeComponentType SuffixComp=new mdMUHybrid.MatchcodeComponentType("SuffixComp",5);
	public final static mdMUHybrid.MatchcodeComponentType GenderComp=new mdMUHybrid.MatchcodeComponentType("GenderComp",6);
	public final static mdMUHybrid.MatchcodeComponentType FirstNicknameComp=new mdMUHybrid.MatchcodeComponentType("FirstNicknameComp",7);
	public final static mdMUHybrid.MatchcodeComponentType MiddleNicknameComp=new mdMUHybrid.MatchcodeComponentType("MiddleNicknameComp",8);
	public final static mdMUHybrid.MatchcodeComponentType TitleComp=new mdMUHybrid.MatchcodeComponentType("TitleComp",9);
	public final static mdMUHybrid.MatchcodeComponentType CompanyComp=new mdMUHybrid.MatchcodeComponentType("CompanyComp",10);
	public final static mdMUHybrid.MatchcodeComponentType CompanyAcronymComp=new mdMUHybrid.MatchcodeComponentType("CompanyAcronymComp",11);
	public final static mdMUHybrid.MatchcodeComponentType StreetNumberComp=new mdMUHybrid.MatchcodeComponentType("StreetNumberComp",12);
	public final static mdMUHybrid.MatchcodeComponentType StreetPreDirComp=new mdMUHybrid.MatchcodeComponentType("StreetPreDirComp",13);
	public final static mdMUHybrid.MatchcodeComponentType StreetNameComp=new mdMUHybrid.MatchcodeComponentType("StreetNameComp",14);
	public final static mdMUHybrid.MatchcodeComponentType StreetSuffixComp=new mdMUHybrid.MatchcodeComponentType("StreetSuffixComp",15);
	public final static mdMUHybrid.MatchcodeComponentType StreetPostDirComp=new mdMUHybrid.MatchcodeComponentType("StreetPostDirComp",16);
	public final static mdMUHybrid.MatchcodeComponentType POBoxComp=new mdMUHybrid.MatchcodeComponentType("POBoxComp",17);
	public final static mdMUHybrid.MatchcodeComponentType SecondaryComp=new mdMUHybrid.MatchcodeComponentType("SecondaryComp",18);
	public final static mdMUHybrid.MatchcodeComponentType AddressComp=new mdMUHybrid.MatchcodeComponentType("AddressComp",19);
	public final static mdMUHybrid.MatchcodeComponentType CityComp=new mdMUHybrid.MatchcodeComponentType("CityComp",20);
	public final static mdMUHybrid.MatchcodeComponentType StateComp=new mdMUHybrid.MatchcodeComponentType("StateComp",21);
	public final static mdMUHybrid.MatchcodeComponentType Zip9Comp=new mdMUHybrid.MatchcodeComponentType("Zip9Comp",22);
	public final static mdMUHybrid.MatchcodeComponentType Zip5Comp=new mdMUHybrid.MatchcodeComponentType("Zip5Comp",23);
	public final static mdMUHybrid.MatchcodeComponentType Zip4Comp=new mdMUHybrid.MatchcodeComponentType("Zip4Comp",24);
	public final static mdMUHybrid.MatchcodeComponentType CountryComp=new mdMUHybrid.MatchcodeComponentType("CountryComp",28);
	public final static mdMUHybrid.MatchcodeComponentType CanadianPCComp=new mdMUHybrid.MatchcodeComponentType("CanadianPCComp",29);
	public final static mdMUHybrid.MatchcodeComponentType PhoneComp=new mdMUHybrid.MatchcodeComponentType("PhoneComp",33);
	public final static mdMUHybrid.MatchcodeComponentType EMailComp=new mdMUHybrid.MatchcodeComponentType("EMailComp",34);
	public final static mdMUHybrid.MatchcodeComponentType CreditCardComp=new mdMUHybrid.MatchcodeComponentType("CreditCardComp",35);
	public final static mdMUHybrid.MatchcodeComponentType GeneralComp=new mdMUHybrid.MatchcodeComponentType("GeneralComp",36);
	public final static mdMUHybrid.MatchcodeComponentType GeoDistanceComp=new mdMUHybrid.MatchcodeComponentType("GeoDistanceComp",38);
	public final static mdMUHybrid.MatchcodeComponentType DateComp=new mdMUHybrid.MatchcodeComponentType("DateComp",39);
	public final static mdMUHybrid.MatchcodeComponentType NumericComp=new mdMUHybrid.MatchcodeComponentType("NumericComp",40);
	public final static mdMUHybrid.MatchcodeComponentType PremisesNumberComp=new mdMUHybrid.MatchcodeComponentType("PremisesNumberComp",41);
	public final static mdMUHybrid.MatchcodeComponentType ThoroughfarePreDirComp=new mdMUHybrid.MatchcodeComponentType("ThoroughfarePreDirComp",42);
	public final static mdMUHybrid.MatchcodeComponentType ThoroughfareLeadingTypeComp=new mdMUHybrid.MatchcodeComponentType("ThoroughfareLeadingTypeComp",43);
	public final static mdMUHybrid.MatchcodeComponentType ThoroughfareNameComp=new mdMUHybrid.MatchcodeComponentType("ThoroughfareNameComp",44);
	public final static mdMUHybrid.MatchcodeComponentType ThoroughfarePostDirComp=new mdMUHybrid.MatchcodeComponentType("ThoroughfarePostDirComp",45);
	public final static mdMUHybrid.MatchcodeComponentType ThoroughfareTrailingTypeComp=new mdMUHybrid.MatchcodeComponentType("ThoroughfareTrailingTypeComp",46);
	public final static mdMUHybrid.MatchcodeComponentType DepThoroughfarePreDirComp=new mdMUHybrid.MatchcodeComponentType("DepThoroughfarePreDirComp",47);
	public final static mdMUHybrid.MatchcodeComponentType DepThoroughfareLeadingTypeComp=new mdMUHybrid.MatchcodeComponentType("DepThoroughfareLeadingTypeComp",48);
	public final static mdMUHybrid.MatchcodeComponentType DepThoroughfareNameComp=new mdMUHybrid.MatchcodeComponentType("DepThoroughfareNameComp",49);
	public final static mdMUHybrid.MatchcodeComponentType DepThoroughfarePostDirComp=new mdMUHybrid.MatchcodeComponentType("DepThoroughfarePostDirComp",50);
	public final static mdMUHybrid.MatchcodeComponentType DepThoroughfareTrailingTypeComp=new mdMUHybrid.MatchcodeComponentType("DepThoroughfareTrailingTypeComp",51);
	public final static mdMUHybrid.MatchcodeComponentType LocalityComp=new mdMUHybrid.MatchcodeComponentType("LocalityComp",52);
	public final static mdMUHybrid.MatchcodeComponentType DependentLocalityComp=new mdMUHybrid.MatchcodeComponentType("DependentLocalityComp",53);
	public final static mdMUHybrid.MatchcodeComponentType DblDependentLocalityComp=new mdMUHybrid.MatchcodeComponentType("DblDependentLocalityComp",54);
	public final static mdMUHybrid.MatchcodeComponentType AdministrativeAreaComp=new mdMUHybrid.MatchcodeComponentType("AdministrativeAreaComp",55);
	public final static mdMUHybrid.MatchcodeComponentType SubAdministrativeAreaComp=new mdMUHybrid.MatchcodeComponentType("SubAdministrativeAreaComp",56);
	public final static mdMUHybrid.MatchcodeComponentType PostalCodeComp=new mdMUHybrid.MatchcodeComponentType("PostalCodeComp",57);
	public final static mdMUHybrid.MatchcodeComponentType SubNationalAreaComp=new mdMUHybrid.MatchcodeComponentType("SubNationalAreaComp",58);
	public final static mdMUHybrid.MatchcodeComponentType PostBoxComp=new mdMUHybrid.MatchcodeComponentType("PostBoxComp",59);

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
	public final static mdMUHybrid.MatchcodeStart Left=new mdMUHybrid.MatchcodeStart("Left",8);
	public final static mdMUHybrid.MatchcodeStart Right=new mdMUHybrid.MatchcodeStart("Right",16);
	public final static mdMUHybrid.MatchcodeStart StartAtPos=new mdMUHybrid.MatchcodeStart("StartAtPos",32);
	public final static mdMUHybrid.MatchcodeStart StartAtWord=new mdMUHybrid.MatchcodeStart("StartAtWord",64);

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
	public final static mdMUHybrid.MatchcodeTrim LeftTrim=new mdMUHybrid.MatchcodeTrim("LeftTrim",2);
	public final static mdMUHybrid.MatchcodeTrim RightTrim=new mdMUHybrid.MatchcodeTrim("RightTrim",4);
	public final static mdMUHybrid.MatchcodeTrim AllTrim=new mdMUHybrid.MatchcodeTrim("AllTrim",6);

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
	public final static mdMUHybrid.MatchcodeFuzzy Exact=new mdMUHybrid.MatchcodeFuzzy("Exact",0);
	public final static mdMUHybrid.MatchcodeFuzzy SoundEx=new mdMUHybrid.MatchcodeFuzzy("SoundEx",1);
	public final static mdMUHybrid.MatchcodeFuzzy Phonetex=new mdMUHybrid.MatchcodeFuzzy("Phonetex",2);
	public final static mdMUHybrid.MatchcodeFuzzy Containment=new mdMUHybrid.MatchcodeFuzzy("Containment",4);
	public final static mdMUHybrid.MatchcodeFuzzy Frequency=new mdMUHybrid.MatchcodeFuzzy("Frequency",8);
	public final static mdMUHybrid.MatchcodeFuzzy FastNear=new mdMUHybrid.MatchcodeFuzzy("FastNear",16);
	public final static mdMUHybrid.MatchcodeFuzzy AccurateNear=new mdMUHybrid.MatchcodeFuzzy("AccurateNear",32);
	public final static mdMUHybrid.MatchcodeFuzzy VowelsOnly=new mdMUHybrid.MatchcodeFuzzy("VowelsOnly",64);
	public final static mdMUHybrid.MatchcodeFuzzy ConsonantsOnly=new mdMUHybrid.MatchcodeFuzzy("ConsonantsOnly",128);
	public final static mdMUHybrid.MatchcodeFuzzy AlphasOnly=new mdMUHybrid.MatchcodeFuzzy("AlphasOnly",256);
	public final static mdMUHybrid.MatchcodeFuzzy NumericsOnly=new mdMUHybrid.MatchcodeFuzzy("NumericsOnly",512);
	public final static mdMUHybrid.MatchcodeFuzzy FrequencyNear=new mdMUHybrid.MatchcodeFuzzy("FrequencyNear",1024);
	public final static mdMUHybrid.MatchcodeFuzzy NGram=new mdMUHybrid.MatchcodeFuzzy("NGram",2048);
	public final static mdMUHybrid.MatchcodeFuzzy Jaro=new mdMUHybrid.MatchcodeFuzzy("Jaro",4096);
	public final static mdMUHybrid.MatchcodeFuzzy JaroWinkler=new mdMUHybrid.MatchcodeFuzzy("JaroWinkler",8192);
	public final static mdMUHybrid.MatchcodeFuzzy LCS=new mdMUHybrid.MatchcodeFuzzy("LCS",16384);
	public final static mdMUHybrid.MatchcodeFuzzy NeedlemanWunsch=new mdMUHybrid.MatchcodeFuzzy("NeedlemanWunsch",32768);
	public final static mdMUHybrid.MatchcodeFuzzy MDKeyboard=new mdMUHybrid.MatchcodeFuzzy("MDKeyboard",65536);
	public final static mdMUHybrid.MatchcodeFuzzy SmithWatermanGotoh=new mdMUHybrid.MatchcodeFuzzy("SmithWatermanGotoh",131072);
	public final static mdMUHybrid.MatchcodeFuzzy Dice=new mdMUHybrid.MatchcodeFuzzy("Dice",262144);
	public final static mdMUHybrid.MatchcodeFuzzy Jaccard=new mdMUHybrid.MatchcodeFuzzy("Jaccard",524288);
	public final static mdMUHybrid.MatchcodeFuzzy Overlap=new mdMUHybrid.MatchcodeFuzzy("Overlap",1048576);
	public final static mdMUHybrid.MatchcodeFuzzy DoubleMetaphone=new mdMUHybrid.MatchcodeFuzzy("DoubleMetaphone",2097152);
	public final static mdMUHybrid.MatchcodeFuzzy UTF8Near=new mdMUHybrid.MatchcodeFuzzy("UTF8Near",4194304);

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
	public final static mdMUHybrid.MatchcodeFieldMatch NoFieldMatch=new mdMUHybrid.MatchcodeFieldMatch("NoFieldMatch",0);
	public final static mdMUHybrid.MatchcodeFieldMatch BothBlankMatch=new mdMUHybrid.MatchcodeFieldMatch("BothBlankMatch",256);
	public final static mdMUHybrid.MatchcodeFieldMatch OneBlankMatch=new mdMUHybrid.MatchcodeFieldMatch("OneBlankMatch",512);
	public final static mdMUHybrid.MatchcodeFieldMatch InitialMatch=new mdMUHybrid.MatchcodeFieldMatch("InitialMatch",1024);

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
	public final static mdMUHybrid.MatchcodeSwap NoSwap=new mdMUHybrid.MatchcodeSwap("NoSwap",0);
	public final static mdMUHybrid.MatchcodeSwap SwapA=new mdMUHybrid.MatchcodeSwap("SwapA",1);
	public final static mdMUHybrid.MatchcodeSwap SwapB=new mdMUHybrid.MatchcodeSwap("SwapB",2);
	public final static mdMUHybrid.MatchcodeSwap SwapC=new mdMUHybrid.MatchcodeSwap("SwapC",4);
	public final static mdMUHybrid.MatchcodeSwap SwapD=new mdMUHybrid.MatchcodeSwap("SwapD",8);
	public final static mdMUHybrid.MatchcodeSwap SwapE=new mdMUHybrid.MatchcodeSwap("SwapE",16);
	public final static mdMUHybrid.MatchcodeSwap SwapF=new mdMUHybrid.MatchcodeSwap("SwapF",32);
	public final static mdMUHybrid.MatchcodeSwap SwapG=new mdMUHybrid.MatchcodeSwap("SwapG",64);
	public final static mdMUHybrid.MatchcodeSwap SwapH=new mdMUHybrid.MatchcodeSwap("SwapH",128);
	public final static mdMUHybrid.MatchcodeSwap BothA=new mdMUHybrid.MatchcodeSwap("BothA",256);
	public final static mdMUHybrid.MatchcodeSwap BothB=new mdMUHybrid.MatchcodeSwap("BothB",512);
	public final static mdMUHybrid.MatchcodeSwap BothC=new mdMUHybrid.MatchcodeSwap("BothC",1024);
	public final static mdMUHybrid.MatchcodeSwap BothD=new mdMUHybrid.MatchcodeSwap("BothD",2048);
	public final static mdMUHybrid.MatchcodeSwap BothE=new mdMUHybrid.MatchcodeSwap("BothE",4096);
	public final static mdMUHybrid.MatchcodeSwap BothF=new mdMUHybrid.MatchcodeSwap("BothF",8192);
	public final static mdMUHybrid.MatchcodeSwap BothG=new mdMUHybrid.MatchcodeSwap("BothG",16384);
	public final static mdMUHybrid.MatchcodeSwap BothH=new mdMUHybrid.MatchcodeSwap("BothH",32768);

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
	public final static mdMUHybrid.MatchcodeCombination Combo1=new mdMUHybrid.MatchcodeCombination("Combo1",1);
	public final static mdMUHybrid.MatchcodeCombination Combo2=new mdMUHybrid.MatchcodeCombination("Combo2",2);
	public final static mdMUHybrid.MatchcodeCombination Combo3=new mdMUHybrid.MatchcodeCombination("Combo3",4);
	public final static mdMUHybrid.MatchcodeCombination Combo4=new mdMUHybrid.MatchcodeCombination("Combo4",8);
	public final static mdMUHybrid.MatchcodeCombination Combo5=new mdMUHybrid.MatchcodeCombination("Combo5",16);
	public final static mdMUHybrid.MatchcodeCombination Combo6=new mdMUHybrid.MatchcodeCombination("Combo6",32);
	public final static mdMUHybrid.MatchcodeCombination Combo7=new mdMUHybrid.MatchcodeCombination("Combo7",64);
	public final static mdMUHybrid.MatchcodeCombination Combo8=new mdMUHybrid.MatchcodeCombination("Combo8",128);
	public final static mdMUHybrid.MatchcodeCombination Combo9=new mdMUHybrid.MatchcodeCombination("Combo9",256);
	public final static mdMUHybrid.MatchcodeCombination Combo10=new mdMUHybrid.MatchcodeCombination("Combo10",512);
	public final static mdMUHybrid.MatchcodeCombination Combo11=new mdMUHybrid.MatchcodeCombination("Combo11",1024);
	public final static mdMUHybrid.MatchcodeCombination Combo12=new mdMUHybrid.MatchcodeCombination("Combo12",2048);
	public final static mdMUHybrid.MatchcodeCombination Combo13=new mdMUHybrid.MatchcodeCombination("Combo13",4096);
	public final static mdMUHybrid.MatchcodeCombination Combo14=new mdMUHybrid.MatchcodeCombination("Combo14",8192);
	public final static mdMUHybrid.MatchcodeCombination Combo15=new mdMUHybrid.MatchcodeCombination("Combo15",16384);
	public final static mdMUHybrid.MatchcodeCombination Combo16=new mdMUHybrid.MatchcodeCombination("Combo16",32768);

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
	public final static mdMUHybrid.MatchcodeMappingTarget PrefixType=new mdMUHybrid.MatchcodeMappingTarget("PrefixType",1);
	public final static mdMUHybrid.MatchcodeMappingTarget FirstType=new mdMUHybrid.MatchcodeMappingTarget("FirstType",2);
	public final static mdMUHybrid.MatchcodeMappingTarget MiddleType=new mdMUHybrid.MatchcodeMappingTarget("MiddleType",3);
	public final static mdMUHybrid.MatchcodeMappingTarget LastType=new mdMUHybrid.MatchcodeMappingTarget("LastType",4);
	public final static mdMUHybrid.MatchcodeMappingTarget SuffixType=new mdMUHybrid.MatchcodeMappingTarget("SuffixType",5);
	public final static mdMUHybrid.MatchcodeMappingTarget GenderType=new mdMUHybrid.MatchcodeMappingTarget("GenderType",6);
	public final static mdMUHybrid.MatchcodeMappingTarget FirstNicknameType=new mdMUHybrid.MatchcodeMappingTarget("FirstNicknameType",7);
	public final static mdMUHybrid.MatchcodeMappingTarget MiddleNicknameType=new mdMUHybrid.MatchcodeMappingTarget("MiddleNicknameType",8);
	public final static mdMUHybrid.MatchcodeMappingTarget TitleType=new mdMUHybrid.MatchcodeMappingTarget("TitleType",9);
	public final static mdMUHybrid.MatchcodeMappingTarget CompanyType=new mdMUHybrid.MatchcodeMappingTarget("CompanyType",10);
	public final static mdMUHybrid.MatchcodeMappingTarget CompanyAcronymType=new mdMUHybrid.MatchcodeMappingTarget("CompanyAcronymType",11);
	public final static mdMUHybrid.MatchcodeMappingTarget AddressType=new mdMUHybrid.MatchcodeMappingTarget("AddressType",12);
	public final static mdMUHybrid.MatchcodeMappingTarget CityType=new mdMUHybrid.MatchcodeMappingTarget("CityType",13);
	public final static mdMUHybrid.MatchcodeMappingTarget StateType=new mdMUHybrid.MatchcodeMappingTarget("StateType",14);
	public final static mdMUHybrid.MatchcodeMappingTarget Zip9Type=new mdMUHybrid.MatchcodeMappingTarget("Zip9Type",15);
	public final static mdMUHybrid.MatchcodeMappingTarget Zip5Type=new mdMUHybrid.MatchcodeMappingTarget("Zip5Type",16);
	public final static mdMUHybrid.MatchcodeMappingTarget Zip4Type=new mdMUHybrid.MatchcodeMappingTarget("Zip4Type",17);
	public final static mdMUHybrid.MatchcodeMappingTarget CountryType=new mdMUHybrid.MatchcodeMappingTarget("CountryType",18);
	public final static mdMUHybrid.MatchcodeMappingTarget CanadianPCType=new mdMUHybrid.MatchcodeMappingTarget("CanadianPCType",19);
	public final static mdMUHybrid.MatchcodeMappingTarget PhoneType=new mdMUHybrid.MatchcodeMappingTarget("PhoneType",23);
	public final static mdMUHybrid.MatchcodeMappingTarget EMailType=new mdMUHybrid.MatchcodeMappingTarget("EMailType",24);
	public final static mdMUHybrid.MatchcodeMappingTarget CreditCardType=new mdMUHybrid.MatchcodeMappingTarget("CreditCardType",25);
	public final static mdMUHybrid.MatchcodeMappingTarget GeneralType=new mdMUHybrid.MatchcodeMappingTarget("GeneralType",26);
	public final static mdMUHybrid.MatchcodeMappingTarget Address1Type=new mdMUHybrid.MatchcodeMappingTarget("Address1Type",28);
	public final static mdMUHybrid.MatchcodeMappingTarget Address2Type=new mdMUHybrid.MatchcodeMappingTarget("Address2Type",29);
	public final static mdMUHybrid.MatchcodeMappingTarget Address3Type=new mdMUHybrid.MatchcodeMappingTarget("Address3Type",30);
	public final static mdMUHybrid.MatchcodeMappingTarget LatitudeType=new mdMUHybrid.MatchcodeMappingTarget("LatitudeType",34);
	public final static mdMUHybrid.MatchcodeMappingTarget LongitudeType=new mdMUHybrid.MatchcodeMappingTarget("LongitudeType",35);
	public final static mdMUHybrid.MatchcodeMappingTarget DateType=new mdMUHybrid.MatchcodeMappingTarget("DateType",36);
	public final static mdMUHybrid.MatchcodeMappingTarget NumericType=new mdMUHybrid.MatchcodeMappingTarget("NumericType",37);
	public final static mdMUHybrid.MatchcodeMappingTarget Address4Type=new mdMUHybrid.MatchcodeMappingTarget("Address4Type",38);
	public final static mdMUHybrid.MatchcodeMappingTarget Address5Type=new mdMUHybrid.MatchcodeMappingTarget("Address5Type",39);
	public final static mdMUHybrid.MatchcodeMappingTarget Address6Type=new mdMUHybrid.MatchcodeMappingTarget("Address6Type",40);
	public final static mdMUHybrid.MatchcodeMappingTarget Address7Type=new mdMUHybrid.MatchcodeMappingTarget("Address7Type",41);
	public final static mdMUHybrid.MatchcodeMappingTarget Address8Type=new mdMUHybrid.MatchcodeMappingTarget("Address8Type",42);

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
	public final static mdMUHybrid.MatchcodeStatus MCNoError=new mdMUHybrid.MatchcodeStatus("MCNoError",0);
	public final static mdMUHybrid.MatchcodeStatus MCFirstComponentFuzzyOptions=new mdMUHybrid.MatchcodeStatus("MCFirstComponentFuzzyOptions",1);
	public final static mdMUHybrid.MatchcodeStatus MCFirstComponentNoSwapPair=new mdMUHybrid.MatchcodeStatus("MCFirstComponentNoSwapPair",2);
	public final static mdMUHybrid.MatchcodeStatus MCDataTypeNoFuzzy=new mdMUHybrid.MatchcodeStatus("MCDataTypeNoFuzzy",3);
	public final static mdMUHybrid.MatchcodeStatus MCComponentFuzzyIncorrectSize=new mdMUHybrid.MatchcodeStatus("MCComponentFuzzyIncorrectSize",4);
	public final static mdMUHybrid.MatchcodeStatus MCDataTypeNoMaximumNumberWords=new mdMUHybrid.MatchcodeStatus("MCDataTypeNoMaximumNumberWords",5);
	public final static mdMUHybrid.MatchcodeStatus MCDataTypeNoStartRightOrWordOrPos=new mdMUHybrid.MatchcodeStatus("MCDataTypeNoStartRightOrWordOrPos",6);
	public final static mdMUHybrid.MatchcodeStatus MCIncorrectMaximumNumberWords=new mdMUHybrid.MatchcodeStatus("MCIncorrectMaximumNumberWords",7);
	public final static mdMUHybrid.MatchcodeStatus MCNearOutOfRange=new mdMUHybrid.MatchcodeStatus("MCNearOutOfRange",8);
	public final static mdMUHybrid.MatchcodeStatus MCFirstComponentNotUsedInEveryCondition=new mdMUHybrid.MatchcodeStatus("MCFirstComponentNotUsedInEveryCondition",9);
	public final static mdMUHybrid.MatchcodeStatus MCCannotChangeFirstComponent=new mdMUHybrid.MatchcodeStatus("MCCannotChangeFirstComponent",10);
	public final static mdMUHybrid.MatchcodeStatus MCInvalidSwapPair=new mdMUHybrid.MatchcodeStatus("MCInvalidSwapPair",11);
	public final static mdMUHybrid.MatchcodeStatus MCIncorrectStartPosOrStartWord=new mdMUHybrid.MatchcodeStatus("MCIncorrectStartPosOrStartWord",12);
	public final static mdMUHybrid.MatchcodeStatus MCInvalidMatchcodeComponentType=new mdMUHybrid.MatchcodeStatus("MCInvalidMatchcodeComponentType",13);

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
	public final static mdMUHybrid.MatchcodeMapping Prefix=new mdMUHybrid.MatchcodeMapping("Prefix",1);
	public final static mdMUHybrid.MatchcodeMapping Gender=new mdMUHybrid.MatchcodeMapping("Gender",2);
	public final static mdMUHybrid.MatchcodeMapping First=new mdMUHybrid.MatchcodeMapping("First",3);
	public final static mdMUHybrid.MatchcodeMapping MixedFirst=new mdMUHybrid.MatchcodeMapping("MixedFirst",4);
	public final static mdMUHybrid.MatchcodeMapping Middle=new mdMUHybrid.MatchcodeMapping("Middle",5);
	public final static mdMUHybrid.MatchcodeMapping Last=new mdMUHybrid.MatchcodeMapping("Last",6);
	public final static mdMUHybrid.MatchcodeMapping MixedLast=new mdMUHybrid.MatchcodeMapping("MixedLast",7);
	public final static mdMUHybrid.MatchcodeMapping Suffix=new mdMUHybrid.MatchcodeMapping("Suffix",8);
	public final static mdMUHybrid.MatchcodeMapping FullName=new mdMUHybrid.MatchcodeMapping("FullName",9);
	public final static mdMUHybrid.MatchcodeMapping InverseName=new mdMUHybrid.MatchcodeMapping("InverseName",10);
	public final static mdMUHybrid.MatchcodeMapping GovernmentInverseName=new mdMUHybrid.MatchcodeMapping("GovernmentInverseName",11);
	public final static mdMUHybrid.MatchcodeMapping Title=new mdMUHybrid.MatchcodeMapping("Title",12);
	public final static mdMUHybrid.MatchcodeMapping Company=new mdMUHybrid.MatchcodeMapping("Company",13);
	public final static mdMUHybrid.MatchcodeMapping Address=new mdMUHybrid.MatchcodeMapping("Address",14);
	public final static mdMUHybrid.MatchcodeMapping City=new mdMUHybrid.MatchcodeMapping("City",15);
	public final static mdMUHybrid.MatchcodeMapping State=new mdMUHybrid.MatchcodeMapping("State",16);
	public final static mdMUHybrid.MatchcodeMapping Zip9=new mdMUHybrid.MatchcodeMapping("Zip9",17);
	public final static mdMUHybrid.MatchcodeMapping Zip5=new mdMUHybrid.MatchcodeMapping("Zip5",18);
	public final static mdMUHybrid.MatchcodeMapping Zip4=new mdMUHybrid.MatchcodeMapping("Zip4",19);
	public final static mdMUHybrid.MatchcodeMapping CityStZip=new mdMUHybrid.MatchcodeMapping("CityStZip",20);
	public final static mdMUHybrid.MatchcodeMapping Country=new mdMUHybrid.MatchcodeMapping("Country",21);
	public final static mdMUHybrid.MatchcodeMapping CanadianPostalCode=new mdMUHybrid.MatchcodeMapping("CanadianPostalCode",22);
	public final static mdMUHybrid.MatchcodeMapping Phone=new mdMUHybrid.MatchcodeMapping("Phone",27);
	public final static mdMUHybrid.MatchcodeMapping EMail=new mdMUHybrid.MatchcodeMapping("EMail",28);
	public final static mdMUHybrid.MatchcodeMapping CreditCard=new mdMUHybrid.MatchcodeMapping("CreditCard",29);
	public final static mdMUHybrid.MatchcodeMapping General=new mdMUHybrid.MatchcodeMapping("General",30);
	public final static mdMUHybrid.MatchcodeMapping Latitude=new mdMUHybrid.MatchcodeMapping("Latitude",40);
	public final static mdMUHybrid.MatchcodeMapping Longitude=new mdMUHybrid.MatchcodeMapping("Longitude",41);
	public final static mdMUHybrid.MatchcodeMapping Date=new mdMUHybrid.MatchcodeMapping("Date",42);
	public final static mdMUHybrid.MatchcodeMapping Numeric=new mdMUHybrid.MatchcodeMapping("Numeric",43);

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
	public final static mdMUHybrid.MatchcodeNearType NearNone=new mdMUHybrid.MatchcodeNearType("NearNone",0);
	public final static mdMUHybrid.MatchcodeNearType NearInteger=new mdMUHybrid.MatchcodeNearType("NearInteger",1);
	public final static mdMUHybrid.MatchcodeNearType NearFloat=new mdMUHybrid.MatchcodeNearType("NearFloat",2);

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
	public final static mdMUHybrid.ComponentCountryType US=new mdMUHybrid.ComponentCountryType("US",1);
	public final static mdMUHybrid.ComponentCountryType Canada=new mdMUHybrid.ComponentCountryType("Canada",2);
	public final static mdMUHybrid.ComponentCountryType Global=new mdMUHybrid.ComponentCountryType("Global",4);
	public final static mdMUHybrid.ComponentCountryType Domestic=new mdMUHybrid.ComponentCountryType("Domestic",3);

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

	protected mdMUHybrid(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdMUHybrid() {
		this(mdMUHybridJNI.mdMUHybridCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdMUHybridJNI.mdMUHybridDestroy(I);
			}
			I=0;
		}
	}

	public void SetPathToMatchUpFiles(String Path) {
		mdMUHybridJNI.SetPathToMatchUpFiles(I,Path);
	}

	public void SetMatchcodeName(String MatchcodeName) {
		mdMUHybridJNI.SetMatchcodeName(I,MatchcodeName);
	}

	public ProgramStatus InitializeDataFiles() {
		return ProgramStatus.toEnum(mdMUHybridJNI.InitializeDataFiles(I));
	}

	public String GetInitializeErrorString() {
		return mdMUHybridJNI.GetInitializeErrorString(I);
	}

	public int SetLicenseString(String License) {
		return mdMUHybridJNI.SetLicenseString(I,License);
	}

	public void SetMaximumCharacterSize(int size) {
		mdMUHybridJNI.SetMaximumCharacterSize(I,size);
	}

	public int SetEncoding(String encodeName) {
		return mdMUHybridJNI.SetEncoding(I,encodeName);
	}

	public String GetBuildNumber() {
		return mdMUHybridJNI.GetBuildNumber(I);
	}

	public String GetDatabaseDate() {
		return mdMUHybridJNI.GetDatabaseDate(I);
	}

	public String GetDatabaseExpirationDate() {
		return mdMUHybridJNI.GetDatabaseExpirationDate(I);
	}

	public String GetLicenseExpirationDate() {
		return mdMUHybridJNI.GetLicenseExpirationDate(I);
	}

	public long GetMatchcodeObject() {
		return mdMUHybridJNI.GetMatchcodeObject(I);
	}

	public void ClearMappings() {
		mdMUHybridJNI.ClearMappings(I);
	}

	public int AddMapping(mdMUHybrid.MatchcodeMapping Mapping) {
		return mdMUHybridJNI.AddMapping(I,Mapping.toValue());
	}

	public void ClearFields() {
		mdMUHybridJNI.ClearFields(I);
	}

	public void AddField(String Field) {
		mdMUHybridJNI.AddField(I,Field);
	}

	public void BuildKey() {
		mdMUHybridJNI.BuildKey(I);
	}

	public String GetKey() {
		return mdMUHybridJNI.GetKey(I);
	}

	public int GetKeySize() {
		return mdMUHybridJNI.GetKeySize(I);
	}

	public int GetClusterSize() {
		return mdMUHybridJNI.GetClusterSize(I);
	}

	public long CompareKeys(String Key1, String Key2) {
		return mdMUHybridJNI.CompareKeys(I,Key1,Key2);
	}

	public String GetResults() {
		return mdMUHybridJNI.GetResults(I);
	}

	public double GetFuzzyPercentage() {
		return mdMUHybridJNI.GetFuzzyPercentage(I);
	}

	public void SetReserved(String Property, String Value) {
		mdMUHybridJNI.SetReserved(I,Property,Value);
	}

	public String GetReserved(String Property) {
		return mdMUHybridJNI.GetReserved(I,Property);
	}

}
