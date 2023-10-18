package com.melissadata;

public class mdMUMatchcode {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdMUMatchcode obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdMUMatchcode.ProgramStatus ErrorNone=new mdMUMatchcode.ProgramStatus("ErrorNone",0);
	public final static mdMUMatchcode.ProgramStatus ErrorConfigFile=new mdMUMatchcode.ProgramStatus("ErrorConfigFile",1);
	public final static mdMUMatchcode.ProgramStatus ErrorLicenseExpired=new mdMUMatchcode.ProgramStatus("ErrorLicenseExpired",2);
	public final static mdMUMatchcode.ProgramStatus ErrorDatabaseExpired=new mdMUMatchcode.ProgramStatus("ErrorDatabaseExpired",3);
	public final static mdMUMatchcode.ProgramStatus ErrorMatchcodeNotSpecified=new mdMUMatchcode.ProgramStatus("ErrorMatchcodeNotSpecified",4);
	public final static mdMUMatchcode.ProgramStatus ErrorMatchcodeNotFound=new mdMUMatchcode.ProgramStatus("ErrorMatchcodeNotFound",5);
	public final static mdMUMatchcode.ProgramStatus ErrorInvalidMatchcode=new mdMUMatchcode.ProgramStatus("ErrorInvalidMatchcode",6);
	public final static mdMUMatchcode.ProgramStatus ErrorKeyFile=new mdMUMatchcode.ProgramStatus("ErrorKeyFile",7);
	public final static mdMUMatchcode.ProgramStatus ErrorNoneIntersectingGroupCache=new mdMUMatchcode.ProgramStatus("ErrorNoneIntersectingGroupCache",8);
	public final static mdMUMatchcode.ProgramStatus ErrorMatchcodeObsolete=new mdMUMatchcode.ProgramStatus("ErrorMatchcodeObsolete",9);
	public final static mdMUMatchcode.ProgramStatus ErrorGlobalAddrInit=new mdMUMatchcode.ProgramStatus("ErrorGlobalAddrInit",10);
	public final static mdMUMatchcode.ProgramStatus ErrorIntlLicenseRequired=new mdMUMatchcode.ProgramStatus("ErrorIntlLicenseRequired",11);

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
	public final static mdMUMatchcode.MatchcodeComponentType PrefixComp=new mdMUMatchcode.MatchcodeComponentType("PrefixComp",1);
	public final static mdMUMatchcode.MatchcodeComponentType FirstComp=new mdMUMatchcode.MatchcodeComponentType("FirstComp",2);
	public final static mdMUMatchcode.MatchcodeComponentType MiddleComp=new mdMUMatchcode.MatchcodeComponentType("MiddleComp",3);
	public final static mdMUMatchcode.MatchcodeComponentType LastComp=new mdMUMatchcode.MatchcodeComponentType("LastComp",4);
	public final static mdMUMatchcode.MatchcodeComponentType SuffixComp=new mdMUMatchcode.MatchcodeComponentType("SuffixComp",5);
	public final static mdMUMatchcode.MatchcodeComponentType GenderComp=new mdMUMatchcode.MatchcodeComponentType("GenderComp",6);
	public final static mdMUMatchcode.MatchcodeComponentType FirstNicknameComp=new mdMUMatchcode.MatchcodeComponentType("FirstNicknameComp",7);
	public final static mdMUMatchcode.MatchcodeComponentType MiddleNicknameComp=new mdMUMatchcode.MatchcodeComponentType("MiddleNicknameComp",8);
	public final static mdMUMatchcode.MatchcodeComponentType TitleComp=new mdMUMatchcode.MatchcodeComponentType("TitleComp",9);
	public final static mdMUMatchcode.MatchcodeComponentType CompanyComp=new mdMUMatchcode.MatchcodeComponentType("CompanyComp",10);
	public final static mdMUMatchcode.MatchcodeComponentType CompanyAcronymComp=new mdMUMatchcode.MatchcodeComponentType("CompanyAcronymComp",11);
	public final static mdMUMatchcode.MatchcodeComponentType StreetNumberComp=new mdMUMatchcode.MatchcodeComponentType("StreetNumberComp",12);
	public final static mdMUMatchcode.MatchcodeComponentType StreetPreDirComp=new mdMUMatchcode.MatchcodeComponentType("StreetPreDirComp",13);
	public final static mdMUMatchcode.MatchcodeComponentType StreetNameComp=new mdMUMatchcode.MatchcodeComponentType("StreetNameComp",14);
	public final static mdMUMatchcode.MatchcodeComponentType StreetSuffixComp=new mdMUMatchcode.MatchcodeComponentType("StreetSuffixComp",15);
	public final static mdMUMatchcode.MatchcodeComponentType StreetPostDirComp=new mdMUMatchcode.MatchcodeComponentType("StreetPostDirComp",16);
	public final static mdMUMatchcode.MatchcodeComponentType POBoxComp=new mdMUMatchcode.MatchcodeComponentType("POBoxComp",17);
	public final static mdMUMatchcode.MatchcodeComponentType SecondaryComp=new mdMUMatchcode.MatchcodeComponentType("SecondaryComp",18);
	public final static mdMUMatchcode.MatchcodeComponentType AddressComp=new mdMUMatchcode.MatchcodeComponentType("AddressComp",19);
	public final static mdMUMatchcode.MatchcodeComponentType CityComp=new mdMUMatchcode.MatchcodeComponentType("CityComp",20);
	public final static mdMUMatchcode.MatchcodeComponentType StateComp=new mdMUMatchcode.MatchcodeComponentType("StateComp",21);
	public final static mdMUMatchcode.MatchcodeComponentType Zip9Comp=new mdMUMatchcode.MatchcodeComponentType("Zip9Comp",22);
	public final static mdMUMatchcode.MatchcodeComponentType Zip5Comp=new mdMUMatchcode.MatchcodeComponentType("Zip5Comp",23);
	public final static mdMUMatchcode.MatchcodeComponentType Zip4Comp=new mdMUMatchcode.MatchcodeComponentType("Zip4Comp",24);
	public final static mdMUMatchcode.MatchcodeComponentType CountryComp=new mdMUMatchcode.MatchcodeComponentType("CountryComp",28);
	public final static mdMUMatchcode.MatchcodeComponentType CanadianPCComp=new mdMUMatchcode.MatchcodeComponentType("CanadianPCComp",29);
	public final static mdMUMatchcode.MatchcodeComponentType PhoneComp=new mdMUMatchcode.MatchcodeComponentType("PhoneComp",33);
	public final static mdMUMatchcode.MatchcodeComponentType EMailComp=new mdMUMatchcode.MatchcodeComponentType("EMailComp",34);
	public final static mdMUMatchcode.MatchcodeComponentType CreditCardComp=new mdMUMatchcode.MatchcodeComponentType("CreditCardComp",35);
	public final static mdMUMatchcode.MatchcodeComponentType GeneralComp=new mdMUMatchcode.MatchcodeComponentType("GeneralComp",36);
	public final static mdMUMatchcode.MatchcodeComponentType GeoDistanceComp=new mdMUMatchcode.MatchcodeComponentType("GeoDistanceComp",38);
	public final static mdMUMatchcode.MatchcodeComponentType DateComp=new mdMUMatchcode.MatchcodeComponentType("DateComp",39);
	public final static mdMUMatchcode.MatchcodeComponentType NumericComp=new mdMUMatchcode.MatchcodeComponentType("NumericComp",40);
	public final static mdMUMatchcode.MatchcodeComponentType PremisesNumberComp=new mdMUMatchcode.MatchcodeComponentType("PremisesNumberComp",41);
	public final static mdMUMatchcode.MatchcodeComponentType ThoroughfarePreDirComp=new mdMUMatchcode.MatchcodeComponentType("ThoroughfarePreDirComp",42);
	public final static mdMUMatchcode.MatchcodeComponentType ThoroughfareLeadingTypeComp=new mdMUMatchcode.MatchcodeComponentType("ThoroughfareLeadingTypeComp",43);
	public final static mdMUMatchcode.MatchcodeComponentType ThoroughfareNameComp=new mdMUMatchcode.MatchcodeComponentType("ThoroughfareNameComp",44);
	public final static mdMUMatchcode.MatchcodeComponentType ThoroughfarePostDirComp=new mdMUMatchcode.MatchcodeComponentType("ThoroughfarePostDirComp",45);
	public final static mdMUMatchcode.MatchcodeComponentType ThoroughfareTrailingTypeComp=new mdMUMatchcode.MatchcodeComponentType("ThoroughfareTrailingTypeComp",46);
	public final static mdMUMatchcode.MatchcodeComponentType DepThoroughfarePreDirComp=new mdMUMatchcode.MatchcodeComponentType("DepThoroughfarePreDirComp",47);
	public final static mdMUMatchcode.MatchcodeComponentType DepThoroughfareLeadingTypeComp=new mdMUMatchcode.MatchcodeComponentType("DepThoroughfareLeadingTypeComp",48);
	public final static mdMUMatchcode.MatchcodeComponentType DepThoroughfareNameComp=new mdMUMatchcode.MatchcodeComponentType("DepThoroughfareNameComp",49);
	public final static mdMUMatchcode.MatchcodeComponentType DepThoroughfarePostDirComp=new mdMUMatchcode.MatchcodeComponentType("DepThoroughfarePostDirComp",50);
	public final static mdMUMatchcode.MatchcodeComponentType DepThoroughfareTrailingTypeComp=new mdMUMatchcode.MatchcodeComponentType("DepThoroughfareTrailingTypeComp",51);
	public final static mdMUMatchcode.MatchcodeComponentType LocalityComp=new mdMUMatchcode.MatchcodeComponentType("LocalityComp",52);
	public final static mdMUMatchcode.MatchcodeComponentType DependentLocalityComp=new mdMUMatchcode.MatchcodeComponentType("DependentLocalityComp",53);
	public final static mdMUMatchcode.MatchcodeComponentType DblDependentLocalityComp=new mdMUMatchcode.MatchcodeComponentType("DblDependentLocalityComp",54);
	public final static mdMUMatchcode.MatchcodeComponentType AdministrativeAreaComp=new mdMUMatchcode.MatchcodeComponentType("AdministrativeAreaComp",55);
	public final static mdMUMatchcode.MatchcodeComponentType SubAdministrativeAreaComp=new mdMUMatchcode.MatchcodeComponentType("SubAdministrativeAreaComp",56);
	public final static mdMUMatchcode.MatchcodeComponentType PostalCodeComp=new mdMUMatchcode.MatchcodeComponentType("PostalCodeComp",57);
	public final static mdMUMatchcode.MatchcodeComponentType SubNationalAreaComp=new mdMUMatchcode.MatchcodeComponentType("SubNationalAreaComp",58);
	public final static mdMUMatchcode.MatchcodeComponentType PostBoxComp=new mdMUMatchcode.MatchcodeComponentType("PostBoxComp",59);

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
	public final static mdMUMatchcode.MatchcodeStart Left=new mdMUMatchcode.MatchcodeStart("Left",8);
	public final static mdMUMatchcode.MatchcodeStart Right=new mdMUMatchcode.MatchcodeStart("Right",16);
	public final static mdMUMatchcode.MatchcodeStart StartAtPos=new mdMUMatchcode.MatchcodeStart("StartAtPos",32);
	public final static mdMUMatchcode.MatchcodeStart StartAtWord=new mdMUMatchcode.MatchcodeStart("StartAtWord",64);

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
	public final static mdMUMatchcode.MatchcodeTrim LeftTrim=new mdMUMatchcode.MatchcodeTrim("LeftTrim",2);
	public final static mdMUMatchcode.MatchcodeTrim RightTrim=new mdMUMatchcode.MatchcodeTrim("RightTrim",4);
	public final static mdMUMatchcode.MatchcodeTrim AllTrim=new mdMUMatchcode.MatchcodeTrim("AllTrim",6);

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
	public final static mdMUMatchcode.MatchcodeFuzzy Exact=new mdMUMatchcode.MatchcodeFuzzy("Exact",0);
	public final static mdMUMatchcode.MatchcodeFuzzy SoundEx=new mdMUMatchcode.MatchcodeFuzzy("SoundEx",1);
	public final static mdMUMatchcode.MatchcodeFuzzy Phonetex=new mdMUMatchcode.MatchcodeFuzzy("Phonetex",2);
	public final static mdMUMatchcode.MatchcodeFuzzy Containment=new mdMUMatchcode.MatchcodeFuzzy("Containment",4);
	public final static mdMUMatchcode.MatchcodeFuzzy Frequency=new mdMUMatchcode.MatchcodeFuzzy("Frequency",8);
	public final static mdMUMatchcode.MatchcodeFuzzy FastNear=new mdMUMatchcode.MatchcodeFuzzy("FastNear",16);
	public final static mdMUMatchcode.MatchcodeFuzzy AccurateNear=new mdMUMatchcode.MatchcodeFuzzy("AccurateNear",32);
	public final static mdMUMatchcode.MatchcodeFuzzy VowelsOnly=new mdMUMatchcode.MatchcodeFuzzy("VowelsOnly",64);
	public final static mdMUMatchcode.MatchcodeFuzzy ConsonantsOnly=new mdMUMatchcode.MatchcodeFuzzy("ConsonantsOnly",128);
	public final static mdMUMatchcode.MatchcodeFuzzy AlphasOnly=new mdMUMatchcode.MatchcodeFuzzy("AlphasOnly",256);
	public final static mdMUMatchcode.MatchcodeFuzzy NumericsOnly=new mdMUMatchcode.MatchcodeFuzzy("NumericsOnly",512);
	public final static mdMUMatchcode.MatchcodeFuzzy FrequencyNear=new mdMUMatchcode.MatchcodeFuzzy("FrequencyNear",1024);
	public final static mdMUMatchcode.MatchcodeFuzzy NGram=new mdMUMatchcode.MatchcodeFuzzy("NGram",2048);
	public final static mdMUMatchcode.MatchcodeFuzzy Jaro=new mdMUMatchcode.MatchcodeFuzzy("Jaro",4096);
	public final static mdMUMatchcode.MatchcodeFuzzy JaroWinkler=new mdMUMatchcode.MatchcodeFuzzy("JaroWinkler",8192);
	public final static mdMUMatchcode.MatchcodeFuzzy LCS=new mdMUMatchcode.MatchcodeFuzzy("LCS",16384);
	public final static mdMUMatchcode.MatchcodeFuzzy NeedlemanWunsch=new mdMUMatchcode.MatchcodeFuzzy("NeedlemanWunsch",32768);
	public final static mdMUMatchcode.MatchcodeFuzzy MDKeyboard=new mdMUMatchcode.MatchcodeFuzzy("MDKeyboard",65536);
	public final static mdMUMatchcode.MatchcodeFuzzy SmithWatermanGotoh=new mdMUMatchcode.MatchcodeFuzzy("SmithWatermanGotoh",131072);
	public final static mdMUMatchcode.MatchcodeFuzzy Dice=new mdMUMatchcode.MatchcodeFuzzy("Dice",262144);
	public final static mdMUMatchcode.MatchcodeFuzzy Jaccard=new mdMUMatchcode.MatchcodeFuzzy("Jaccard",524288);
	public final static mdMUMatchcode.MatchcodeFuzzy Overlap=new mdMUMatchcode.MatchcodeFuzzy("Overlap",1048576);
	public final static mdMUMatchcode.MatchcodeFuzzy DoubleMetaphone=new mdMUMatchcode.MatchcodeFuzzy("DoubleMetaphone",2097152);
	public final static mdMUMatchcode.MatchcodeFuzzy UTF8Near=new mdMUMatchcode.MatchcodeFuzzy("UTF8Near",4194304);

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
	public final static mdMUMatchcode.MatchcodeFieldMatch NoFieldMatch=new mdMUMatchcode.MatchcodeFieldMatch("NoFieldMatch",0);
	public final static mdMUMatchcode.MatchcodeFieldMatch BothBlankMatch=new mdMUMatchcode.MatchcodeFieldMatch("BothBlankMatch",256);
	public final static mdMUMatchcode.MatchcodeFieldMatch OneBlankMatch=new mdMUMatchcode.MatchcodeFieldMatch("OneBlankMatch",512);
	public final static mdMUMatchcode.MatchcodeFieldMatch InitialMatch=new mdMUMatchcode.MatchcodeFieldMatch("InitialMatch",1024);

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
	public final static mdMUMatchcode.MatchcodeSwap NoSwap=new mdMUMatchcode.MatchcodeSwap("NoSwap",0);
	public final static mdMUMatchcode.MatchcodeSwap SwapA=new mdMUMatchcode.MatchcodeSwap("SwapA",1);
	public final static mdMUMatchcode.MatchcodeSwap SwapB=new mdMUMatchcode.MatchcodeSwap("SwapB",2);
	public final static mdMUMatchcode.MatchcodeSwap SwapC=new mdMUMatchcode.MatchcodeSwap("SwapC",4);
	public final static mdMUMatchcode.MatchcodeSwap SwapD=new mdMUMatchcode.MatchcodeSwap("SwapD",8);
	public final static mdMUMatchcode.MatchcodeSwap SwapE=new mdMUMatchcode.MatchcodeSwap("SwapE",16);
	public final static mdMUMatchcode.MatchcodeSwap SwapF=new mdMUMatchcode.MatchcodeSwap("SwapF",32);
	public final static mdMUMatchcode.MatchcodeSwap SwapG=new mdMUMatchcode.MatchcodeSwap("SwapG",64);
	public final static mdMUMatchcode.MatchcodeSwap SwapH=new mdMUMatchcode.MatchcodeSwap("SwapH",128);
	public final static mdMUMatchcode.MatchcodeSwap BothA=new mdMUMatchcode.MatchcodeSwap("BothA",256);
	public final static mdMUMatchcode.MatchcodeSwap BothB=new mdMUMatchcode.MatchcodeSwap("BothB",512);
	public final static mdMUMatchcode.MatchcodeSwap BothC=new mdMUMatchcode.MatchcodeSwap("BothC",1024);
	public final static mdMUMatchcode.MatchcodeSwap BothD=new mdMUMatchcode.MatchcodeSwap("BothD",2048);
	public final static mdMUMatchcode.MatchcodeSwap BothE=new mdMUMatchcode.MatchcodeSwap("BothE",4096);
	public final static mdMUMatchcode.MatchcodeSwap BothF=new mdMUMatchcode.MatchcodeSwap("BothF",8192);
	public final static mdMUMatchcode.MatchcodeSwap BothG=new mdMUMatchcode.MatchcodeSwap("BothG",16384);
	public final static mdMUMatchcode.MatchcodeSwap BothH=new mdMUMatchcode.MatchcodeSwap("BothH",32768);

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
	public final static mdMUMatchcode.MatchcodeCombination Combo1=new mdMUMatchcode.MatchcodeCombination("Combo1",1);
	public final static mdMUMatchcode.MatchcodeCombination Combo2=new mdMUMatchcode.MatchcodeCombination("Combo2",2);
	public final static mdMUMatchcode.MatchcodeCombination Combo3=new mdMUMatchcode.MatchcodeCombination("Combo3",4);
	public final static mdMUMatchcode.MatchcodeCombination Combo4=new mdMUMatchcode.MatchcodeCombination("Combo4",8);
	public final static mdMUMatchcode.MatchcodeCombination Combo5=new mdMUMatchcode.MatchcodeCombination("Combo5",16);
	public final static mdMUMatchcode.MatchcodeCombination Combo6=new mdMUMatchcode.MatchcodeCombination("Combo6",32);
	public final static mdMUMatchcode.MatchcodeCombination Combo7=new mdMUMatchcode.MatchcodeCombination("Combo7",64);
	public final static mdMUMatchcode.MatchcodeCombination Combo8=new mdMUMatchcode.MatchcodeCombination("Combo8",128);
	public final static mdMUMatchcode.MatchcodeCombination Combo9=new mdMUMatchcode.MatchcodeCombination("Combo9",256);
	public final static mdMUMatchcode.MatchcodeCombination Combo10=new mdMUMatchcode.MatchcodeCombination("Combo10",512);
	public final static mdMUMatchcode.MatchcodeCombination Combo11=new mdMUMatchcode.MatchcodeCombination("Combo11",1024);
	public final static mdMUMatchcode.MatchcodeCombination Combo12=new mdMUMatchcode.MatchcodeCombination("Combo12",2048);
	public final static mdMUMatchcode.MatchcodeCombination Combo13=new mdMUMatchcode.MatchcodeCombination("Combo13",4096);
	public final static mdMUMatchcode.MatchcodeCombination Combo14=new mdMUMatchcode.MatchcodeCombination("Combo14",8192);
	public final static mdMUMatchcode.MatchcodeCombination Combo15=new mdMUMatchcode.MatchcodeCombination("Combo15",16384);
	public final static mdMUMatchcode.MatchcodeCombination Combo16=new mdMUMatchcode.MatchcodeCombination("Combo16",32768);

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
	public final static mdMUMatchcode.MatchcodeMappingTarget PrefixType=new mdMUMatchcode.MatchcodeMappingTarget("PrefixType",1);
	public final static mdMUMatchcode.MatchcodeMappingTarget FirstType=new mdMUMatchcode.MatchcodeMappingTarget("FirstType",2);
	public final static mdMUMatchcode.MatchcodeMappingTarget MiddleType=new mdMUMatchcode.MatchcodeMappingTarget("MiddleType",3);
	public final static mdMUMatchcode.MatchcodeMappingTarget LastType=new mdMUMatchcode.MatchcodeMappingTarget("LastType",4);
	public final static mdMUMatchcode.MatchcodeMappingTarget SuffixType=new mdMUMatchcode.MatchcodeMappingTarget("SuffixType",5);
	public final static mdMUMatchcode.MatchcodeMappingTarget GenderType=new mdMUMatchcode.MatchcodeMappingTarget("GenderType",6);
	public final static mdMUMatchcode.MatchcodeMappingTarget FirstNicknameType=new mdMUMatchcode.MatchcodeMappingTarget("FirstNicknameType",7);
	public final static mdMUMatchcode.MatchcodeMappingTarget MiddleNicknameType=new mdMUMatchcode.MatchcodeMappingTarget("MiddleNicknameType",8);
	public final static mdMUMatchcode.MatchcodeMappingTarget TitleType=new mdMUMatchcode.MatchcodeMappingTarget("TitleType",9);
	public final static mdMUMatchcode.MatchcodeMappingTarget CompanyType=new mdMUMatchcode.MatchcodeMappingTarget("CompanyType",10);
	public final static mdMUMatchcode.MatchcodeMappingTarget CompanyAcronymType=new mdMUMatchcode.MatchcodeMappingTarget("CompanyAcronymType",11);
	public final static mdMUMatchcode.MatchcodeMappingTarget AddressType=new mdMUMatchcode.MatchcodeMappingTarget("AddressType",12);
	public final static mdMUMatchcode.MatchcodeMappingTarget CityType=new mdMUMatchcode.MatchcodeMappingTarget("CityType",13);
	public final static mdMUMatchcode.MatchcodeMappingTarget StateType=new mdMUMatchcode.MatchcodeMappingTarget("StateType",14);
	public final static mdMUMatchcode.MatchcodeMappingTarget Zip9Type=new mdMUMatchcode.MatchcodeMappingTarget("Zip9Type",15);
	public final static mdMUMatchcode.MatchcodeMappingTarget Zip5Type=new mdMUMatchcode.MatchcodeMappingTarget("Zip5Type",16);
	public final static mdMUMatchcode.MatchcodeMappingTarget Zip4Type=new mdMUMatchcode.MatchcodeMappingTarget("Zip4Type",17);
	public final static mdMUMatchcode.MatchcodeMappingTarget CountryType=new mdMUMatchcode.MatchcodeMappingTarget("CountryType",18);
	public final static mdMUMatchcode.MatchcodeMappingTarget CanadianPCType=new mdMUMatchcode.MatchcodeMappingTarget("CanadianPCType",19);
	public final static mdMUMatchcode.MatchcodeMappingTarget PhoneType=new mdMUMatchcode.MatchcodeMappingTarget("PhoneType",23);
	public final static mdMUMatchcode.MatchcodeMappingTarget EMailType=new mdMUMatchcode.MatchcodeMappingTarget("EMailType",24);
	public final static mdMUMatchcode.MatchcodeMappingTarget CreditCardType=new mdMUMatchcode.MatchcodeMappingTarget("CreditCardType",25);
	public final static mdMUMatchcode.MatchcodeMappingTarget GeneralType=new mdMUMatchcode.MatchcodeMappingTarget("GeneralType",26);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address1Type=new mdMUMatchcode.MatchcodeMappingTarget("Address1Type",28);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address2Type=new mdMUMatchcode.MatchcodeMappingTarget("Address2Type",29);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address3Type=new mdMUMatchcode.MatchcodeMappingTarget("Address3Type",30);
	public final static mdMUMatchcode.MatchcodeMappingTarget LatitudeType=new mdMUMatchcode.MatchcodeMappingTarget("LatitudeType",34);
	public final static mdMUMatchcode.MatchcodeMappingTarget LongitudeType=new mdMUMatchcode.MatchcodeMappingTarget("LongitudeType",35);
	public final static mdMUMatchcode.MatchcodeMappingTarget DateType=new mdMUMatchcode.MatchcodeMappingTarget("DateType",36);
	public final static mdMUMatchcode.MatchcodeMappingTarget NumericType=new mdMUMatchcode.MatchcodeMappingTarget("NumericType",37);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address4Type=new mdMUMatchcode.MatchcodeMappingTarget("Address4Type",38);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address5Type=new mdMUMatchcode.MatchcodeMappingTarget("Address5Type",39);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address6Type=new mdMUMatchcode.MatchcodeMappingTarget("Address6Type",40);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address7Type=new mdMUMatchcode.MatchcodeMappingTarget("Address7Type",41);
	public final static mdMUMatchcode.MatchcodeMappingTarget Address8Type=new mdMUMatchcode.MatchcodeMappingTarget("Address8Type",42);

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
	public final static mdMUMatchcode.MatchcodeStatus MCNoError=new mdMUMatchcode.MatchcodeStatus("MCNoError",0);
	public final static mdMUMatchcode.MatchcodeStatus MCFirstComponentFuzzyOptions=new mdMUMatchcode.MatchcodeStatus("MCFirstComponentFuzzyOptions",1);
	public final static mdMUMatchcode.MatchcodeStatus MCFirstComponentNoSwapPair=new mdMUMatchcode.MatchcodeStatus("MCFirstComponentNoSwapPair",2);
	public final static mdMUMatchcode.MatchcodeStatus MCDataTypeNoFuzzy=new mdMUMatchcode.MatchcodeStatus("MCDataTypeNoFuzzy",3);
	public final static mdMUMatchcode.MatchcodeStatus MCComponentFuzzyIncorrectSize=new mdMUMatchcode.MatchcodeStatus("MCComponentFuzzyIncorrectSize",4);
	public final static mdMUMatchcode.MatchcodeStatus MCDataTypeNoMaximumNumberWords=new mdMUMatchcode.MatchcodeStatus("MCDataTypeNoMaximumNumberWords",5);
	public final static mdMUMatchcode.MatchcodeStatus MCDataTypeNoStartRightOrWordOrPos=new mdMUMatchcode.MatchcodeStatus("MCDataTypeNoStartRightOrWordOrPos",6);
	public final static mdMUMatchcode.MatchcodeStatus MCIncorrectMaximumNumberWords=new mdMUMatchcode.MatchcodeStatus("MCIncorrectMaximumNumberWords",7);
	public final static mdMUMatchcode.MatchcodeStatus MCNearOutOfRange=new mdMUMatchcode.MatchcodeStatus("MCNearOutOfRange",8);
	public final static mdMUMatchcode.MatchcodeStatus MCFirstComponentNotUsedInEveryCondition=new mdMUMatchcode.MatchcodeStatus("MCFirstComponentNotUsedInEveryCondition",9);
	public final static mdMUMatchcode.MatchcodeStatus MCCannotChangeFirstComponent=new mdMUMatchcode.MatchcodeStatus("MCCannotChangeFirstComponent",10);
	public final static mdMUMatchcode.MatchcodeStatus MCInvalidSwapPair=new mdMUMatchcode.MatchcodeStatus("MCInvalidSwapPair",11);
	public final static mdMUMatchcode.MatchcodeStatus MCIncorrectStartPosOrStartWord=new mdMUMatchcode.MatchcodeStatus("MCIncorrectStartPosOrStartWord",12);
	public final static mdMUMatchcode.MatchcodeStatus MCInvalidMatchcodeComponentType=new mdMUMatchcode.MatchcodeStatus("MCInvalidMatchcodeComponentType",13);

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
	public final static mdMUMatchcode.MatchcodeMapping Prefix=new mdMUMatchcode.MatchcodeMapping("Prefix",1);
	public final static mdMUMatchcode.MatchcodeMapping Gender=new mdMUMatchcode.MatchcodeMapping("Gender",2);
	public final static mdMUMatchcode.MatchcodeMapping First=new mdMUMatchcode.MatchcodeMapping("First",3);
	public final static mdMUMatchcode.MatchcodeMapping MixedFirst=new mdMUMatchcode.MatchcodeMapping("MixedFirst",4);
	public final static mdMUMatchcode.MatchcodeMapping Middle=new mdMUMatchcode.MatchcodeMapping("Middle",5);
	public final static mdMUMatchcode.MatchcodeMapping Last=new mdMUMatchcode.MatchcodeMapping("Last",6);
	public final static mdMUMatchcode.MatchcodeMapping MixedLast=new mdMUMatchcode.MatchcodeMapping("MixedLast",7);
	public final static mdMUMatchcode.MatchcodeMapping Suffix=new mdMUMatchcode.MatchcodeMapping("Suffix",8);
	public final static mdMUMatchcode.MatchcodeMapping FullName=new mdMUMatchcode.MatchcodeMapping("FullName",9);
	public final static mdMUMatchcode.MatchcodeMapping InverseName=new mdMUMatchcode.MatchcodeMapping("InverseName",10);
	public final static mdMUMatchcode.MatchcodeMapping GovernmentInverseName=new mdMUMatchcode.MatchcodeMapping("GovernmentInverseName",11);
	public final static mdMUMatchcode.MatchcodeMapping Title=new mdMUMatchcode.MatchcodeMapping("Title",12);
	public final static mdMUMatchcode.MatchcodeMapping Company=new mdMUMatchcode.MatchcodeMapping("Company",13);
	public final static mdMUMatchcode.MatchcodeMapping Address=new mdMUMatchcode.MatchcodeMapping("Address",14);
	public final static mdMUMatchcode.MatchcodeMapping City=new mdMUMatchcode.MatchcodeMapping("City",15);
	public final static mdMUMatchcode.MatchcodeMapping State=new mdMUMatchcode.MatchcodeMapping("State",16);
	public final static mdMUMatchcode.MatchcodeMapping Zip9=new mdMUMatchcode.MatchcodeMapping("Zip9",17);
	public final static mdMUMatchcode.MatchcodeMapping Zip5=new mdMUMatchcode.MatchcodeMapping("Zip5",18);
	public final static mdMUMatchcode.MatchcodeMapping Zip4=new mdMUMatchcode.MatchcodeMapping("Zip4",19);
	public final static mdMUMatchcode.MatchcodeMapping CityStZip=new mdMUMatchcode.MatchcodeMapping("CityStZip",20);
	public final static mdMUMatchcode.MatchcodeMapping Country=new mdMUMatchcode.MatchcodeMapping("Country",21);
	public final static mdMUMatchcode.MatchcodeMapping CanadianPostalCode=new mdMUMatchcode.MatchcodeMapping("CanadianPostalCode",22);
	public final static mdMUMatchcode.MatchcodeMapping Phone=new mdMUMatchcode.MatchcodeMapping("Phone",27);
	public final static mdMUMatchcode.MatchcodeMapping EMail=new mdMUMatchcode.MatchcodeMapping("EMail",28);
	public final static mdMUMatchcode.MatchcodeMapping CreditCard=new mdMUMatchcode.MatchcodeMapping("CreditCard",29);
	public final static mdMUMatchcode.MatchcodeMapping General=new mdMUMatchcode.MatchcodeMapping("General",30);
	public final static mdMUMatchcode.MatchcodeMapping Latitude=new mdMUMatchcode.MatchcodeMapping("Latitude",40);
	public final static mdMUMatchcode.MatchcodeMapping Longitude=new mdMUMatchcode.MatchcodeMapping("Longitude",41);
	public final static mdMUMatchcode.MatchcodeMapping Date=new mdMUMatchcode.MatchcodeMapping("Date",42);
	public final static mdMUMatchcode.MatchcodeMapping Numeric=new mdMUMatchcode.MatchcodeMapping("Numeric",43);

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
	public final static mdMUMatchcode.MatchcodeNearType NearNone=new mdMUMatchcode.MatchcodeNearType("NearNone",0);
	public final static mdMUMatchcode.MatchcodeNearType NearInteger=new mdMUMatchcode.MatchcodeNearType("NearInteger",1);
	public final static mdMUMatchcode.MatchcodeNearType NearFloat=new mdMUMatchcode.MatchcodeNearType("NearFloat",2);

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
	public final static mdMUMatchcode.ComponentCountryType US=new mdMUMatchcode.ComponentCountryType("US",1);
	public final static mdMUMatchcode.ComponentCountryType Canada=new mdMUMatchcode.ComponentCountryType("Canada",2);
	public final static mdMUMatchcode.ComponentCountryType Global=new mdMUMatchcode.ComponentCountryType("Global",4);
	public final static mdMUMatchcode.ComponentCountryType Domestic=new mdMUMatchcode.ComponentCountryType("Domestic",3);

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



