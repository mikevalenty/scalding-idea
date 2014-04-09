IntelliJ IDEA horribly slow after adding dependency on Scalding 1.9.1
=============

### Symptoms

In a much larger project, optimizing imports takes almost a full minute. In this simpler example project, optimizing imports takes about 15 seconds. Without a dependency on an older version of Scalding (0.8.11), optimizing imports is instant. Upgrading to Scalding 0.9.x, introduced the slow down. This slowdown is also evident in the removal of code lint, also the IDE just stops the worlds for 20-30 seconds at a time while working. 

### My machine

IntelliJ IDEA 13.1.1
Build #IC-135.480, built on March 21, 2014

JRE: 1.6.0_65-b14-462-11M4609 x86_64
VM: Java HotSpot(TM) 64-Bit Server VM by Apple Inc.