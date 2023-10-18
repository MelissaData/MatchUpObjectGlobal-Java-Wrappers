# Set Java Includes and MatchUp Object Global Library Path
$JavaIncludeDirectory1 = "C:\Program Files\Java\jdk-20\include"
$JavaIncludeDirectory2 = "C:\Program Files\Java\jdk-20\include\win32"
$MatchupLibraryPath = $PSScriptRoot

# Run cl command
& 'cl' -I"$MatchUpLibraryPath" -I"$JavaIncludeDirectory1" -I"$JavaIncludeDirectory2" -Fe'mdMatchupJavaWrapper.dll' 'mdMatchupJavaWrapper.cpp' -link -DLL -LIBPATH:"$MatchUpLibraryPath" -DEFAULTLIB:'mdMatchUp.lib'

# Remove files
Remove-Item 'mdMatchupJavaWrapper.exp' -ErrorAction SilentlyContinue
Remove-Item 'mdMatchupJavaWrapper.obj' -ErrorAction SilentlyContinue
Remove-Item 'mdMatchupJavaWrapper.lib' -ErrorAction SilentlyContinue

