# cucumber-appium

Set JDK 8 in Ubuntu

1. Download jdk from oracle and move to /usr/lib

2.Update your java laternatives using below scripts
sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/java/jdk1.7.0_65/bin/java" 1
sudo update-alternatives --install "/usr/bin/javac" "javac" "/usr/lib/java/jdk1.7.0_65/bin/javac" 1
sudo update-alternatives --install "/usr/bin/javaws" "javaws" "/usr/lib/java/jdk1.7.0_65/bin/javaws" 1

3. Update your ~/.bashrc file
##add these
export JAVA_HOME=/usr/lib/java/jdk1.8.0_77
export PATH="$PATH:$JAVA_HOME/bin"

4. sudo update-alternatives --config java


Configuring Appium in Ubuntu from Scratch

1.Install node.js without using sudo-

Do not install node.js through apt-get, which will need sudo rights and appium will not work if node.js is installed as sudo user. If you have already installed remove it using commands:
sudo apt-get remove nodejs
sudo apt-get remove npm
Download latest nodejs linux binaries from https://nodejs.org/download/release/latest/
 into a folder for example /home/superman/Downloads (where superman is your username and you have downloaded the file in Downloads)
Now install it under /usr/local using
cd /usr/local
tar --strip-components 1 -xzf /home/superman/Downloads/node-v8.2.1-linux-x64.tar.gz
Check the installation using
which node
it should give you output
usr/local/bin/node

node -v 
should give you output
v8.2.1 (or whichever version you have installed)
2. Install java, jdk and jre-

sudo apt-get update
sudo apt-get install default-jre
sudo apt-get install default-jdk
//to install oracle jdk
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
3. Set the JAVA HOME path-

//open bashrc file 
gedit ~/.bashrc
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export PATH=${PATH}:${JAVA_HOME}/bin
//run following command to verify the path
echo $JAVA_HOME
echo $PATH
Tip: Use the following command to find out exact path to which java executable under UNIX / Linux:
which java
4. Download android studio and set the ANDROID HOME path-

download android studio for ubuntu and extract it in the HOME directory
open terminal and enter:
cd android-studio/bin
./studio.sh
Now android studio will open.Click next and let it download required things.
Once android sdk is installed add ANDROID_HOME to environment using:
gedit /.bashrc
//add following lines at the end of the file and then save
export ANDROID_HOME=/home/user_name/Android/Sdk
export PATH=$PATH:/home/user_name/Android/Sdk/tools
export PATH=$PATH:/home/user_name/Android/Sdk/platform-tools
5. Install appium globally-

sudo npm install -g appium --unsafe-perm=true --allow-root
//check if appium is installed using
appium
6. Install appium-doctor to troubleshoot the errors if any using:

npm install -g appium-doctor
//then 
appium-doctor
//it will give checklist of which things are okay and which are not

7.Install sdk from sdk manager in ANdroid Studio to get the aapt

8.In eclipse go to Run configuration set environment as ANDROID_HOME = /home/ketan/Android/Sdk

NOTE :  sudo gedit .bashrc NOT sudo gedit /.bashrc
Your .bashrc should look like 

.....
....
export JAVA_HOME=/usr/lib/java/jdk1.8.0_171
export PATH="$PATH:$JAVA_HOME/bin"
export ANDROID_HOME=/home/ketan/Android/Sdk
export PATH=$PATH:/home/ketan/Android/Sdk/tools
export PATH=$PATH:/home/ketan/Android/Sdk/platform-tools
export PATH=$PATH:/home/ketan/Android/Sdk/build-tools/28.0.0-rc2