	protected mdMUMatchcode(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdMUMatchcode() {
		this(mdMUMatchcodeJNI.mdMUMatchcodeCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdMUMatchcodeJNI.mdMUMatchcodeDestroy(I);
			}
			I=0;
		}
	}

	public void SetPathToMatchUpFiles(String Path) {
		mdMUMatchcodeJNI.SetPathToMatchUpFiles(I,Path);
	}

	public ProgramStatus InitializeDataFiles() {
		return ProgramStatus.toEnum(mdMUMatchcodeJNI.InitializeDataFiles(I));
	}

	public String GetInitializeErrorString() {
		return mdMUMatchcodeJNI.GetInitializeErrorString(I);
	}

	public int FindMatchcode(String Matchcode) {
		return mdMUMatchcodeJNI.FindMatchcode(I,Matchcode);
	}

	public String GetMatchcodeName() {
		return mdMUMatchcodeJNI.GetMatchcodeName(I);
	}

	public void SetDescription(String Description) {
		mdMUMatchcodeJNI.SetDescription(I,Description);
	}

	public String GetDescription() {
		return mdMUMatchcodeJNI.GetDescription(I);
	}

	public void SetNGram(int NGram) {
		mdMUMatchcodeJNI.SetNGram(I,NGram);
	}

	public int GetNGram() {
		return mdMUMatchcodeJNI.GetNGram(I);
	}

