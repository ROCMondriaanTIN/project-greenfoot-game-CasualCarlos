warning: LF will be replaced by CRLF in Hero.java.
The file will have its original line endings in your working directory
[1mdiff --git a/Hero.java b/Hero.java[m
[1mindex e75163c..92aafe2 100644[m
[1m--- a/Hero.java[m
[1m+++ b/Hero.java[m
[36m@@ -16,7 +16,7 @@[m [mpublic class Hero extends Mover {[m
     public static int coin;[m
     public boolean inAir;[m
     public int x = 397;[m
[31m-    public boolean doorOpen = true;[m
[32m+[m[32m    public String doorOpen = "false";[m
     public int y = 3733;[m
     public String verzamel = "";[m
     private int frame = 1;[m
[36m@@ -118,13 +118,13 @@[m [mpublic class Hero extends Mover {[m
             break;[m
         }[m
         for (Actor door : getIntersectingObjects(door.class)) {[m
[31m-            if (coin == 4 && doorOpen == true){[m
[32m+[m[32m            if (coin == 4 && doorOpen == "true"){[m
                 //getWorld().removeObject(this);[m
                 doorPlay.play();[m
                 Greenfoot.setWorld(new MyWorld2());[m
                 setLocation(452, 1633);[m
             } [m
[31m-            if (coin == 7 && doorOpen == true){[m
[32m+[m[32m            if (coin == 7 && doorOpen == "true"){[m
                 //getWorld().removeObject(this);[m
                 doorPlay.play();[m
                 Greenfoot.setWorld(new MyWorld3());[m
[36m@@ -166,21 +166,21 @@[m [mpublic class Hero extends Mover {[m
     public void openDoor(){[m
         if(isTouching(keyDoor.class) && (coin == 4)){[m
             String activeWorld = "MyWorld1";[m
[31m-            boolean doorOpen = true;[m
[32m+[m[32m            doorOpen = "true";[m
             getWorld().removeObjects(getWorld().getObjects(keyDoor.class));[m
             getWorld().removeObjects(getWorld().getObjects(ClosedDoor.class));[m
             getWorld().removeObjects(getWorld().getObjects(ClosedDoorTop.class));[m
         }[m
         if(isTouching(keyDoor.class) && (coin == 7)){[m
             String activeWorld = "MyWorld2";[m
[31m-            boolean doorOpen = true;[m
[32m+[m[32m            doorOpen = "true";[m
             getWorld().removeObjects(getWorld().getObjects(keyDoor.class));[m
             getWorld().removeObjects(getWorld().getObjects(ClosedDoor.class));[m
             getWorld().removeObjects(getWorld().getObjects(ClosedDoorTop.class));[m
         }[m
         if(isTouching(keyDoor.class) && (coin == 10)){[m
             String activeWorld = "MyWorld3";[m
[31m-            boolean doorOpen = true;[m
[32m+[m[32m            doorOpen = "true";[m
             getWorld().removeObjects(getWorld().getObjects(keyDoor.class));[m
             getWorld().removeObjects(getWorld().getObjects(ClosedDoor.class));[m
             getWorld().removeObjects(getWorld().getObjects(ClosedDoorTop.class));[m
[1mdiff --git a/project.greenfoot b/project.greenfoot[m
[1mindex fae6901..88c5f69 100644[m
[1m--- a/project.greenfoot[m
[1m+++ b/project.greenfoot[m
[36m@@ -334,7 +334,7 @@[m [meditor.fx.0.height=739[m
 editor.fx.0.width=816[m
 editor.fx.0.x=552[m
 editor.fx.0.y=114[m
[31m-height=1056[m
[32m+[m[32mheight=1096[m
 package.numDependencies=106[m
 package.numTargets=38[m
 project.charset=windows-1252[m
