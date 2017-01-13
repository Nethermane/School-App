# School App #

To get started on the school computers you need to download and run this https://downloadcenter.intel.com/download/22165/Intel-Graphics-Media-Accelerator-Driver-Windows-7-Windows-Vista-exe


To get started please follow [this link](https://github.com/libgdx/libgdx/wiki/Setting-up-your-Development-Environment-(Eclipse,-Intellij-IDEA,-NetBeans)#setting-up-eclipse) to setup your development environment.

I trust that the first 2 steps will be easy for most, if not message me.

THE THIRD STEP IS NOT NEEDED. The android sdk can be downloaded with the android ADT plugin, so it can save you a bit of time to just download the ADT plugin and not the SDK.


Inside of eclipse, go to help, install new software and paste "https://dl-ssl.google.com/android/eclipse" into Work with and install everything in the drop down. This will install the android ADT plugin. Do the same with "http://dist.springsource.com/snapshot/TOOLS/gradle/nightly" that will install the gradle plugin.

![libgdx](http://i.imgur.com/iRXYnsC.png)

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

After your environment is setup properly download the projects in this Git repository and import them the same way as before. Git is a useful tool for code sharing, but it is a bit complicated. I am personally using the Eclipse plugin EGit which allows me to push projects in on my computer directly to the cloud.