	public int GetMatchcodeItemCount() {
		return mdMUMatchcodeJNI.GetMatchcodeItemCount(I);
	}

	public long GetMatchcodeItem(int Pos) {
		return mdMUMatchcodeJNI.GetMatchcodeItem(I,Pos);
	}

	public int GetMappingItemCount() {
		return mdMUMatchcodeJNI.GetMappingItemCount(I);
	}

	public MatchcodeMappingTarget GetMappingItemType(int Pos) {
		return MatchcodeMappingTarget.toEnum(mdMUMatchcodeJNI.GetMappingItemType(I,Pos));
	}

	public String GetMappingItemLabel(int Pos) {
		return mdMUMatchcodeJNI.GetMappingItemLabel(I,Pos);
	}

	public MatchcodeStatus DeleteMatchcodeItem(int Pos) {
		return MatchcodeStatus.toEnum(mdMUMatchcodeJNI.DeleteMatchcodeItem(I,Pos));
	}

	public int RenameMatchcode(String Name) {
		return mdMUMatchcodeJNI.RenameMatchcode(I,Name);
	}

	public int DeleteMatchcode() {
		return mdMUMatchcodeJNI.DeleteMatchcode(I);
	}

	public void Save() {
		mdMUMatchcodeJNI.Save(I);
	}

