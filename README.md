# School App #

To get started please follow [his link](https://github.com/libgdx/libgdx/wiki/Setting-up-your-Development-Environment-(Eclipse,-Intellij-IDEA,-NetBeans)#setting-up-eclipse) to setup your development environment.

I trust that the first 2 steps will be easy for most, if not message me.

The android SDK part is a bit confusing, essentially you download the command line tools, once downloaded extract it. 

This is where it gets a bit messy. Inside of the extracted folder(probably named /User/tools_r25...) you are going to navigate to the tools section. Once there you open the android.bat file. You can see all the crap that I have installed in the image below. Click 'em all then press install packages, it will take a while.

![sdk manager](http://i.imgur.com/W1uydtz.png)

If that does end up being too complicated you can message me or worst case you can downlaod all of android studio and download SDKs from that.


*Below is optional, just nice to test eclipse is setup properly*

After your environment is setup you should be able to download and run the [setup application for libgdx] (https://libgdx.badlogicgames.com/download.html)
Once downloaded run it.


Remember where your sdk is stored because you need that location for the setup. Otherwise nothing else matters (in the setup) except the destination (where the projects will be generated to). You can uncheck the HTML checkbox because we don't need it.

(Make sure to go to advanced and click the Eclipse button)
![libgdx](http://i.imgur.com/x7Jgugg.png)
It creates a number of projects for each device 

You import them into eclipse by going to eclipse, file, import, general, existing projects, then selecting the folder where you created the project in the GDX setup application.
![import eclipse](http://i.imgur.com/4hxF64q.png)
Select all projects that it provides and import them. If your environment is setup properly, it should only contain a single error in the android project(disregard for now).

If this doesn't work of course troubleshoot or just message me and tell me what is breaking.

*end optional testing thing*

After your environment is setup properly download the projects in this Git repository. Git is a useful tool for code sharing, but it is a bit complicated. I am personally using the Eclipse plugin EGit which allows me to push projects in on my computer directly to the cloud.
