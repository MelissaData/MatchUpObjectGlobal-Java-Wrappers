package com.melissadata;

public class mdMUMatchcodeComponent {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdMUMatchcodeComponent obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorNone=new mdMUMatchcodeComponent.ProgramStatus("ErrorNone",0);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorConfigFile=new mdMUMatchcodeComponent.ProgramStatus("ErrorConfigFile",1);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorLicenseExpired=new mdMUMatchcodeComponent.ProgramStatus("ErrorLicenseExpired",2);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorDatabaseExpired=new mdMUMatchcodeComponent.ProgramStatus("ErrorDatabaseExpired",3);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorMatchcodeNotSpecified=new mdMUMatchcodeComponent.ProgramStatus("ErrorMatchcodeNotSpecified",4);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorMatchcodeNotFound=new mdMUMatchcodeComponent.ProgramStatus("ErrorMatchcodeNotFound",5);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorInvalidMatchcode=new mdMUMatchcodeComponent.ProgramStatus("ErrorInvalidMatchcode",6);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorKeyFile=new mdMUMatchcodeComponent.ProgramStatus("ErrorKeyFile",7);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorNoneIntersectingGroupCache=new mdMUMatchcodeComponent.ProgramStatus("ErrorNoneIntersectingGroupCache",8);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorMatchcodeObsolete=new mdMUMatchcodeComponent.ProgramStatus("ErrorMatchcodeObsolete",9);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorGlobalAddrInit=new mdMUMatchcodeComponent.ProgramStatus("ErrorGlobalAddrInit",10);
	public final static mdMUMatchcodeComponent.ProgramStatus ErrorIntlLicenseRequired=new mdMUMatchcodeComponent.ProgramStatus("ErrorIntlLicenseRequired",11);

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
	public final static mdMUMatchcodeComponent.MatchcodeComponentType PrefixComp=new mdMUMatchcodeComponent.MatchcodeComponentType("PrefixComp",1);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType FirstComp=new mdMUMatchcodeComponent.MatchcodeComponentType("FirstComp",2);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType MiddleComp=new mdMUMatchcodeComponent.MatchcodeComponentType("MiddleComp",3);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType LastComp=new mdMUMatchcodeComponent.MatchcodeComponentType("LastComp",4);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType SuffixComp=new mdMUMatchcodeComponent.MatchcodeComponentType("SuffixComp",5);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType GenderComp=new mdMUMatchcodeComponent.MatchcodeComponentType("GenderComp",6);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType FirstNicknameComp=new mdMUMatchcodeComponent.MatchcodeComponentType("FirstNicknameComp",7);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType MiddleNicknameComp=new mdMUMatchcodeComponent.MatchcodeComponentType("MiddleNicknameComp",8);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType TitleComp=new mdMUMatchcodeComponent.MatchcodeComponentType("TitleComp",9);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType CompanyComp=new mdMUMatchcodeComponent.MatchcodeComponentType("CompanyComp",10);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType CompanyAcronymComp=new mdMUMatchcodeComponent.MatchcodeComponentType("CompanyAcronymComp",11);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType StreetNumberComp=new mdMUMatchcodeComponent.MatchcodeComponentType("StreetNumberComp",12);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType StreetPreDirComp=new mdMUMatchcodeComponent.MatchcodeComponentType("StreetPreDirComp",13);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType StreetNameComp=new mdMUMatchcodeComponent.MatchcodeComponentType("StreetNameComp",14);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType StreetSuffixComp=new mdMUMatchcodeComponent.MatchcodeComponentType("StreetSuffixComp",15);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType StreetPostDirComp=new mdMUMatchcodeComponent.MatchcodeComponentType("StreetPostDirComp",16);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType POBoxComp=new mdMUMatchcodeComponent.MatchcodeComponentType("POBoxComp",17);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType SecondaryComp=new mdMUMatchcodeComponent.MatchcodeComponentType("SecondaryComp",18);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType AddressComp=new mdMUMatchcodeComponent.MatchcodeComponentType("AddressComp",19);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType CityComp=new mdMUMatchcodeComponent.MatchcodeComponentType("CityComp",20);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType StateComp=new mdMUMatchcodeComponent.MatchcodeComponentType("StateComp",21);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType Zip9Comp=new mdMUMatchcodeComponent.MatchcodeComponentType("Zip9Comp",22);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType Zip5Comp=new mdMUMatchcodeComponent.MatchcodeComponentType("Zip5Comp",23);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType Zip4Comp=new mdMUMatchcodeComponent.MatchcodeComponentType("Zip4Comp",24);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType CountryComp=new mdMUMatchcodeComponent.MatchcodeComponentType("CountryComp",28);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType CanadianPCComp=new mdMUMatchcodeComponent.MatchcodeComponentType("CanadianPCComp",29);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType PhoneComp=new mdMUMatchcodeComponent.MatchcodeComponentType("PhoneComp",33);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType EMailComp=new mdMUMatchcodeComponent.MatchcodeComponentType("EMailComp",34);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType CreditCardComp=new mdMUMatchcodeComponent.MatchcodeComponentType("CreditCardComp",35);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType GeneralComp=new mdMUMatchcodeComponent.MatchcodeComponentType("GeneralComp",36);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType GeoDistanceComp=new mdMUMatchcodeComponent.MatchcodeComponentType("GeoDistanceComp",38);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DateComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DateComp",39);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType NumericComp=new mdMUMatchcodeComponent.MatchcodeComponentType("NumericComp",40);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType PremisesNumberComp=new mdMUMatchcodeComponent.MatchcodeComponentType("PremisesNumberComp",41);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType ThoroughfarePreDirComp=new mdMUMatchcodeComponent.MatchcodeComponentType("ThoroughfarePreDirComp",42);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType ThoroughfareLeadingTypeComp=new mdMUMatchcodeComponent.MatchcodeComponentType("ThoroughfareLeadingTypeComp",43);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType ThoroughfareNameComp=new mdMUMatchcodeComponent.MatchcodeComponentType("ThoroughfareNameComp",44);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType ThoroughfarePostDirComp=new mdMUMatchcodeComponent.MatchcodeComponentType("ThoroughfarePostDirComp",45);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType ThoroughfareTrailingTypeComp=new mdMUMatchcodeComponent.MatchcodeComponentType("ThoroughfareTrailingTypeComp",46);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DepThoroughfarePreDirComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DepThoroughfarePreDirComp",47);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DepThoroughfareLeadingTypeComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DepThoroughfareLeadingTypeComp",48);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DepThoroughfareNameComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DepThoroughfareNameComp",49);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DepThoroughfarePostDirComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DepThoroughfarePostDirComp",50);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DepThoroughfareTrailingTypeComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DepThoroughfareTrailingTypeComp",51);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType LocalityComp=new mdMUMatchcodeComponent.MatchcodeComponentType("LocalityComp",52);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DependentLocalityComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DependentLocalityComp",53);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType DblDependentLocalityComp=new mdMUMatchcodeComponent.MatchcodeComponentType("DblDependentLocalityComp",54);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType AdministrativeAreaComp=new mdMUMatchcodeComponent.MatchcodeComponentType("AdministrativeAreaComp",55);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType SubAdministrativeAreaComp=new mdMUMatchcodeComponent.MatchcodeComponentType("SubAdministrativeAreaComp",56);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType PostalCodeComp=new mdMUMatchcodeComponent.MatchcodeComponentType("PostalCodeComp",57);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType SubNationalAreaComp=new mdMUMatchcodeComponent.MatchcodeComponentType("SubNationalAreaComp",58);
	public final static mdMUMatchcodeComponent.MatchcodeComponentType PostBoxComp=new mdMUMatchcodeComponent.MatchcodeComponentType("PostBoxComp",59);

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
	public final static mdMUMatchcodeComponent.MatchcodeStart Left=new mdMUMatchcodeComponent.MatchcodeStart("Left",8);
	public final static mdMUMatchcodeComponent.MatchcodeStart Right=new mdMUMatchcodeComponent.MatchcodeStart("Right",16);
	public final static mdMUMatchcodeComponent.MatchcodeStart StartAtPos=new mdMUMatchcodeComponent.MatchcodeStart("StartAtPos",32);
	public final static mdMUMatchcodeComponent.MatchcodeStart StartAtWord=new mdMUMatchcodeComponent.MatchcodeStart("StartAtWord",64);

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
	public final static mdMUMatchcodeComponent.MatchcodeTrim LeftTrim=new mdMUMatchcodeComponent.MatchcodeTrim("LeftTrim",2);
	public final static mdMUMatchcodeComponent.MatchcodeTrim RightTrim=new mdMUMatchcodeComponent.MatchcodeTrim("RightTrim",4);
	public final static mdMUMatchcodeComponent.MatchcodeTrim AllTrim=new mdMUMatchcodeComponent.MatchcodeTrim("AllTrim",6);

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
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Exact=new mdMUMatchcodeComponent.MatchcodeFuzzy("Exact",0);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy SoundEx=new mdMUMatchcodeComponent.MatchcodeFuzzy("SoundEx",1);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Phonetex=new mdMUMatchcodeComponent.MatchcodeFuzzy("Phonetex",2);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Containment=new mdMUMatchcodeComponent.MatchcodeFuzzy("Containment",4);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Frequency=new mdMUMatchcodeComponent.MatchcodeFuzzy("Frequency",8);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy FastNear=new mdMUMatchcodeComponent.MatchcodeFuzzy("FastNear",16);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy AccurateNear=new mdMUMatchcodeComponent.MatchcodeFuzzy("AccurateNear",32);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy VowelsOnly=new mdMUMatchcodeComponent.MatchcodeFuzzy("VowelsOnly",64);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy ConsonantsOnly=new mdMUMatchcodeComponent.MatchcodeFuzzy("ConsonantsOnly",128);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy AlphasOnly=new mdMUMatchcodeComponent.MatchcodeFuzzy("AlphasOnly",256);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy NumericsOnly=new mdMUMatchcodeComponent.MatchcodeFuzzy("NumericsOnly",512);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy FrequencyNear=new mdMUMatchcodeComponent.MatchcodeFuzzy("FrequencyNear",1024);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy NGram=new mdMUMatchcodeComponent.MatchcodeFuzzy("NGram",2048);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Jaro=new mdMUMatchcodeComponent.MatchcodeFuzzy("Jaro",4096);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy JaroWinkler=new mdMUMatchcodeComponent.MatchcodeFuzzy("JaroWinkler",8192);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy LCS=new mdMUMatchcodeComponent.MatchcodeFuzzy("LCS",16384);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy NeedlemanWunsch=new mdMUMatchcodeComponent.MatchcodeFuzzy("NeedlemanWunsch",32768);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy MDKeyboard=new mdMUMatchcodeComponent.MatchcodeFuzzy("MDKeyboard",65536);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy SmithWatermanGotoh=new mdMUMatchcodeComponent.MatchcodeFuzzy("SmithWatermanGotoh",131072);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Dice=new mdMUMatchcodeComponent.MatchcodeFuzzy("Dice",262144);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Jaccard=new mdMUMatchcodeComponent.MatchcodeFuzzy("Jaccard",524288);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy Overlap=new mdMUMatchcodeComponent.MatchcodeFuzzy("Overlap",1048576);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy DoubleMetaphone=new mdMUMatchcodeComponent.MatchcodeFuzzy("DoubleMetaphone",2097152);
	public final static mdMUMatchcodeComponent.MatchcodeFuzzy UTF8Near=new mdMUMatchcodeComponent.MatchcodeFuzzy("UTF8Near",4194304);

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
	public final static mdMUMatchcodeComponent.MatchcodeFieldMatch NoFieldMatch=new mdMUMatchcodeComponent.MatchcodeFieldMatch("NoFieldMatch",0);
	public final static mdMUMatchcodeComponent.MatchcodeFieldMatch BothBlankMatch=new mdMUMatchcodeComponent.MatchcodeFieldMatch("BothBlankMatch",256);
	public final static mdMUMatchcodeComponent.MatchcodeFieldMatch OneBlankMatch=new mdMUMatchcodeComponent.MatchcodeFieldMatch("OneBlankMatch",512);
	public final static mdMUMatchcodeComponent.MatchcodeFieldMatch InitialMatch=new mdMUMatchcodeComponent.MatchcodeFieldMatch("InitialMatch",1024);

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
	public final static mdMUMatchcodeComponent.MatchcodeSwap NoSwap=new mdMUMatchcodeComponent.MatchcodeSwap("NoSwap",0);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapA=new mdMUMatchcodeComponent.MatchcodeSwap("SwapA",1);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapB=new mdMUMatchcodeComponent.MatchcodeSwap("SwapB",2);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapC=new mdMUMatchcodeComponent.MatchcodeSwap("SwapC",4);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapD=new mdMUMatchcodeComponent.MatchcodeSwap("SwapD",8);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapE=new mdMUMatchcodeComponent.MatchcodeSwap("SwapE",16);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapF=new mdMUMatchcodeComponent.MatchcodeSwap("SwapF",32);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapG=new mdMUMatchcodeComponent.MatchcodeSwap("SwapG",64);
	public final static mdMUMatchcodeComponent.MatchcodeSwap SwapH=new mdMUMatchcodeComponent.MatchcodeSwap("SwapH",128);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothA=new mdMUMatchcodeComponent.MatchcodeSwap("BothA",256);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothB=new mdMUMatchcodeComponent.MatchcodeSwap("BothB",512);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothC=new mdMUMatchcodeComponent.MatchcodeSwap("BothC",1024);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothD=new mdMUMatchcodeComponent.MatchcodeSwap("BothD",2048);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothE=new mdMUMatchcodeComponent.MatchcodeSwap("BothE",4096);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothF=new mdMUMatchcodeComponent.MatchcodeSwap("BothF",8192);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothG=new mdMUMatchcodeComponent.MatchcodeSwap("BothG",16384);
	public final static mdMUMatchcodeComponent.MatchcodeSwap BothH=new mdMUMatchcodeComponent.MatchcodeSwap("BothH",32768);

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
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo1=new mdMUMatchcodeComponent.MatchcodeCombination("Combo1",1);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo2=new mdMUMatchcodeComponent.MatchcodeCombination("Combo2",2);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo3=new mdMUMatchcodeComponent.MatchcodeCombination("Combo3",4);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo4=new mdMUMatchcodeComponent.MatchcodeCombination("Combo4",8);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo5=new mdMUMatchcodeComponent.MatchcodeCombination("Combo5",16);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo6=new mdMUMatchcodeComponent.MatchcodeCombination("Combo6",32);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo7=new mdMUMatchcodeComponent.MatchcodeCombination("Combo7",64);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo8=new mdMUMatchcodeComponent.MatchcodeCombination("Combo8",128);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo9=new mdMUMatchcodeComponent.MatchcodeCombination("Combo9",256);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo10=new mdMUMatchcodeComponent.MatchcodeCombination("Combo10",512);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo11=new mdMUMatchcodeComponent.MatchcodeCombination("Combo11",1024);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo12=new mdMUMatchcodeComponent.MatchcodeCombination("Combo12",2048);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo13=new mdMUMatchcodeComponent.MatchcodeCombination("Combo13",4096);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo14=new mdMUMatchcodeComponent.MatchcodeCombination("Combo14",8192);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo15=new mdMUMatchcodeComponent.MatchcodeCombination("Combo15",16384);
	public final static mdMUMatchcodeComponent.MatchcodeCombination Combo16=new mdMUMatchcodeComponent.MatchcodeCombination("Combo16",32768);

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
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget PrefixType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("PrefixType",1);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget FirstType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("FirstType",2);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget MiddleType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("MiddleType",3);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget LastType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("LastType",4);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget SuffixType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("SuffixType",5);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget GenderType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("GenderType",6);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget FirstNicknameType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("FirstNicknameType",7);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget MiddleNicknameType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("MiddleNicknameType",8);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget TitleType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("TitleType",9);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget CompanyType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("CompanyType",10);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget CompanyAcronymType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("CompanyAcronymType",11);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget AddressType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("AddressType",12);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget CityType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("CityType",13);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget StateType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("StateType",14);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Zip9Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Zip9Type",15);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Zip5Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Zip5Type",16);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Zip4Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Zip4Type",17);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget CountryType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("CountryType",18);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget CanadianPCType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("CanadianPCType",19);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget PhoneType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("PhoneType",23);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget EMailType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("EMailType",24);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget CreditCardType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("CreditCardType",25);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget GeneralType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("GeneralType",26);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address1Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address1Type",28);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address2Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address2Type",29);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address3Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address3Type",30);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget LatitudeType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("LatitudeType",34);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget LongitudeType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("LongitudeType",35);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget DateType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("DateType",36);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget NumericType=new mdMUMatchcodeComponent.MatchcodeMappingTarget("NumericType",37);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address4Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address4Type",38);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address5Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address5Type",39);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address6Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address6Type",40);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address7Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address7Type",41);
	public final static mdMUMatchcodeComponent.MatchcodeMappingTarget Address8Type=new mdMUMatchcodeComponent.MatchcodeMappingTarget("Address8Type",42);

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
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCNoError=new mdMUMatchcodeComponent.MatchcodeStatus("MCNoError",0);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCFirstComponentFuzzyOptions=new mdMUMatchcodeComponent.MatchcodeStatus("MCFirstComponentFuzzyOptions",1);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCFirstComponentNoSwapPair=new mdMUMatchcodeComponent.MatchcodeStatus("MCFirstComponentNoSwapPair",2);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCDataTypeNoFuzzy=new mdMUMatchcodeComponent.MatchcodeStatus("MCDataTypeNoFuzzy",3);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCComponentFuzzyIncorrectSize=new mdMUMatchcodeComponent.MatchcodeStatus("MCComponentFuzzyIncorrectSize",4);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCDataTypeNoMaximumNumberWords=new mdMUMatchcodeComponent.MatchcodeStatus("MCDataTypeNoMaximumNumberWords",5);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCDataTypeNoStartRightOrWordOrPos=new mdMUMatchcodeComponent.MatchcodeStatus("MCDataTypeNoStartRightOrWordOrPos",6);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCIncorrectMaximumNumberWords=new mdMUMatchcodeComponent.MatchcodeStatus("MCIncorrectMaximumNumberWords",7);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCNearOutOfRange=new mdMUMatchcodeComponent.MatchcodeStatus("MCNearOutOfRange",8);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCFirstComponentNotUsedInEveryCondition=new mdMUMatchcodeComponent.MatchcodeStatus("MCFirstComponentNotUsedInEveryCondition",9);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCCannotChangeFirstComponent=new mdMUMatchcodeComponent.MatchcodeStatus("MCCannotChangeFirstComponent",10);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCInvalidSwapPair=new mdMUMatchcodeComponent.MatchcodeStatus("MCInvalidSwapPair",11);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCIncorrectStartPosOrStartWord=new mdMUMatchcodeComponent.MatchcodeStatus("MCIncorrectStartPosOrStartWord",12);
	public final static mdMUMatchcodeComponent.MatchcodeStatus MCInvalidMatchcodeComponentType=new mdMUMatchcodeComponent.MatchcodeStatus("MCInvalidMatchcodeComponentType",13);

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
	public final static mdMUMatchcodeComponent.MatchcodeMapping Prefix=new mdMUMatchcodeComponent.MatchcodeMapping("Prefix",1);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Gender=new mdMUMatchcodeComponent.MatchcodeMapping("Gender",2);
	public final static mdMUMatchcodeComponent.MatchcodeMapping First=new mdMUMatchcodeComponent.MatchcodeMapping("First",3);
	public final static mdMUMatchcodeComponent.MatchcodeMapping MixedFirst=new mdMUMatchcodeComponent.MatchcodeMapping("MixedFirst",4);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Middle=new mdMUMatchcodeComponent.MatchcodeMapping("Middle",5);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Last=new mdMUMatchcodeComponent.MatchcodeMapping("Last",6);
	public final static mdMUMatchcodeComponent.MatchcodeMapping MixedLast=new mdMUMatchcodeComponent.MatchcodeMapping("MixedLast",7);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Suffix=new mdMUMatchcodeComponent.MatchcodeMapping("Suffix",8);
	public final static mdMUMatchcodeComponent.MatchcodeMapping FullName=new mdMUMatchcodeComponent.MatchcodeMapping("FullName",9);
	public final static mdMUMatchcodeComponent.MatchcodeMapping InverseName=new mdMUMatchcodeComponent.MatchcodeMapping("InverseName",10);
	public final static mdMUMatchcodeComponent.MatchcodeMapping GovernmentInverseName=new mdMUMatchcodeComponent.MatchcodeMapping("GovernmentInverseName",11);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Title=new mdMUMatchcodeComponent.MatchcodeMapping("Title",12);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Company=new mdMUMatchcodeComponent.MatchcodeMapping("Company",13);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Address=new mdMUMatchcodeComponent.MatchcodeMapping("Address",14);
	public final static mdMUMatchcodeComponent.MatchcodeMapping City=new mdMUMatchcodeComponent.MatchcodeMapping("City",15);
	public final static mdMUMatchcodeComponent.MatchcodeMapping State=new mdMUMatchcodeComponent.MatchcodeMapping("State",16);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Zip9=new mdMUMatchcodeComponent.MatchcodeMapping("Zip9",17);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Zip5=new mdMUMatchcodeComponent.MatchcodeMapping("Zip5",18);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Zip4=new mdMUMatchcodeComponent.MatchcodeMapping("Zip4",19);
	public final static mdMUMatchcodeComponent.MatchcodeMapping CityStZip=new mdMUMatchcodeComponent.MatchcodeMapping("CityStZip",20);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Country=new mdMUMatchcodeComponent.MatchcodeMapping("Country",21);
	public final static mdMUMatchcodeComponent.MatchcodeMapping CanadianPostalCode=new mdMUMatchcodeComponent.MatchcodeMapping("CanadianPostalCode",22);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Phone=new mdMUMatchcodeComponent.MatchcodeMapping("Phone",27);
	public final static mdMUMatchcodeComponent.MatchcodeMapping EMail=new mdMUMatchcodeComponent.MatchcodeMapping("EMail",28);
	public final static mdMUMatchcodeComponent.MatchcodeMapping CreditCard=new mdMUMatchcodeComponent.MatchcodeMapping("CreditCard",29);
	public final static mdMUMatchcodeComponent.MatchcodeMapping General=new mdMUMatchcodeComponent.MatchcodeMapping("General",30);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Latitude=new mdMUMatchcodeComponent.MatchcodeMapping("Latitude",40);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Longitude=new mdMUMatchcodeComponent.MatchcodeMapping("Longitude",41);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Date=new mdMUMatchcodeComponent.MatchcodeMapping("Date",42);
	public final static mdMUMatchcodeComponent.MatchcodeMapping Numeric=new mdMUMatchcodeComponent.MatchcodeMapping("Numeric",43);

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
	public final static mdMUMatchcodeComponent.MatchcodeNearType NearNone=new mdMUMatchcodeComponent.MatchcodeNearType("NearNone",0);
	public final static mdMUMatchcodeComponent.MatchcodeNearType NearInteger=new mdMUMatchcodeComponent.MatchcodeNearType("NearInteger",1);
	public final static mdMUMatchcodeComponent.MatchcodeNearType NearFloat=new mdMUMatchcodeComponent.MatchcodeNearType("NearFloat",2);

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
	public final static mdMUMatchcodeComponent.ComponentCountryType US=new mdMUMatchcodeComponent.ComponentCountryType("US",1);
	public final static mdMUMatchcodeComponent.ComponentCountryType Canada=new mdMUMatchcodeComponent.ComponentCountryType("Canada",2);
	public final static mdMUMatchcodeComponent.ComponentCountryType Global=new mdMUMatchcodeComponent.ComponentCountryType("Global",4);
	public final static mdMUMatchcodeComponent.ComponentCountryType Domestic=new mdMUMatchcodeComponent.ComponentCountryType("Domestic",3);

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



	protected mdMUMatchcodeComponent(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdMUMatchcodeComponent() {
		this(mdMUMatchcodeComponentJNI.mdMUMatchcodeComponentCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdMUMatchcodeComponentJNI.mdMUMatchcodeComponentDestroy(I);
			}
			I=0;
		}
	}

	public MatchcodeComponentType GetComponentType() {
		return MatchcodeComponentType.toEnum(mdMUMatchcodeComponentJNI.GetComponentType(I));
	}

	public void SetComponentType(mdMUMatchcodeComponent.MatchcodeComponentType Type) {
		mdMUMatchcodeComponentJNI.SetComponentType(I,Type.toValue());
	}

	public int GetSize() {
		return mdMUMatchcodeComponentJNI.GetSize(I);
	}

	public void SetSize(int Size) {
		mdMUMatchcodeComponentJNI.SetSize(I,Size);
	}

	public String GetLabel() {
		return mdMUMatchcodeComponentJNI.GetLabel(I);
	}

	public void SetLabel(String Label) {
		mdMUMatchcodeComponentJNI.SetLabel(I,Label);
	}

	public int GetWordCount() {
		return mdMUMatchcodeComponentJNI.GetWordCount(I);
	}

	public void SetWordCount(int WordCount) {
		mdMUMatchcodeComponentJNI.SetWordCount(I,WordCount);
	}

	public MatchcodeStart GetStart() {
		return MatchcodeStart.toEnum(mdMUMatchcodeComponentJNI.GetStart(I));
	}

	public void SetStart(mdMUMatchcodeComponent.MatchcodeStart Start) {
		mdMUMatchcodeComponentJNI.SetStart(I,Start.toValue());
	}

	public int GetStartPos() {
		return mdMUMatchcodeComponentJNI.GetStartPos(I);
	}

	public void SetStartPos(int StartPos) {
		mdMUMatchcodeComponentJNI.SetStartPos(I,StartPos);
	}

	public MatchcodeTrim GetTrim() {
		return MatchcodeTrim.toEnum(mdMUMatchcodeComponentJNI.GetTrim(I));
	}

	public void SetTrim(mdMUMatchcodeComponent.MatchcodeTrim Trim) {
		mdMUMatchcodeComponentJNI.SetTrim(I,Trim.toValue());
	}

	public MatchcodeFuzzy GetFuzzy() {
		return MatchcodeFuzzy.toEnum(mdMUMatchcodeComponentJNI.GetFuzzy(I));
	}

	public void SetFuzzy(mdMUMatchcodeComponent.MatchcodeFuzzy Fuzzy) {
		mdMUMatchcodeComponentJNI.SetFuzzy(I,Fuzzy.toValue());
	}

	public int GetNear() {
		return mdMUMatchcodeComponentJNI.GetNear(I);
	}

	public void SetNear(int Near) {
		mdMUMatchcodeComponentJNI.SetNear(I,Near);
	}

	public double GetNearDbl() {
		return mdMUMatchcodeComponentJNI.GetNearDbl(I);
	}

	public void SetNearDbl(double Near) {
		mdMUMatchcodeComponentJNI.SetNearDbl(I,Near);
	}

	public MatchcodeFieldMatch GetFieldMatch() {
		return MatchcodeFieldMatch.toEnum(mdMUMatchcodeComponentJNI.GetFieldMatch(I));
	}

	public void SetFieldMatch(mdMUMatchcodeComponent.MatchcodeFieldMatch Match) {
		mdMUMatchcodeComponentJNI.SetFieldMatch(I,Match.toValue());
	}

	public MatchcodeSwap GetSwap() {
		return MatchcodeSwap.toEnum(mdMUMatchcodeComponentJNI.GetSwap(I));
	}

	public void SetSwap(mdMUMatchcodeComponent.MatchcodeSwap Swap) {
		mdMUMatchcodeComponentJNI.SetSwap(I,Swap.toValue());
	}

	public MatchcodeCombination GetCombination() {
		return MatchcodeCombination.toEnum(mdMUMatchcodeComponentJNI.GetCombination(I));
	}

	public void SetCombination(mdMUMatchcodeComponent.MatchcodeCombination Combination) {
		mdMUMatchcodeComponentJNI.SetCombination(I,Combination.toValue());
	}

	public ComponentCountryType GetComponentCountryTypeFromEnum(mdMUMatchcodeComponent.MatchcodeComponentType Value) {
		return ComponentCountryType.toEnum(mdMUMatchcodeComponentJNI.GetComponentCountryTypeFromEnum(I,Value.toValue()));
	}

	public String GetComponentDescription(int UseLabel) {
		return mdMUMatchcodeComponentJNI.GetComponentDescription(I,UseLabel);
	}

	public String GetComponentDescriptionFromEnum(mdMUMatchcodeComponent.MatchcodeComponentType Value) {
		return mdMUMatchcodeComponentJNI.GetComponentDescriptionFromEnum(I,Value.toValue());
	}

	public String GetComponentAbbreviation() {
		return mdMUMatchcodeComponentJNI.GetComponentAbbreviation(I);
	}

	public MatchcodeComponentType ParseComponentDescription(String Value) {
		return MatchcodeComponentType.toEnum(mdMUMatchcodeComponentJNI.ParseComponentDescription(I,Value));
	}

	public String GetSizeDescription() {
		return mdMUMatchcodeComponentJNI.GetSizeDescription(I);
	}

	public int ParseSizeDescription(String Value) {
		return mdMUMatchcodeComponentJNI.ParseSizeDescription(I,Value);
	}

	public int ParseWordCountDescription(String Value) {
		return mdMUMatchcodeComponentJNI.ParseWordCountDescription(I,Value);
	}

	public String GetStartDescription() {
		return mdMUMatchcodeComponentJNI.GetStartDescription(I);
	}

	public MatchcodeStart ParseStartDescription(String Value) {
		return MatchcodeStart.toEnum(mdMUMatchcodeComponentJNI.ParseStartDescription(I,Value));
	}

	public int ParseStartPosDescription(String Value) {
		return mdMUMatchcodeComponentJNI.ParseStartPosDescription(I,Value);
	}

	public String GetFuzzyDescription(int Decorated) {
		return mdMUMatchcodeComponentJNI.GetFuzzyDescription(I,Decorated);
	}

	public String GetFuzzyDescriptionFromEnum(mdMUMatchcodeComponent.MatchcodeFuzzy Value) {
		return mdMUMatchcodeComponentJNI.GetFuzzyDescriptionFromEnum(I,Value.toValue());
	}

	public MatchcodeFuzzy ParseFuzzyDescription(String Value) {
		return MatchcodeFuzzy.toEnum(mdMUMatchcodeComponentJNI.ParseFuzzyDescription(I,Value));
	}

	public double ParseNearDescription(String Value) {
		return mdMUMatchcodeComponentJNI.ParseNearDescription(I,Value);
	}

	public String GetFieldMatchDescription() {
		return mdMUMatchcodeComponentJNI.GetFieldMatchDescription(I);
	}

	public MatchcodeFieldMatch ParseFieldMatchDescription(String Value) {
		return MatchcodeFieldMatch.toEnum(mdMUMatchcodeComponentJNI.ParseFieldMatchDescription(I,Value));
	}

	public String GetSwapDescription() {
		return mdMUMatchcodeComponentJNI.GetSwapDescription(I);
	}

	public int CanChangeComponentType() {
		return mdMUMatchcodeComponentJNI.CanChangeComponentType(I);
	}

	public int CanChangeLabel() {
		return mdMUMatchcodeComponentJNI.CanChangeLabel(I);
	}

	public int CanChangeSize() {
		return mdMUMatchcodeComponentJNI.CanChangeSize(I);
	}

	public int CanChangeWordCount() {
		return mdMUMatchcodeComponentJNI.CanChangeWordCount(I);
	}

	public int CanChangeStart() {
		return mdMUMatchcodeComponentJNI.CanChangeStart(I);
	}

	public int CanChangeTrim() {
		return mdMUMatchcodeComponentJNI.CanChangeTrim(I);
	}

	public int CanChangeFuzzy() {
		return mdMUMatchcodeComponentJNI.CanChangeFuzzy(I);
	}

	public int GetSizeMinimum() {
		return mdMUMatchcodeComponentJNI.GetSizeMinimum(I);
	}

	public int GetSizeMaximum() {
		return mdMUMatchcodeComponentJNI.GetSizeMaximum(I);
	}

	public MatchcodeStart GetAllowedStarts() {
		return MatchcodeStart.toEnum(mdMUMatchcodeComponentJNI.GetAllowedStarts(I));
	}

	public MatchcodeFuzzy GetAllowedFuzzies() {
		return MatchcodeFuzzy.toEnum(mdMUMatchcodeComponentJNI.GetAllowedFuzzies(I));
	}

	public int IsAllowedFuzzy(mdMUMatchcodeComponent.MatchcodeFuzzy Value) {
		return mdMUMatchcodeComponentJNI.IsAllowedFuzzy(I,Value.toValue());
	}

	public MatchcodeNearType GetFuzzyNearType() {
		return MatchcodeNearType.toEnum(mdMUMatchcodeComponentJNI.GetFuzzyNearType(I));
	}

	public double GetNearMinimum() {
		return mdMUMatchcodeComponentJNI.GetNearMinimum(I);
	}

	public double GetNearMaximum() {
		return mdMUMatchcodeComponentJNI.GetNearMaximum(I);
	}

	public MatchcodeFieldMatch GetAllowedFieldMatches() {
		return MatchcodeFieldMatch.toEnum(mdMUMatchcodeComponentJNI.GetAllowedFieldMatches(I));
	}

	public MatchcodeCombination GetAllowedCombinations() {
		return MatchcodeCombination.toEnum(mdMUMatchcodeComponentJNI.GetAllowedCombinations(I));
	}

	public MatchcodeSwap GetAllowedSwaps() {
		return MatchcodeSwap.toEnum(mdMUMatchcodeComponentJNI.GetAllowedSwaps(I));
	}

	public String GetComponentTypeEnum() {
		return mdMUMatchcodeComponentJNI.GetComponentTypeEnum(I);
	}

	public String GetFuzzyEnum() {
		return mdMUMatchcodeComponentJNI.GetFuzzyEnum(I);
	}

	public void SetReserved(String Property, String Value) {
		mdMUMatchcodeComponentJNI.SetReserved(I,Property,Value);
	}

	public String GetReserved(String Property) {
		return mdMUMatchcodeComponentJNI.GetReserved(I,Property);
	}

}
