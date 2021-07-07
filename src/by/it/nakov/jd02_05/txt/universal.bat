set path=C:\Program Files\Java\jdk8u275\bin
FOR %%I In (*.txt) DO (
native2ascii.exe -encoding utf-8 %%I ..\res\%%-nI.properties
)