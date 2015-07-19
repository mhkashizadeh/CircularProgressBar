# CircularProgressBar
CircularProgressBar for android

### Setup 

##### 1.First import project as android application.
##### 2.Then copy ```icomoon.ttf``` in assets folder.
##### 3.Then copy ```aspace_light_demo.otf``` in assets folder.

----
### Usage
``` java
   CircularProgressBar progressBar = (CircularProgressBar) findViewById(R.id.progressBar);
   progressBar.setColor(Colro.RED);
   progressBar.setState(CircularProgressBar.LOADING);
   
   DownloaderListener listener = new DownloaderListener(){
        @Override
            public void onProgressChanged(int percent) {
              progressBar.setProgress(percent);
            }
   };
```
----

### ScreenShot 

![CircularProgressBar](https://github.com/mhkashizadeh/CircularProgressBar/CircularProgressBar.gif)

----

### Developer
#### [Mohammad Hossein Kashizadeh](mailto:mh.kashizadeh@gmail.com)