	public void SaveToFile(String Path) {
		mdMUMatchcodeJNI.SaveToFile(I,Path);
	}

	public int CreateNewMatchcode(String Matchcode) {
		return mdMUMatchcodeJNI.CreateNewMatchcode(I,Matchcode);
	}

	public String GetRuleDescription(int Rule_, int Abbreviated_) {
		return mdMUMatchcodeJNI.GetRuleDescription(I,Rule_,Abbreviated_);
	}

	public int GetMaximumCombinations() {
		return mdMUMatchcodeJNI.GetMaximumCombinations(I);
	}

	public int GetAllowedInputMappingCount(mdMUMatchcode.MatchcodeMappingTarget Mapping_) {
		return mdMUMatchcodeJNI.GetAllowedInputMappingCount(I,Mapping_.toValue());
	}

	public MatchcodeMapping GetAllowedInputMappingType(mdMUMatchcode.MatchcodeMappingTarget Mapping_, int Pos_) {
		return MatchcodeMapping.toEnum(mdMUMatchcodeJNI.GetAllowedInputMappingType(I,Mapping_.toValue(),Pos_));
	}

	public String GetAllowedInputMappingLabel(mdMUMatchcode.MatchcodeMappingTarget Mapping_, int Pos_) {
		return mdMUMatchcodeJNI.GetAllowedInputMappingLabel(I,Mapping_.toValue(),Pos_);
	}

