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
   progressBar.setColor(Color.RED);
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

![CircularProgressBar](/CircularProgressBar.gif)

----

### Developer
#### [Mohammad Hossein Kashizadeh](mailto:mh.kashizadeh@gmail.com)

### License
----
```
Copyright 2015 MH.Kashizadeh
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.```
