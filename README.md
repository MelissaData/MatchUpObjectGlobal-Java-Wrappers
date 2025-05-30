# Melissa - MatchUp Object Global Java Wrappers

## Purpose
This is the code for you to run MatchUp Object Global in Java.
    
Please feel free to copy or embed this code to your own project. Happy coding!

For latest Melissa MatchUp Object Global release notes, please visit: https://releasenotes.melissa.com/on-premise-api/matchup-object-global/

For further details, please visit: https://wiki.melissadata.com/index.php?title=MatchUp_Object:Reference

## Tested Environments
- Windows 10 64-bit Java 19, Microsoft Visual C++ 19.34, Powershell 5.1
- Ubuntu Linux 20.04.04 LTS 64-bit Java 20, gcc 9.4.0 
- Melissa MatchUp Object Global for 2025-Q2
- Wrapper file(s) have not changed since 2023-Q4

## Getting Started
These instructions will get you a copy of the wrappers needed to run the Java MatchUp Object Global on your local machine. 

### Download this project
```
git clone https://github.com/MelissaData/MatchUpObjectGlobal-Java-Wrappers
cd MatchUpObjectGlobal-Java-Wrappers
```

### Copy wrappers to your project folder
Import the `com` folder, and `mdMatchupJavaWrapper.dll` (Windows) or `libmdMatchupJavaWrapper.so` (Linux) to your project, and include the following line in your code to begin using the wrapper.

```
import com.melissadata.*;
```

If you would like to generate the wrappers yourself instead of using the provided wrappers proceed with the following instructions for either Windows or Linux.

## Windows

#### Install Java
Before starting, make sure that Java has been correctly installed on your machine. 

You can check that your environment is set up correctly by opening a command prompt window and typing the following:
`java --version`

If you see something like the following, that means that you have Java installed.

![alt text](/screenshots/java_version_windows.png)

If not, you can proceed to download Java here: 
https://www.oracle.com/java/technologies/downloads/

Once you have finished installations, you should be able to verify that Java has been correctly installed using the `java --version` command.

#### Set up Melissa Updater 
Melissa Updater is a CLI application allowing the user to update their Melissa applications/data. 

- Download Melissa Updater here: <https://releases.melissadata.net/Download/Library/WINDOWS/NET/ANY/latest/MelissaUpdater.exe>
- Create a folder within the cloned repo called `MelissaUpdater`.
- Put `MelissaUpdater.exe` in `MelissaUpdater` folder you just created.

#### Configure Scripts
If you want to generate `mdMatchupJavaWrapper.dll`, you will execute the `BuildMatchupJavaWrapper.ps1` script. This may require you to configure some path variables in `BuildWrapper.ps1` and `BuildMatchupJavaWrapper.ps1`.

BuildMatchupJavaWrapper.ps1
- Check the `$CmdPath` variable and configure the path to `vcvarsall.bat` if needed

BuildWrapper.ps1
- Check the `$JavaIncludeDirectory1` variable and configure the path to the `include` folder if needed
- Check the `$JavaIncludeDirectory2` variable and configure the path to the `win32` folder if needed

It is important to note that you must be able to initialize the Visual Studio Developer Command Prompt environment for `x86_x64` to generate `mdMatchupJavaWrapper.dll`.
The Visual Studio Developer Command Prompt should already be downloaded if you have Microsoft Visual Studio installed.

To check if you are able to intialize the Visual Studio Developer Command Prompt for `x86_x64`, you can open the start menu and search for `x86_x64 Cross Tools Command Prompt for VS 2022`. If this program exists, then you may continue to the next steps.

Alternatively, you can check to see if the following filepath exists: `C:\Program Files\Microsoft Visual Studio\2022\Professional\VC\Auxiliary\Build\vcvarsall.bat` (with Visual Studio 2022 installed). If the filepath exists, then you may continue to the next steps.

#### Run Script
Parameter(s)
- -license (optional): a license string to run the powershell script

```
.\BuildMatchupJavaWrapper.ps1
.\BuildMatchupJavaWrapper.ps1 -license "<your_license_string>"
```

## Linux

#### Install Java 
You can check if Java is already installed on your environment by opening the linux terminal and using the following command:
`java --version`

If you see something like the following, that means that you have Java installed.

![alt text](/screenshots/java_version_linux.png)

If not, you can proceed with the following commands to install Java:
- `sudo apt update`
- `sudo apt install default-jdk`

Once you have finished installations, you should be able to verify that Java has been correctly installed using the `java --version` command.

#### Install GCC
You can check if GCC is already installed on your environment by opening the linux terminal and using the following command:
`gcc --version`

If you see something like the following, that means that you have GCC installed.

![alt text](/screenshots/gcc_version.png)

If not, you can proceed with the following commands to install GCC:
- `sudo apt update`
- `sudo apt install build-essential`

Once you have finished installations, you should be able to verify that GCC has been correctly installed using the `gcc --version` command.

#### Set up Melissa Updater 
Melissa Updater is a CLI application allowing the user to update their Melissa applications/data. 

- In the root directory of the project, create a folder called `MelissaUpdater` by using the command: 

  `mkdir MelissaUpdater`

- Enter the newly created folder using the command:

  `cd MelissaUpdater`

- Proceed to install the Melissa Updater using the curl command: 

  `curl -L -O https://releases.melissadata.net/Download/Library/LINUX/NET/ANY/latest/MelissaUpdater`

- After the Melissa Updater is installed, you will need to change the Melissa Updater to an executable using the command:

  `chmod +x MelissaUpdater`

- Now that the Melissa Updater is set up, you can now proceed to move back into the project folder by using the command:
  
   `cd ..`

#### Configure Script
If you want to generate `libmdMatchupJavaWrapper.so`, you will execute the `BuildMatchupJavaWrapper.sh` script. This may require you to configure some path variables in `BuildMatchupJavaWrapper.sh`.

BuildMatchupJavaWrapper.sh
- Check the `JavaIncludeDirectory1` variable and configure the path to the `include` folder if needed
- Check the `JavaIncludeDirectory2` variable and configure the path to the `win32` folder if needed

#### Run Script
Parameter(s)
- --license (optional): a license string to run the bash script

```
./BuildMatchupJavaWrapper.sh
./BuildMatchupJavaWrapper.sh --license "<your_license_string>"
```

----------------------------------------
## See also
- [Melissa - MatchUp Object Global Windows Java](https://github.com/MelissaData/MatchUpObjectGlobal-Java)
- [Melissa - MatchUp Object Global Linux Java](https://github.com/MelissaData/MatchUpObjectGlobal-Java-Linux)
    
## Contact Us
For free technical support, please call us at 800-MELISSA ext. 4
(800-635-4772 ext. 4) or email us at tech@melissa.com.

To purchase this product, contact Melissa sales department at
800-MELISSA ext. 3 (800-635-4772 ext. 3).