	public String GetInputMappingLabel(mdMUMatchcode.MatchcodeMapping Mapping_) {
		return mdMUMatchcodeJNI.GetInputMappingLabel(I,Mapping_.toValue());
	}

	public MatchcodeMapping ParseInputMappingLabel(String Value_) {
		return MatchcodeMapping.toEnum(mdMUMatchcodeJNI.ParseInputMappingLabel(I,Value_));
	}

	public MatchcodeMapping GetBestInputMappingType(mdMUMatchcode.MatchcodeMappingTarget Target_) {
		return MatchcodeMapping.toEnum(mdMUMatchcodeJNI.GetBestInputMappingType(I,Target_.toValue()));
	}

	public int IsDirectConversion(mdMUMatchcode.MatchcodeMapping Source_, mdMUMatchcode.MatchcodeMappingTarget Target_) {
		return mdMUMatchcodeJNI.IsDirectConversion(I,Source_.toValue(),Target_.toValue());
	}

	public int IsConvertable(mdMUMatchcode.MatchcodeMapping Source_, mdMUMatchcode.MatchcodeMappingTarget Target_) {
		return mdMUMatchcodeJNI.IsConvertable(I,Source_.toValue(),Target_.toValue());
	}

	public String GetInputMappingEnum() {
		return mdMUMatchcodeJNI.GetInputMappingEnum(I);
	}

	public void SetReserved(String Property, String Value) {
		mdMUMatchcodeJNI.SetReserved(I,Property,Value);
	}

	public String GetReserved(String Property) {
		return mdMUMatchcodeJNI.GetReserved(I,Property);
	}

}
