#include <jni.h>

#include "mdMatchup.h"

class Utf8String {
	private:
		JNIEnv* env;
		const char* utf8Ptr;
		jstring jString;
	public:
		Utf8String(JNIEnv* jEnv,jstring str);
		~Utf8String();
		const char* GetUtf8Ptr();
};

Utf8String::Utf8String(JNIEnv* jEnv,jstring str) {
	env=jEnv;
	jString=str;
	if (jString!=0)
		utf8Ptr=env->GetStringUTFChars(jString,0);
	else
		utf8Ptr=0;
}

Utf8String::~Utf8String() {
	if (utf8Ptr!=0)
		env->ReleaseStringUTFChars(jString,utf8Ptr);
}

const char* Utf8String::GetUtf8Ptr() {
	if (utf8Ptr!=0)
		return utf8Ptr;
	return "";
}

jstring UnicodeString(JNIEnv* jEnv,const char* str) {
	if (str!=0)
		return jEnv->NewStringUTF(str);
	return jEnv->NewStringUTF("");
}



extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_mdMUMatchcodeComponentCreate(JNIEnv* /*jEnv*/,jclass /*jCls*/) {
	return (jlong) new mdMUMatchcodeComponent();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_mdMUMatchcodeComponentDestroy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	delete (mdMUMatchcodeComponent*) I;
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetComponentType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetComponentType();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetComponentType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Type) {
	((mdMUMatchcodeComponent*) I)->SetComponentType((mdMUMatchcodeComponent::MatchcodeComponentType) Type);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetSize();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Size) {
	((mdMUMatchcodeComponent*) I)->SetSize((int) Size);
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetLabel(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetLabel());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetLabel(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Label) {
	Utf8String _Label(jEnv,Label);
	((mdMUMatchcodeComponent*) I)->SetLabel(_Label.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetWordCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetWordCount();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetWordCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint WordCount) {
	((mdMUMatchcodeComponent*) I)->SetWordCount((int) WordCount);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetStart(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetStart();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetStart(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Start) {
	((mdMUMatchcodeComponent*) I)->SetStart((mdMUMatchcodeComponent::MatchcodeStart) Start);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetStartPos(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetStartPos();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetStartPos(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint StartPos) {
	((mdMUMatchcodeComponent*) I)->SetStartPos((int) StartPos);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetTrim(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetTrim();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetTrim(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Trim) {
	((mdMUMatchcodeComponent*) I)->SetTrim((mdMUMatchcodeComponent::MatchcodeTrim) Trim);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFuzzy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetFuzzy();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetFuzzy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Fuzzy) {
	((mdMUMatchcodeComponent*) I)->SetFuzzy((mdMUMatchcodeComponent::MatchcodeFuzzy) Fuzzy);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetNear(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetNear();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetNear(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Near) {
	((mdMUMatchcodeComponent*) I)->SetNear((int) Near);
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetNearDbl(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jdouble) ((mdMUMatchcodeComponent*) I)->GetNearDbl();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetNearDbl(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jdouble Near) {
	((mdMUMatchcodeComponent*) I)->SetNearDbl((double) Near);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFieldMatch(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetFieldMatch();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetFieldMatch(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Match) {
	((mdMUMatchcodeComponent*) I)->SetFieldMatch((mdMUMatchcodeComponent::MatchcodeFieldMatch) Match);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetSwap(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetSwap();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetSwap(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Swap) {
	((mdMUMatchcodeComponent*) I)->SetSwap((mdMUMatchcodeComponent::MatchcodeSwap) Swap);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetCombination(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetCombination();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetCombination(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Combination) {
	((mdMUMatchcodeComponent*) I)->SetCombination((mdMUMatchcodeComponent::MatchcodeCombination) Combination);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetComponentCountryTypeFromEnum(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Value) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetComponentCountryTypeFromEnum((mdMUMatchcodeComponent::MatchcodeComponentType) Value);
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetComponentDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint UseLabel) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetComponentDescription((int) UseLabel));
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetComponentDescriptionFromEnum(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Value) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetComponentDescriptionFromEnum((mdMUMatchcodeComponent::MatchcodeComponentType) Value));
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetComponentAbbreviation(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetComponentAbbreviation());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseComponentDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseComponentDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetSizeDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetSizeDescription());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseSizeDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseSizeDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseWordCountDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseWordCountDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetStartDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetStartDescription());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseStartDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseStartDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseStartPosDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseStartPosDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFuzzyDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Decorated) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetFuzzyDescription((int) Decorated));
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFuzzyDescriptionFromEnum(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Value) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetFuzzyDescriptionFromEnum((mdMUMatchcodeComponent::MatchcodeFuzzy) Value));
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseFuzzyDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseFuzzyDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseNearDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jdouble) ((mdMUMatchcodeComponent*) I)->ParseNearDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFieldMatchDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetFieldMatchDescription());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_ParseFieldMatchDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value) {
	Utf8String _Value(jEnv,Value);
	return (jint) ((mdMUMatchcodeComponent*) I)->ParseFieldMatchDescription(_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetSwapDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetSwapDescription());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeComponentType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeComponentType();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeLabel(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeLabel();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeSize();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeWordCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeWordCount();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeStart(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeStart();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeTrim(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeTrim();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_CanChangeFuzzy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->CanChangeFuzzy();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetSizeMinimum(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetSizeMinimum();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetSizeMaximum(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetSizeMaximum();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetAllowedStarts(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetAllowedStarts();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetAllowedFuzzies(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetAllowedFuzzies();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_IsAllowedFuzzy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Value) {
	return (jint) ((mdMUMatchcodeComponent*) I)->IsAllowedFuzzy((mdMUMatchcodeComponent::MatchcodeFuzzy) Value);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFuzzyNearType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetFuzzyNearType();
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetNearMinimum(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jdouble) ((mdMUMatchcodeComponent*) I)->GetNearMinimum();
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetNearMaximum(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jdouble) ((mdMUMatchcodeComponent*) I)->GetNearMaximum();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetAllowedFieldMatches(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetAllowedFieldMatches();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetAllowedCombinations(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetAllowedCombinations();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetAllowedSwaps(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeComponent*) I)->GetAllowedSwaps();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetComponentTypeEnum(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetComponentTypeEnum());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetFuzzyEnum(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetFuzzyEnum());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_SetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property,jstring Value) {
	Utf8String _Property(jEnv,Property);
	Utf8String _Value(jEnv,Value);
	((mdMUMatchcodeComponent*) I)->SetReserved(_Property.GetUtf8Ptr(),_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeComponentJNI_GetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property) {
	Utf8String _Property(jEnv,Property);
	return UnicodeString(jEnv,((mdMUMatchcodeComponent*) I)->GetReserved(_Property.GetUtf8Ptr()));
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_mdMUMatchcodeListCreate(JNIEnv* /*jEnv*/,jclass /*jCls*/) {
	return (jlong) new mdMUMatchcodeList();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_mdMUMatchcodeListDestroy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	delete (mdMUMatchcodeList*) I;
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_SetPathToMatchUpFiles(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Path) {
	Utf8String _Path(jEnv,Path);
	((mdMUMatchcodeList*) I)->SetPathToMatchUpFiles(_Path.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_InitializeDataFiles(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeList*) I)->InitializeDataFiles();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_GetInitializeErrorString(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcodeList*) I)->GetInitializeErrorString());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_GetMatchcodeCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcodeList*) I)->GetMatchcodeCount();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeListJNI_GetMatchcodeName(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Pos) {
	return UnicodeString(jEnv,((mdMUMatchcodeList*) I)->GetMatchcodeName((int) Pos));
}



extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUMatchcodeJNI_mdMUMatchcodeCreate(JNIEnv* /*jEnv*/,jclass /*jCls*/) {
	return (jlong) new mdMUMatchcode();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_mdMUMatchcodeDestroy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	delete (mdMUMatchcode*) I;
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_SetPathToMatchUpFiles(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Path) {
	Utf8String _Path(jEnv,Path);
	((mdMUMatchcode*) I)->SetPathToMatchUpFiles(_Path.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_InitializeDataFiles(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcode*) I)->InitializeDataFiles();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetInitializeErrorString(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetInitializeErrorString());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_FindMatchcode(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Matchcode) {
	Utf8String _Matchcode(jEnv,Matchcode);
	return (jint) ((mdMUMatchcode*) I)->FindMatchcode(_Matchcode.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMatchcodeName(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetMatchcodeName());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_SetDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Description) {
	Utf8String _Description(jEnv,Description);
	((mdMUMatchcode*) I)->SetDescription(_Description.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetDescription());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_SetNGram(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint NGram) {
	((mdMUMatchcode*) I)->SetNGram((int) NGram);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetNGram(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcode*) I)->GetNGram();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMatchcodeItemCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcode*) I)->GetMatchcodeItemCount();
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMatchcodeItem(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Pos) {
	return (jlong) ((mdMUMatchcode*) I)->GetMatchcodeItem((int) Pos);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMappingItemCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcode*) I)->GetMappingItemCount();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMappingItemType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Pos) {
	return (jint) ((mdMUMatchcode*) I)->GetMappingItemType((int) Pos);
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMappingItemLabel(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Pos) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetMappingItemLabel((int) Pos));
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_DeleteMatchcodeItem(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Pos) {
	return (jint) ((mdMUMatchcode*) I)->DeleteMatchcodeItem((int) Pos);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_RenameMatchcode(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Name) {
	Utf8String _Name(jEnv,Name);
	return (jint) ((mdMUMatchcode*) I)->RenameMatchcode(_Name.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_DeleteMatchcode(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcode*) I)->DeleteMatchcode();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_Save(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUMatchcode*) I)->Save();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_SaveToFile(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Path) {
	Utf8String _Path(jEnv,Path);
	((mdMUMatchcode*) I)->SaveToFile(_Path.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_CreateNewMatchcode(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Matchcode) {
	Utf8String _Matchcode(jEnv,Matchcode);
	return (jint) ((mdMUMatchcode*) I)->CreateNewMatchcode(_Matchcode.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetRuleDescription(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Rule_,jint Abbreviated_) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetRuleDescription((int) Rule_,(int) Abbreviated_));
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetMaximumCombinations(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUMatchcode*) I)->GetMaximumCombinations();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetAllowedInputMappingCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Mapping_) {
	return (jint) ((mdMUMatchcode*) I)->GetAllowedInputMappingCount((mdMUMatchcode::MatchcodeMappingTarget) Mapping_);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetAllowedInputMappingType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Mapping_,jint Pos_) {
	return (jint) ((mdMUMatchcode*) I)->GetAllowedInputMappingType((mdMUMatchcode::MatchcodeMappingTarget) Mapping_,(int) Pos_);
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetAllowedInputMappingLabel(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Mapping_,jint Pos_) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetAllowedInputMappingLabel((mdMUMatchcode::MatchcodeMappingTarget) Mapping_,(int) Pos_));
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetInputMappingLabel(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jint Mapping_) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetInputMappingLabel((mdMUMatchcode::MatchcodeMapping) Mapping_));
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_ParseInputMappingLabel(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Value_) {
	Utf8String _Value_(jEnv,Value_);
	return (jint) ((mdMUMatchcode*) I)->ParseInputMappingLabel(_Value_.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetBestInputMappingType(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Target_) {
	return (jint) ((mdMUMatchcode*) I)->GetBestInputMappingType((mdMUMatchcode::MatchcodeMappingTarget) Target_);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_IsDirectConversion(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Source_,jint Target_) {
	return (jint) ((mdMUMatchcode*) I)->IsDirectConversion((mdMUMatchcode::MatchcodeMapping) Source_,(mdMUMatchcode::MatchcodeMappingTarget) Target_);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUMatchcodeJNI_IsConvertable(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Source_,jint Target_) {
	return (jint) ((mdMUMatchcode*) I)->IsConvertable((mdMUMatchcode::MatchcodeMapping) Source_,(mdMUMatchcode::MatchcodeMappingTarget) Target_);
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetInputMappingEnum(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetInputMappingEnum());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUMatchcodeJNI_SetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property,jstring Value) {
	Utf8String _Property(jEnv,Property);
	Utf8String _Value(jEnv,Value);
	((mdMUMatchcode*) I)->SetReserved(_Property.GetUtf8Ptr(),_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUMatchcodeJNI_GetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property) {
	Utf8String _Property(jEnv,Property);
	return UnicodeString(jEnv,((mdMUMatchcode*) I)->GetReserved(_Property.GetUtf8Ptr()));
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUReadWriteJNI_mdMUReadWriteCreate(JNIEnv* /*jEnv*/,jclass /*jCls*/) {
	return (jlong) new mdMUReadWrite();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_mdMUReadWriteDestroy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	delete (mdMUReadWrite*) I;
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetPathToMatchUpFiles(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Path) {
	Utf8String _Path(jEnv,Path);
	((mdMUReadWrite*) I)->SetPathToMatchUpFiles(_Path.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetMatchcodeName(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring MatchcodeName) {
	Utf8String _MatchcodeName(jEnv,MatchcodeName);
	((mdMUReadWrite*) I)->SetMatchcodeName(_MatchcodeName.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetKeyFile(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring KeyFile) {
	Utf8String _KeyFile(jEnv,KeyFile);
	((mdMUReadWrite*) I)->SetKeyFile(_KeyFile.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_InitializeDataFiles(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUReadWrite*) I)->InitializeDataFiles();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetInitializeErrorString(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetInitializeErrorString());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetLicenseString(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring License) {
	Utf8String _License(jEnv,License);
	return (jint) ((mdMUReadWrite*) I)->SetLicenseString(_License.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetMaximumCharacterSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint size) {
	((mdMUReadWrite*) I)->SetMaximumCharacterSize((int) size);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetEncoding(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring encodeName) {
	Utf8String _encodeName(jEnv,encodeName);
	return (jint) ((mdMUReadWrite*) I)->SetEncoding(_encodeName.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetBuildNumber(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetBuildNumber());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetDatabaseDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetDatabaseDate());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetDatabaseExpirationDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetDatabaseExpirationDate());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetLicenseExpirationDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetLicenseExpirationDate());
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetMatchcodeObject(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUReadWrite*) I)->GetMatchcodeObject();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_ClearMappings(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUReadWrite*) I)->ClearMappings();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_AddMapping(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Mapping) {
	return (jint) ((mdMUReadWrite*) I)->AddMapping((mdMUReadWrite::MatchcodeMapping) Mapping);
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_ClearFields(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUReadWrite*) I)->ClearFields();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_AddField(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Field) {
	Utf8String _Field(jEnv,Field);
	((mdMUReadWrite*) I)->AddField(_Field.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_BuildKey(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUReadWrite*) I)->BuildKey();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetKey(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Key) {
	Utf8String _Key(jEnv,Key);
	((mdMUReadWrite*) I)->SetKey(_Key.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetUserInfo(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring UserInfo) {
	Utf8String _UserInfo(jEnv,UserInfo);
	((mdMUReadWrite*) I)->SetUserInfo(_UserInfo.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_WriteRecord(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUReadWrite*) I)->WriteRecord();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_Process(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUReadWrite*) I)->Process();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_ReadRecord(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUReadWrite*) I)->ReadRecord();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetKey(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetKey());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetUserInfo(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetUserInfo());
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetDupeGroup(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUReadWrite*) I)->GetDupeGroup();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetStatusCode(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetStatusCode());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUReadWrite*) I)->GetCount();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetEntry(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUReadWrite*) I)->GetEntry();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetError(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUReadWrite*) I)->GetError();
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetCombinations(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUReadWrite*) I)->GetCombinations();
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetFuzzyPercentage(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jdouble) ((mdMUReadWrite*) I)->GetFuzzyPercentage();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetResults(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetResults());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetKeySize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUReadWrite*) I)->GetKeySize();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetGroupSorting(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jboolean bGroupSorting) {
	((mdMUReadWrite*) I)->SetGroupSorting(bGroupSorting!=0 ? true : false);
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUReadWriteJNI_SetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property,jstring Value) {
	Utf8String _Property(jEnv,Property);
	Utf8String _Value(jEnv,Value);
	((mdMUReadWrite*) I)->SetReserved(_Property.GetUtf8Ptr(),_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUReadWriteJNI_GetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property) {
	Utf8String _Property(jEnv,Property);
	return UnicodeString(jEnv,((mdMUReadWrite*) I)->GetReserved(_Property.GetUtf8Ptr()));
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUIncrementalJNI_mdMUIncrementalCreate(JNIEnv* /*jEnv*/,jclass /*jCls*/) {
	return (jlong) new mdMUIncremental();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_mdMUIncrementalDestroy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	delete (mdMUIncremental*) I;
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetPathToMatchUpFiles(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Path) {
	Utf8String _Path(jEnv,Path);
	((mdMUIncremental*) I)->SetPathToMatchUpFiles(_Path.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetMatchcodeName(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring MatchcodeName) {
	Utf8String _MatchcodeName(jEnv,MatchcodeName);
	((mdMUIncremental*) I)->SetMatchcodeName(_MatchcodeName.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetMustExist(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jboolean bMustExist) {
	((mdMUIncremental*) I)->SetMustExist(bMustExist!=0 ? true : false);
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetKeyFile(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring KeyFile) {
	Utf8String _KeyFile(jEnv,KeyFile);
	((mdMUIncremental*) I)->SetKeyFile(_KeyFile.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_InitializeDataFiles(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUIncremental*) I)->InitializeDataFiles();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetInitializeErrorString(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetInitializeErrorString());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetLicenseString(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring License) {
	Utf8String _License(jEnv,License);
	return (jint) ((mdMUIncremental*) I)->SetLicenseString(_License.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetMaximumCharacterSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint size) {
	((mdMUIncremental*) I)->SetMaximumCharacterSize((int) size);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetEncoding(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring encodeName) {
	Utf8String _encodeName(jEnv,encodeName);
	return (jint) ((mdMUIncremental*) I)->SetEncoding(_encodeName.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetBuildNumber(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetBuildNumber());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetDatabaseDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetDatabaseDate());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetDatabaseExpirationDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetDatabaseExpirationDate());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetLicenseExpirationDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetLicenseExpirationDate());
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetMatchcodeObject(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUIncremental*) I)->GetMatchcodeObject();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_ClearMappings(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUIncremental*) I)->ClearMappings();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_AddMapping(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Mapping) {
	return (jint) ((mdMUIncremental*) I)->AddMapping((mdMUIncremental::MatchcodeMapping) Mapping);
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_ClearFields(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUIncremental*) I)->ClearFields();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_AddField(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Field) {
	Utf8String _Field(jEnv,Field);
	((mdMUIncremental*) I)->AddField(_Field.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_BuildKey(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUIncremental*) I)->BuildKey();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetKey(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Key) {
	Utf8String _Key(jEnv,Key);
	((mdMUIncremental*) I)->SetKey(_Key.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetUserInfo(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring UserInfo) {
	Utf8String _UserInfo(jEnv,UserInfo);
	((mdMUIncremental*) I)->SetUserInfo(_UserInfo.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_MatchRecord(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUIncremental*) I)->MatchRecord();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_AddRecord(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUIncremental*) I)->AddRecord();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_NextMatchingRecord(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUIncremental*) I)->NextMatchingRecord();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetKey(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetKey());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetUserInfo(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetUserInfo());
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetDupeGroup(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUIncremental*) I)->GetDupeGroup();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetStatusCode(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetStatusCode());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetCount(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUIncremental*) I)->GetCount();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetEntry(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUIncremental*) I)->GetEntry();
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetCombinations(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUIncremental*) I)->GetCombinations();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetResults(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetResults());
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetFuzzyPercentage(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jdouble) ((mdMUIncremental*) I)->GetFuzzyPercentage();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUIncrementalJNI_SetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property,jstring Value) {
	Utf8String _Property(jEnv,Property);
	Utf8String _Value(jEnv,Value);
	((mdMUIncremental*) I)->SetReserved(_Property.GetUtf8Ptr(),_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUIncrementalJNI_GetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property) {
	Utf8String _Property(jEnv,Property);
	return UnicodeString(jEnv,((mdMUIncremental*) I)->GetReserved(_Property.GetUtf8Ptr()));
}

extern "C" JNIEXPORT jboolean JNICALL Java_com_melissadata_mdMUIncrementalJNI_BeginTransaction(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jboolean) ((mdMUIncremental*) I)->BeginTransaction();
}

extern "C" JNIEXPORT jboolean JNICALL Java_com_melissadata_mdMUIncrementalJNI_CommitTransaction(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jboolean) ((mdMUIncremental*) I)->CommitTransaction();
}

extern "C" JNIEXPORT jboolean JNICALL Java_com_melissadata_mdMUIncrementalJNI_RollbackTransaction(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jboolean) ((mdMUIncremental*) I)->RollbackTransaction();
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUHybridJNI_mdMUHybridCreate(JNIEnv* /*jEnv*/,jclass /*jCls*/) {
	return (jlong) new mdMUHybrid();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_mdMUHybridDestroy(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	delete (mdMUHybrid*) I;
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_SetPathToMatchUpFiles(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Path) {
	Utf8String _Path(jEnv,Path);
	((mdMUHybrid*) I)->SetPathToMatchUpFiles(_Path.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_SetMatchcodeName(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring MatchcodeName) {
	Utf8String _MatchcodeName(jEnv,MatchcodeName);
	((mdMUHybrid*) I)->SetMatchcodeName(_MatchcodeName.GetUtf8Ptr());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUHybridJNI_InitializeDataFiles(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUHybrid*) I)->InitializeDataFiles();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetInitializeErrorString(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetInitializeErrorString());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUHybridJNI_SetLicenseString(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring License) {
	Utf8String _License(jEnv,License);
	return (jint) ((mdMUHybrid*) I)->SetLicenseString(_License.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_SetMaximumCharacterSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint size) {
	((mdMUHybrid*) I)->SetMaximumCharacterSize((int) size);
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUHybridJNI_SetEncoding(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring encodeName) {
	Utf8String _encodeName(jEnv,encodeName);
	return (jint) ((mdMUHybrid*) I)->SetEncoding(_encodeName.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetBuildNumber(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetBuildNumber());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetDatabaseDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetDatabaseDate());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetDatabaseExpirationDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetDatabaseExpirationDate());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetLicenseExpirationDate(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetLicenseExpirationDate());
}

extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUHybridJNI_GetMatchcodeObject(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jlong) ((mdMUHybrid*) I)->GetMatchcodeObject();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_ClearMappings(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUHybrid*) I)->ClearMappings();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUHybridJNI_AddMapping(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I,jint Mapping) {
	return (jint) ((mdMUHybrid*) I)->AddMapping((mdMUHybrid::MatchcodeMapping) Mapping);
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_ClearFields(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUHybrid*) I)->ClearFields();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_AddField(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Field) {
	Utf8String _Field(jEnv,Field);
	((mdMUHybrid*) I)->AddField(_Field.GetUtf8Ptr());
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_BuildKey(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	((mdMUHybrid*) I)->BuildKey();
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetKey(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetKey());
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUHybridJNI_GetKeySize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUHybrid*) I)->GetKeySize();
}

extern "C" JNIEXPORT jint JNICALL Java_com_melissadata_mdMUHybridJNI_GetClusterSize(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jint) ((mdMUHybrid*) I)->GetClusterSize();
}

/* WARNING: There is no native 'unsigned long' type in Java, a 'signed long' was used instead. */
extern "C" JNIEXPORT jlong JNICALL Java_com_melissadata_mdMUHybridJNI_CompareKeys(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Key1,jstring Key2) {
	Utf8String _Key1(jEnv,Key1);
	Utf8String _Key2(jEnv,Key2);
	return (jlong) ((mdMUHybrid*) I)->CompareKeys(_Key1.GetUtf8Ptr(),_Key2.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetResults(JNIEnv* jEnv,jclass /*jCls*/,jlong I) {
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetResults());
}

extern "C" JNIEXPORT jdouble JNICALL Java_com_melissadata_mdMUHybridJNI_GetFuzzyPercentage(JNIEnv* /*jEnv*/,jclass /*jCls*/,jlong I) {
	return (jdouble) ((mdMUHybrid*) I)->GetFuzzyPercentage();
}

extern "C" JNIEXPORT void JNICALL Java_com_melissadata_mdMUHybridJNI_SetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property,jstring Value) {
	Utf8String _Property(jEnv,Property);
	Utf8String _Value(jEnv,Value);
	((mdMUHybrid*) I)->SetReserved(_Property.GetUtf8Ptr(),_Value.GetUtf8Ptr());
}

extern "C" JNIEXPORT jstring JNICALL Java_com_melissadata_mdMUHybridJNI_GetReserved(JNIEnv* jEnv,jclass /*jCls*/,jlong I,jstring Property) {
	Utf8String _Property(jEnv,Property);
	return UnicodeString(jEnv,((mdMUHybrid*) I)->GetReserved(_Property.GetUtf8Ptr()));
}

